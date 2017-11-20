package 正则表达式;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindGroup {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		Pattern p = Pattern.compile("\\w+");
		Matcher m = p.matcher("java is very easy");
		while(m.find()){
			System.out.println(m.group());
		}
	}

}
