package runnable;

public class Main {

	public static void main(String[] args) {
		RunnableImp ri = new RunnableImp();
		Thread thread = new Thread(ri);
		thread.start();

	}

}
