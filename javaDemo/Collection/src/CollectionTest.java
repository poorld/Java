import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;


public class CollectionTest {

	public static void main(String[] args) {
		Collection c = new ArrayList();
		c.add("�����");
		//Java�Զ�װ��
		c.add(6);
		System.out.println("c���ϵ�Ԫ�ظ���:" + c.size());
		//ɾ��ָ��Ԫ��
		c.remove(6);
		//�ж��Ƿ�����ַ���������ա�
		System.out.println("�Ƿ���������:" + c.contains("�����"));
		c.add("����");
		System.out.println("c�ļ���Ԫ��:" + c);
		
		Collection books = new HashSet();
		books.add("���java");
		books.add("���android");
		System.out.println("c�����Ƿ���ȫ����books���ϣ�" + c.containsAll(books));
		//��c���ϼ�ȥbooks�������Ԫ��
		c.removeAll(books);
		//Ȼ��ɾ����
		System.out.println("c���ϵ�Ԫ��:" + c);
		System.out.println("books���ϵ�Ԫ��:" + books);
		//ɾ��c���������е�Ԫ��
		c.clear();
		System.out.println("c���ϵ�Ԫ��:" + c);
		//books������ֻʣ��c������Ҳ������Ԫ��
		System.out.println("books���ϵ�Ԫ��:" + books);
	}

}
