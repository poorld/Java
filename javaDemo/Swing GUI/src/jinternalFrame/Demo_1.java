package jinternalFrame;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class Demo_1 {
	private JInternalFrame jif;
	private JFrame f;
	
	public Demo_1(){
		f = new JFrame();
		jif = new JInternalFrame("测试");
		f.add(jif);
		f.setVisible(true);
		f.setSize(100, 100);
	}

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new Demo_1();
	}
	

}
