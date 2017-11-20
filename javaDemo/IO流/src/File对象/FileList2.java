package File����;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
���裺
1.�ȱ���Ŀ¼�����е�Ԫ�أ��ļ����ļ��У����浽�����У������������Ļ���ֿɴ浽�ļ���
2.�Ѽ��ϴ浽�ļ���
*/
public class FileList2 {
	public static void main(String[] args) {
		File dir = new File("D:/java/IO��");
		ArrayList<File> list = new ArrayList<File>();
		
		//���������ļ�
		fileTolist(dir,list);
		//д���ļ�
		File f = new File("IO���ļ����嵥.txt");
		String fileName = f.getName();
		listWriterFile(fileName,list);
		System.out.println("�ļ������ַ�� " + f.getAbsolutePath());
	}
	
	public static void fileTolist(File dir,ArrayList<File> list){
		File[] files = dir.listFiles();
		for (File file : files){
			if (file.isDirectory()){
				fileTolist(file,list);
			}
			else{
				list.add(file);
			}
		}
	} 
	
	public static void listWriterFile(String fileName,ArrayList<File> list){
		FileWriter fw = null;
		BufferedWriter bufw = null;
		try {
			fw = new FileWriter(fileName);
			bufw = new BufferedWriter(fw);
			for (File file : list){
				String name = file.getAbsolutePath();
				bufw.write(name);
				bufw.newLine();
				bufw.flush();
			}
		} catch (IOException e) {
			throw new RuntimeException(e);
		}
		finally{
			try {
				if (bufw!=null){
					bufw.close();
				}
			} catch (IOException e2) {
				throw new RuntimeException(e2);
			}
		}
	}
}
