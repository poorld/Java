/**
 * ����
 * �ͻ��˸�����������Сд��ĸ�����������ش�д��ĸ
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
			//1,����socket����,ָ��ip�Ͷ˿�
			Socket socket = new Socket("127.0.0.1",10390);
			
			/***************   ʹ��PrintWriter��ǿ��
			//2,�������
			BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(socket.getOutputStream()));
			*/
			//***************   ����PrintWriter(�Զ����У��Զ�ˢ��)
			PrintWriter pw = new PrintWriter(socket.getOutputStream(),true);
			
			//3,��������
			BufferedReader bufr = new BufferedReader(new InputStreamReader(socket.getInputStream()));
			
			//4,���������������
			BufferedReader keyin = new BufferedReader(new InputStreamReader(System.in));
			String line = null;
			while((line=keyin.readLine())!=null){
				if ("over".equals(line)){
					break;
				}
				
				/*
				bufw.write(line);
				bufw.newLine();//д����lineֻ������Ч���ݣ��������س��������мӻس����÷�������readLine()ʶ��
				bufw.flush();//line��������д�뵽���������棬����Ҫˢ��һ��
				*/
				pw.println(line);
				String data = bufr.readLine();//��ȡ���������ص�����
				System.out.println(data);
			}
			socket.close();
		} catch (IOException e) {
			e.printStackTrace();
		} 
	}

}
