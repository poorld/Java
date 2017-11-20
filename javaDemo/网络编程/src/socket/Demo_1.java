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
			//����UDP����ͨ��DatagramSocket����
			DatagramSocket dgs = new DatagramSocket(666);
			
			//ȷ�����ݣ�����װ�����ݰ���
			//DatagramPacket(byte[] buf, int offset, int length, InetAddress address, int port)
			Scanner sc = new Scanner(System.in);
			String s = sc.nextLine();
			byte[] buf = s.getBytes();
			DatagramPacket dgp = 
					new DatagramPacket(buf, buf.length,InetAddress.getByName("127.0.0.1"),10390);//����10390�˿�
			
			//ͨ��socket���񣬽����ݰ����ͳ�ȥ
			try {
				dgs.send(dgp);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			//�ر���Դ
			dgs.close();
		} catch (SocketException | UnknownHostException e) {
			e.printStackTrace();
		}
	}
	
	public static void UDPreceive(){
		System.out.println("���ڼ���");
		try {
			DatagramSocket dgs = new DatagramSocket(10390);//����10390�˿�
			
			//�������ݰ�:DatagramPacket(byte[] buf, int length) 
			byte[] buf = new byte[1024];
			DatagramPacket dgp = new DatagramPacket(buf,buf.length);
			
			//ͨ��receive�������յ����ݴ�ŵ����ݰ���
			try {
				dgs.receive(dgp);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			//��ȡ��ַ
			String ip = dgp.getAddress().getHostAddress();
			
			//��ȡ�˿�(�Է��Ķ˿�)
			int port = dgp.getPort();
			
			//��ȡ���͵�����
			String data = new String(dgp.getData(),0,dgp.getLength());
			
			System.out.println(ip + ":" + port + " ������Ϣ��");
			System.out.println(data.toString());
		} catch (SocketException e) {
			e.printStackTrace();
		}
	}
}
