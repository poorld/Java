package propertiesDemo;

import java.util.Properties;
import java.util.Set;

public class propDemo1 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		setAndGet();
	}
	
	public static void setAndGet(){
		Properties prop = new Properties();
		prop.setProperty("����", "30��");
		prop.setProperty("����", "32��");
		
		//�޸�����
		prop.setProperty("����", "100��");
		
		Set<String> names = prop.stringPropertyNames();
		
		for (String name : names){
			System.out.println(name +"="+ prop.getProperty(name));
		}

	}

}
