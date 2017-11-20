package 匿名内部类;

interface Product{
	public double getPrice();
	public String getName();
}

public class AnonymousTest{
	public void test(Product p){
		System.out.println("购买" + p.getName() +",价格:" + p.getPrice());
	}
	
	public static void main(String[] args){
		AnonymousTest ta = new AnonymousTest();
		ta.test(new Product(){
			public double getPrice(){
				return 40;
			}
			public String getName(){
				return "显卡";
			}
		});
	}
}
