package print流;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Test {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO 自动生成的方法存根
		PrintStream p = new PrintStream("g:/sb.txt");
		System.setOut(p);
		System.out.println("大家好,老铁省没毛病市");
	}

}
