package propertiesDemo;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/*
 * readFile() 是自己写的方法
 读取磁盘上的文件保存到prop对象
 
jdk提供的方法：
load(InputStream inStream) 
load(Reader reader)
*/
public class ReadInfo {

	public static void main(String[] args) {
		Properties prop = new Properties();
		//readFile(prop);
		//loadDemo(prop);//杠杠的
		loadDemo2(prop);//中文乱码
		
	}
	
	//BufferedReader
	public static void loadDemo(Properties prop){
		BufferedReader bufr = null;
		BufferedWriter bufw = null;
		try{
			bufr = new BufferedReader(new FileReader("c:/info.txt"));
			bufw = new BufferedWriter(new FileWriter("c:/info.txt",true));//true表示追加文件
			prop.load(bufr);//读取文件
			
			//小插曲-->修改信息,然后掉用store方法,即可保存到文件,
			/*不知为什么，文件变空
			prop.setProperty("李四", "10");
			prop.store(bufw, "this is note!");*/
			
			//System.out.println(prop);
			prop.list(System.out);//输出
		}catch(IOException e){
			throw new RuntimeException(e);
		}finally{
			try{
				bufr.close();
				bufw.close();
			}catch(IOException e){
				throw new RuntimeException(e);
			}
		}
	}
	
	//FileInputStream
	public static void loadDemo2(Properties prop){
		FileInputStream fis = null;
		try{
			fis = new FileInputStream("c:/info.txt");
			prop.load(fis);

			//System.out.println(prop);
			
			prop.list(System.out);
		}catch(IOException e){
			throw new RuntimeException(e);
		}finally{
			try{
				fis.close();
			}catch(IOException e){
				throw new RuntimeException(e);
			}
		}
	}
	
	//读取文件信息保存到prop,自己写的方法，建议用系统的方法load();
	public static void readFile(Properties prop){
		BufferedReader bufr = null;
		try {
			bufr = new BufferedReader(new FileReader("C:/info.txt"));
			String line = null;
			while((line=bufr.readLine())!=null){
				String[] arr = line.split("=");
				prop.setProperty(arr[0], arr[1]);
				//System.out.println(arr[0] +"..."+ arr[1]);
			}
			System.out.println(prop);
		} catch (IOException e) {
			throw new RuntimeException("读取失败!");
		}
		finally{
			try{
				bufr.close();
			}catch(IOException e) {
					throw new RuntimeException("读取关闭失败!");
				}
		}
	}

}
