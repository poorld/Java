package File����;

import java.io.File;
//ɾ���ļ�����
//ԭ�򣺴��ﵽ��
public class DirDele {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
				System.out.println("ɾ���ļ�--"+ files[i].toString() +"  " +files[i].delete());
			}
		}
		System.out.println("ɾ���ļ���  "+dir+"  " +dir.delete());
	}
}
