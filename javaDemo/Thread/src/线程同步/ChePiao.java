package 线程同步;

public class ChePiao implements Runnable{
	int i = 100;
	public void run(){
		while(true){
			synchronized(this){
				System.out.println(Thread.currentThread().getName() + "卖出一张火车票，剩余 " + i + " 张");
				i--;
				Thread.yield();
				if (i <= 0){
					break;
				}
			}
		}
	}
}
