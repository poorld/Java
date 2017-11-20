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
	
	//增加
	public void add(Book book){
		if(count < size){
			array[count] = book;
			count++;
		}else{//动态数组
			Book array2[] = new Book[size+10];
			for(int i = 0; i < size; i++){
				array2[i] = array[i];
			}
			this.array = array2;
			this.size = size+10;
			add(book);
		}
	}
	
	//查找
	public Book findIndex(String name){
		for(int i = 0; i < count; i++){
			if(array[i].bookName .equals(name)){
				return array[i];
			}
		}
		return null;
	}
	
	//查找书名
	public int find(String name){
		boolean find = false;
		int index = -1;
		for(int i = 0; i < count; i++){
			if (array[i].bookName.equals(name)){
				find = true;
				System.out.print("已找到：-->>");
				System.out.println(array[i]);
				return i;
			}
		}
		if(find == false){
		System.out.println("找不到《" + name + "》这本书");
		}
		return -1;
	}
	
	//删除
	public void dele(String name){
		int index = find(name);
		if(index == -1){
			return;
		}
		for(int i = index; i < count; i++){
			array[i] = array[i+1];
		}
		System.out.println("已删除！");
		count--;
	}
	
	//修改
	public void update(String name,Book book){
		Book bk = findIndex(name);
		if (bk == null)
			return;
		bk.bookName = book.bookName;
		bk.author = book.author;
		bk.publishers = book.publishers;
		bk.price = book.price;
	}
	
	//排序
	public void sort(){
		System.out.println("排序");
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
	
	
	//打印
	public void print(){
		for(int i = 0; i < count; i++){
			System.out.println(array[i]);
		}
	}
}
