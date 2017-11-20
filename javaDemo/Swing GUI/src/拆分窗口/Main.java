package 拆分窗口;
import java.awt.*;

import javax.swing.JSplitPane;
import javax.swing.*;

public class Main extends JFrame{
	JLabel bq;//右边图像标签
	JList lb;//左边列表
	JSplitPane cf;//拆分
	
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Main m = new Main();
	}
	public Main(){
		String[] name = {"软件开发","游戏开发","平面设计","动画设计","室内设计"};
		lb = new JList(name);
		
		bq = new JLabel(new ImageIcon("image/biaoqian.jpg"));
		
		cf = new JSplitPane(JSplitPane.HORIZONTAL_SPLIT,lb,bq);//左右拆分
		//cf = new JSplitPane(JSplitPane.VERTICAL_SPLIT,lb,bq);//上下拆分
		cf.setOneTouchExpandable(true);//设置左右收缩
		
		this.add(cf);
		this.setBounds(350, 80, 660, 500);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
	}
}
