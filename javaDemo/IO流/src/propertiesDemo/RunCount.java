package propertiesDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class RunCount {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		Properties prop = new Properties();
		Mycount(prop);
	}
	
	public static void Mycount(Properties prop){
		File file = null;
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try {
			file = new File("C:/count.ini");
			if (!file.exists()){
				file.createNewFile();
			}
			fis = new FileInputStream(file);
			prop.load(fis);
			int count = 0;
			String value = prop.getProperty("time");
			if (value!=null){
				count = Integer.parseInt(value);
				if (count>=5){
					System.out.println("���Ѿ�ʹ�ù�5�Σ����ֵ!");
					return;
				}
			}
			count++;
			prop.setProperty("time", count+"");
			fos = new FileOutputStream(file);
			prop.store(fos,"zhushi");
		} catch (Exception e) {
			System.out.println(e);
		}
		finally{
			try {
				fis.close();
				fos.close();
			}catch(Exception e) {
				System.out.println(e);
			}
		}
	}

}
