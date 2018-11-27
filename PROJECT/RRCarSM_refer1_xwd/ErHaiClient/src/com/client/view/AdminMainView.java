package com.client.view;


import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import com.client.util.JPanelCarAdmin;
import com.client.util.JPanelRecordAdmin;

public class AdminMainView extends View{

    private JFrame frame = new JFrame("管理平台");
    private Container container = frame.getContentPane();

    /**
     * 顶部面板顺序
     */
    private JPanel upPanel = new JPanel();
    /**
     * 查看所有汽车
     */
    private JButton adminListCarButton = new JButton("查看所有汽车");
    /**
     * 中部显示列表
     */
    private JPanel middlePanel = new JPanel();
    /**
     * 所有汽车
     */
    private JPanel panel1 ;
    /**
     * 全部租车记录
     */
    private JPanel panel2;

    /**
     * 底部面板顺序
     */
    private JPanel downPanel = new JPanel();
    /**
     * 添加汽车
     */
    private JButton addButton = new JButton("添加汽车");
    /**
     * 修改汽车信息
     */
    private JButton updateButton = new JButton("修改汽车信息");
    /**
     * 查看所有租车记录
     */
    private JButton listRecordButton = new JButton("查看租车记录");
    /**
     * 返回登录界面
     */
    private JButton backButton = new JButton("返回登录界面");

    public AdminMainView(){
        frame.setSize(1000,500);
        container.setLayout(new BorderLayout());
        initFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    void initFrame(){
        //上
        upPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
        upPanel.add(adminListCarButton);
        container.add(upPanel,"North");

        //中
        CardLayout cardLayout = new CardLayout(20, 20);//设置布局管理器为卡片式
        middlePanel.setLayout(cardLayout);
        panel1 = JPanelCarAdmin.getJPanelCar(listCar);
        middlePanel.add("查看汽车", panel1);
        container.add(middlePanel, "Center");

        //下侧
        downPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 20));
        downPanel.add(addButton);
        downPanel.add(updateButton);
        downPanel.add(listRecordButton);
        downPanel.add(backButton);
        container.add(downPanel, "South");


        adminListCarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	listCar = cs.listCar();
            	panel1 = JPanelCarAdmin.getJPanelCar(listCar);
                cardLayout.show(middlePanel, "查看汽车");
            }
        });

        listRecordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listRecord = rs.listRecord();
                panel2 = JPanelRecordAdmin.getJPanelRecord(listRecord);
                middlePanel.add("全部租车记录", panel2);
                cardLayout.show(middlePanel, "全部租车记录");
            }
        });

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hide();
                new AdminAddCarView();
            }
        });

        updateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hide();
                new AdminUpdateView();
            }
        });
        backButton.addActionListener(new ActionListener() {
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
