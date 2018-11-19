package com.client.view;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 * ��¼ҳ��
 * @author Administrator
 *
 */
public class LoginView extends View{
	private JFrame frame = new JFrame("��¼");
    private Container container = frame.getContentPane();
    /**
     * ��ʼ����¼ҳ��
     */
    public LoginView(){
        frame.setSize(300,200);
        container.setLayout(new BorderLayout());//��������Ϊ�߽粼�ֹ�����
        initFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//�������Ͻǡ��Զ���������
        frame.setLocationRelativeTo(null);//������������Ļ������
        frame.setVisible(true);//���ô��ڿɼ�
    }
    
	/**
     * `һ��ʼ�ĵ�¼����
     */
    protected void initFrame() {

        //����
        JPanel titlePanel = new JPanel();//�����������
        titlePanel.setLayout(new FlowLayout());//���ñ������Ϊ��ʽ���ֹ�����
        titlePanel.add(new JLabel("��ӭ���ʶ����⳵"));
        container.add(titlePanel,"North");

        //�в���
        JPanel fieldPanel = new JPanel();
        fieldPanel.setLayout(null);
        JLabel userNameLabel = new JLabel("�û���:");
        userNameLabel.setBounds(50, 20, 50, 20);
        JLabel passWordLabel = new JLabel("��    ��:");
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

        //�ײ���ť
        JButton login = new JButton("��¼");
        JButton register = new JButton("ע��");
        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout());
        buttonPanel.add(login);
        buttonPanel.add(register);
        container.add(buttonPanel,"South");

        //�����¼��ťִ��
        login.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String userName = userNameText.getText();//��ȡ�����ֵ
                String passWord = String.valueOf(passWordText.getPassword());
                user = us.login(userName, passWord);
                if (user != null){
                    new SuccessLoginDialog(this, "��¼�ɹ���ʾ", true);
                }else{
                    new FailLoginDialog(this, "��¼ʧ����ʾ", true);
                }
            }
        });

        //���ע�ᰴťִ��
        register.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
            	frame.setVisible(false);//����¼ҳ����Ϊ���ɼ�
                new RegisterView();//��תע��ҳ��
            }
        });
    }

    

    //��¼�ɹ���ʾ�Ի���
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
         * `��ʼ����¼�ɹ�ҳ��
         */
        private void init(){
            JPanel panel = new JPanel();
            JLabel desc = new JLabel("��¼�ɹ�����ӭ��" + user.getUserName(), SwingConstants.CENTER);
            JButton btn = new JButton("ȷ��");

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
                    //��¼�ɹ���ת  0 ��ת�û���ʼҳ  1 ��ת����Ա��ʼҳ
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

    //��¼ʧ����ʾ�Ի���
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
		 * `��ʼ����¼ʧ��ҳ��
		 */
        private void init(){
            JPanel panel = new JPanel();
            JLabel desc = new JLabel("�û�����������󣬵�¼ʧ��", SwingConstants.CENTER);
            JButton registerButton = new JButton("���µ�¼");

            panel.add(registerButton);
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
                    //��¼ʧ�����µ�¼
                	LoginView.this.frame.setVisible(true);
                }
            });
        }
    }
    
    
}
