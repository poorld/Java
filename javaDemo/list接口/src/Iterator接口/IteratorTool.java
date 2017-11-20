package Iterator接口;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Iterator接口，用于迭代访问Colletion中的元素
 * */
public class IteratorTool {

	public static void main(String[] args) {
		// TODO 自动生成的方法存根
		new IteratorTool();
	}
	public void iteration(ArrayList list){
		Iterator it = list.iterator();
		while (it.hasNext()){
			Object obj = it.next();
			System.out.println(obj);
		}
	}

}
