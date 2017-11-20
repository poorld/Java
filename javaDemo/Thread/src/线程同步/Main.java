package 线程同步;

public class Main {

	public static void main(String[] args) {
		ChePiao chepiao = new ChePiao();
		Thread t1 = new Thread(chepiao);
		Thread t2 = new Thread(chepiao);
		
		t1.setName("张三小姐");
		t2.setName("李四大娘");
		
		t1.start();
		t2.start();

	}

}
