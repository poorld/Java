package ���±�;
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class Test extends JFrame{
	
	JMenuBar cd;//�˵�
	JMenu cd1,cd2,cd3,cd4;//�˵�
	JMenuItem cdx2,cdx3,cdx4,cdx5,about;//�˵���
	
	JMenu ej;//�����˵�
	JMenuItem ej1,ej2;//�����˵���
	
	JToolBar gjt;//�Ѱ�ťͼƬ��ӽ�������
	JButton an1,an2,an3,an4,an5;
	
	JTextArea wbk;
	JScrollPane gdt;
	
	public static void main(String[] args) {
		Test t = new Test();
	}
	public Test(){
		cd = new JMenuBar();
		cd1 = new JMenu("�ļ�(F)");
		cd1.setMnemonic('F');
		cd2 = new JMenu("�༭(E)");
		cd2.setMnemonic('E');
		cd3 = new JMenu("�鿴(V)");
		cd3.setMnemonic('V');
		cd4 = new JMenu("����(H)");
		cd4.setMnemonic('H');
		cd4.setIcon(new ImageIcon("image/icon/help.png"));
		//����
		ej = new JMenu("�½�");
		
		ej1 = new JMenuItem("�ļ�");
		ej1.setIcon(new ImageIcon("image/icon/Document Blank.png"));
		ej2 = new JMenuItem("ģ��");
		ej2.setIcon(new ImageIcon("image/icon/Lamp.png"));
		cdx2 = new JMenuItem("��ӡ");
		cdx3 = new JMenuItem("��");
		cdx4 = new JMenuItem("����(S)");
		cdx4.setIcon(new ImageIcon("image/Open.png"));
		cdx4.setMnemonic('S');
		cdx5 = new JMenuItem("�˳�");
		about = new JMenuItem("����",new ImageIcon("image/icon/contacts.png"));
		
		//�����ر�
		cdx5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO �Զ����ɵķ������
				wbk.append("�ر�");
				System.exit(0);
			}
		});
		
		an1 = new JButton(new ImageIcon("image/New.png"));//�½�
		an1.setToolTipText("�½�");
		an2 = new JButton(new ImageIcon("image/Open.png"));//��
		an2.setToolTipText("��");
		an3 = new JButton(new ImageIcon("image/Copy.png"));//����
		an3.setToolTipText("����");
		an4 = new JButton(new ImageIcon("image/Paste.png"));//ճ��
		an4.setToolTipText("ճ��");
		an5 = new JButton(new ImageIcon("image/Save.png"));//����
		an5.setToolTipText("����");
		
		wbk = new JTextArea();
		gdt = new JScrollPane(wbk);
		
		//����
		ej.add(ej1);	ej.add(ej2);	
		cd1.add(ej);
		
		//�ļ��˵����ѡ�
		cd1.addSeparator();//�ָ�
		cd1.add(cdx2);	
		cd1.add(cdx3);	
		cd1.add(cdx4);	cd1.addSeparator();//�ָ�
		cd1.add(cdx5);
		
		//�����˵����ѡ�
		cd4.add(about);
		
		gjt = new JToolBar();
		gjt.add(an1);	gjt.add(an2);
		gjt.add(an3);	gjt.add(an4);
		gjt.add(an5);
		
		cd.add(cd1);	cd.add(cd2);
		cd.add(cd3);	cd.add(cd4);
		
		ImageIcon image = new ImageIcon("image/icon/notes.png");
		this.setIconImage(image.getImage());
		//this.add(cd);����
		this.setJMenuBar(cd);
		this.add(gjt,BorderLayout.NORTH);
		this.add(gdt);
		
		this.setVisible(true);
		this.setBounds(100, 50, 500, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
