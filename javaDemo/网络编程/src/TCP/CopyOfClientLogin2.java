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
			System.out.println("�������пͻ���");
			//1������socket����
			Socket socket = new Socket("127.0.0.1",10390);
			//2����һ�������
			OutputStream os = socket.getOutputStream();
			InputStream is = socket.getInputStream();//�ֽ���
			//�ֽ�����װ���ַ���
			BufferedReader bufr = new BufferedReader(new InputStreamReader(is));
			//3�����������������
			String data = "��ã����ǿͻ���ɵ��2��";
			//BufferedReader bufr = new BufferedReader(new InputStreamReader(System.in));
			os.write(data.getBytes());
			socket.shutdownOutput();
			//��������Ӧ
			String tip = null;
			while ((tip=bufr.readLine()) != null){
				System.out.println("���ǿͻ��ˣ���������Ӧ��Ϣ��" + tip);
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
