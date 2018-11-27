package com.client.view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.client.bean.User;
import com.client.util.Constants;

public class RegisterView extends View{
	private JFrame frame = new JFrame("ע��");
    private Container container = frame.getContentPane();

    public RegisterView(){
        frame.setSize(360,500);
        container.setLayout(new BorderLayout());
        initFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    
    void initFrame() {
    	

        //����
        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new FlowLayout());
        titlePanel.add(new JLabel("�û�ע��"));
        container.add(titlePanel,"North");

        //�в���
        JPanel fieldPanel = new JPanel();
        fieldPanel.setLayout(null);
        JLabel username_label = new JLabel("�û���:");
        username_label.setBounds(60, 40, 50, 20);
        JLabel password_label = new JLabel("��    ��:");
        password_label.setBounds(60, 80, 50, 20);
        JLabel sex_label = new JLabel("��    ��:");
        sex_label.setBounds(60, 120, 50, 20);
        JLabel id_number_label = new JLabel("���֤:");
        id_number_label.setBounds(60, 160, 50, 20);
        JLabel tel_label = new JLabel("��    ��:");
        tel_label.setBounds(60, 200, 50, 20);
        JLabel addr_label = new JLabel("ס    ַ:");
        addr_label.setBounds(60, 240, 50, 20);
        fieldPanel.add(username_label);
        fieldPanel.add(password_label);
        fieldPanel.add(sex_label);
        fieldPanel.add(id_number_label);
        fieldPanel.add(tel_label);
        fieldPanel.add(addr_label);
        /**
    	 * `5���ı������,1��������
    	 */
        JTextField userNameText = new JTextField();
        JPasswordField passWordText = new JPasswordField();
        JComboBox<String> sexBox = new JComboBox<>(Constants.sex);
        JTextField userIdNumberText = new JTextField();
        JTextField telText = new JTextField();
        JTextField addrText = new JTextField();
        /**
         * `ȷ��
         */
        JButton confirm = new JButton("ȷ��");
        /**
         * `ȡ��
         */
        JButton cancel = new JButton("ȡ��");
        userNameText.setBounds(120,40,150,20);
        passWordText.setBounds(120,80,150,20);
        sexBox.setBounds(120,120,150,20);
        userIdNumberText.setBounds(120,160,150,20);
        telText.setBounds(120,200,150,20);
        addrText.setBounds(120,240,150,20);
        fieldPanel.add(userNameText);
        fieldPanel.add(passWordText);
        fieldPanel.add(sexBox);
        fieldPanel.add(userIdNumberText);
        fieldPanel.add(telText);
        fieldPanel.add(addrText);
        container.add(fieldPanel,"Center");

        //�ײ���ť
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(cancel);
        buttonPanel.add(confirm);
        container.add(buttonPanel,"South");

        confirm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String userName = userNameText.getText();
                String passWord = String.valueOf(passWordText.getPassword());
                int sex = (sexBox.getSelectedItem().equals("��"))? 0:1;
                String userIdNumber = userIdNumberText.getText();
                String tel = telText.getText();
                String addr = telText.getText();
                user = new User(userName, passWord, sex, userIdNumber, tel, addr, 0);
                user = us.register(user);
                if (user != null){
                    new SuccessRegisterDialog(this, "ע��ɹ���ʾ", true);
                }else{
                    new FailRegisterDialog(this, "ע��ʧ����ʾ", true);
                }
            }
        });

        cancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	frame.setVisible(false);
                new LoginView();
            }
        });
    }

    //�Զ���ע��ɹ���ʾ�Ի���
    class SuccessRegisterDialog extends JDialog{
        /**
		 * 
		 */
		private static final long serialVersionUID = 2040220079714126170L;

		public SuccessRegisterDialog(ActionListener owner, String title, boolean modal){
			
            init();
            this.setVisible(true);
        }

        private void init(){
            JPanel panel = new JPanel();
            JLabel desc = new JLabel("ע��ɹ���", SwingConstants.CENTER);
            JButton btn = new JButton("���ص�¼");

            panel.add(btn);
            this.add(desc, BorderLayout.CENTER);
            this.add(panel, BorderLayout.SOUTH);
            this.setSize(300, 200);

            //���õ�������λ��
            int fx = frame.getLocation().x;
            int fy = frame.getLocation().y;
            int windowWidth = frame.getWidth();
            int windowHeight = frame.getHeight();
            int dialogWidth = this.getWidth();
            int dialogHeight = this.getHeight();
            this.setLocation(fx + (windowWidth - dialogWidth)/2, fy + (windowHeight - dialogHeight)/2);

            btn.addActionListener(new ActionListener() {
                @SuppressWarnings("deprecation")
				@Override
                public void actionPerformed(ActionEvent e) {
                	hide();
                	frame.setVisible(false);
                    new LoginView();
                }
            });
        }
    }

    //�Զ���ע��ʧ����ʾ�Ի���
    class FailRegisterDialog extends JDialog{
        /**
		 * 
		 */
		private static final long serialVersionUID = 4217560090605927687L;

		public FailRegisterDialog(ActionListener owner, String title, boolean modal){
            init();
            this.setVisible(true);
        }

        private void init(){
            JPanel panel = new JPanel();
            JLabel desc = new JLabel("�û����Ѵ���,������ע��!" , SwingConstants.CENTER);
            JButton registerButton = new JButton("����ע��");
            JButton loginButton = new JButton("���ص�¼");

            panel.add(registerButton);
            panel.add(loginButton);
            this.add(desc, BorderLayout.CENTER);
            this.add(panel, BorderLayout.SOUTH);
            this.setSize(300, 200);

            //���õ�������λ��
            int fx = frame.getLocation().x;
            int fy = frame.getLocation().y;
            int windowWidth = frame.getWidth();
            int windowHeight = frame.getHeight();
            int dialogWidth = this.getWidth();
            int dialogHeight = this.getHeight();
            this.setLocation(fx + (windowWidth - dialogWidth)/2, fy + (windowHeight - dialogHeight)/2);

            registerButton.addActionListener(new ActionListener() {
                @SuppressWarnings("deprecation")
				@Override
                public void actionPerformed(ActionEvent e) {
                	hide();
                    frame.setVisible(true);
                }
            });

            loginButton.addActionListener(new ActionListener() {
                @SuppressWarnings("deprecation")
				@Override
                public void actionPerformed(ActionEvent e) {
                	hide();
                	frame.setVisible(false);
                    new LoginView();
                }
            });

        }
    }

}
