package objectStream;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class ObjectStreamDemo {

	public static void main(String[] args) {
		//writerObj();
		readObj();
	}
	
	public static void readObj(){
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("c:/person.object"));
			try {
				try{
					while (true){
						Person p = (Person)ois.readObject();
						System.out.println(p);
					}
				}catch (EOFException e){
					System.out.println("ĳ�ִ���-_-");
				}
			} catch (ClassNotFoundException e) {
				// TODO �Զ����ɵ� catch ��
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}
	
	public static void writerObj(){
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("c:/person.object"));
			oos.writeObject(new Person("����","�����ǰ�"));
			oos.writeObject(new Person("����","������.."));
			oos.writeObject(new Person("�Ϫ","hjfd47.&*"));
		} catch (FileNotFoundException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		} catch (IOException e) {
			// TODO �Զ����ɵ� catch ��
			e.printStackTrace();
		}
	}

}
