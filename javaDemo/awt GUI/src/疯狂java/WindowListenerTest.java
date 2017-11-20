package ���java;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class WindowListenerTest {
	private Frame f = new Frame("����ʾ��");
	private TextArea ta = new TextArea(6 , 30);
	public void init(){
		//Ϊ��������¼�������
		f.addWindowListener(new MyWindowListener());
		f.add(ta);
		f.pack();
		f.setVisible(true);
	}
	public class MyWindowListener implements WindowListener{

		@Override
		public void windowOpened(WindowEvent e) {
			ta.append("���ڳ��α���!\n");
		}

		@Override
		public void windowClosing(WindowEvent e) {
			// TODO �Զ����ɵķ������
			ta.append("���ڱ��رգ�\n");
			System.exit(0);
		}

		@Override
		public void windowClosed(WindowEvent e) {
			// TODO �Զ����ɵķ������
			ta.append("���ڱ��ɹ��رգ�");
		}

		@Override
		public void windowIconified(WindowEvent e) {
			// TODO �Զ����ɵķ������
			ta.append("���ڱ���С��!\n");
		}

		@Override
		public void windowDeiconified(WindowEvent e) {
			// TODO �Զ����ɵķ������
			ta.append("���ڱ��ָ�!\n");
		}

		@Override
		public void windowActivated(WindowEvent e) {
			// TODO �Զ����ɵķ������
			ta.append("���ڱ�����!\n");
		}

		@Override
		public void windowDeactivated(WindowEvent e) {
			// TODO �Զ����ɵķ������
			ta.append("����ʧȥ����!\n");
		}
	}
	
	public static void main(String[] args){
		new WindowListenerTest().init();
	}
}
