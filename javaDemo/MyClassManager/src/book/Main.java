package book;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Library library = new Library(2);
		Information info1 = new Information("��������","���ҽ�","��ְ������","17456468412");
		Information info2 = new Information("��������","������","��ְ������","18867855754");
		Information info3 = new Information("��������","������","��ְ������","15686548566");
		
		Press press = new Press(5);
		press.add(info1);
		press.add(info2);
		press.add(info3);
		press.find("��ְ������");
	
		
		Book book1 = new Book("��̥��ֲ����","���ѽ�","����������",32.1,info1);
		Book book2 = new Book("��̥�ָ��","������","����������",51.9,info2);
		Book book3 = new Book("��̥���ʼ���","������","����������",3.1,info3);
		
		library.add(book1);
		library.add(book2);
		library.add(book3);
		
		menu(library);
		
	}
	
	public static void menu(Library library){
		while(true){
		int select = -1;
		System.out.println("--------ͼ��ݲ˵�------");
		System.out.println("--------1.�����鱾");
		System.out.println("--------2.�����鱾");
		System.out.println("--------3.�۸�����");
		System.out.println("--------4.�޸��鱾��Ϣ");
		System.out.println("--------5.ɾ���鱾");
		System.out.println("--------6.�鿴�����鼮");
		System.out.println("--------10.�˳�");
		System.out.println("������ѡ�");
		
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
			System.out.println("�������!���������룺");
		}
	}
	}
	
	private static void find_all(Library library) {
		library.print();
	}

	private static void dele(Library library) {
		System.out.println("---------ɾ��ѡ��---------");
		System.out.println("��������");
		Scanner sca = new Scanner(System.in);
		String name = sca.nextLine();
		library.dele(name);
	}

	private static void update(Library library) {
		System.out.println("---------�޸�ѡ��---------");
		System.out.println("��������:");
		Scanner sca = new Scanner(System.in);
		String name1 = sca.nextLine();
		System.out.println("��������:");
		String author = sca.nextLine();
		System.out.println("���������:");
		String publishers = sca.nextLine();
		System.out.println("����۸�:");
		Double price = sca.nextDouble();
		library.update(name1,new Book(name1,author,publishers,price,null));
	}

	private static void sort(Library library) {
		library.sort();
	}

	public static void add(Library library){
		System.out.println("---------����ѡ��---------");
		System.out.println("��������:");
		Scanner sca = new Scanner(System.in);
		String name = sca.nextLine();
		if (name.isEmpty()){
			System.out.println("���벻��Ϊ�գ����������룺");
			name = sca.nextLine();
		}
		System.out.println("��������:");
		String author = sca.nextLine();
		System.out.println("���������:");
		String publishers = sca.nextLine();
		System.out.println("����۸�:");
		Double price = sca.nextDouble();
		
		Book bk = new Book(name,author,publishers,price,null);
		library.add(bk);
	}
	
	public static void find(Library library){
		System.out.println("---------����ѡ��---------");
		System.out.println("��������");
		Scanner sca = new Scanner(System.in);
		String name = sca.nextLine();
		library.find(name);
	}
}
