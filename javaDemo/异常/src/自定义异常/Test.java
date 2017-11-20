package 自定义异常;

public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		try{
			int result = divide(4,-2);
		}catch(DivideByMinusException e){
			System.out.println(e.getMessage());
		}
	}
	public static int divide(int x,int y) throws DivideByMinusException{
		if (y < 0){
			throw new DivideByMinusException("异常：被除数是负数");
		}
		int result = x / y;
		return result;
	}

}
