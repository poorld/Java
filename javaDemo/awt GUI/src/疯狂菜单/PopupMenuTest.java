package ���˵�;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Frame;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.PopupMenu;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import ���java.WindowAdapterTest;

public class PopupMenuTest {
	private Frame f = new Frame("�Ҽ��˵�");
	private TextArea ta = new TextArea(6,30);
	PopupMenu pop = new PopupMenu();
	MenuItem copy = new MenuItem("����");
	MenuItem paste = new MenuItem("ճ��");
	MenuItem clean = new MenuItem("���");
	public void init(){
		//��ռ�����
		clean.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ta.setText(" ");
			}
		});
		f.setBackground(Color.BLUE);
		pop.add(copy);
		pop.addSeparator();//��ӷָ���
		pop.add(paste);
		pop.add(new MenuItem("-"));//��ӷָ���
		pop.add(clean);
		f.addWindowListener(new WindowAdapter(){
			public void windowClosing(WindowEvent e){
				System.exit(0);
			}
		});
		final Panel p = new Panel();
		p.setPreferredSize(new Dimension(300,160));
		p.add(pop);
		p.addMouseListener(new MouseAdapter(){
			public void mouseReleased(MouseEvent e){
				//����ͷŵ�������Ҽ�
				if (e.isPopupTrigger()){
					pop.show(p , e.getX() , e.getY());
				}
			}
		});
		f.add(p);
		f.add(ta,BorderLayout.NORTH);
		f.pack();
		f.setVisible(true);
	}
	public static void main(String[] args){
		new PopupMenuTest().init();
	}
}
