import java.io.*;
import java.net.*;

class  Server
{
	public static void main(String[] args) 
	{
		try{
			ServerSocket ss = new ServerSocket(10000);
			Socket socket = ss.accept();
			InputStream is = socket.getInputStream();
			FileOutputStream fos = new FileOutputStream("F://javaDemo/Upload_photo/Test/2.jpg");
			byte[] buf = new byte[1024];
			int len = 0;
			while((len = is.read(buf)) != -1){
				fos.write(buf,0,len);
			}
			
			OutputStream os = socket.getOutputStream();
			os.write("�ϴ���ɣ�".getBytes());

			ss.close();
			socket.close();

		} catch(IOException e){
			e.printStackTrace();
		}
	}
}
