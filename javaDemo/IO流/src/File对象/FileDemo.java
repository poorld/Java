package File对象;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO 自动生成的方法存根
		File f = new File("text/File.txt");
		//f.deleteOnExit();
		System.out.println("create:" + f.createNewFile());//创建
		sop(f.getPath());//获取绝对路径
		sop(f.getAbsolutePath());//获取相对路径
		long s = f.length();//文件大小
		System.out.println(s + "字节");
		
		//f.delete();//删除
		sop("create:" + f.createNewFile());
		File[] files = File.listRoots();
		for (File fl : files){
			System.out.println(fl);
		}
	}

	private static void sop(String string) {
		// TODO 自动生成的方法存根
		System.out.println(string);
	}

}
