import java.net.*;
class  LoginServer
{
	public static void main(String[] args) 
	{
		try
		{
			ServerSocket ss = new ServerSocket(10000);
			while (true)
			{
				Socket s = ss.accept();
				new Thread(new UserThread(s)).start();
			}
		}
			
		catch (Exception e)
		{
			throw new RuntimeException("¡¨Ω” ß∞‹");
		}
	}
}
