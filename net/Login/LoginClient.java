/*
需求：客户端尝试登录服务器3次，登录成功服务器反馈信息：用户名+欢迎光临！
如果验证3次错误，就退出验证，结束登录!
*/

import java.io.*;
import java.net.*;

class  LoginClient
{
	public static void main(String[] args) 
	{
		try{
			Socket s = new Socket("113.17.39.161",10000);
			BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
			PrintWriter out = new PrintWriter(s.getOutputStream(),true);
			BufferedReader bufIn = new BufferedReader(new InputStreamReader(s.getInputStream()));
			String line;
			for (int i = 0; i < 3; i++ )
			{
				line = bufr.readLine();
				if (line == null)
				{
					break;
				}
				//把用户名发出去
				out.println(line);

				//读一次服务器的反馈信息
				String info = bufIn.readLine();
				if (info.contains("欢迎"))//如果info包含 “欢迎”
				{
					System.out.println("服务端:" + info);
					break;
				}

			}
			bufr.close();
			s.close();
		} catch (Exception e){
			throw new RuntimeException("异常！");
		}
	}
}
