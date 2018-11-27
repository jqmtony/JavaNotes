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

    private JFrame frame = new JFrame("�û��⳵ҵ�����");
    private Container container = frame.getContentPane();

    /**
     * �������
     */
    private JPanel upPanel = new JPanel();
    /**
     * �⳵��ʾ��Ϣ
     */
    private JLabel carLabel = new JLabel("�������������������ţ�");
    /**
     * �⳵�����
     */
    private JTextField carNumberText = new JTextField();
    /**
     * �⳵ȷ�ϰ�ť
     */
    private JButton rentButton = new JButton("ȷ���⳵");
    /**
     * �����û�������
     */
    private JButton backupButton = new JButton("����");
    /**
     * �˳���¼
     */
    private JButton quitButton = new JButton("�˳���¼");

    /**
     * �м����
     */
    private JPanel middlePanel = new JPanel();
    /**
     * �鿴����������г�
     */
    private JPanel rentPanel;

    /**
     * �ײ����
     */
    private JPanel downPanel = new JPanel();
    private JLabel resultLabel = new JLabel("��ӭʹ�ö����⳵");

    public UserRentCarView(){
        frame.setSize(1000,500);
        container.setLayout(new BorderLayout());
        initFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    public void initFrame(){
        //�ϲ�
        upPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
        upPanel.add(carLabel);
        upPanel.add(carNumberText);
        upPanel.add(rentButton);
        upPanel.add(backupButton);
        upPanel.add(quitButton);
        container.add(upPanel, "North");

        //�в�
        CardLayout cardLayout = new CardLayout(20, 20);//���ò��ֹ�����Ϊ��Ƭʽ
        middlePanel.setLayout(cardLayout);
        container.add(middlePanel, "Center");

        //�²�
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
                    resultLabel.setText("�⳵ʧ�ܣ�");
                }else {
                	List<Record> list = new ArrayList<>();
                	list.add(record2);
                    resultLabel.setText("�⳵�ɹ���");
                    rentPanel = JPanelRecord.getJPanelRecord(list);
                    middlePanel.add("�⳵�ɹ���Ϣ", rentPanel);
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

