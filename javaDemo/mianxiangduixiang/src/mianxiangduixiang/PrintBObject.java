package mianxiangduixiang;

class Person{
	private String name;
	public Person(String name){
		this.name = name;
	}
	public void info(){
		System.out.println("姓名为" + name);
	}
	
	//重写toString方法
//	public String toString (){
//		return "Person[name="  + name + "]";
//	}
}
public class PrintBObject {

	public static void main(String[] args) {
		Person p = new Person("小猪");
		//下面两行代码效果完全一样
		System.out.println(p);
		System.out.println(p.toString());
		System.out.println(p.toString()+"操你妈");
	}

}
