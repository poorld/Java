package jpanel;

import javax.swing.JFrame;
import java.awt.*;
import javax.swing.*;

public class Test extends JFrame{

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new Test();
	}
	public Test(){
		JTextArea wbk = new JTextArea(5,30);
		JPanel mb = new JPanel();
		JButton b1 = new JButton("按钮1");
		JButton b2 = new JButton("按钮2");
		
		mb.add(b1);
		mb.add(b2);
		this.add(wbk);
		this.add(mb,BorderLayout.SOUTH);
		this.setVisible(true);
		this.pack();
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
