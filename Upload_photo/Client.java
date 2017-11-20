import java.io.*;
import java.net.*;

class  Client
{
	public static void main(String[] args) 
	{
		try{
			Socket socket = new Socket("113.17.37.231",10000);
			OutputStream os = socket.getOutputStream();
			FileInputStream fis = new FileInputStream("f://upload/qq.png");
			
			byte[] buf = new byte[1024];
			int len = 0;
			while((len = fis.read(buf)) != -1){
				os.write(buf,0,len);
			}
			socket.shutdownOutput();
			InputStream is = socket.getInputStream();
			byte[] bufIn = new byte[1024];
			int num = is.read(bufIn);			
			System.out.println(new String(bufIn,0,num));
		    
			socket.close();
			os.close();
			fis.close();
			is.close();
		}catch (UnknownHostException e){
			e.printStackTrace();
		}catch (IOException e) {
			e.printStackTrace();
		}
	}
}
