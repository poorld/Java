package File����;

import java.io.File;

public class removeTest {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		File f = new File("E:/java��Ƶ");
		int a = 0;
		File newFile = new File("E:/java��Ƶ/new/" + a + ".avi");
		Demo(f, newFile, a);
		// test();
	}

	public static void Demo(File dir, File newDir, int a) {
		File[] files = dir.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				Demo(file, newDir, a++);
			} else {
				if (file.getName().endsWith(".avi")) {
					a++;
					file.renameTo(new File("E:/java��Ƶ/new/" + file.getName()
							+ ".avi"));
				}
			}
		}
	}

	public static void test() {
		File f1 = new File("D:/hello.txt");
		File f2 = new File("D:/helloRename.txt");
		f1.renameTo(f2);
	}

}
