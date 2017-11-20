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
			//1,创建ServerSocket对象
			ServerSocket ss = new ServerSocket(10390);
			
			//监听客户端请求
			Socket socket = ss.accept();
			String ip = ss.getInetAddress().getHostAddress();
			System.out.println(ip+"connect....");
			
			//2,打开输入流
			BufferedReader bufr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			/**********     使用PrintWriter
			//3,打开输出流
			BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			*/
			PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
			//提供服务
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
