package bufferedReader流;
//BufferedReader流readLine方法原理模拟

import java.io.FileReader;
import java.io.IOException;

public class MyBufferedReader {
	private FileReader r;
	public MyBufferedReader(FileReader r){
		this.r = r;
	}
	public String MyreadLine() throws IOException{
		StringBuilder sb = new StringBuilder();
		int ch = 0;
		while ((ch=r.read()) != -1){
			if (ch == '\r')
				continue;
			if (ch == '\n')
				return sb.toString();
			else
				sb.append((char)ch);
		}
		
		//如果最后一行没回车符
		if (sb.length() != 0){
			return sb.toString();
		}
		return null;
	}
	public void close() throws IOException{//谁调用，谁处理
		r.close();
	}

}
