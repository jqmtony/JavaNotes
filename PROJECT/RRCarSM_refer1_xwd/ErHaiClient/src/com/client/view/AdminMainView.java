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

    private JFrame frame = new JFrame("����ƽ̨");
    private Container container = frame.getContentPane();

    /**
     * �������˳��
     */
    private JPanel upPanel = new JPanel();
    /**
     * �鿴��������
     */
    private JButton adminListCarButton = new JButton("�鿴��������");
    /**
     * �в���ʾ�б�
     */
    private JPanel middlePanel = new JPanel();
    /**
     * ��������
     */
    private JPanel panel1 ;
    /**
     * ȫ���⳵��¼
     */
    private JPanel panel2;

    /**
     * �ײ����˳��
     */
    private JPanel downPanel = new JPanel();
    /**
     * �������
     */
    private JButton addButton = new JButton("�������");
    /**
     * �޸�������Ϣ
     */
    private JButton updateButton = new JButton("�޸�������Ϣ");
    /**
     * �鿴�����⳵��¼
     */
    private JButton listRecordButton = new JButton("�鿴�⳵��¼");
    /**
     * ���ص�¼����
     */
    private JButton backButton = new JButton("���ص�¼����");

    public AdminMainView(){
        frame.setSize(1000,500);
        container.setLayout(new BorderLayout());
        initFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    void initFrame(){
        //��
        upPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
        upPanel.add(adminListCarButton);
        container.add(upPanel,"North");

        //��
        CardLayout cardLayout = new CardLayout(20, 20);//���ò��ֹ�����Ϊ��Ƭʽ
        middlePanel.setLayout(cardLayout);
        panel1 = JPanelCarAdmin.getJPanelCar(listCar);
        middlePanel.add("�鿴����", panel1);
        container.add(middlePanel, "Center");

        //�²�
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
                cardLayout.show(middlePanel, "�鿴����");
            }
        });

        listRecordButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                listRecord = rs.listRecord();
                panel2 = JPanelRecordAdmin.getJPanelRecord(listRecord);
                middlePanel.add("ȫ���⳵��¼", panel2);
                cardLayout.show(middlePanel, "ȫ���⳵��¼");
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
