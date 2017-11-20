package bufferedReader流;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class System_in {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		BufferedReader bufr = new BufferedReader(new InputStreamReader(new FileInputStream("text/text1")));//键盘录入最常见写法
		BufferedWriter bufw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String line;
		
		while ((line=bufr.readLine()) != null){
			try {
				bufw.write(line);
				bufw.newLine();
				bufw.flush();
				if (line.equals("over")){
					break;
				}
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
		}

	}

}
