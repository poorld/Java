package ͼƬ��ǩ;
import java.awt.*;

import javax.swing.*;

public class Test extends JFrame{

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Test t = new Test();
	}
	public Test(){
		JLabel bq;
		
		bq = new JLabel(new ImageIcon("image/dzq.jpg"));
		
		this.add(bq);
		this.setTitle("ͼƬ��ǩ");
		this.setVisible(true);
		this.setBounds(0, 0, 1440, 900);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
