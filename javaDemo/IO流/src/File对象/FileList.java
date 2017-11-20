package File对象;

import java.awt.List;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;

public class FileList {

	public static void main(String[] args) throws FileNotFoundException {
		File f = new File("C:/Users/Administrator/Desktop/代码库");
		ArrayList<File> list = new ArrayList<File>();
		// 调用遍历方法，把文件路径存到list
		fileTolist(f, list);

		// 把 list 内容写入到文件 方法1
		PrintStream p = new PrintStream("text/list.txt");
		System.setOut(p);// 输出到p对象的文件夹
		for (File obj : list) {
			System.out.println(obj);
		}

		// 把 list 内容写入到文件 方法2
		String fileName = "text/代码库清单.txt";
		listTofile(list, fileName);
		System.out.println("文件保存地址" + f.getAbsolutePath());
	}

	public static void fileTolist(File dir, ArrayList<File> list) {
		File[] files = dir.listFiles();
		for (File file : files) {
			if (file.isDirectory()) {
				fileTolist(file, list);
			} else {
				list.add(file);
			}
		}
	}

	public static void listTofile(ArrayList<File> list, String fileName) {
		BufferedWriter bufw = null;
		try {
			bufw = new BufferedWriter(new FileWriter(fileName));
			for (File f : list) {
				String path = f.getAbsolutePath();
				bufw.write(path);
				bufw.newLine();
				bufw.flush();
			}
		} catch (Exception e) {
			System.out.println(e);
		} finally {
			try {
				if (bufw != null) {
					bufw.close();
				}
			} catch (IOException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
		}
	}
}
