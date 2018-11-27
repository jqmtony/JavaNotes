package com.client.view;

import javax.swing.*;

import com.client.util.JPanelCar;
import com.client.util.JPanelRecord;
import com.client.util.QueryListCar;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * �û�������
 * @author Administrator
 *
 */
public class UserMainView extends View{
	/**
	 * �û�ҵ�����
	 */
    private JFrame frame = new JFrame("�û�ҵ�����");
    private Container container = frame.getContentPane();

    /**
     * �������˳��
     */
    private JPanel upPanel = new JPanel();
    /**
     * �鿴��������
     */
    private JButton userListCarButton = new JButton("�鿴��������");
    /**
     * ���۸�����
     */
    private JButton userListCarSortByRentASCButton = new JButton("���۸���������");
    /**
     * ���۸���
     */
    private JButton userListCarSortByRentDESCButton = new JButton("���۸�������");
    /**
     * ��������
     */
    private JLabel listCategoryLabel = new JLabel("����������");
    /**
     * ��������(������)
     */
    private JComboBox<String> CategoryComboBox = new JComboBox<>(cs.getCarCategory());
    /**
     * ��������(ȷ��)
     */
    private JButton listCategoryButton = new JButton("ȷ��");
    /**
     * Ʒ������
     */
    private JLabel listBrandLabel = new JLabel("��Ʒ������");
    /**
     * Ʒ������(������)
     */
    private JComboBox<String> BrandComboBox = new JComboBox<>(cs.getBrand());
    /**
     * Ʒ������(ȷ��)
     */
    private JButton listBrandButton = new JButton("ȷ��");

    /**
     * �в���ʾ�б�
     */
    private JPanel middlePanel = new JPanel();
    /**
     * ��������
     */
    private JPanel panel1 ;
    /**
     * �۸�����
     */
    private JPanel panel2 ;
    /**
     * �۸���
     */
    private JPanel panel3;
    /**
     * ����������
     */
    private JPanel panel4;
    /**
     * ��Ʒ������
     */
    private JPanel panel5;
    /**
     * ����ȫ���⳵��¼
     */
    private JPanel panel6;

    /**
     * �ײ����˳��
     */
    private JPanel downPanel = new JPanel();
    /**
     * �⳵
     */
    private JButton rentButton = new JButton("�⳵");
    /**
     * ����
     */
    private JButton returnButton = new JButton("����");
    /**
     * �⳵��¼
     */
    private JButton recordButton = new JButton("�⳵��¼");
    /**
     * ���ص�¼����
     */
    private JButton backButton = new JButton("���ص�¼����");
    /**
     * ��ʼ���û�������
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
        //��
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

        //��
        CardLayout cardLayout = new CardLayout(20, 20);//���ò��ֹ�����Ϊ��Ƭʽ
        middlePanel.setLayout(cardLayout);
        middlePanel.add("�鿴��������", panel1);
        container.add(middlePanel, "Center");

        //�²�
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
                cardLayout.show(middlePanel, "�鿴��������");
            }
        });

        userListCarSortByRentASCButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	listCar = cs.listCar();
            	panel2 = JPanelCar.getJPanelCar(QueryListCar.ListASC(listCar));
                middlePanel.add("���۸�����", panel2);
                cardLayout.show(middlePanel, "���۸�����");
            }
        });

        userListCarSortByRentASCButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	listCar = cs.listCar();
            	panel3 = JPanelCar.getJPanelCar(QueryListCar.ListDESC(listCar));
                middlePanel.add("���۸���", panel3);
                cardLayout.show(middlePanel, "���۸���");
            }
        });

        listCategoryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	listCar = cs.listCar();
                String category = CategoryComboBox.getActionCommand();
                panel4 = JPanelCar.getJPanelCar(QueryListCar.ListCategory(listCar, category));
                middlePanel.add("����������", panel4);
                cardLayout.show(middlePanel, "����������");
            }
        });

        listBrandButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	listCar = cs.listCar();
                String brand = BrandComboBox.getActionCommand();
                panel5 = JPanelCar.getJPanelCar(QueryListCar.ListBrand(listCar, brand));
                middlePanel.add("��Ʒ������", panel5);
                cardLayout.show(middlePanel, "��Ʒ������");
            }
        });

        recordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
        		listRecord = rs.listRecord2(user);
                panel6 = JPanelRecord.getJPanelRecord(listRecord);
                middlePanel.add("����ȫ���⳵��¼", panel6);
                cardLayout.show(middlePanel, "����ȫ���⳵��¼");
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

