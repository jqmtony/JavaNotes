package com.client.view;
/**
 * �޸�����
 * @author Administrator
 *
 */

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import com.client.bean.CarBrandCategory;
import com.client.util.Constants;
import com.client.util.JPanelCar;

public class AdminUpdateView extends View{

    private JFrame frame = new JFrame("����Ա�޸�������Ϣ");
    private Container container = frame.getContentPane();

    /**
     * �������
     */
    private JPanel upPanel = new JPanel();
    /**
     * ѡ������
     */
    private JLabel carLabel = new JLabel("������");
    /**
     * ���������˵�
     */
    private JComboBox<String> carComboBox;
    /**
     * �޸ĺ������
     */
    private JLabel chooseLabel = new JLabel("�޸����ݣ�");
    /**
     * ѡ����޸ĵ�����
     */
    private JComboBox<String> chooseComboBox = new JComboBox<>(Constants.choose);

    /**
     * �м����
     */
    private JPanel middlePanel = new JPanel();
    /**
     * �޸���Ϣ���
     */
    private JPanel alterPanel;

    /**
     * �ײ����
     */
    private JPanel downPanel = new JPanel();
    /**
     * �޸�ֵ����ʾ
     */
    private JLabel changeLabel = new JLabel("�޸ĺ��ֵ��");
    /**
     * �޸�ֵ���ı������
     */
    private JTextField changeText = new JTextField(20);
    /**
     * ȷ���޸�
     */
    private JButton alterButton = new JButton("ȷ���޸�");
    /**
     * ����
     */
    private JButton backup_btn = new JButton("����");
    /**
     * �˳���¼
     */
    private JButton quit_btn = new JButton("�˳���¼");
    /**
     * ��ʾ��Ϣ
     */
    private JLabel resultLabel = new JLabel("�����⳵�޸Ĺ���������...");

    public AdminUpdateView(){
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
        List<CarBrandCategory> list = cs.adminListCar();
        String[] str = new String[list.size()];
        for (CarBrandCategory cbc:list){
        	int i=0;
            String s = cbc.getCarNumber() + "-" + cbc.getModel() + "-" + cbc.getColor() + "-" +
                    cbc.getCarComments() + "-" + cbc.getBrand() + "-" + cbc.getCategory() + "-�����޼۸�" +
                    cbc.getRent() + "-" + ((cbc.getUseable() == 0)? "�ϼ�":"�¼�");
            str[i]= s;
            i++;
        }
        carComboBox = new JComboBox<String>(str);
        upPanel.add(carLabel);
        upPanel.add(carComboBox);
        upPanel.add(chooseLabel);
        upPanel.add(chooseComboBox);
        container.add(upPanel, "North");

        //�в�
        middlePanel.setLayout(new FlowLayout(20,20,20));
        container.add(middlePanel, "Center");

        //�²�
        downPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 30, 30));
        downPanel.add(changeLabel);
        downPanel.add(changeText);
        downPanel.add(alterButton);
        downPanel.add(backup_btn);
        downPanel.add(quit_btn);
        downPanel.add(resultLabel);
        container.add(downPanel, "South");

        alterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String car = String.valueOf(carComboBox.getSelectedItem());
                String carNumber = car.split("-")[0];
                String carId = null;
                for (CarBrandCategory cbc:list){
                    if (cbc.getCarNumber().equals(carNumber)){
                        carId = cbc.getCarId();
                    }
                }
                String choose = String.valueOf(chooseComboBox.getSelectedItem());
                String change = changeText.getText();
                CarBrandCategory car2 ;
                switch (choose){
                    case "���޼۸�":
                    	car2 = cs.updateCarRent(carId, change);
                        if (car2 == null){
                            resultLabel.setText("�޸�ʧ�ܣ�");
                        }else {
                            resultLabel.setText("�޸ĳɹ���");
                            List<CarBrandCategory> list = new ArrayList<>();
                        	list.add(car2);
                            alterPanel = JPanelCar.getJPanelCar(list);
                            middlePanel.add(alterPanel);
                        }
                        break;
                    case "�ϼ��¼�":
                        int useable = change.equals("�ϼ�")? 0:1;
                        car2 = cs.updateCarUseable(carId, useable);
                        if (car2 == null){
                            resultLabel.setText("�޸�ʧ�ܣ�");
                        }else {
                            resultLabel.setText("�޸ĳɹ���");
                            List<CarBrandCategory> list = new ArrayList<>();
                        	list.add(car2);
                            alterPanel = JPanelCar.getJPanelCar(list);
                            middlePanel.add(alterPanel);
                        }
                        break;
                }
            }
        });

        backup_btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                hide();
                new AdminMainView();
            }
        });

        quit_btn.addActionListener(new ActionListener() {
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

