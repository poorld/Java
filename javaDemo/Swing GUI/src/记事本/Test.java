package 记事本;
import java.awt.*;

import javax.swing.*;

import java.awt.event.*;

public class Test extends JFrame{
	
	JMenuBar cd;//菜单
	JMenu cd1,cd2,cd3,cd4;//菜单
	JMenuItem cdx2,cdx3,cdx4,cdx5,about;//菜单项
	
	JMenu ej;//二级菜单
	JMenuItem ej1,ej2;//二级菜单项
	
	JToolBar gjt;//把按钮图片添加进工具条
	JButton an1,an2,an3,an4,an5;
	
	JTextArea wbk;
	JScrollPane gdt;
	
	public static void main(String[] args) {
		Test t = new Test();
	}
	public Test(){
		cd = new JMenuBar();
		cd1 = new JMenu("文件(F)");
		cd1.setMnemonic('F');
		cd2 = new JMenu("编辑(E)");
		cd2.setMnemonic('E');
		cd3 = new JMenu("查看(V)");
		cd3.setMnemonic('V');
		cd4 = new JMenu("帮助(H)");
		cd4.setMnemonic('H');
		cd4.setIcon(new ImageIcon("image/icon/help.png"));
		//二级
		ej = new JMenu("新建");
		
		ej1 = new JMenuItem("文件");
		ej1.setIcon(new ImageIcon("image/icon/Document Blank.png"));
		ej2 = new JMenuItem("模版");
		ej2.setIcon(new ImageIcon("image/icon/Lamp.png"));
		cdx2 = new JMenuItem("打印");
		cdx3 = new JMenuItem("打开");
		cdx4 = new JMenuItem("保存(S)");
		cdx4.setIcon(new ImageIcon("image/Open.png"));
		cdx4.setMnemonic('S');
		cdx5 = new JMenuItem("退出");
		about = new JMenuItem("关于",new ImageIcon("image/icon/contacts.png"));
		
		//监听关闭
		cdx5.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO 自动生成的方法存根
				wbk.append("关闭");
				System.exit(0);
			}
		});
		
		an1 = new JButton(new ImageIcon("image/New.png"));//新建
		an1.setToolTipText("新建");
		an2 = new JButton(new ImageIcon("image/Open.png"));//打开
		an2.setToolTipText("打开");
		an3 = new JButton(new ImageIcon("image/Copy.png"));//复制
		an3.setToolTipText("复制");
		an4 = new JButton(new ImageIcon("image/Paste.png"));//粘贴
		an4.setToolTipText("粘帖");
		an5 = new JButton(new ImageIcon("image/Save.png"));//保存
		an5.setToolTipText("保存");
		
		wbk = new JTextArea();
		gdt = new JScrollPane(wbk);
		
		//二级
		ej.add(ej1);	ej.add(ej2);	
		cd1.add(ej);
		
		//文件菜单添加选项卡
		cd1.addSeparator();//分隔
		cd1.add(cdx2);	
		cd1.add(cdx3);	
		cd1.add(cdx4);	cd1.addSeparator();//分隔
		cd1.add(cdx5);
		
		//帮助菜单添加选项卡
		cd4.add(about);
		
		gjt = new JToolBar();
		gjt.add(an1);	gjt.add(an2);
		gjt.add(an3);	gjt.add(an4);
		gjt.add(an5);
		
		cd.add(cd1);	cd.add(cd2);
		cd.add(cd3);	cd.add(cd4);
		
		ImageIcon image = new ImageIcon("image/icon/notes.png");
		this.setIconImage(image.getImage());
		//this.add(cd);错误
		this.setJMenuBar(cd);
		this.add(gjt,BorderLayout.NORTH);
		this.add(gdt);
		
		this.setVisible(true);
		this.setBounds(100, 50, 500, 400);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
}
