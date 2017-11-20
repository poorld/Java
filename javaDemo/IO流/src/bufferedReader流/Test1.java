package bufferedReader流;
import java.io.*;

public class Test1 {

	public static void main(String[] args) throws IOException{
		// TODO 自动生成的方法存根
		FileReader fileReader = new FileReader("text/text1");
		BufferedReader buf = new BufferedReader(fileReader);
		
		String line = null;
		while((line=buf.readLine()) != null){
			System.out.println(line);
		}
		buf.close();
	}

}
