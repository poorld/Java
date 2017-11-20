package frame;

import java.awt.Color;
import java.awt.Frame;

public class FrameTest {

	public static void main(String[] args) {
		Frame f = new Frame("my first frame");
		f.setLocation(300,300);
		f.setSize(480, 320);
		f.setVisible(true);
	}

}
