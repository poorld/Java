package ������;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		BufferedInputStream hczf = null;
		BufferedOutputStream hczt = null;
		byte[] hc = new byte[2048];
		int ff;
		try{
			hczf = new BufferedInputStream(new FileInputStream("g:/sb.zip"));
			hczt = new BufferedOutputStream(new FileOutputStream("g:/sb/sb.zip"));
			ff = hczf.read(hc);
			while(ff != -1){
				hczt.write(hc, 0, ff);
				ff = hczf.read(hc);
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			try {
				hczt.flush();
				hczf.close();
				hczt.close();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}

}
