package print��;

import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Test {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO �Զ����ɵķ������
		PrintStream p = new PrintStream("g:/sb.txt");
		System.setOut(p);
		System.out.println("��Һ�,����ʡûë����");
	}

}
