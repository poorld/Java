package book;

public class Library {
	int count;
	int size;
	Book[] array;
	
	public Library(int size){
		this.size = size;
		array = new Book[size];
		count = 0;
	}
	
	//����
	public void add(Book book){
		if(count < size){
			array[count] = book;
			count++;
		}else{//��̬����
			Book array2[] = new Book[size+10];
			for(int i = 0; i < size; i++){
				array2[i] = array[i];
			}
			this.array = array2;
			this.size = size+10;
			add(book);
		}
	}
	
	//����
	public Book findIndex(String name){
		for(int i = 0; i < count; i++){
			if(array[i].bookName .equals(name)){
				return array[i];
			}
		}
		return null;
	}
	
	//��������
	public int find(String name){
		boolean find = false;
		int index = -1;
		for(int i = 0; i < count; i++){
			if (array[i].bookName.equals(name)){
				find = true;
				System.out.print("���ҵ���-->>");
				System.out.println(array[i]);
				return i;
			}
		}
		if(find == false){
		System.out.println("�Ҳ�����" + name + "���Ȿ��");
		}
		return -1;
	}
	
	//ɾ��
	public void dele(String name){
		int index = find(name);
		if(index == -1){
			return;
		}
		for(int i = index; i < count; i++){
			array[i] = array[i+1];
		}
		System.out.println("��ɾ����");
		count--;
	}
	
	//�޸�
	public void update(String name,Book book){
		Book bk = findIndex(name);
		if (bk == null)
			return;
		bk.bookName = book.bookName;
		bk.author = book.author;
		bk.publishers = book.publishers;
		bk.price = book.price;
	}
	
	//����
	public void sort(){
		System.out.println("����");
		for(int i = 0; i < count; i++){
			for(int j = i+1; j < count; j++){
				if(array[i].price<array[j].price){
					Book bk = array[i];
					array[i] = array[j];
					array[j] = bk;
				}
			}
		}
		print();
	}
	
	
	//��ӡ
	public void print(){
		for(int i = 0; i < count; i++){
			System.out.println(array[i]);
		}
	}
}
