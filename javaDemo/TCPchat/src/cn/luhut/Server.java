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
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Server implements MouseListener{
	
	ServerSocket ss;
	Socket socket;
	static String ip;
	static int port;
	
	JFrame f;
	JPanel mb;
	JTextArea wby;
	JTextField wbk;
	JButton send;
	JScrollPane gdt;
	
	String inMessage,outMessage;
	
	public Server(){
		f = new JFrame("������");
		mb = new JPanel();
		wbk = new JTextField(20);
		wby = new JTextArea(30,10);
		send = new JButton("����");
		send.addMouseListener(this);
		gdt = new JScrollPane(wby);
		
		mb.add(wbk); mb.add(send);
		
		f.add(gdt,BorderLayout.CENTER);
		f.add(mb,BorderLayout.SOUTH);
		
		f.setVisible(true);
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setBounds(100, 100, 500, 300);
	}

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Server server = new Server();
		server.run();
	}

	
	//������Ϣ
	public void run(){
		try {
			ss = new ServerSocket(10390);
			socket = ss.accept();
			if (socket.isBound()){
				wby.append("���ӳɹ�......\n");
				wby.append("ip"+socket.getInetAddress().getHostAddress()+":"+socket.getPort()+"\n");
			}
			BufferedReader bufr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			//BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
			while ((inMessage=bufr.readLine())!=null){
				wby.append("�ͻ���:" + inMessage + "\n");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

	@Override//������Ϣ
	public void mouseClicked(MouseEvent e) {
		// TODO �Զ����ɵķ������
		try {
			//BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter pw = new PrintWriter(socket.getOutputStream());
			outMessage = wbk.getText();
			wby.append("������:"+outMessage+"\n");
			pw.println(outMessage);
			pw.flush();
			wbk.setText("");
			
		} catch (UnknownHostException e1) {
			// TODO �Զ����ɵ� catch ��
			e1.printStackTrace();
		} catch (IOException e1) {
			// TODO �Զ����ɵ� catch ��
			e1.printStackTrace();
		}
	
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO �Զ����ɵķ������
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO �Զ����ɵķ������
		
	}

}
