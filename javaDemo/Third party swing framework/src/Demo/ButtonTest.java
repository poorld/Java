package Demo;
import java.awt.*;
import javax.swing.*;

public class ButtonTest {

	JFrame f = new JFrame("测试");
	JPanel mb1,mb2,mb3;
	JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new ButtonTest();
	}
	public ButtonTest(){
		mb1 = new JPanel();
		mb2 = new JPanel();
		mb3 = new JPanel();
		b1 = new JButton("按钮1");
		b2 = new JButton("按钮2");
		b3 = new JButton("按钮3");
		b4 = new JButton("按钮4");
		b5 = new JButton("按钮5");
		b6 = new JButton("按钮6");
		b7 = new JButton("按钮7");
		b8 = new JButton("按钮8");
		b9 = new JButton("按钮9");
		
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
