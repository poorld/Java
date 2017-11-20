package ���java;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class AnonymousEventHandler {
	private Frame f = new Frame("�����ڲ��������");
	private TextArea ta = new TextArea(8,50);
	public void init(){
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.out.println("�رմ��ڣ�");
				System.exit(0);
			}
		});
		f.add(ta);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args){
		new AnonymousEventHandler().init();
	}
}
