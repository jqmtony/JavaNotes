package com.client.view;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.client.bean.Record;
import com.client.util.JPanelRecord;

public class UserRentCarView extends View {
    JPanelRecord jPanelRecord = new JPanelRecord();

    private JFrame frame = new JFrame("用户租车业务办理");
    private Container container = frame.getContentPane();

    /**
     * 顶部面板
     */
    private JPanel upPanel = new JPanel();
    /**
     * 租车提示信息
     */
    private JLabel carLabel = new JLabel("请输入您想租的汽车编号：");
    /**
     * 租车输入框
     */
    private JTextField carNumberText = new JTextField();
    /**
     * 租车确认按钮
     */
    private JButton rentButton = new JButton("确认租车");
    /**
     * 返回用户主界面
     */
    private JButton backupButton = new JButton("返回");
    /**
     * 退出登录
     */
    private JButton quitButton = new JButton("退出登录");

    /**
     * 中间面板
     */
    private JPanel middlePanel = new JPanel();
    /**
     * 查看可以租的所有车
     */
    private JPanel rentPanel;

    /**
     * 底部面板
     */
    private JPanel downPanel = new JPanel();
    private JLabel resultLabel = new JLabel("欢迎使用二嗨租车");

    public UserRentCarView(){
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
        upPanel.add(carLabel);
        upPanel.add(carNumberText);
        upPanel.add(rentButton);
        upPanel.add(backupButton);
        upPanel.add(quitButton);
        container.add(upPanel, "North");

        //中部
        CardLayout cardLayout = new CardLayout(20, 20);//设置布局管理器为卡片式
        middlePanel.setLayout(cardLayout);
        container.add(middlePanel, "Center");

        //下侧
        downPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 30));
        downPanel.add(resultLabel);
        container.add(downPanel, "South");

        rentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	Record record = new Record();
            	record.setRecordUserId(Integer.valueOf(user.getUserId()));
            	record.getCarBrandCategory().setCarId(carNumberText.getText());
                Record record2 = rs.rentCar(record);
                if (record2 == null){
                    resultLabel.setText("租车失败！");
                }else {
                	List<Record> list = new ArrayList<>();
                	list.add(record2);
                    resultLabel.setText("租车成功！");
                    rentPanel = JPanelRecord.getJPanelRecord(list);
                    middlePanel.add("租车成功信息", rentPanel);
                }
            }
        });

        backupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hide();
                new UserMainView();
            }
        });

        quitButton.addActionListener(new ActionListener() {
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

