/*
���󣺿ͻ��˳��Ե�¼������3�Σ���¼�ɹ�������������Ϣ���û���+��ӭ���٣�
�����֤3�δ��󣬾��˳���֤��������¼!
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
				//���û�������ȥ
				out.println(line);

				//��һ�η������ķ�����Ϣ
				String info = bufIn.readLine();
				if (info.contains("��ӭ"))//���info���� ����ӭ��
				{
					System.out.println("�����:" + info);
					break;
				}

			}
			bufr.close();
			s.close();
		} catch (Exception e){
			throw new RuntimeException("�쳣��");
		}
	}
}
