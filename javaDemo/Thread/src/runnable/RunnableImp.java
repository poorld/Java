package runnable;

public class RunnableImp implements Runnable{
	public void run(){
		for(int i = 0; i < 100; i++){
			System.out.println("RunnableImp-->>" + i);
			if (i == 50){
				try {
					Thread.sleep(2000);//Thread的sleep()是静态方法，调用：类名.方法
				} catch (InterruptedException e) {
					// TODO 自动生成的 catch 块
					e.printStackTrace();
				}
			}
		}
	}
}
