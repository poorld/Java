package flowLayout;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class FlowLayoutTest {

	public static void main(String[] args) {
		Frame f = new Frame("flowlayout");
		Button b1 = new Button("open");
		Button b2 = new Button("È·¶¨");
		Button b3 = new Button("close");
		f.setLayout(new FlowLayout());
		f.add(b1);
		f.add(b2);
		f.add(b3);
		f.setSize(200, 200);
		f.setVisible(true);
	}

}
