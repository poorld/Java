package cn.luhut;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Client implements MouseListener{
	String ip;
	int port;
	Socket socket;

	
	JFrame f;
	JPanel mb;
	JTextArea wby;
	JTextField wbk;
	JButton send;
	JScrollPane gdt;
	
	String inMessage,outMessage;
	
	public Client(){
		//this.ip = ip;
		//this.port = port;
		this.socket = socket;
		f = new JFrame("客户端");
		mb = new JPanel();
		wbk = new JTextField(20);
		wby = new JTextArea(30,10);
		send = new JButton("发送");
		send.addMouseListener(this);
		gdt = new JScrollPane(wby);
		
		mb.add(wbk); mb.add(send);
		
		f.add(gdt,BorderLayout.CENTER);
		f.add(mb,BorderLayout.SOUTH);
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100, 100, 500, 300);
	}

	public static void main(String[] args){
		Client client = new Client();
		client.run();
	}
	
	//接收信息
	public void run(){
		try {
			socket = new Socket("127.0.0.1",10390);
			if (socket.isBound()){
				wby.append("连接成功......\n");
				wby.append("ip"+socket.getInetAddress().getHostAddress()+":"+
				socket.getPort()+"\n");
			}
			BufferedReader bufr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
			while ((inMessage=bufr.readLine())!=null){
				wby.append("服务器:" + inMessage + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override//发送信息
	public void mouseClicked(MouseEvent e) {
		// TODO 自动生成的方法存根
		try {
			//BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			outMessage = wbk.getText();
			wbk.setText("");
			wby.append("客户端:"+outMessage+"\n");
			pw.println(outMessage);
			pw.flush();
			
			
		} catch (UnknownHostException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO 自动生成的 catch 块
			e1.printStackTrace();
		}
	
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO 自动生成的方法存根
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO 自动生成的方法存根
		
	}

}
