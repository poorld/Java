package IP;
import java.net.*;

public class IpDemo {
	public static void main(String[] args){
		//try{
			InetAddress address;
			try {
				address = InetAddress.getLocalHost();
				System.out.println(address);
				System.out.println("������:" + address.getHostName());
				System.out.println("������ַ:" + address.getHostAddress());
				
				InetAddress myip = InetAddress.getByName("flypig.pw");
				System.out.println("������:" + myip.getHostName());
				System.out.println("������ַ:" + myip.getHostAddress());
			} catch (UnknownHostException e) {
				// TODO �Զ����ɵ� catch ��
				System.out.println("������������");
				e.printStackTrace();
			}
			

	}
}
