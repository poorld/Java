package ��ѡ��;
import java.awt.*;
import javax.swing.*;

public class Test1 extends JFrame{

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Test1 t = new Test1();
	}
	public Test1(){
		this.setTitle("�û�ע��");
		JPanel p1,p2,p3;
		JLabel bq1,bq2;
		JButton b1,b2;
		JCheckBox box1,box2,box3;
		JRadioButton r1,r2;
		ButtonGroup dxz;
		
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		bq1 = new JLabel("����");
		bq2 = new JLabel("�Ա�");
		b1 = new JButton("ȷ��");
		b2 = new JButton("ȡ��");
		box1 = new JCheckBox("����");
		box2 = new JCheckBox("����");
		box3 = new JCheckBox("����");
		r1 = new JRadioButton("��");
		r2 = new JRadioButton("Ů");
		
		dxz = new ButtonGroup();//��r1,r2��ӽ�һ���飬ʹ��ֻ��ѡһ��
		dxz.add(r1);
		dxz.add(r2);
		
		this.setLayout(new GridLayout(3,1));
		p1.add(bq1);	p1.add(box1);	p1.add(box2);	p1.add(box3);
		p2.add(bq2);	p2.add(r1);		p2.add(r2);
		p3.add(b1);		p3.add(b2);
		
		
		this.add(p1);	
		this.add(p2);	
		this.add(p3);

		this.setBounds(200,200,300,150);
		this.setResizable(false);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}
}
