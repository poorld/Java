package ���java;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogTest {
	Frame f = new Frame("����");
	Dialog d1 = new Dialog(f, "ģʽ�Ի���", true);
	Dialog d2 = new Dialog(f, "��ģʽ�Ի���", false);
	Button b1 = new Button("��ģʽ�Ի���");
	Button b2 = new Button("�򿪷�ģʽ�Ի���");
	public void init(){
		d1.setBounds(20 , 30 , 300 , 400);
		Label l1 = new Label("ģʽ�Ի���");
		d1.add(l1);
		
		d2.setBounds(20 , 30 , 300 , 400);
		Label l2 = new Label("��ģʽ�Ի���");
		d2.add(l2);
		b1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				d1.setVisible(true);
			}
		});
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				d2.setVisible(true);
			}
		});
		f.add(b1);
		f.add(b2 , BorderLayout.SOUTH);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args){
		new DialogTest().init();
	}
}
