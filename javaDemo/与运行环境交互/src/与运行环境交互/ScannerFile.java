package 与运行环境交互;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ScannerFile {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner sc = new Scanner(new File("d:/TXL.txt"));
		while (sc.hasNextLine()){
			System.out.println(sc.nextLine());
		}
	}

}
