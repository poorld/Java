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
			//���ñ����Խ��ı䴰�ڱ߿���ʽ���� 
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
			DatagramSocket dsSend = new DatagramSocket();//�ҵĶ˿�
			DatagramSocket dsRece = new DatagramSocket(10390);//�����˿�

			new Thread(new Send(dsSend,wbk)).start();
			new Thread(new Receive(dsRece,wby)).start();
		}catch(Exception e){
			System.out.println("����˿��Ƿ�ռ��!");
			e.printStackTrace();
		}
	}
	public void gui(){
		JFrame f;
		JPanel mb;
		JLabel bq;
		JButton btn;
		JScrollPane gdt;

		
		f = new JFrame("����");

		mb = new JPanel();
		bq = new JLabel("��ĳĳĳ����");
		wby = new JTextArea(40,10);
		wby.setEditable(false);
		gdt = new JScrollPane(wby);
		wbk = new JTextField(60);
		btn = new JButton("����");
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