package �Զ����쳣;

public class Test {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		try{
			int result = divide(4,-2);
		}catch(DivideByMinusException e){
			System.out.println(e.getMessage());
		}
	}
	public static int divide(int x,int y) throws DivideByMinusException{
		if (y < 0){
			throw new DivideByMinusException("�쳣���������Ǹ���");
		}
		int result = x / y;
		return result;
	}

}
