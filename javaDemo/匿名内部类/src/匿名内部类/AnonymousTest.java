package �����ڲ���;

interface Product{
	public double getPrice();
	public String getName();
}

public class AnonymousTest{
	public void test(Product p){
		System.out.println("����" + p.getName() +",�۸�:" + p.getPrice());
	}
	
	public static void main(String[] args){
		AnonymousTest ta = new AnonymousTest();
		ta.test(new Product(){
			public double getPrice(){
				return 40;
			}
			public String getName(){
				return "�Կ�";
			}
		});
	}
}
