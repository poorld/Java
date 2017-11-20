package 疯狂java;

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
	private Button b1 = new Button("按钮1");
	private Button b2 = new Button("按钮2");
	private Button b3 = new Button("清空");
	public void init(){
		//创建 FirstListener监听器实例
		FirstListener fl = new FirstListener();
		b1.addActionListener(fl);
		b1.addActionListener(new SecondListener());
		b2.addActionListener(new SecondListener());
		b3.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				//把文本内容设为空
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
		Button qq = new Button("联系QQ");
		qq.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				ta.setText("联系QQ：1039059930");
			}
		});
		p2.add(qq);
		f.add(p2 , BorderLayout.NORTH);
		
		//为Frame窗口添加关闭方法
		f.addWindowListener(new WindowClose());
		f.pack();
		f.setVisible(true);
	}
	class FirstListener implements ActionListener{
		public void actionPerformed(ActionEvent e){
			ta.append("第一个事件监听器被触发，事件源是:" + e.getActionCommand() + "\n");
		}
	}
	class SecondListener implements ActionListener {
		public void actionPerformed(ActionEvent e){
			ta.append("单击了：" + e.getActionCommand() + "按钮\n");
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
