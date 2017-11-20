package ·è¿ñjava;

import java.awt.Frame;
import java.awt.TextArea;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowAdapterTest {
	private Frame f = new Frame("²âÊÔ");
	private TextArea ta = new TextArea(6 ,30);
	public void init(){
		f.addWindowListener(new MyAdapter());
		f.add(ta);
		f.pack();
		f.setVisible(true);
	}
	class MyAdapter extends WindowAdapter{
		public void windowClosing(WindowEvent e){
			ta.setText("¹Ø±Õ´°¿Ú!");
			System.out.println("¹Ø±Õ´°¿Ú£¡");
			System.exit(0);
		}
	}
	public static void main(String[] args){
		new WindowAdapterTest().init();
	}
	
}
