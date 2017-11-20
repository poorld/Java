package 与运行环境交互;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Keyboardln {

	public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String line = null;
			while ((line = br.readLine()) != null){
				System.out.println("用户输入的是:" + line);
			}
		}

	}

