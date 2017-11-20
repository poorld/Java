package Calendar;

import java.util.Calendar;
//import java.util.TimeZone;

public class CalendarTest {

	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		//取出年
		System.out.println(c.get(1));//年
		//取出月份
		System.out.println(c.get(2));
		System.out.println(c.get(3));
		System.out.println(c.get(4));//月
		System.out.println(c.get(5));//日
		System.out.println("当地时间:" + c.get(1) + "年" + c.get(4) + "月" + c.get(5) + "日");
//		TimeZone my = TimeZone.getDefault();
//		System.out.println(my.getID());
//		System.out.println(my.getDisplayName());
	}

}
