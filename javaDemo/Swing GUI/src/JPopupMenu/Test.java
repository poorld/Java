package JPopupMenu;
import java.awt.*;

import javax.swing.*;

import java.awt.Event;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Test extends JFrame{
	JPopupMenu pop;
	//JMenuItem m1,m2;
	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new Test();
	}
	public Test(){
		pop = new JPopupMenu();
		JMenuItem m1 = new JMenuItem("模式");
		JMenuItem m2 = new JMenuItem("退出");
		
		//按钮2 添加事件监听器
		m2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				System.exit(0);
			}
		});
		
		m1.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//jdialog对话框.Test tanchu = new jdialog对话框.Test();
			}
		});
		
		this.addMouseListener(new MouseAdapter(){
			public void mouseCliked(MouseEvent e){
				if (e.getButton() == e.BUTTON3){
					pop.show(e.getComponent(), e.getX(), e.getY());
				}
			}
		});
		
		pop.add(m1);
		pop.add(m2);
		
		this.add(pop);
		
		this.setSize(300, 300);
		this.setVisible(true);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}
