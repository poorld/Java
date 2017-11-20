package TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class ServerThread implements Runnable{
	private Socket socket;
	public ServerThread(Socket socket){
		this.socket = socket;
	}
	@Override
	public void run() {
		// TODO 自动生成的方法存根
		try{
		//3,打开输入流
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();
		BufferedReader bufr = new BufferedReader(new InputStreamReader(is));
		String line = null;
		while ((line=bufr.readLine())!=null){
			System.out.println("我是服务器。客户信息为:" + line);
		}
		socket.shutdownInput();
		//服务器给客户端一个响应
		
		String tip = "连接成功!";
		os.write(tip.getBytes());
		
		//关闭资源，后开先关
		bufr.close();
		is.close();
		os.close();
		socket.close();
		} catch (IOException e) {
		e.printStackTrace();
	}

	}
	
}
