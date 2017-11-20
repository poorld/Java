package File对象;
//D:\Java\IO流\text\File.txt
import java.io.File;
import java.io.FilenameFilter;

public class FileDemo2 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
//		File f = new File("D:/Java");
//		Demo_3(f);
		File newDir = new File("E:/java视/集合");
		newDir.mkdir();
		File dir = new File("E:/java视频");
		Demo_4(dir);
	}
	public static void Demo_1(){
		File dir = new File("D:/Java/IO流/text");
		String[] names = dir.list(new FilenameFilter() {	
			@Override
			public boolean accept(File dir, String name) {
				// TODO 自动生成的方法存根
				return name.endsWith(".txt");
			}
		});
		System.out.println(names.length);
		for (String name : names){
			System.out.println(name);
		}	
	}
	public static void Demo_2(){
		File dir = new File("G:");
		File[] files = dir.listFiles();
		for (File f : files){
			System.out.println("fileName: " + f.getName() + "\t大小: " + f.length());
		}
	}
	
	//遍历所有目录
	public static void Demo_3(File dir){
		System.out.println(dir.getName());
		File[] files = dir.listFiles();
		for (int i = 0; i < files.length; i++){
			if (files[i].isDirectory()){
				Demo_3(files[i]);
			}
			else{
				System.out.println(files[i]);
			}
		}
	}
	
	public static void Demo_4(File dir){
		int a = 0;
		File[] files = dir.listFiles();
		
		for(File file : files){	
			if (file.isDirectory()){
				Demo_4(file);
			}
			else{
				System.out.println(file);
			}
		}
	}
}
