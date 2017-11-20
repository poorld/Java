import java.io.*;
import java.net.*;
class PicServer 
{	public static void main(String args[]){
	  try{
		ServerSocket ss = new ServerSocket(10000);
		while(true){				
		   Socket socket = ss.accept();
		   new Thread(new PicThread(socket)).start();
		
		}
		} catch (IOException e){
				e.printStackTrace();
			}

}
}
