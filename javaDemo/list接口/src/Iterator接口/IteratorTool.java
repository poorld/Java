package Iterator�ӿ�;

import java.util.ArrayList;
import java.util.Iterator;

/*
 * Iterator�ӿڣ����ڵ�������Colletion�е�Ԫ��
 * */
public class IteratorTool {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
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
