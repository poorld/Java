package bufferedReader��;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MyBufferedReaderTest {

	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������
		FileReader fr = new FileReader("text/text1");
		MyBufferedReader br = new MyBufferedReader(fr);
		String line;
		while ((line = br.MyreadLine()) != null){
			System.out.println(line);
		}
		try{
			br.close();
		}catch(Exception e){
			System.out.println(e);
		}
	}

}
