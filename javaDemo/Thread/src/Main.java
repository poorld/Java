
public class Main {

	public static void main(String[] args) {
		// 生成线程类的对象
//		FirstThread ft = new FirstThread();
//		ft.start();
		
		AThread at = new AThread();
		at.start();
		
		BThread bt = new BThread();
		bt.start();
	}

}
