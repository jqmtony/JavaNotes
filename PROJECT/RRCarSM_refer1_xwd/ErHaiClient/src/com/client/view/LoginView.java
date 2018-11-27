package com.client.view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 * 登录页面
 * @author Administrator
 *
 */
public class LoginView extends View{
	private JFrame frame = new JFrame("登录");
    private Container container = frame.getContentPane();
    /**
     * 初始化登录页面
     */
    public LoginView(){
        frame.setSize(300,200);
        container.setLayout(new BorderLayout());//设置容器为边界布局管理器
        initFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//设置右上角×自动结束程序
        frame.setLocationRelativeTo(null);//将窗口置于屏幕的中央
        frame.setVisible(true);//设置窗口可见
    }
    
	/**
     * `一开始的登录界面
     */
    protected void initFrame() {

        //顶部
        JPanel titlePanel = new JPanel();//创建标题面板
        titlePanel.setLayout(new FlowLayout());//设置标题面板为流式布局管理器
        titlePanel.add(new JLabel("欢迎访问二嗨租车"));
        container.add(titlePanel,"North");

        //中部表单
        JPanel fieldPanel = new JPanel();
        fieldPanel.setLayout(null);
        JLabel userNameLabel = new JLabel("用户名:");
        userNameLabel.setBounds(50, 20, 50, 20);
        JLabel passWordLabel = new JLabel("密    码:");
        passWordLabel.setBounds(50, 60, 50, 20);
        fieldPanel.add(userNameLabel);
        fieldPanel.add(passWordLabel);
        
        JTextField userNameText = new JTextField();
        JPasswordField passWordText = new JPasswordField();
        userNameText.setBounds(110,20,120,20);
        passWordText.setBounds(110,60,120,20);
        fieldPanel.add(userNameText);
        fieldPanel.add(passWordText);
        container.add(fieldPanel,"Center");

        //底部按钮
        JButton login = new JButton("登录");
        JButton register = new JButton("注册");
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(login);
        buttonPanel.add(register);
        container.add(buttonPanel,"South");

        //点击登录按钮执行
        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String userName = userNameText.getText();//获取输入的值
                String passWord = String.valueOf(passWordText.getPassword());
                user = us.login(userName, passWord);
                if (user != null){
                    new SuccessLoginDialog(this, "登录成功提示", true);
                }else{
                    new FailLoginDialog(this, "登录失败提示", true);
                }
            }
        });

        //点击注册按钮执行
        register.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	frame.setVisible(false);//将登录页面设为不可见
                new RegisterView();//跳转注册页面
            }
        });
    }

    

    //登录成功提示对话框
    class SuccessLoginDialog extends JDialog{
        /**
		 * 
		 */
		private static final long serialVersionUID = 8127041064731835723L;
        public SuccessLoginDialog(ActionListener owner, String title, boolean modal){
            init();
            this.setVisible(true);
        }
        /**
         * `初始化登录成功页面
         */
        private void init(){
            JPanel panel = new JPanel();
            JLabel desc = new JLabel("登录成功！欢迎您" + user.getUserName(), SwingConstants.CENTER);
            JButton btn = new JButton("确定");

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
                    //登录成功跳转  0 跳转用户起始页  1 跳转管理员起始页
                    switch (user.getType()){
                        case 0:
                            new UserMainView();
                            break;
                        case 1:
                            new AdminMainView();
                            break;
                    }
                }
            });
        }
    }

    //登录失败提示对话框
    class FailLoginDialog extends JDialog{

		/**
		 * 
		 */
		private static final long serialVersionUID = -363853461836735219L;

		public FailLoginDialog(ActionListener owner, String title, boolean modal){
            init();
            this.setVisible(true);
        }
		/**
		 * `初始化登录失败页面
		 */
        private void init(){
            JPanel panel = new JPanel();
            JLabel desc = new JLabel("用户名或密码错误，登录失败", SwingConstants.CENTER);
            JButton registerButton = new JButton("重新登录");

            panel.add(registerButton);
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
                    //登录失败重新登录
                	LoginView.this.frame.setVisible(true);
                }
            });
        }
    }
    
    
}
