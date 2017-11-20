package 字节流;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyImages {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try{
			fis = new FileInputStream("images/1.jpg");
			fos = new FileOutputStream("images/1_copy.jpg");
			
			byte[] buf = new byte[1024];
			
			int len = 0;
			
			while ((len=fis.read(buf)) != -1){
				fos.write(buf, 0, len);
			}
			
		}catch(IOException e){
			throw new RuntimeException("复制文件失败");
		}
		
		finally{
			
			try{
				fis.close();
			}catch(IOException e){
				throw new RuntimeException("读取关闭失败");
			}
			
			try{
				fos.close();
			}catch(IOException e){
				throw new RuntimeException("写入关闭失败");
			}
		}
	}

}
