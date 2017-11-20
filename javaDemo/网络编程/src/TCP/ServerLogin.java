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
		
			System.out.println("正在监听客户端...");
			//1,创建一个ServerSocket对象
			ServerSocket serversocket;
			try {
				serversocket = new ServerSocket(10390);
				while(true) {//持续监听
				//2,监听客户端请求
				Socket socket = serversocket.accept();
				new Thread(new ServerThread(socket)).start();
				}
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
	
	}
}
