package chat;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

import javax.swing.JTextArea;
import javax.swing.JTextField;

public class Send implements Runnable{
	private DatagramSocket ds;
	private JTextField wbk;

	public Send(DatagramSocket ds,JTextField wbk){
		this.ds = ds;
		this.wbk = wbk;
	}

	public void run(){
		try{
			BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));	
			byte[] buf = new byte[1024];
			String line = null;
			while ((line=wbk.getText()) != "∞›∞›"){
				buf = line.getBytes();
				DatagramPacket dp = new DatagramPacket(buf,buf.length,InetAddress.getByName("127.0.0.1"),666);
				ds.send(dp);
			}
		}
		catch(Exception e){
			throw new RuntimeException("∑¢ÀÕ∂À ß∞‹£°");
		}
	}
}