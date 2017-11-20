package try_catch_finally;

public class Test {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		try{
			int result = divide(5,0);		
			System.out.println(result);	
		}
		catch(Exception e){
			System.out.println("错误信息为:" + e.getMessage());
		}
		System.out.println("程序继续运行");
	}
	public static int divide(int x,int y){
		int result = x / y;
		return result;
	}

}
