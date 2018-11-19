package com.client.view;

import javax.swing.*;

import com.client.bean.Record;
import com.client.util.JPanelRecord;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class UserReturnCarView extends View{
    private JFrame frame = new JFrame("用户还车业务办理");
    private Container container = frame.getContentPane();

    /**
     * 顶部面板
     */
    private JPanel upPanel = new JPanel();
    /**
     * 还车提示框
     */
    private JLabel carLabel = new JLabel("请输入您想归还的汽车编号：");
    
    /**
     * 还车输入框
     */
    private JTextField carNumberText = new JTextField();
    /**
     * 还车确认按钮
     */
    private JButton returnButton = new JButton("确认还车");

    /**
     * 中间面板
     */
    private JPanel middlePanel = new JPanel();
    /**
     * 还车详情页
     */
    private JPanel returnPanel;

    /**
     * 底部面板
     */
    private JPanel downPanel = new JPanel();
    /**
     * 返回用户主界面
     */
    private JButton backupButton = new JButton("返回主界面");
    /**
     * 退出登录
     */
    private JButton quitButton = new JButton("退出登录");
    /**
     * 结果提示
     */
    private JLabel resultLabel = new JLabel("欢迎使用二嗨租车");

    public UserReturnCarView(){
        frame.setSize(1000,500);
        container.setLayout(new BorderLayout());
        initFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    void initFrame(){
        //上侧
        upPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
        upPanel.add(carLabel);
        upPanel.add(carNumberText);
        upPanel.add(returnButton);
        container.add(upPanel, "North");

        //中
        middlePanel.setLayout(new CardLayout(20, 20));
        container.add(middlePanel, "Center");

        //下侧
        downPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 30));
        downPanel.add(backupButton);
        downPanel.add(quitButton);
        downPanel.add(resultLabel);
        container.add(downPanel, "South");

        returnButton.addActionListener(new ActionListener() {
            @SuppressWarnings("unused")
			@Override
            public void actionPerformed(ActionEvent e) {
            	Record record = new Record();
            	record.setRecordUserId(Integer.valueOf(user.getUserId()));
            	record.getCarBrandCategory().setCarId(carNumberText.getText());
            	Record record2 = rs.returnCar(record);
                if (record == null ){
                    resultLabel.setText("还车失败！");
                }else {
                	List<Record> list = new ArrayList<>();
                	list.add(record2);
                    resultLabel.setText("还车成功！");
                    returnPanel = JPanelRecord.getJPanelRecord(list);
                    middlePanel.add("还车成功信息", returnPanel);
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

