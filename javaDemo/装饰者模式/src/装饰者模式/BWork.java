package װ����ģʽ;

class BWork implements Work {
	private Work work;
	public BWork(Work work){
		this.work = work;
	}
	public void doSomeWork(){
		System.out.println("����B��˾Ա�������Ŵ�����");
		work.doSomeWork();
	}
}
