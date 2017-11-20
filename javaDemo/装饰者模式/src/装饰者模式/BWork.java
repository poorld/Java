package 装饰者模式;

class BWork implements Work {
	private Work work;
	public BWork(Work work){
		this.work = work;
	}
	public void doSomeWork(){
		System.out.println("我是B公司员工，进门戴手套");
		work.doSomeWork();
	}
}
