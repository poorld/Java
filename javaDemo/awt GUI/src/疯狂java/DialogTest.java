package 疯狂java;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dialog;
import java.awt.Frame;
import java.awt.Label;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class DialogTest {
	Frame f = new Frame("测试");
	Dialog d1 = new Dialog(f, "模式对话框", true);
	Dialog d2 = new Dialog(f, "非模式对话框", false);
	Button b1 = new Button("打开模式对话框");
	Button b2 = new Button("打开非模式对话框");
	public void init(){
		d1.setBounds(20 , 30 , 300 , 400);
		Label l1 = new Label("模式对话框");
		d1.add(l1);
		
		d2.setBounds(20 , 30 , 300 , 400);
		Label l2 = new Label("非模式对话框");
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
