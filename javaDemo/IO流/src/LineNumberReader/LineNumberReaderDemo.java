package LineNumberReader;
import java.io.*;

//getLineNumber : 获取行号
//setLineNumber(100) : 从101开始

public class LineNumberReaderDemo {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		FileReader fr = null;
		LineNumberReader lnr = null;
		try{
			fr = new FileReader("text/text1");
			lnr = new LineNumberReader(fr);
			
			String line;
			while ((line = lnr.readLine()) != null){
				//getLineNumber : 获取行号
				System.out.println(lnr.getLineNumber() + ":" + line);
			}
			System.out.println();
		}catch(Exception e){
			System.out.println(e);
		}
		finally{
			try{
				lnr.close();
			}catch(Exception e){
				System.out.println(e);
			}
		}
	}

}
