package login;

import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class loginTest extends JFrame{
	private JPanel p1,p2,p3;
	private JLabel l1,l2;
	private JTextField zh;
	private JPasswordField mm;
	private JButton b1,b2;
	
	public static void main(String[] args){
		loginTest test = new loginTest();
	}
	public loginTest() {
		this.setTitle("�û���¼");
		// TODO �Զ����ɵĹ��캯�����
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		
		l1 = new JLabel("�ʺ�");
		l2 = new JLabel("����");
		
		zh = new JTextField(15);
		mm = new JPasswordField(15);
		
		b1 = new JButton("��¼");
		b2 = new JButton("ȡ��");
		
		this.setLayout(new FlowLayout());
		
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
