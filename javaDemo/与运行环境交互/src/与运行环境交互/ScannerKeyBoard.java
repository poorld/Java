package 与运行环境交互;

import java.util.Scanner;

public class ScannerKeyBoard {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()){
			System.out.println("你输入的是:" + sc.next());
		}
	}
}
