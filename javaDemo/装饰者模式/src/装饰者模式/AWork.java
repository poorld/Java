package װ����ģʽ;

class AWork implements Work{
	private Work work;
	public AWork(Work work){
		this.work = work;
	}
	public void doSomeWork(){
		System.out.println("���,����A��˾��Ա��");
		work.doSomeWork();
	}
}
