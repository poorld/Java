package borderlayout;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;

public class BorderLayoutTest {

	public static void main(String[] args) {
		Frame f = new Frame("Borderlayout Test");
		
		Button be = new Button("be");
		Button bw = new Button("bw");
		Button bs = new Button("bs");
		Button bn = new Button("bn");
		Button bc = new Button("bc");
		
		//不知道为啥不可以
//		f.add(be, "EAST");
//		f.add(bw, "WEST");
//		f.add(bs, "SOUND");
//		f.add(bn, "NORTH");
//		f.add(bc, "CENTER");
		
		f.add(be, BorderLayout.EAST);
		f.add(bw, BorderLayout.WEST);
		f.add(bs, BorderLayout.SOUTH);
		f.add(bn, BorderLayout.NORTH);
		f.add(bc, BorderLayout.CENTER);
		
		f.setSize(200, 200);
		f.setVisible(true);
	}

}

