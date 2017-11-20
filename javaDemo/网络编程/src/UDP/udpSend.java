package UDP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class udpSend {

	public static void main(String[] args) {
		try {
			DatagramSocket ds = new DatagramSocket(666);
			BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
			String line = null;
			while (true){
				try {
					line = bufr.readLine();
					if (line.equals("886")){
						break;
					}
				} catch (IOException e1) {
					e1.printStackTrace();
				}
				byte[] buf = line.getBytes();
				DatagramPacket dp = new DatagramPacket(buf, buf.length, InetAddress.getByName("127.0.0.1"), 10390);
				try {
					ds.send(dp);
				} catch (IOException e) {
					e.printStackTrace();
				}
				finally{
					ds.close();
				}
			}
		} catch (SocketException | UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
