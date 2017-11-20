package gridlayout;

import java.awt.Button;
import java.awt.Frame;
import java.awt.GridLayout;

public class gridTest {
	public static void main(String[] args){
		Frame f = new Frame("gridLayout");
		GridLayout g = new GridLayout(3,4);
		f.setLayout(g);
		for(int i = 0; i < 12; i++){
			f.add(new Button("button" + i));
		}
		f.setBounds(250, 150, 800, 600);
		f.pack();//加pack默认放大
		f.setVisible(true);
	}
}
