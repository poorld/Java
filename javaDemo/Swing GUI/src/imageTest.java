
import java.awt.*;

import javax.swing.*;

public class imageTest extends JFrame{

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		imageTest t = new imageTest();
	}
	public imageTest(){
		JLabel bq;
		
		bq = new JLabel(new ImageIcon("image/dzq.jpg"));
		
		this.add(bq);
		this.setTitle("图片标签");
		this.setVisible(true);
		this.setBounds(0, 0, 1440, 900);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
