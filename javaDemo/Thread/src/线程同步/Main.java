package �߳�ͬ��;

public class Main {

	public static void main(String[] args) {
		ChePiao chepiao = new ChePiao();
		Thread t1 = new Thread(chepiao);
		Thread t2 = new Thread(chepiao);
		
		t1.setName("����С��");
		t2.setName("���Ĵ���");
		
		t1.start();
		t2.start();

	}

}
