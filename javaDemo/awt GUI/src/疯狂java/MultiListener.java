package ���java;

import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextArea;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class MultiListener {
	private Frame f = new Frame("Test");
	private TextArea ta = new TextArea();
	private Button b1 = new Button("��ť1");
	private Button b2 = new Button("��ť2");
	private Button b3 = new Button("���");
	public void init(){
		//���� FirstListener������ʵ��
		FirstListener fl = new FirstListener();
		b1.addActionListener(fl);
		b1.addActionListener(new SecondListener());
		b2.addActionListener(new SecondListener());
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//���ı�������Ϊ��
				ta.setText("");
			}
		}); 
		f.add(ta);
		Panel p = new Panel();
		p.add(b1);
		p.add(b2);
		p.add(b3);
		f.add(p , BorderLayout.SOUTH);
		
		Panel p2 = new Panel();
		Button qq = new Button("��ϵQQ");
		qq.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ta.setText("��ϵQQ��1039059930");
			}
		});
		p2.add(qq);
		f.add(p2 , BorderLayout.NORTH);
		
		//ΪFrame������ӹرշ���
		f.addWindowListener(new WindowClose());
		f.pack();
		f.setVisible(true);
	}
	class FirstListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			ta.append("��һ���¼����������������¼�Դ��:" + e.getActionCommand() + "\n");
		}
	}
	class SecondListener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			ta.append("�����ˣ�" + e.getActionCommand() + "��ť\n");
		}
	}
	class WindowClose implements WindowListener{
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}
		public void windowOpened(WindowEvent e) { }
		public void windowClosed(WindowEvent e) { }
		public void windowIconified(WindowEvent e) { }
		public void windowDeiconified(WindowEvent e) { }
		public void windowActivated(WindowEvent e) { }
		public void windowDeactivated(WindowEvent e) {}
	}
	
	public static void main(String[] args){
		new MultiListener().init();
	}
}
