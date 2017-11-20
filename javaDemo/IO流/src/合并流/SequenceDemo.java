package 合并流;
import java.io.*;
import java.util.*;

public class SequenceDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Vector<FileInputStream> v = new Vector<FileInputStream>();
		try{
		v.add(new FileInputStream("g:/javaRun/1.txt"));
		v.add(new FileInputStream("g:/javaRun/2.txt"));
		v.add(new FileInputStream("g:/javaRun/3.txt"));
		Enumeration<FileInputStream> en = v.elements();
		
		FileOutputStream fos = new FileOutputStream("g:/javaRun/4.txt");
		SequenceInputStream sis = new SequenceInputStream(en);
		
		byte[] buf = new byte[1024];
		int len = 0;
		
		while ((len=sis.read(buf)) != -1){
			fos.write(buf, 0, len);
		}
		
		}catch(IOException e){
			throw new RuntimeException("打开文件失败");
		}
		finally{
			
		}
	}

}
