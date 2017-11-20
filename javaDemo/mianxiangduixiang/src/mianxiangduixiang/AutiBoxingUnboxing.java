package mianxiangduixiang;

public class AutiBoxingUnboxing {

	public static void main(String[] args) {
		Integer inObj = 5;
		Object boolObj = true;
		int it = inObj;
		if (boolObj instanceof Boolean){
			boolean b = (Boolean)boolObj;
			System.out.println(b);
		}
		System.out.println(it);
	}

}
