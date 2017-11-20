package 字节流;
import java.io.*;

public class FileInputStreamTest {

	public static void main(String[] args) {
//		// TODO 自动生成的方法存根
//		FileInputStream fis = null;
//		try{
//			fis = new FileInputStream("text/text1");
//			byte[] buf = new byte[fis.available()];//定义一个刚刚好的缓冲区；大文件慎用
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
	
	//最明智的选择
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
