import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.Properties;


public class SystemInfo {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO �Զ����ɵķ������
		Properties prop = System.getProperties();
		
		prop.list(new PrintStream("text/systemInfo.txt"));
	}

}
