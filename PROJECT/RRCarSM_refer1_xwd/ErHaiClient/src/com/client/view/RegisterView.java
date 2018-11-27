package com.client.view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

import com.client.bean.User;
import com.client.util.Constants;

public class RegisterView extends View{
	private JFrame frame = new JFrame("注册");
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
    	

        //顶部
        JPanel titlePanel = new JPanel();
        titlePanel.setLayout(new FlowLayout());
        titlePanel.add(new JLabel("用户注册"));
        container.add(titlePanel,"North");

        //中部表单
        JPanel fieldPanel = new JPanel();
        fieldPanel.setLayout(null);
        JLabel username_label = new JLabel("用户名:");
        username_label.setBounds(60, 40, 50, 20);
        JLabel password_label = new JLabel("密    码:");
        password_label.setBounds(60, 80, 50, 20);
        JLabel sex_label = new JLabel("性    别:");
        sex_label.setBounds(60, 120, 50, 20);
        JLabel id_number_label = new JLabel("身份证:");
        id_number_label.setBounds(60, 160, 50, 20);
        JLabel tel_label = new JLabel("电    话:");
        tel_label.setBounds(60, 200, 50, 20);
        JLabel addr_label = new JLabel("住    址:");
        addr_label.setBounds(60, 240, 50, 20);
        fieldPanel.add(username_label);
        fieldPanel.add(password_label);
        fieldPanel.add(sex_label);
        fieldPanel.add(id_number_label);
        fieldPanel.add(tel_label);
        fieldPanel.add(addr_label);
        /**
    	 * `5个文本输入框,1个下拉框
    	 */
        JTextField userNameText = new JTextField();
        JPasswordField passWordText = new JPasswordField();
        JComboBox<String> sexBox = new JComboBox<>(Constants.sex);
        JTextField userIdNumberText = new JTextField();
        JTextField telText = new JTextField();
        JTextField addrText = new JTextField();
        /**
         * `确定
         */
        JButton confirm = new JButton("确定");
        /**
         * `取消
         */
        JButton cancel = new JButton("取消");
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

        //底部按钮
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(cancel);
        buttonPanel.add(confirm);
        container.add(buttonPanel,"South");

        confirm.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String userName = userNameText.getText();
                String passWord = String.valueOf(passWordText.getPassword());
                int sex = (sexBox.getSelectedItem().equals("男"))? 0:1;
                String userIdNumber = userIdNumberText.getText();
                String tel = telText.getText();
                String addr = telText.getText();
                user = new User(userName, passWord, sex, userIdNumber, tel, addr, 0);
                user = us.register(user);
                if (user != null){
                    new SuccessRegisterDialog(this, "注册成功提示", true);
                }else{
                    new FailRegisterDialog(this, "注册失败提示", true);
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

    //自定义注册成功提示对话框
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
            JLabel desc = new JLabel("注册成功！", SwingConstants.CENTER);
            JButton btn = new JButton("返回登录");

            panel.add(btn);
            this.add(desc, BorderLayout.CENTER);
            this.add(panel, BorderLayout.SOUTH);
            this.setSize(300, 200);

            //设置弹出窗口位置
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

    //自定义注册失败提示对话框
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
            JLabel desc = new JLabel("用户名已存在,请重新注册!" , SwingConstants.CENTER);
            JButton registerButton = new JButton("重新注册");
            JButton loginButton = new JButton("返回登录");

            panel.add(registerButton);
            panel.add(loginButton);
            this.add(desc, BorderLayout.CENTER);
            this.add(panel, BorderLayout.SOUTH);
            this.setSize(300, 200);

            //设置弹出窗口位置
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
