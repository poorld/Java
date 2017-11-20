package ���java;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowAdapterTest {
	private Frame f = new Frame("����");
	private TextArea ta = new TextArea(6 ,30);
	public void init(){
		f.addWindowListener(new MyAdapter());
		f.add(ta);
		f.pack();
		f.setVisible(true);
	}
	class MyAdapter extends WindowAdapter{
		public void windowClosing(WindowEvent e){
			ta.setText("�رմ���!");
			System.out.println("�رմ��ڣ�");
			System.exit(0);
		}
	}
	public static void main(String[] args){
		new WindowAdapterTest().init();
	}
	
}
