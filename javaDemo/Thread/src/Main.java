
public class Main {

	public static void main(String[] args) {
		// �����߳���Ķ���
//		FirstThread ft = new FirstThread();
//		ft.start();
		
		AThread at = new AThread();
		at.start();
		
		BThread bt = new BThread();
		bt.start();
	}

}
