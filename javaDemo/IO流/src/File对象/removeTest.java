package File对象;

import java.io.File;

public class removeTest {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		File f = new File("E:/java视频");
		int a = 0;
		File newFile = new File("E:/java视频/new/" + a + ".avi");
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
					file.renameTo(new File("E:/java视频/new/" + file.getName()
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
