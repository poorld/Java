package File����;

import java.io.File;
import java.io.IOException;

public class FileDemo {

	public static void main(String[] args) throws IOException {
		// TODO �Զ����ɵķ������
		File f = new File("text/File.txt");
		//f.deleteOnExit();
		System.out.println("create:" + f.createNewFile());//����
		sop(f.getPath());//��ȡ����·��
		sop(f.getAbsolutePath());//��ȡ���·��
		long s = f.length();//�ļ���С
		System.out.println(s + "�ֽ�");
		
		//f.delete();//ɾ��
		sop("create:" + f.createNewFile());
		File[] files = File.listRoots();
		for (File fl : files){
			System.out.println(fl);
		}
	}

	private static void sop(String string) {
		// TODO �Զ����ɵķ������
		System.out.println(string);
	}

}
