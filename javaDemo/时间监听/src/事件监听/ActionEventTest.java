package 事件监听;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ActionEventTest {
	public static void main(String[] args){
		ActionEventTest ae = new ActionEventTest();
		Frame f = new Frame("event");
		Button b = new Button("点我");
		Monitor m = ae.new Monitor();
		b.addActionListener(m);
		f.add(b, BorderLayout.CENTER);
		f.pack();
		f.setVisible(true);;
	}
	
	class Monitor implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.out.println("点你麻痹");
		}
	}
}
