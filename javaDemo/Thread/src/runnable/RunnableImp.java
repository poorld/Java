package runnable;

public class RunnableImp implements Runnable{
	public void run(){
		for(int i = 0; i < 100; i++){
			System.out.println("RunnableImp-->>" + i);
			if (i == 50){
				try {
					Thread.sleep(2000);//Thread��sleep()�Ǿ�̬���������ã�����.����
				} catch (InterruptedException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
			}
		}
	}
}
