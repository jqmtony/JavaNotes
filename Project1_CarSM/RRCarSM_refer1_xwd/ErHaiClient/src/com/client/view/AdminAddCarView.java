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
 * �������
 * @author Administrator
 *
 */
public class AdminAddCarView extends View{

    private JFrame frame = new JFrame("����Ա�������");
    private Container container = frame.getContentPane();

    /**
     * �������
     */
    private JPanel upPanel = new JPanel();
    /**
     * ����Ʒ��
     */
    private JLabel brandLabel = new JLabel("       Ʒ��:");
    /**
     * Ʒ��������
     */
    private JComboBox<String> brandComboBox = new JComboBox<>(listBrand);
    
    /**
     * ��������
     */
    private JLabel categoryLabel = new JLabel("       ����:");
    /**
     * ����������
     */
    private JComboBox<String> categoryComboBox = new JComboBox<>(listCategory);
    /**
     * �����ͺţ�������
     */
    private JLabel modelLabel = new JLabel("       �ͺ�:");
    /**
     * ���ƺ�
     */
    private JLabel carNumberLabel = new JLabel("       ���ƺ�:");
    /**
     * ������ע
     */
    private JLabel carCommentsLabel = new JLabel("       ��ע:");
    /**
     * ������ɫ
     */
    private JLabel colorLabel = new JLabel("       ��ɫ:");
    /**
     * �����г���
     */
    private JLabel priceLabel = new JLabel("       �����г���:");
    /**
     * ÿ�����
     */
    private JLabel rentLabel = new JLabel("       ÿ�����:");
    /**
     * �Ƿ�ɽ�
     */
    private JLabel statusLabel= new JLabel("       �Ƿ�ɽ�:");
    /**
     * �Ƿ��ϼ�
     */
    private JLabel useableLabel = new JLabel("       �Ƿ��ϼ�:");
    
    private JTextField modelText = new JTextField(8);
    private JTextField carNumberText = new JTextField(8);
    private JTextField carCommentsText = new JTextField(8);
    private JTextField colorText = new JTextField(8);
    private JTextField priceText = new JTextField(8);
    private JTextField rentText = new JTextField(8);
    private JComboBox<String> statusComboBox = new JComboBox<>(Constants.status);
    private JComboBox<String> useableComboBox = new JComboBox<>(Constants.useable);


    /**
     * �м����
     */
    private JPanel middlePanel = new JPanel();
    /**
     * ȷ����Ӱ�ť
     */
    private JButton addButton = new JButton("ȷ�����");
    /**
     * ���ع���Ա��ҳ��
     */
    private JButton backupButton = new JButton("����");
    /**
     * �˳���¼
     */
    private JButton quitButton = new JButton("�˳�");
    /**
     * ������������Ľ��
     */
    private JLabel resultLabel = new JLabel("�����⳵��ӹ���������...");

    //��
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
        //�ϲ�
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

        //�в�
        CardLayout cardLayout = new CardLayout(20, 20);//���ò��ֹ�����Ϊ��Ƭʽ
        middlePanel.setLayout(cardLayout);
        container.add(middlePanel, "Center");

        //�²�
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
                int status = (statusComboBox.getSelectedItem().equals("�ɽ�")? 0:1);
                int useable = (useableComboBox.getSelectedItem().equals("�ϼ�")? 0:1);
                Car car = new CarBrandCategory(carNumber, brandId, model, color,
                		categoryId, carComments, price, rent, status, useable , brands , categorys);
                CarBrandCategory car2 = cs.addCar(car);
                if(car2 == null){
                    resultLabel.setText("���ʧ�ܣ�");
                }else {
                	List<CarBrandCategory> list = new ArrayList<>();
                	list.add(car2);
                    resultLabel.setText("��ӳɹ���");
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
