package cn.luhut;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Connect implements MouseListener{
	String ip;
	int port;
	Socket socket;
	
	JFrame f;
	JPanel mb;
	JLabel ip_bq,port_bq;
	JTextField ip_wbk,port_wbk;
	JButton con;
	
	public Connect(){
		
		
		f = new JFrame("����");
		mb = new JPanel();
		ip_bq = new JLabel("ip:");
		port_bq = new JLabel("�˿�:");
		ip_wbk = new JTextField(15);
		port_wbk = new JTextField(5);
		con = new JButton("����");
		con.addMouseListener(this);
		
		mb.add(ip_bq); 		mb.add(ip_wbk);
		mb.add(port_bq); 	mb.add(port_wbk);
		
		f.setLayout(new FlowLayout());
		f.add(mb,BorderLayout.CENTER);
		f.add(con,FlowLayout.CENTER);
		
		f.setVisible(true);
		f.setBounds(100, 100, 400, 80);
	}
//	public static void main(String[] args){
//		Connect connect = new Connect();
//	}
	
	public String getIP(){
		return ip;
	}
	public int getPORT(){
		return port;
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO �Զ����ɵķ������
		ip = ip_wbk.getText();
		String str = port_wbk.getText();
		port = Integer.parseInt(str);//Stringת��Ϊint
		System.out.println(ip+":"+port);
		try {
			socket = new Socket(ip,port);
			if (socket.isBound()){
				f.dispose();
				System.out.println("���ӳɹ�......\n");
				//Client client = new Client(socket);
				//client.run();
			}
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
