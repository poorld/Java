package bufferedReader��;
import java.io.*;

public class Test1 {

	public static void main(String[] args) throws IOException{
		// TODO �Զ����ɵķ������
		FileReader fileReader = new FileReader("text/text1");
		BufferedReader buf = new BufferedReader(fileReader);
		
		String line = null;
		while((line=buf.readLine()) != null){
			System.out.println(line);
		}
		buf.close();
	}

}
