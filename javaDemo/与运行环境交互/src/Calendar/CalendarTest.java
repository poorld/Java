package Calendar;

import java.util.Calendar;
//import java.util.TimeZone;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		//ȡ����
		System.out.println(c.get(1));//��
		//ȡ���·�
		System.out.println(c.get(2));
		System.out.println(c.get(3));
		System.out.println(c.get(4));//��
		System.out.println(c.get(5));//��
		System.out.println("����ʱ��:" + c.get(1) + "��" + c.get(4) + "��" + c.get(5) + "��");
//		TimeZone my = TimeZone.getDefault();
//		System.out.println(my.getID());
//		System.out.println(my.getDisplayName());
	}

}
