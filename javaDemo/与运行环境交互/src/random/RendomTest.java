package random;

import java.util.Random;

public class RendomTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Random rand = new Random();
		//�����������
		System.out.println("rand.nextInt:" + rand.nextInt());
		//����0~10֮����������
		System.out.println("rand.nextInt(10):" + rand.nextInt(10));
	}

}
