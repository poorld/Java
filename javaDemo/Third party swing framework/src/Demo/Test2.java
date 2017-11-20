package Demo;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
import org.jb2011.lnf.beautyeye.ch3_button.BEButtonUI;
import org.w3c.dom.events.MouseEvent;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.io.IOException;

import javax.swing.*;


public class Test2{
	private JFrame f;
	private JLabel labelbg;
	private JPanel mb2,mb3;
	private JLabel zh,mm;
	private JTextField wbk;
	private JPasswordField mmk;
	private JButton bt1,bt2;
	
	public Test2(){
		try {
			//设置本属性将改变窗口边框样式定义 
			BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.translucencyAppleLike;//强立体半透明
			
			/*
			 * 将你的Java程序界面更换成Beauty Eye的外观
			 */
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
		} 
		catch (Exception e) {
			e.printStackTrace();
		}
		
		/***************************************** 组件初始化区域********************************************/
		f = new JFrame("登陆");
		mb2 = new JPanel();
		mb3 = new JPanel();
		zh = new JLabel("帐号：",JLabel.CENTER);
		zh.setForeground(Color.BLACK);
		zh.setFont(new Font("宋体",Font.PLAIN,16));
		mm = new JLabel("密码：",JLabel.CENTER);
		mm.setForeground(Color.BLACK);
		mm.setFont(new Font("宋体",Font.PLAIN,16));
		wbk = new JTextField(15);
		mmk = new JPasswordField(15);
		bt1 = new JButton("登录");
		bt1.setForeground(Color.WHITE);;
		bt1.setFont(new Font("宋体",Font.PLAIN,14));
		bt1.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.blue));//蓝色按钮
		bt2 = new JButton("注册");
		bt2.setForeground(Color.WHITE);;
		bt2.setFont(new Font("宋体",Font.PLAIN,14));
		bt2.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.green));//绿色按钮
		
		
		/***************************************** 事件监听器添加 ********************************************/
		//登录按钮添加监听器
		bt1.addMouseListener(new bt1Listener());
		//注册按钮添加监听器
		bt2.addMouseListener(new bt2Listener());
		//密码框回车监听
		mmk.addKeyListener(new mmkListener());
		
		/***************************************** 组件添加区域  ********************************************/
		labelbg = new JLabel(new ImageIcon("image/1.jpg"));
		
		mb2.setLayout(new GridLayout(2,1));
		mb2.add(zh);	mb2.add(wbk);
		mb2.add(mm);	mb2.add(mmk);
		
		mb3.setLayout(new GridLayout(1,2));
		mb3.add(bt1);	mb3.add(bt2);
		
		f.add(labelbg,BorderLayout.NORTH);
		f.add(mb2);
		f.add(mb3,BorderLayout.SOUTH);
		/*****************************************组件添加区域********************************************/

		
		f.setVisible(true);
		f.setResizable(false);
		f.setLocation(200, 200);
		f.setSize(390, 280);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	//按钮1监听器
	public class bt1Listener implements MouseListener{
		@Override
		public void mouseClicked(java.awt.event.MouseEvent e) {
			// TODO 自动生成的方法存根
			if (null == wbk.getText() || "".equals(wbk.getText()))
			{
				JOptionPane.showMessageDialog(null, "用户名不能为空");
			}
			else if (null == mmk.getText() || "".equals(mmk.getText())){
				JOptionPane.showMessageDialog(null, "密码不能为空");
			}
			else if (null != wbk && "1039059930".equals(wbk.getText()) &&
					 null != mmk && "12345".equals(mmk.getText())){
				JOptionPane.showMessageDialog(null, "登录成功!\n帐号为:" + wbk.getText() + "\n"
						+ "密码为:" + mmk.getText());
			}
			else{
				JOptionPane.showMessageDialog(null, "帐号或密码错误！");
			}
		}
		@Override
		public void mousePressed(java.awt.event.MouseEvent e) {}
		@Override
		public void mouseReleased(java.awt.event.MouseEvent e) {}
		@Override
		public void mouseEntered(java.awt.event.MouseEvent e) {}
		@Override
		public void mouseExited(java.awt.event.MouseEvent e) {}

	}
	
	//按钮2监听器
	public class bt2Listener implements MouseListener{
		@Override
		public void mouseClicked(java.awt.event.MouseEvent e) {
			// TODO 自动生成的方法存根
			JOptionPane.showMessageDialog(null, "注册请打开:\n" + "http://flypig.pw");
			try {
				Runtime.getRuntime().exec("rundll32 url.dll,FileProtocolHandler http://flypig.pw");
			} catch (IOException e1) {
				// TODO 自动生成的 catch 块
				e1.printStackTrace();
			}
		}
		@Override
		public void mousePressed(java.awt.event.MouseEvent e) {}
		@Override
		public void mouseReleased(java.awt.event.MouseEvent e) {}
		@Override
		public void mouseEntered(java.awt.event.MouseEvent e) {}
		@Override
		public void mouseExited(java.awt.event.MouseEvent e) {}
	}
	
	//密码框回车监听
	public class mmkListener implements KeyListener{
		@Override
		public void keyTyped(KeyEvent e) {
			// TODO 自动生成的方法存根
		}

		@Override
		public void keyPressed(KeyEvent e) {
			// TODO 自动生成的方法存根	
			if (e.getKeyCode() == KeyEvent.VK_ENTER){
				new bt1Listener().mouseClicked(null);
			}
		}

		@Override   
		public void keyReleased(KeyEvent e) {
			// TODO 自动生成的方法存根
		}
	}
	
	
	public static void main(String args[]){
		/*隐藏设置按钮
		设置此开关量为false即表示关闭之，BeautyEye LNF中默认是true 
		*/
		UIManager.put("RootPane.setupButtonVisible", false); 
		new Test2();
	}

}
