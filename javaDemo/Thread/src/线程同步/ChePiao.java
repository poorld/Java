package �߳�ͬ��;

public class ChePiao implements Runnable{
	int i = 100;
	public void run(){
		while(true){
			synchronized(this){
				System.out.println(Thread.currentThread().getName() + "����һ�Ż�Ʊ��ʣ�� " + i + " ��");
				i--;
				Thread.yield();
				if (i <= 0){
					break;
				}
			}
		}
	}
}
