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
    private JFrame frame = new JFrame("�û�����ҵ�����");
    private Container container = frame.getContentPane();

    /**
     * �������
     */
    private JPanel upPanel = new JPanel();
    /**
     * ������ʾ��
     */
    private JLabel carLabel = new JLabel("����������黹��������ţ�");
    
    /**
     * ���������
     */
    private JTextField carNumberText = new JTextField();
    /**
     * ����ȷ�ϰ�ť
     */
    private JButton returnButton = new JButton("ȷ�ϻ���");

    /**
     * �м����
     */
    private JPanel middlePanel = new JPanel();
    /**
     * ��������ҳ
     */
    private JPanel returnPanel;

    /**
     * �ײ����
     */
    private JPanel downPanel = new JPanel();
    /**
     * �����û�������
     */
    private JButton backupButton = new JButton("����������");
    /**
     * �˳���¼
     */
    private JButton quitButton = new JButton("�˳���¼");
    /**
     * �����ʾ
     */
    private JLabel resultLabel = new JLabel("��ӭʹ�ö����⳵");

    public UserReturnCarView(){
        frame.setSize(1000,500);
        container.setLayout(new BorderLayout());
        initFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    void initFrame(){
        //�ϲ�
        upPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 20, 20));
        upPanel.add(carLabel);
        upPanel.add(carNumberText);
        upPanel.add(returnButton);
        container.add(upPanel, "North");

        //��
        middlePanel.setLayout(new CardLayout(20, 20));
        container.add(middlePanel, "Center");

        //�²�
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
                    resultLabel.setText("����ʧ�ܣ�");
                }else {
                	List<Record> list = new ArrayList<>();
                	list.add(record2);
                    resultLabel.setText("�����ɹ���");
                    returnPanel = JPanelRecord.getJPanelRecord(list);
                    middlePanel.add("�����ɹ���Ϣ", returnPanel);
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

