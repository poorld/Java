package Runtime��;

import java.io.IOException;

public class ExecTest {

	public static void main(String[] args) throws IOException{
		Runtime rt = Runtime.getRuntime();
		//���м��±�����
		rt.exec("notepad.exe");
	}

}

