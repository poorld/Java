package ���java;

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
		//ע���¼�������
		b.addActionListener(new OkListener());
		f.add(tf);
		f.add(b , BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
	//�����¼���������
	class OkListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			System.out.println("������ok");
			tf.setText("�����赥����OK����");
		}
	}
	public static void main(String[] args){
		new EventQs().init();;
	}
	
}
