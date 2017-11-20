package �ļ��и�;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.SequenceInputStream;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Vector;

public class splitDemo {
	public static void main(String[] args) throws IOException{
		//splitFile();//�и��ļ�
		//mergeFile_1();//�ϲ��ļ�����Ч�ʣ�
		mergeFile_2();//��Ч
	}
	
	//�ָ��ļ�
	public static void splitFile() {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		try{
			fis = new FileInputStream("G:\\javaRun\\splitFiles\\Nevada.mp3");
			
			byte[] buf = new byte[1024*1024];//1M
			
			int len = 0;
			int count = 1;
			while ((len=fis.read(buf))!=-1){
				fos = new FileOutputStream("g:\\javaRun\\splitFiles\\" + (count++) + ".part");
				fos.write(buf,0,len);
				fos.close();
			}
		}
		catch(Exception e){
			System.out.println(e);
		}
		finally{
			try {
				fis.close();
			} catch (IOException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}
	
	//�ϲ��ļ�
	public static void mergeFile_1() throws FileNotFoundException{
		Vector<FileInputStream> v = new Vector<FileInputStream>();
		for (int i=1;i<7;i++){
			v.add(new FileInputStream("g:/javaRun/splitFiles/" + i + ".part"));
		}
			Enumeration<FileInputStream> en = v.elements();
			
			FileOutputStream fos = null;
			SequenceInputStream sis = new SequenceInputStream(en);
			
			try{
				fos = new FileOutputStream("g:/javaRun/�ϲ�����.mp3");
				byte[] buf = new byte[1024*1024];
				int len = 0;
				while ((len=sis.read(buf))!=-1){
					fos.write(buf, 0, len);
				}
			}catch (Exception e){
				System.out.println(e);
			}
			finally{
				try {
					sis.close();
					fos.close();
				} catch (IOException e) {
					// TODO �Զ����ɵ� catch ��
					e.printStackTrace();
				}
				
			}
	}
	
	public static void mergeFile_2() throws IOException{
		ArrayList<FileInputStream> al = new ArrayList<FileInputStream>();
		for (int i=1;i<7;i++){
			al.add(new FileInputStream("g:/javaRun/splitFiles/" + i + ".part"));
		}
		
		final Iterator<FileInputStream> it = al.iterator();
		
		Enumeration<FileInputStream> en = new Enumeration() {
			
			@Override
			public FileInputStream nextElement() {
				// TODO �Զ����ɵķ������
				return it.next();
			}
			
			@Override
			public boolean hasMoreElements() {
				// TODO �Զ����ɵķ������
				return it.hasNext();
			}
		};
		
		SequenceInputStream sis = new SequenceInputStream(en);
		FileOutputStream fos = new FileOutputStream("g:/javaRun/�ϲ�����2.mp3");
		byte[] buf = new byte[1024*1024];
		int len = 0;
		while ((len=sis.read(buf))!=-1){
			fos.write(buf, 0, len);
		}
		sis.close();
		fos.close();
	}
	
}
