package 装饰者模式;

public class Test {

	public static void main(String[] args) {
		Plumber aPlumber = new Plumber();
		AWork aWork1 = new AWork(aPlumber);
		aWork1.doSomeWork();
		/////////////////////////////////////
		Carpenter aCarpenter = new Carpenter();
		AWork aWork2 = new AWork(aCarpenter);
		aWork2.doSomeWork();
		
		System.out.println("\n");
		
		Plumber bPlumber = new Plumber();
		BWork bWork1 = new BWork(bPlumber);
		bWork1.doSomeWork();
		//////////////////////////////////
		Carpenter bCapenter = new Carpenter();
		BWork bWork2 = new BWork(bCapenter);
		bWork2.doSomeWork();
	}

}
