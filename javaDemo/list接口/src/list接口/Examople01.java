package list�ӿ�;

import java.util.ArrayList;
import java.util.Iterator;

import Iterator�ӿ�.IteratorTool;

public class Examople01 {

	public static void main(String[] args) {
		// TODO �Զ����ɵķ������
		ArrayList list = new ArrayList();
		list.add("0");
		list.add("1");
		list.add("����");
		list.add("�������");
		System.out.println("list����:" + list.size());
		System.out.println("list�ڶ���Ԫ��:" + list.get(1));
		
		//����Iterator�ӿڵ�IteratorTool��������������Ԫ��
		Iterator�ӿ�.IteratorTool it = new IteratorTool();
		it.iteration(list);
		
		//��foreachѭ����������Ԫ�أ���iterator��
		for (Object obj : list){
			System.out.println(obj);
		}
		
		//�õ�����ɾ��Ԫ��
		Iterator it2 = list.iterator();
		while (it2.hasNext()){
			Object obj = it2.next();
			if ("����".equals(obj)){
				list.remove(obj);
				break;
			}
		}
		System.out.println();
		it.iteration(list);
	}

}
