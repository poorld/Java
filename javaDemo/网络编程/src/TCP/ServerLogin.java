package TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class ServerLogin {

	public static void main(String[] args) {
		
			System.out.println("���ڼ����ͻ���...");
			//1,����һ��ServerSocket����
			ServerSocket serversocket;
			try {
				serversocket = new ServerSocket(10390);
				while(true) {//��������
				//2,�����ͻ�������
				Socket socket = serversocket.accept();
				new Thread(new ServerThread(socket)).start();
				}
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			
	
	}
}
