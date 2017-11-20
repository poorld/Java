package panel;
import java.awt.*;
public class PanelTest {

	public static void main(String[] args) {
		Frame f = new Frame("My panel");//添加一个Frame（窗口）
		Panel p = new Panel(null);//添加panel
		f.setBounds(300,300,500,500);//设置freme初始x,y,w,h
		f.setBackground(new Color(0,0,255));//设置背景颜色
		p.setBounds(50,50,400,400);//设置panel初始x,y,w,h
		p.setBackground(new Color(255,0,0));//设置背景颜色
		f.add(p);//把panel添加到frame中显示
		f.setVisible(true);
	}

}
