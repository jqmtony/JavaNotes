package com.client.view;

import javax.swing.*;

import com.client.bean.Brand;
import com.client.bean.Car;
import com.client.bean.CarBrandCategory;
import com.client.bean.Category;
import com.client.util.Constants;
import com.client.util.JPanelCarAdmin;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
/**
 * 添加汽车
 * @author Administrator
 *
 */
public class AdminAddCarView extends View{

    private JFrame frame = new JFrame("管理员添加汽车");
    private Container container = frame.getContentPane();

    /**
     * 顶层面板
     */
    private JPanel upPanel = new JPanel();
    /**
     * 汽车品牌
     */
    private JLabel brandLabel = new JLabel("       品牌:");
    /**
     * 品牌下拉框
     */
    private JComboBox<String> brandComboBox = new JComboBox<>(listBrand);
    
    /**
     * 汽车类型
     */
    private JLabel categoryLabel = new JLabel("       类型:");
    /**
     * 类型下拉框
     */
    private JComboBox<String> categoryComboBox = new JComboBox<>(listCategory);
    /**
     * 汽车型号，汽车名
     */
    private JLabel modelLabel = new JLabel("       型号:");
    /**
     * 车牌号
     */
    private JLabel carNumberLabel = new JLabel("       车牌号:");
    /**
     * 汽车备注
     */
    private JLabel carCommentsLabel = new JLabel("       备注:");
    /**
     * 汽车颜色
     */
    private JLabel colorLabel = new JLabel("       颜色:");
    /**
     * 汽车市场价
     */
    private JLabel priceLabel = new JLabel("       汽车市场价:");
    /**
     * 每日租金
     */
    private JLabel rentLabel = new JLabel("       每日租金:");
    /**
     * 是否可借
     */
    private JLabel statusLabel= new JLabel("       是否可借:");
    /**
     * 是否上架
     */
    private JLabel useableLabel = new JLabel("       是否上架:");
    
    private JTextField modelText = new JTextField(8);
    private JTextField carNumberText = new JTextField(8);
    private JTextField carCommentsText = new JTextField(8);
    private JTextField colorText = new JTextField(8);
    private JTextField priceText = new JTextField(8);
    private JTextField rentText = new JTextField(8);
    private JComboBox<String> statusComboBox = new JComboBox<>(Constants.status);
    private JComboBox<String> useableComboBox = new JComboBox<>(Constants.useable);


    /**
     * 中间面板
     */
    private JPanel middlePanel = new JPanel();
    /**
     * 确认添加按钮
     */
    private JButton addButton = new JButton("确认添加");
    /**
     * 返回管理员主页面
     */
    private JButton backupButton = new JButton("返回");
    /**
     * 退出登录
     */
    private JButton quitButton = new JButton("退出");
    /**
     * 返回添加汽车的结果
     */
    private JLabel resultLabel = new JLabel("二嗨租车添加工作进行中...");

    //下
    private JPanel downPanel = new JPanel();
    private JPanel addPanel;

    public AdminAddCarView(){
        frame.setSize(1000,500);
        container.setLayout(new BorderLayout());
        initFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void initFrame(){
        //上侧
        upPanel.setLayout(new GridLayout(2 , 10 , 5 , 5 ));
        upPanel.add(brandLabel);
        upPanel.add(brandComboBox);
        upPanel.add(categoryLabel);
        upPanel.add(categoryComboBox);
        upPanel.add(modelLabel);
        upPanel.add(modelText);
        upPanel.add(carNumberLabel);
        upPanel.add(carNumberText);
        upPanel.add(carCommentsLabel);
        upPanel.add(carCommentsText);
        upPanel.add(colorLabel);
        upPanel.add(colorText);
        upPanel.add(priceLabel);
        upPanel.add(priceText);
        upPanel.add(rentLabel);
        upPanel.add(rentText);
        upPanel.add(statusLabel);
        upPanel.add(statusComboBox);
        upPanel.add(useableLabel);
        upPanel.add(useableComboBox);
        container.add(upPanel, "North");

        //中部
        CardLayout cardLayout = new CardLayout(20, 20);//设置布局管理器为卡片式
        middlePanel.setLayout(cardLayout);
        container.add(middlePanel, "Center");

        //下侧
        downPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 30));
        downPanel.add(addButton);
        downPanel.add(backupButton);
        downPanel.add(quitButton);
        downPanel.add(resultLabel);
        container.add(downPanel, "South");

        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String brand = String.valueOf(brandComboBox.getSelectedItem());
                String brandId = getBrandId(brand);
                Brand brands = new Brand(brandId , brand);
                String category = String.valueOf(categoryComboBox.getSelectedItem());
                String categoryId = getCategoryId(category);
                Category categorys = new Category(categoryId , category);
                String model = modelText.getText();
                String carNumber = carNumberText.getText();
                String carComments = carCommentsText.getText();
                String color = colorText.getText();
                double price = Double.parseDouble(priceText.getText());
                double rent = Double.parseDouble(rentText.getText());
                int status = (statusComboBox.getSelectedItem().equals("可借")? 0:1);
                int useable = (useableComboBox.getSelectedItem().equals("上架")? 0:1);
                Car car = new CarBrandCategory(carNumber, brandId, model, color,
                		categoryId, carComments, price, rent, status, useable , brands , categorys);
                CarBrandCategory car2 = cs.addCar(car);
                if(car2 == null){
                    resultLabel.setText("添加失败！");
                }else {
                	List<CarBrandCategory> list = new ArrayList<>();
                	list.add(car2);
                    resultLabel.setText("添加成功！");
                    addPanel = JPanelCarAdmin.getJPanelCar(list);
                    downPanel.add(addPanel);
                }
            }

			private String getBrandId(String brand) {
				int num = 0 ;
				for (int i = 0; i < listBrand.length; i++) {
					if (listBrand[i].equals(brand)) {
						num = i+1;
						break;
					}
				}
				return String.valueOf(num);
			}
			
			private String getCategoryId(String category) {
				int num = 0 ;
				for (int i = 0; i < listCategory.length; i++) {
					if (listCategory[i].equals(category)) {
						num = i+1;
						break;
					}
				}
				return String.valueOf(num);
			}
        });

        backupButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hide();
                new AdminMainView();
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
