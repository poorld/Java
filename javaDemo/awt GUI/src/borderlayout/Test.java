package borderlayout;

import java.awt.BorderLayout;
import java.awt.Frame;
import java.awt.Panel;
import java.awt.TextArea;

public class Test {

	public static void main(String[] args) {
		Frame f = new Frame("666");
		Panel p2 = new Panel();
		p2.setLayout(new BorderLayout());
		p2.add(new TextArea());
		f.add(p2);
		f.setSize(300,300);
		f.setVisible(true);

	}

}
