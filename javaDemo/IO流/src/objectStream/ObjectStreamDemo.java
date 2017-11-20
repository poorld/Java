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
					System.out.println("某种错误-_-");
				}
			} catch (ClassNotFoundException e) {
				// TODO 自动生成的 catch 块
				e.printStackTrace();
			}
			
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}
	
	public static void writerObj(){
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("c:/person.object"));
			oos.writeObject(new Person("哒哒","丢那星啊"));
			oos.writeObject(new Person("胡佳","丢那妈.."));
			oos.writeObject(new Person("岑溪","hjfd47.&*"));
		} catch (FileNotFoundException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		} catch (IOException e) {
			// TODO 自动生成的 catch 块
			e.printStackTrace();
		}
	}

}
