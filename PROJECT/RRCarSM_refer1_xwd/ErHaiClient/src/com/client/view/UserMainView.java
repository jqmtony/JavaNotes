package com.client.view;

import javax.swing.*;

import com.client.util.JPanelCar;
import com.client.util.JPanelRecord;
import com.client.util.QueryListCar;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * 用户主界面
 * @author Administrator
 *
 */
public class UserMainView extends View{
	/**
	 * 用户业务办理
	 */
    private JFrame frame = new JFrame("用户业务办理");
    private Container container = frame.getContentPane();

    /**
     * 顶部面板顺序
     */
    private JPanel upPanel = new JPanel();
    /**
     * 查看所有汽车
     */
    private JButton userListCarButton = new JButton("查看所有汽车");
    /**
     * 按价格升序
     */
    private JButton userListCarSortByRentASCButton = new JButton("按价格升序排序");
    /**
     * 按价格降序
     */
    private JButton userListCarSortByRentDESCButton = new JButton("按价格降序排序");
    /**
     * 类型搜索
     */
    private JLabel listCategoryLabel = new JLabel("按类型搜索");
    /**
     * 类型搜索(下拉框)
     */
    private JComboBox<String> CategoryComboBox = new JComboBox<>(cs.getCarCategory());
    /**
     * 类型搜索(确定)
     */
    private JButton listCategoryButton = new JButton("确定");
    /**
     * 品牌搜索
     */
    private JLabel listBrandLabel = new JLabel("按品牌搜索");
    /**
     * 品牌搜索(下拉框)
     */
    private JComboBox<String> BrandComboBox = new JComboBox<>(cs.getBrand());
    /**
     * 品牌搜索(确定)
     */
    private JButton listBrandButton = new JButton("确定");

    /**
     * 中部显示列表
     */
    private JPanel middlePanel = new JPanel();
    /**
     * 所有汽车
     */
    private JPanel panel1 ;
    /**
     * 价格升序
     */
    private JPanel panel2 ;
    /**
     * 价格降序
     */
    private JPanel panel3;
    /**
     * 按类型搜索
     */
    private JPanel panel4;
    /**
     * 按品牌搜索
     */
    private JPanel panel5;
    /**
     * 个人全部租车记录
     */
    private JPanel panel6;

    /**
     * 底部面板顺序
     */
    private JPanel downPanel = new JPanel();
    /**
     * 租车
     */
    private JButton rentButton = new JButton("租车");
    /**
     * 还车
     */
    private JButton returnButton = new JButton("还车");
    /**
     * 租车记录
     */
    private JButton recordButton = new JButton("租车记录");
    /**
     * 返回登录界面
     */
    private JButton backButton = new JButton("返回登录界面");
    /**
     * 初始化用户主界面
     */
    public UserMainView(){
        frame.setSize(1000,500);
        container.setLayout(new BorderLayout());
        initFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
    void initFrame(){
        //上
        upPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 20, 20));
        upPanel.add(userListCarButton);
        upPanel.add(userListCarSortByRentASCButton);
        upPanel.add(userListCarSortByRentDESCButton);
        upPanel.add(listCategoryLabel);
        upPanel.add(CategoryComboBox);
        upPanel.add(listCategoryButton);
        upPanel.add(listBrandLabel);
        upPanel.add(BrandComboBox);
        upPanel.add(listBrandButton);
        container.add(upPanel, "North");

        //中
        CardLayout cardLayout = new CardLayout(20, 20);//设置布局管理器为卡片式
        middlePanel.setLayout(cardLayout);
        middlePanel.add("查看所有汽车", panel1);
        container.add(middlePanel, "Center");

        //下侧
        downPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 30, 20));
        downPanel.add(rentButton);
        downPanel.add(returnButton);
        downPanel.add(recordButton);
        downPanel.add(backButton);
        container.add(downPanel, "South");


        userListCarButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	listCar = cs.listCar();
            	panel1 = JPanelCar.getJPanelCar(QueryListCar.List(listCar));
                cardLayout.show(middlePanel, "查看所有汽车");
            }
        });

        userListCarSortByRentASCButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	listCar = cs.listCar();
            	panel2 = JPanelCar.getJPanelCar(QueryListCar.ListASC(listCar));
                middlePanel.add("按价格升序", panel2);
                cardLayout.show(middlePanel, "按价格升序");
            }
        });

        userListCarSortByRentASCButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	listCar = cs.listCar();
            	panel3 = JPanelCar.getJPanelCar(QueryListCar.ListDESC(listCar));
                middlePanel.add("按价格降序", panel3);
                cardLayout.show(middlePanel, "按价格降序");
            }
        });

        listCategoryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	listCar = cs.listCar();
                String category = CategoryComboBox.getActionCommand();
                panel4 = JPanelCar.getJPanelCar(QueryListCar.ListCategory(listCar, category));
                middlePanel.add("按类型搜索", panel4);
                cardLayout.show(middlePanel, "按类型搜索");
            }
        });

        listBrandButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	listCar = cs.listCar();
                String brand = BrandComboBox.getActionCommand();
                panel5 = JPanelCar.getJPanelCar(QueryListCar.ListBrand(listCar, brand));
                middlePanel.add("按品牌搜索", panel5);
                cardLayout.show(middlePanel, "按品牌搜索");
            }
        });

        recordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
        		listRecord = rs.listRecord2(user);
                panel6 = JPanelRecord.getJPanelRecord(listRecord);
                middlePanel.add("个人全部租车记录", panel6);
                cardLayout.show(middlePanel, "个人全部租车记录");
            }
        });

        rentButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hide();
                new UserRentCarView();
            }
        });

        returnButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hide();
                new UserReturnCarView();
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

