package mianxiangduixiang;

public class Primitive2String {
	public static void main(String args[]){
		String intStr = "123";
		//���ַ���ת��Ϊint����
		int it1 = Integer.parseInt(intStr);
		System.out.println(it1);
		int it2 = new Integer(intStr);
		System.out.println(it2);

	}
}
