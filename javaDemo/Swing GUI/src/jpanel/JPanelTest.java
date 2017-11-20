package jpanel;

import java.awt.BorderLayout;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JPanelTest extends JFrame{
	JPanel mb1,mb2;
	JButton b1,b2,b3,b4,b5;
	
	public static void main(String[] args){
		JPanelTest jp = new JPanelTest();
	}
	public JPanelTest(){
		mb1 = new JPanel();
		mb2 = new JPanel();
		
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		
		//������ʱ�Ƚ�panel�ϵ���������ϣ������jframe�ϵ����
		mb1.add(b1);//JPanelĬ����FlowLayout������
		mb1.add(b2);
		mb2.add(b3);
		mb2.add(b4);
		
		this.add(mb1, BorderLayout.NORTH);
		this.add(mb2, BorderLayout.SOUTH);
		this.add(b5); //�߽粼�ֱ�������м��������Բ�д�ڶ�������
		
		this.setTitle("����");
		this.setBounds(300,300,300,300);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
