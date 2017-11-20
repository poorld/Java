package list接口;

import java.util.ArrayList;
import java.util.Iterator;

import Iterator接口.IteratorTool;

public class Examople01 {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		ArrayList list = new ArrayList();
		list.add("0");
		list.add("1");
		list.add("哒哒");
		list.add("顶你个肺");
		System.out.println("list个数:" + list.size());
		System.out.println("list第二个元素:" + list.get(1));
		
		//调用Iterator接口的IteratorTool方法来遍历所有元素
		Iterator接口.IteratorTool it = new IteratorTool();
		it.iteration(list);
		
		//用foreach循环遍历所有元素，比iterator简单
		for (Object obj : list){
			System.out.println(obj);
		}
		
		//用迭代器删除元素
		Iterator it2 = list.iterator();
		while (it2.hasNext()){
			Object obj = it2.next();
			if ("哒哒".equals(obj)){
				list.remove(obj);
				break;
			}
		}
		System.out.println();
		it.iteration(list);
	}

}
