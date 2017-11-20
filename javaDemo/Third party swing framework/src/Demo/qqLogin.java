package Demo;
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dialog;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JRootPane;
import javax.swing.JTextField;
import javax.swing.UIManager;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;
import org.jb2011.lnf.beautyeye.ch3_button.BEButtonUI;

public class qqLogin {
	private boolean wbkClick = false;//文本框字体
	private JFrame f;
	private JPanel mb;
	private JPanel btnmb;
	private JLabel zh,mm;
	private JTextField wbk;
	private JPasswordField mmk;
	private JButton btn1,btn2;
	
	public qqLogin(){
		try {
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
			BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.frameBorderStyle.translucencyAppleLike;
		} catch (Exception e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
		
		f = new JFrame("登录");
		mb = new JPanel();
		btnmb = new JPanel();
		zh = new JLabel("帐号:",JLabel.CENTER);//静态文本
		wbk = new JTextField("输入帐号",30);
		wbk.addMouseListener(new MyMouseAdapter());
		mm = new JLabel("密码:",JLabel.CENTER);
		mmk = new JPasswordField(30);
		
		btn1 = new JButton("登录");
		btn1.addMouseListener(new btn1Listner());
		btn2 = new JButton("重置");
		btn2.addMouseListener(new btn2Listener());
		//**设置按钮颜色
		btn1.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.green));
		btn2.setUI(new BEButtonUI().setNormalColor(BEButtonUI.NormalColor.red));

		//**设置按钮颜色
		//mb.setLayout(new FlowLayout());   //默认是FlowLayout
		mb.add(zh);	mb.add(wbk);
		mb.add(mm);	mb.add(mmk);
		
		btnmb.add(btn1);
		btnmb.add(btn2);
		
		f.add(mb);
		f.add(btnmb,BorderLayout.SOUTH);
		
		f.setVisible(true);
		f.setSize(300, 190);
		f.setResizable(false);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setLocationRelativeTo(null);           //让窗体居中显示	
	}
	
	//第一次点击帐号框清空
	public class MyMouseAdapter extends MouseAdapter{
		public void mouseClicked(MouseEvent e){
			if (wbkClick == false){
			wbk.setText("");
			wbkClick = true;
			}
		}
	}
	//重置按钮监听器
	public class btn2Listener extends MouseAdapter{
		public void mouseClicked(MouseEvent e){
			//全部清空
			wbk.setText("");
			mmk.setText("");
		}
	}
	
	//登录按钮监听器
	public class btn1Listner extends MouseAdapter{
		public void mouseClicked(MouseEvent e){
			System.out.println("操你妈、");
		}
	}
	
	public static void main(String[] args){
		UIManager.put("RootPane.setupButtonVisible", false); 
		//设置此开关量为false即表示关闭之，BeautyEye LNF中默认是true 
		new qqLogin();
	}
}
