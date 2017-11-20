package 背景颜色;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Panel;

public class BackgroundTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Frame f = new Frame("背景颜色");
		Panel p = new Panel();
		p.setPreferredSize(new Dimension(300,300));
		//f.setBackground(Color.BLACK);
		p.setBackground(Color.BLUE);
		f.add(p);
		f.pack();
		f.setVisible(true);
	}

}
