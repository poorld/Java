package Demo;
import java.awt.*;
import javax.swing.*;

public class ButtonTest {

	JFrame f = new JFrame("����");
	JPanel mb1,mb2,mb3;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new ButtonTest();
	}
	public ButtonTest(){
		mb1 = new JPanel();
		mb2 = new JPanel();
		mb3 = new JPanel();
		b1 = new JButton("��ť1");
		b2 = new JButton("��ť2");
		b3 = new JButton("��ť3");
		b4 = new JButton("��ť4");
		b5 = new JButton("��ť5");
		b6 = new JButton("��ť6");
		b7 = new JButton("��ť7");
		b8 = new JButton("��ť8");
		b9 = new JButton("��ť9");
		
		mb1.setLayout(new FlowLayout());
		mb2.setLayout(new BorderLayout());
		mb3.setLayout(new GridLayout());
		
		mb1.add(b1);mb1.add(b2);mb1.add(b3);
		mb2.add(b4);mb2.add(b5);mb2.add(b6);
		mb3.add(b7);mb3.add(b8);mb3.add(b9);
		
		f.setLayout(new BorderLayout(3,1));
		f.add(mb1,BorderLayout.NORTH);f.add(mb2);f.add(mb3,BorderLayout.SOUTH);
		f.setVisible(true);
		f.setSize(300, 300);
		f.pack();
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
