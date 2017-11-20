package login;

import java.awt.*;
import javax.swing.*;

public class loginTest_2 extends JFrame{
	private JPanel p1,p2,p3;
	private JLabel l1,l2;
	private JTextField zh;
	private JPasswordField mm;
	private JButton b1,b2;
	
	public static void main(String[] args){
		loginTest test = new loginTest();
	}
	public loginTest_2() {
		this.setTitle("用户登录");
		// TODO 自动生成的构造函数存根
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		
		l1 = new JLabel("帐号");
		l2 = new JLabel("密码");
		
		zh = new JTextField(15);
		mm = new JPasswordField(15);
		
		b1 = new JButton("登录");
		b2 = new JButton("取消");
		
		this.setLayout(new GridLayout(3,1));
		
		p1.add(l1);		p1.add(zh);
		p2.add(l2);		p2.add(mm);
		p3.add(b1);		p3.add(b2);
		
		this.add(p1);
		this.add(p2);
		this.add(p3);
		
		this.setBounds(300, 300, 300, 150);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
