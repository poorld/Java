package File����;
//D:\Java\IO��\text\File.txt
import java.io.File;
import java.io.FilenameFilter;

public class FileDemo2 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
//		File f = new File("D:/Java");
//		Demo_3(f);
		File newDir = new File("E:/java��/����");
		newDir.mkdir();
		File dir = new File("E:/java��Ƶ");
		Demo_4(dir);
	}
	public static void Demo_1(){
		File dir = new File("D:/Java/IO��/text");
		String[] names = dir.list(new FilenameFilter() {	
			@Override
			public boolean accept(File dir, String name) {
				// TODO �Զ����ɵķ������
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
			System.out.println("fileName: " + f.getName() + "\t��С: " + f.length());
		}
	}
	
	//��������Ŀ¼
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
