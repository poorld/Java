package chat;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.net.DatagramSocket;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;

import org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper;

class Main {
	JTextArea wby;
	JTextField wbk;
	public Main(){
		try {
			//设置本属性将改变窗口边框样式定义 
			BeautyEyeLNFHelper.frameBorderStyle = BeautyEyeLNFHelper.FrameBorderStyle.translucencyAppleLike;
			org.jb2011.lnf.beautyeye.BeautyEyeLNFHelper.launchBeautyEyeLNF();
		} catch (Exception e) {
			e.printStackTrace();
		}
		gui();
		chat();
	}
	
	
	public void chat(){
		try{
			DatagramSocket dsSend = new DatagramSocket();//我的端口
			DatagramSocket dsRece = new DatagramSocket(10390);//监听端口

			new Thread(new Send(dsSend,wbk)).start();
			new Thread(new Receive(dsRece,wby)).start();
		}catch(Exception e){
			System.out.println("请检查端口是否被占用!");
			e.printStackTrace();
		}
	}
	public void gui(){
		JFrame f;
		JPanel mb;
		JLabel bq;
		JButton btn;
		JScrollPane gdt;

		
		f = new JFrame("聊天");

		mb = new JPanel();
		bq = new JLabel("和某某某聊天");
		wby = new JTextArea(40,10);
		wby.setEditable(false);
		gdt = new JScrollPane(wby);
		wbk = new JTextField(60);
		btn = new JButton("发送");
		btn.addMouseListener(new btnListener(wbk,wby));
		wbk.addKeyListener(new mykeyListener(wbk,wby));
		
		mb.add(wbk);
		mb.add(btn);
		//f.setLayout(new GridLayout(3,1));
		//f.setResizable(false);
		//f.add(bq,BorderLayout.NORTH);
		f.add(gdt);
		f.add(mb,BorderLayout.SOUTH);
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100, 100, 500, 300);
	}
	
}