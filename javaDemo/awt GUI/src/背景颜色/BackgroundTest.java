package ������ɫ;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Panel;

public class BackgroundTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Frame f = new Frame("������ɫ");
		Panel p = new Panel();
		p.setPreferredSize(new Dimension(300,300));
		//f.setBackground(Color.BLACK);
		p.setBackground(Color.BLUE);
		f.add(p);
		f.pack();
		f.setVisible(true);
	}

}
