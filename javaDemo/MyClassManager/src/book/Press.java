package book;

public class Press {
	int count;
	int size;
	Information array[];
	
	public Press(int size){
		this.size = size;
		array = new Information[size];
		count = 0;
	}
	
	public void add(Information info){
		if(count < size){
			array[count] = info;
			count++;
		}
	}
	
	public void find(String name){
		System.out.println("出版社信息:");
		for(int i = 0; i < count; i++){
			if(array[i].name.equals(name)){
				System.out.println(array[i]);
			}
		}
	}
	
	public void print(){
		for(int i = 0; i < count; i++){
			System.out.println(array[i]);
		}
	}
}
