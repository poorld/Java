package TCP2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) {
		try {
			//1,����ServerSocket����
			ServerSocket ss = new ServerSocket(10390);
			
			//�����ͻ�������
			Socket socket = ss.accept();
			String ip = ss.getInetAddress().getHostAddress();
			System.out.println(ip+"connect....");
			
			//2,��������
			BufferedReader bufr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			/**********     ʹ��PrintWriter
			//3,�������
			BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			*/
			PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
			//�ṩ����
			BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
			String line = null;
			while ((line = bufr.readLine())!=null){
				System.out.println(line);
				/*
				bufw.write(line.toUpperCase());
				bufw.newLine();
				bufw.flush();*/
				pw.println(line.toUpperCase());
			}
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
