
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		 Stu s = new Stu("20140001", "LiMing", 22, "Ů ", 89.5);
		 Stu s1 = new Stu("20140002", "ZhangSan", 21, "�� ", 89);
		 Stu s2 = new Stu("20140003", "xiaoWang", 20, "Ů ", 87);
		 MyClass myClass = new MyClass(2);
		 myClass.add(s);
		 myClass.add(s1);
		 myClass.add(s2);
		 
		 myClass.add(s2);
		 
		 //myClass.delete("20140002");
		 myClass.update("20140001", new Stu("20140001", "����", 22, "Ů ", 77.5));
		 myClass.sort();
		 myClass.print();
		  
		 
		  

	}

}
