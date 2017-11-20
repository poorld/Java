package IP;
import java.net.*;

public class IpDemo {
	public static void main(String[] args){
		//try{
			InetAddress address;
			try {
				address = InetAddress.getLocalHost();
				System.out.println(address);
				System.out.println("主机名:" + address.getHostName());
				System.out.println("主机地址:" + address.getHostAddress());
				
				InetAddress myip = InetAddress.getByName("flypig.pw");
				System.out.println("主机名:" + myip.getHostName());
				System.out.println("主机地址:" + myip.getHostAddress());
			} catch (UnknownHostException e) {
				// TODO 自动生成的 catch 块
				System.out.println("请检查网络连接");
				e.printStackTrace();
			}
			

	}
}
