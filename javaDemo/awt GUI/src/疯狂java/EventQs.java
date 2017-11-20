package 疯狂java;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EventQs{
	private Frame f = new Frame("test");
	private Button b = new Button("ok");
	private TextField tf = new TextField(30);
	public void init(){
		//注册事件监听器
		b.addActionListener(new OkListener());
		f.add(tf);
		f.add(b , BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
	//定义事件监听器类
	class OkListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.out.println("单击了ok");
			tf.setText("你他妈单击了OK键！");
		}
	}
	public static void main(String[] args){
		new EventQs().init();;
	}
	
}
