package socket;
import java.io.IOException;
import java.net.*;
import java.util.Scanner;

public class Demo_1 {
	
	public static void main(String[] args){
		UDPsend();
		//UDPreceive();
	}
	
	public static void UDPsend(){
		try {
			//创建UDP服务，通过DatagramSocket对象
			DatagramSocket dgs = new DatagramSocket(666);
			
			//确定数据，并封装成数据包：
			//DatagramPacket(byte[] buf, int offset, int length, InetAddress address, int port)
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			byte[] buf = s.getBytes();
			DatagramPacket dgp = 
					new DatagramPacket(buf, buf.length,InetAddress.getByName("127.0.0.1"),10390);//发到10390端口
			
			//通过socket服务，将数据包发送出去
			try {
				dgs.send(dgp);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			//关闭资源
			dgs.close();
		} catch (SocketException | UnknownHostException e) {
			e.printStackTrace();
		}
	}
	
	public static void UDPreceive(){
		System.out.println("正在监听");
		try {
			DatagramSocket dgs = new DatagramSocket(10390);//监听10390端口
			
			//定义数据包:DatagramPacket(byte[] buf, int length) 
			byte[] buf = new byte[1024];
			DatagramPacket dgp = new DatagramPacket(buf,buf.length);
			
			//通过receive方法将收到数据存放到数据包中
			try {
				dgs.receive(dgp);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			//获取地址
			String ip = dgp.getAddress().getHostAddress();
			
			//获取端口(对方的端口)
			int port = dgp.getPort();
			
			//获取发送的内容
			String data = new String(dgp.getData(),0,dgp.getLength());
			
			System.out.println(ip + ":" + port + " 发来信息：");
			System.out.println(data.toString());
		} catch (SocketException e) {
			e.printStackTrace();
		}
	}
}
