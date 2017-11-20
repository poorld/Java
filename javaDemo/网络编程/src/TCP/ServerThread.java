package TCP;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.Socket;

public class ServerThread implements Runnable{
	private Socket socket;
	public ServerThread(Socket socket){
		this.socket = socket;
	}
	@Override
	public void run() {
		// TODO �Զ����ɵķ������
		try{
		//3,��������
		InputStream is = socket.getInputStream();
		OutputStream os = socket.getOutputStream();
		BufferedReader bufr = new BufferedReader(new InputStreamReader(is));
		String line = null;
		while ((line=bufr.readLine())!=null){
			System.out.println("���Ƿ��������ͻ���ϢΪ:" + line);
		}
		socket.shutdownInput();
		//���������ͻ���һ����Ӧ
		
		String tip = "���ӳɹ�!";
		os.write(tip.getBytes());
		
		//�ر���Դ�����ȹ�
		bufr.close();
		is.close();
		os.close();
		socket.close();
		} catch (IOException e) {
		e.printStackTrace();
	}

	}
	
}
