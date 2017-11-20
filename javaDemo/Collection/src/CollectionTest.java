import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;


public class CollectionTest {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("孙悟空");
		//Java自动装箱
		c.add(6);
		System.out.println("c集合的元素个数:" + c.size());
		//删除指定元素
		c.remove(6);
		//判断是否包含字符串“孙悟空”
		System.out.println("是否包含孙悟空:" + c.contains("孙悟空"));
		c.add("哒哒");
		System.out.println("c的集合元素:" + c);
		
		Collection books = new HashSet();
		books.add("疯狂java");
		books.add("疯狂android");
		System.out.println("c集合是否完全包含books集合？" + c.containsAll(books));
		//用c集合减去books集合里的元素
		c.removeAll(books);
		//然而删不了
		System.out.println("c集合的元素:" + c);
		System.out.println("books集合的元素:" + books);
		//删除c集合里所有的元素
		c.clear();
		System.out.println("c集合的元素:" + c);
		//books集合里只剩下c集合里也包括的元素
		System.out.println("books集合的元素:" + books);
	}

}
