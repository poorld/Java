package UDP;

import java.io.IOException;
import java.net.*;

public class udpReceive {

	public static void main(String[] args) {
		try {
			DatagramSocket ds = new DatagramSocket(10390);
			while (true){
			byte[] buf = new byte[1024];
			DatagramPacket dp = new DatagramPacket(buf,buf.length);

			try {
				ds.receive(dp);
			} catch (IOException e) {
				e.printStackTrace();
			}
			String data = new String(dp.getData(),0,dp.getLength());
			String ip = dp.getAddress().getHostAddress();
			int port = dp.getPort();
			System.out.println(ip+":"+port+ "\t–≈œ¢:" + data);
			//ds.close();
			}
		} catch (SocketException e) {
			e.printStackTrace();
		}
	}

}
