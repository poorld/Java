package bufferedReader��;
//BufferedReader��readLine����ԭ��ģ��

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
		
		//������һ��û�س���
		if (sb.length() != 0){
			return sb.toString();
		}
		return null;
	}
	public void close() throws IOException{//˭���ã�˭����
		r.close();
	}

}
