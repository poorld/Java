package 疯狂java;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowListenerTest {
	private Frame f = new Frame("窗口示范");
	private TextArea ta = new TextArea(6 , 30);
	public void init(){
		//为窗口添加事件监听器
		f.addWindowListener(new MyWindowListener());
		f.add(ta);
		f.pack();
		f.setVisible(true);
	}
	public class MyWindowListener implements WindowListener{

		@Override
		public void windowOpened(WindowEvent e) {
			ta.append("窗口初次被打开!\n");
		}

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO 自动生成的方法存根
			ta.append("窗口被关闭！\n");
			System.exit(0);
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO 自动生成的方法存根
			ta.append("窗口被成功关闭！");
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO 自动生成的方法存根
			ta.append("窗口被最小化!\n");
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO 自动生成的方法存根
			ta.append("窗口被恢复!\n");
		}

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO 自动生成的方法存根
			ta.append("窗口被激活!\n");
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO 自动生成的方法存根
			ta.append("窗口失去焦点!\n");
		}
	}
	
	public static void main(String[] args){
		new WindowListenerTest().init();
	}
}
