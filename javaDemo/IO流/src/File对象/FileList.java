package File����;

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
		File f = new File("C:/Users/Administrator/Desktop/�����");
		ArrayList<File> list = new ArrayList<File>();
		// ���ñ������������ļ�·���浽list
		fileTolist(f, list);

		// �� list ����д�뵽�ļ� ����1
		PrintStream p = new PrintStream("text/list.txt");
		System.setOut(p);// �����p������ļ���
		for (File obj : list) {
			System.out.println(obj);
		}

		// �� list ����д�뵽�ļ� ����2
		String fileName = "text/������嵥.txt";
		listTofile(list, fileName);
		System.out.println("�ļ������ַ" + f.getAbsolutePath());
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
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
		}
	}
}
