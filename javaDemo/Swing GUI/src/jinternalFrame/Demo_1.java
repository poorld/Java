package jinternalFrame;

import javax.swing.JFrame;
import javax.swing.JInternalFrame;

public class Demo_1 {
	private JInternalFrame jif;
	private JFrame f;
	
	public Demo_1(){
		f = new JFrame();
		jif = new JInternalFrame("����");
		f.add(jif);
		f.setVisible(true);
		f.setSize(100, 100);
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		new Demo_1();
	}
	

}
