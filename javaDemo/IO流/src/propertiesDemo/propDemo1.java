package propertiesDemo;

import java.util.Properties;
import java.util.Set;

public class propDemo1 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		setAndGet();
	}
	
	public static void setAndGet(){
		Properties prop = new Properties();
		prop.setProperty("张三", "30岁");
		prop.setProperty("李四", "32岁");
		
		//修改岁数
		prop.setProperty("李四", "100岁");
		
		Set<String> names = prop.stringPropertyNames();
		
		for (String name : names){
			System.out.println(name +"="+ prop.getProperty(name));
		}

	}

}
