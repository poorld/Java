package mianxiangduixiang;

public class Primitive2String {
	public static void main(String args[]){
		String intStr = "123";
		//把字符串转换为int变量
		int it1 = Integer.parseInt(intStr);
		System.out.println(it1);
		int it2 = new Integer(intStr);
		System.out.println(it2);

	}
}
