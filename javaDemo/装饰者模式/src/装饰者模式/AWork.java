package 装饰者模式;

class AWork implements Work{
	private Work work;
	public AWork(Work work){
		this.work = work;
	}
	public void doSomeWork(){
		System.out.println("你好,我是A公司的员工");
		work.doSomeWork();
	}
}
