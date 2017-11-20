package flowLayout;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;

public class Test {

	public static void main(String[] args) {
		//FlowLayout(对齐方式，水平间距，上下间距);
		FlowLayout fl = new FlowLayout(FlowLayout.CENTER,20,10);
		Frame f = new Frame("test");
		f.setLayout(fl);
		f.setBounds(250,150,200,300);
		for (int i = 0; i < 7; i++){
			f.add(new Button("button" + i));
		}
		f.setVisible(true);
	}

}