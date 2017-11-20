package File对象;

import java.io.File;
//删除文件测试
//原则：从里到外
public class DirDele {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		File f = new File("G:/Dele");
		DeleDir(f);
	}
	public static void DeleDir(File dir){
		File[] files = dir.listFiles();
		for (int i = 0; i < files.length; i++){
			if (files[i].isDirectory()){
				DeleDir(files[i]);
			}
			else{
				System.out.println("删除文件--"+ files[i].toString() +"  " +files[i].delete());
			}
		}
		System.out.println("删除文件夹  "+dir+"  " +dir.delete());
	}
}
