package chat;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

import javax.swing.JTextArea;

public class Receive implements Runnable{
	private DatagramSocket ds;
	private JTextArea wby;
	public Receive(DatagramSocket ds,JTextArea wby){
		this.ds = ds;
		this.wby = wby;
	}

	public void run(){
		try{
			while (true){
				byte[] buf = new byte[1024];
				DatagramPacket dp = new DatagramPacket(buf,buf.length);
				ds.receive(dp);
				String ip = dp.getAddress().getHostAddress();
				int port = dp.getPort();
				String data = new String(dp.getData(),0,dp.getLength());
				wby.append("ip" +ip+ ":" + port +"-->"+ data+"\n");
			}
		}
		catch(Exception e){
			throw new RuntimeException("Ω” ’∂À ß∞‹£°");
		}
	}
}