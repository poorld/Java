package �ֽ���;
import java.io.*;

public class FileInputStreamTest {

	public static void main(String[] args) {
//		// TODO �Զ����ɵķ������
//		FileInputStream fis = null;
//		try{
//			fis = new FileInputStream("text/text1");
//			byte[] buf = new byte[fis.available()];//����һ���ոպõĻ����������ļ�����
//			fis.read(buf);
//			System.out.println(new String(buf));
//		}
//		catch(Exception e){
//			System.out.println(e);
//		}
//		finally{
//			try{
//				fis.close();
//			}
//			catch(Exception e){
//				System.out.println(e);
//			}
//		}
		readFile();
	}
	
	//�����ǵ�ѡ��
	public static void readFile(){
		FileInputStream fis = null;
		try{
			fis = new FileInputStream("text/text1");
			byte[] buf = new byte[1024];
			int len = 0;
			while ((len = fis.read(buf)) != -1){
				System.out.println(new String(buf,0,len));
			}
			
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			try{
				fis.close();
			}
			catch(Exception e){
				System.out.println(e);
			}
		}
	}

}
