package 疯狂菜单;

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

import 疯狂java.WindowAdapterTest;

public class PopupMenuTest {
	private Frame f = new Frame("右键菜单");
	private TextArea ta = new TextArea(6,30);
	PopupMenu pop = new PopupMenu();
	MenuItem copy = new MenuItem("复制");
	MenuItem paste = new MenuItem("粘帖");
	MenuItem clean = new MenuItem("清空");
	public void init(){
		//清空监听器
		clean.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ta.setText(" ");
			}
		});
		f.setBackground(Color.BLUE);
		pop.add(copy);
		pop.addSeparator();//添加分割线
		pop.add(paste);
		pop.add(new MenuItem("-"));//添加分割线
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
				//如果释放的是鼠标右键
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
