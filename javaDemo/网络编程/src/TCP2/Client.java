/**
 * 需求：
 * 客户端给服务器发送小写字母，服务器返回大写字母
 */

package TCP2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {

	public static void main(String[] args) {	
		
		try {
			//1,创建socket对象,指定ip和端口
			Socket socket = new Socket("127.0.0.1",10390);
			
			/***************   使用PrintWriter更强大
			//2,打开输出流
			BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			*/
			//***************   换成PrintWriter(自动换行，自动刷新)
			PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
			
			//3,打开输入流
			BufferedReader bufr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			//4,向服务器发送请求
			BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
			String line = null;
			while((line=keyin.readLine())!=null){
				if ("over".equals(line)){
					break;
				}
				
				/*
				bufw.write(line);
				bufw.newLine();//写出的line只包括有效内容，不包括回车符，所有加回车符让服务器的readLine()识别
				bufw.flush();//line的内容是写入到缓冲区里面，所以要刷新一下
				*/
				pw.println(line);
				String data = bufr.readLine();//读取服务器返回的数据
				System.out.println(data);
			}
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
