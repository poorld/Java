package jdialog�Ի���;
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
		
		b1 = new JButton("�򿪾�̬�Ի���"); 
		b2 = new JButton("�򿪷Ǿ�̬�Ի���");
		b3 = new JButton("ȷ��");
		
		dialog.add(b3);
		f.add(b1);
		b1.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				//����Ϊ��̬
				dialog.setModal(true);
				dialog.setLayout(new BorderLayout());
				
				dialog.add(b3,BorderLayout.SOUTH);
				if(dialog.getComponents().length == 1){
					dialog.add(label,BorderLayout.CENTER);
				}
				label.setText("��̬�Ի��򣬵��ȷ����ť�ر�");
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
				label.setText("�Ǿ�̬�Ի��򣬵��ȷ����ť�ر�");
				dialog.setBounds(200, 200, 220, 200);
				dialog.setVisible(true);
			}
		});
		
		//Ϊ�Ի�������¼�
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				dialog.dispose();
			}
		});
		
		f.setLayout(new FlowLayout());
		f.setVisible(true);
		f.setBounds(100, 50, 500, 400);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}
