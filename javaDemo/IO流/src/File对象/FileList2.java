package File对象;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

/*
步骤：
1.先遍历目录中所有的元素（文件和文件夹）储存到集合中，即可输出到屏幕，又可存到文件中
2.把集合存到文件中
*/
public class FileList2 {
	public static void main(String[] args) {
		File dir = new File("D:/java/IO流");
		ArrayList<File> list = new ArrayList<File>();
		
		//遍历所有文件
		fileTolist(dir,list);
		//写入文件
		File f = new File("IO流文件夹清单.txt");
		String fileName = f.getName();
		listWriterFile(fileName,list);
		System.out.println("文件保存地址： " + f.getAbsolutePath());
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
