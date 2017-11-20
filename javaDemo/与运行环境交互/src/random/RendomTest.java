package random;

import java.util.Random;

public class RendomTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Random rand = new Random();
		//生成随机整数
		System.out.println("rand.nextInt:" + rand.nextInt());
		//生成0~10之间的随机整数
		System.out.println("rand.nextInt(10):" + rand.nextInt(10));
	}

}
