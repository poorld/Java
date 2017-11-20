package jdialog对话框;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class Test {

	JFrame f;
	JDialog dialog;
	JButton b1,b2,b3;
	JLabel label;
	
	public static void main(String[] args) {
		Test t = new Test();
	}
	
	public Test(){
		f = new JFrame("DialogTest");
		final JDialog dialog = new JDialog(f, "Dialog");
		final JLabel label = new JLabel();
		
		b1 = new JButton("打开静态对话框"); 
		b2 = new JButton("打开非静态对话框");
		b3 = new JButton("确定");
		
		dialog.add(b3);
		f.add(b1);
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//设置为静态
				dialog.setModal(true);
				dialog.setLayout(new BorderLayout());
				
				dialog.add(b3,BorderLayout.SOUTH);
				if(dialog.getComponents().length == 1){
					dialog.add(label,BorderLayout.CENTER);
				}
				label.setText("静态对话框，点击确定按钮关闭");
				dialog.setBounds(200, 200, 220, 200);
				dialog.setVisible(true);
			}
		});
		
		f.add(b2);
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				dialog.setModal(false);
				dialog.setLayout(new BorderLayout());
				
				dialog.add(b3,BorderLayout.SOUTH);
				if (dialog.getComponents().length == 1){
					dialog.add(label,BorderLayout.CENTER);
				}
				label.setText("非静态对话框，点击确定按钮关闭");
				dialog.setBounds(200, 200, 220, 200);
				dialog.setVisible(true);
			}
		});
		
		//为对话框添加事件
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				dialog.dispose();
			}
		});
		
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		f.setBounds(100, 50, 500, 400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
