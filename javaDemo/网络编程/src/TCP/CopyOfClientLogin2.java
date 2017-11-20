package TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;
import java.net.UnknownHostException;

public class CopyOfClientLogin2 {

	public static void main(String[] args) {
		try {
			System.out.println("正在运行客户端");
			//1，创建socket对象
			Socket socket = new Socket("127.0.0.1",10390);
			//2，打开一个输出流
			OutputStream os = socket.getOutputStream();
			InputStream is = socket.getInputStream();//字节流
			//字节流封装成字符流
			BufferedReader bufr = new BufferedReader(new InputStreamReader(is));
			//3，向服务器发送请求
			String data = "你好，我是客户端傻逼2！";
			//BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
			os.write(data.getBytes());
			socket.shutdownOutput();
			//服务器响应
			String tip = null;
			while ((tip=bufr.readLine()) != null){
				System.out.println("我是客户端，服务器响应信息：" + tip);
			}
			
			bufr.close();
			os.close();
			is.close();
			socket.close();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}

}
