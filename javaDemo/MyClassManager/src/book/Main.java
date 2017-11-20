package book;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Library library = new Library(2);
		Information info1 = new Information("广西南宁","胡家健","广职出版社","17456468412");
		Information info2 = new Information("广西南宁","付东升","广职出版社","18867855754");
		Information info3 = new Information("广西南宁","廖守鑫","广职出版社","15686548566");
		
		Press press = new Press(5);
		press.add(info1);
		press.add(info2);
		press.add(info3);
		press.find("广职出版社");
	
		
		Book book1 = new Book("胚胎移植技术","胡佳建","广西出版社",32.1,info1);
		Book book2 = new Book("胚胎分割技术","付东升","广西出版社",51.9,info2);
		Book book3 = new Book("胚胎解剖技术","廖守鑫","广西出版社",3.1,info3);
		
		library.add(book1);
		library.add(book2);
		library.add(book3);
		
		menu(library);
		
	}
	
	public static void menu(Library library){
		while(true){
		int select = -1;
		System.out.println("--------图书馆菜单------");
		System.out.println("--------1.增加书本");
		System.out.println("--------2.查找书本");
		System.out.println("--------3.价格排序");
		System.out.println("--------4.修改书本信息");
		System.out.println("--------5.删除书本");
		System.out.println("--------6.查看所有书籍");
		System.out.println("--------10.退出");
		System.out.println("请输入选项：");
		
		Scanner sca = new Scanner(System.in);
		select = sca.nextInt();
		
		switch(select){
		case 1:{
			add(library);
			break;
		}
		case 2:{
			find(library);
			break;
		}
		case 3:{
			sort(library);
			break;
		}
		case 4:{
			update(library);
			break;
		}
		case 5:{
			dele(library);
			break;
		}
		case 6:{
			find_all(library);
			break;
		}
		case 10:{
			return;
		}
		default :
			System.out.println("输入错误!请重新输入：");
		}
	}
	}
	
	private static void find_all(Library library) {
		library.print();
	}

	private static void dele(Library library) {
		System.out.println("---------删除选项---------");
		System.out.println("输入书名");
		Scanner sca = new Scanner(System.in);
		String name = sca.nextLine();
		library.dele(name);
	}

	private static void update(Library library) {
		System.out.println("---------修改选项---------");
		System.out.println("输入书名:");
		Scanner sca = new Scanner(System.in);
		String name1 = sca.nextLine();
		System.out.println("输入作者:");
		String author = sca.nextLine();
		System.out.println("输入出版社:");
		String publishers = sca.nextLine();
		System.out.println("输入价格:");
		Double price = sca.nextDouble();
		library.update(name1,new Book(name1,author,publishers,price,null));
	}

	private static void sort(Library library) {
		library.sort();
	}

	public static void add(Library library){
		System.out.println("---------增加选项---------");
		System.out.println("输入书名:");
		Scanner sca = new Scanner(System.in);
		String name = sca.nextLine();
		if (name.isEmpty()){
			System.out.println("输入不能为空！请重新输入：");
			name = sca.nextLine();
		}
		System.out.println("输入作者:");
		String author = sca.nextLine();
		System.out.println("输入出版社:");
		String publishers = sca.nextLine();
		System.out.println("输入价格:");
		Double price = sca.nextDouble();
		
		Book bk = new Book(name,author,publishers,price,null);
		library.add(bk);
	}
	
	public static void find(Library library){
		System.out.println("---------查找选项---------");
		System.out.println("输入书名");
		Scanner sca = new Scanner(System.in);
		String name = sca.nextLine();
		library.find(name);
	}
}
