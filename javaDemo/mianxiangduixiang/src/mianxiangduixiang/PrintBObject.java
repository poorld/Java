package mianxiangduixiang;

class Person{
	private String name;
	public Person(String name){
		this.name = name;
	}
	public void info(){
		System.out.println("����Ϊ" + name);
	}
	
	//��дtoString����
//	public String toString (){
//		return "Person[name="  + name + "]";
//	}
}
public class PrintBObject {

	public static void main(String[] args) {
		Person p = new Person("С��");
		//�������д���Ч����ȫһ��
		System.out.println(p);
		System.out.println(p.toString());
		System.out.println(p.toString()+"������");
	}

}
