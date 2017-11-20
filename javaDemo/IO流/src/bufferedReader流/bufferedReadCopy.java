package bufferedReader流;
import java.io.*;

public class bufferedReadCopy {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		BufferedReader bufr = null;
		BufferedWriter bufw = null;
		
		try{
			bufr = new BufferedReader(new FileReader("g:/javaRun/io/text1.txt"));
			bufw = new BufferedWriter(new FileWriter("g:/javaRun/io/text1_copy.txt"));
			
			String line = null;//读取一行到line
			
			while((line = bufr.readLine()) != null){
				bufw.write(line);//把读取到的每一行line写入文件
				bufw.newLine();
				bufw.flush();
			}
		}catch(IOException e){
			throw new RuntimeException("读写失败");
		}
		finally{
			try{
				if (bufr != null)
					bufr.close();
			}catch(IOException e){
				throw new RuntimeException("读取关闭失败！");
			}
			
			try{
				if (bufw != null)
					bufw.close();
			}catch(IOException e){
				throw new RuntimeException("读取写入失败!");
			}
		}
	}

}
