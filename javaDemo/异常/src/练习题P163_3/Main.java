package ��ϰ��P163_3;

public class Main {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		try{
			play(11);
		}catch(NoThisSongException e){
			System.out.println(e.getMessage());
		}
	}

	public static int play(int index) throws NoThisSongException{
		if (index > 10){
			throw new NoThisSongException("�㲥�ŵĸ���������");
		}
		System.out.println("���ڲ���");
		return index;
	}
}
