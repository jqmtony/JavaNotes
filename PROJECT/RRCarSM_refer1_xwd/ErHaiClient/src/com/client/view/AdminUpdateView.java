package com.client.view;
/**
 * 修改汽车
 * @author Administrator
 *
 */

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.client.bean.CarBrandCategory;
import com.client.util.Constants;
import com.client.util.JPanelCar;

public class AdminUpdateView extends View{

    private JFrame frame = new JFrame("管理员修改汽车信息");
    private Container container = frame.getContentPane();

    /**
     * 顶部面板
     */
    private JPanel upPanel = new JPanel();
    /**
     * 选择汽车
     */
    private JLabel carLabel = new JLabel("汽车：");
    /**
     * 汽车下拉菜单
     */
    private JComboBox<String> carComboBox;
    /**
     * 修改后的内容
     */
    private JLabel chooseLabel = new JLabel("修改内容：");
    /**
     * 选择可修改的内容
     */
    private JComboBox<String> chooseComboBox = new JComboBox<>(Constants.choose);

    /**
     * 中间面板
     */
    private JPanel middlePanel = new JPanel();
    /**
     * 修改信息面板
     */
    private JPanel alterPanel;

    /**
     * 底部面板
     */
    private JPanel downPanel = new JPanel();
    /**
     * 修改值的提示
     */
    private JLabel changeLabel = new JLabel("修改后的值：");
    /**
     * 修改值的文本输入框
     */
    private JTextField changeText = new JTextField(20);
    /**
     * 确认修改
     */
    private JButton alterButton = new JButton("确认修改");
    /**
     * 返回
     */
    private JButton backup_btn = new JButton("返回");
    /**
     * 退出登录
     */
    private JButton quit_btn = new JButton("退出登录");
    /**
     * 提示信息
     */
    private JLabel resultLabel = new JLabel("二嗨租车修改工作进行中...");

    public AdminUpdateView(){
        frame.setSize(1000,500);
        container.setLayout(new BorderLayout());
        initFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void initFrame(){
        //上侧
        upPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
        List<CarBrandCategory> list = cs.adminListCar();
        String[] str = new String[list.size()];
        for (CarBrandCategory cbc:list){
        	int i=0;
            String s = cbc.getCarNumber() + "-" + cbc.getModel() + "-" + cbc.getColor() + "-" +
                    cbc.getCarComments() + "-" + cbc.getBrand() + "-" + cbc.getCategory() + "-（租赁价格）" +
                    cbc.getRent() + "-" + ((cbc.getUseable() == 0)? "上架":"下架");
            str[i]= s;
            i++;
        }
        carComboBox = new JComboBox<String>(str);
        upPanel.add(carLabel);
        upPanel.add(carComboBox);
        upPanel.add(chooseLabel);
        upPanel.add(chooseComboBox);
        container.add(upPanel, "North");

        //中部
        middlePanel.setLayout(new FlowLayout(20,20,20));
        container.add(middlePanel, "Center");

        //下侧
        downPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 30));
        downPanel.add(changeLabel);
        downPanel.add(changeText);
        downPanel.add(alterButton);
        downPanel.add(backup_btn);
        downPanel.add(quit_btn);
        downPanel.add(resultLabel);
        container.add(downPanel, "South");

        alterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String car = String.valueOf(carComboBox.getSelectedItem());
                String carNumber = car.split("-")[0];
                String carId = null;
                for (CarBrandCategory cbc:list){
                    if (cbc.getCarNumber().equals(carNumber)){
                        carId = cbc.getCarId();
                    }
                }
                String choose = String.valueOf(chooseComboBox.getSelectedItem());
                String change = changeText.getText();
                CarBrandCategory car2 ;
                switch (choose){
                    case "租赁价格":
                    	car2 = cs.updateCarRent(carId, change);
                        if (car2 == null){
                            resultLabel.setText("修改失败！");
                        }else {
                            resultLabel.setText("修改成功！");
                            List<CarBrandCategory> list = new ArrayList<>();
                        	list.add(car2);
                            alterPanel = JPanelCar.getJPanelCar(list);
                            middlePanel.add(alterPanel);
                        }
                        break;
                    case "上架下架":
                        int useable = change.equals("上架")? 0:1;
                        car2 = cs.updateCarUseable(carId, useable);
                        if (car2 == null){
                            resultLabel.setText("修改失败！");
                        }else {
                            resultLabel.setText("修改成功！");
                            List<CarBrandCategory> list = new ArrayList<>();
                        	list.add(car2);
                            alterPanel = JPanelCar.getJPanelCar(list);
                            middlePanel.add(alterPanel);
                        }
                        break;
                }
            }
        });

        backup_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hide();
                new AdminMainView();
            }
        });

        quit_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hide();
                new LoginView();
            }
        });
    }
    public void hide(){
        frame.setVisible(false);
    }
}

