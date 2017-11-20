package LineNumberReader;
import java.io.*;

public class MyLineNumberReader {
	private FileReader r;
	private int LineNumber=0;
	
	public MyLineNumberReader(FileReader r){
		this.r = r;
	}
	
	public void setLineNumber(int lineNumber){
		this.LineNumber = lineNumber;
	}
	
	public int getLineNumber(){
		return LineNumber;
	}
	

	public String readLine() throws IOException{
		LineNumber++;
		StringBuilder sb = new StringBuilder();
		int ch = 0;
		while ((ch = r.read()) != -1){
			if (ch == '\r')
				continue;
			if (ch == '\n'){
				//LineNumber++;
				return sb.toString();
			}
			else
				sb.append((char)ch);
		}
		//������һ��û�س���
		if (sb.length() != 0){
			return sb.toString();
		}
		return null;
	}
	public void close() throws IOException{
		r.close();
	}

}
