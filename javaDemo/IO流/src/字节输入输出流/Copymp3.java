package 字节输入输出流;
import java.io.*;

public class Copymp3 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		long start = System.currentTimeMillis();
		copy();
		long end = System.currentTimeMillis();
		System.out.println((end-start) + "毫秒");
	}
	
	public static void copy(){
		BufferedInputStream buis = null;
		BufferedOutputStream buos = null;
		try{
			buis = new BufferedInputStream(new FileInputStream("mp3/不只爱情.mp3"));
			buos = new BufferedOutputStream(new FileOutputStream("mp3/不只爱情copy.mp3"));
			int by = 0;
			
			while ((by=buis.read())!=-1){
				buos.write(by);
			}
		}catch(IOException e){
			throw new RuntimeException("复制失败");
		}
		
		finally{
			try{
				buis.close();
			}catch(IOException e){
				throw new RuntimeException("读取关闭失败");
			}
			
			try{
				buos.close();
			}catch(IOException e){
				throw new RuntimeException("写入关闭失败");
			}
		}
	}
}

