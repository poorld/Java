package 正则表达式;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchesTest {

	public static void main(String[] args) {
		String[] mails =
		{
			"kongku@163.com" ,
			"dhjfdshafe@gmail.com" ,
			"asdfe@crazyit.org" ,
			"wdfda@abc.xx"
		};
		String mailRegEx = "\\w{3,20}@\\w+\\.(com|org|cn|net|gov)";
		Pattern mailPattern = Pattern.compile(mailRegEx);
		Matcher matcher = null;
		for (String mail : mails){
			if (matcher == null){
				matcher = mailPattern.matcher(mail);
			}
			else{
				matcher.reset(mail);
			}
			String result = mail + (matcher.matches() ? "是" : "不是") + "一个有效的邮箱地址";
			System.out.println(result);
		}
	}

}
