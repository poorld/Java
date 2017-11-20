package frame;

import java.awt.*;

public class Test {
	public static void main(String[] args) {
		Test t = new Test();
		MyFrame f = t.new MyFrame(400,400,400,400,Color.BLUE);
	}
	
	public class MyFrame extends Frame{
		private Panel p1,p2,p3,p4;
		public MyFrame(int x,int y,int w, int h,Color color){
			super("my frame");
			setLayout(null);
			setBounds(x,y,w,h);
			setBackground(color);
			
			p1 = new Panel(null);
			p1.setBounds(0,0, w/2, h/2);
			p1.setBackground(Color.RED);
			
			p2 = new Panel(null);
			p2.setBounds(w/2,0,w/2,h/2);
			p2.setBackground(Color.GREEN);
			
			p3 = new Panel(null);
			p3.setBounds(0,h/2,w/2,h/2);
			p3.setBackground(Color.BLACK);
			
			p4 = new Panel(null);
			p4.setBounds(w/2,h/2,w/2,h/2);
			p4.setBackground(Color.YELLOW);
			
			add(p1);
			add(p2);
			add(p3);
			add(p4);
			setVisible(true);
		}
	}
}
