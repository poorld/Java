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
 * readFile() ���Լ�д�ķ���
 ��ȡ�����ϵ��ļ����浽prop����
 
jdk�ṩ�ķ�����
load(InputStream inStream) 
load(Reader reader)
*/
public class ReadInfo {

	public static void main(String[] args) {
		Properties prop = new Properties();
		//readFile(prop);
		//loadDemo(prop);//�ܸܵ�
		loadDemo2(prop);//��������
		
	}
	
	//BufferedReader
	public static void loadDemo(Properties prop){
		BufferedReader bufr = null;
		BufferedWriter bufw = null;
		try{
			bufr = new BufferedReader(new FileReader("c:/info.txt"));
			bufw = new BufferedWriter(new FileWriter("c:/info.txt",true));//true��ʾ׷���ļ�
			prop.load(bufr);//��ȡ�ļ�
			
			//С����-->�޸���Ϣ,Ȼ�����store����,���ɱ��浽�ļ�,
			/*��֪Ϊʲô���ļ����
			prop.setProperty("����", "10");
			prop.store(bufw, "this is note!");*/
			
			//System.out.println(prop);
			prop.list(System.out);//���
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
	
	//��ȡ�ļ���Ϣ���浽prop,�Լ�д�ķ�����������ϵͳ�ķ���load();
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
			throw new RuntimeException("��ȡʧ��!");
		}
		finally{
			try{
				bufr.close();
			}catch(IOException e) {
					throw new RuntimeException("��ȡ�ر�ʧ��!");
				}
		}
	}

}
