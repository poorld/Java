package try_catch_finally;

public class Test {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		try{
			int result = divide(5,0);		
			System.out.println(result);	
		}
		catch(Exception e){
			System.out.println("������ϢΪ:" + e.getMessage());
		}
		System.out.println("�����������");
	}
	public static int divide(int x,int y){
		int result = x / y;
		return result;
	}

}
