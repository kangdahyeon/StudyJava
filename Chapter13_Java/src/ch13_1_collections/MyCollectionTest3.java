package ch13_1_collections;

import com.libs.collection.MyList2;
import com.libs.collection.MySmartList;

class MyClass {
	
}

public class MyCollectionTest3 {
	public static void main(String[] args) {
	
		MyList2<String> list = new MySmartList<String>(); // ��Ʈ�� ����Ʈ O ������ �ڵ� ����Ʈ.
		
		list.add("��");
		list.add("�ȵ�");
		list.add("??");
		
		// ArrayIndexOutOfException �ذ��ϱ�.

		System.out.println(list);
		System.out.println("list[2]�� �� : " + list.get(2));
		System.out.println("size : " + list.size());
		System.out.println("=============================");
		
		list.add("kor");
		list.add("����");
		
	
		MyList2<Integer> list2 = new MySmartList<Integer>();
		
		list2.add(100);
		list2.add(300);
		
		System.out.println(list2);
		System.out.println("list2[2]�� �� : " + list2.get(2));
		System.out.println("size : " + list2.size());
		System.out.println("=============================");
		
		MyList2<Object> list3 = new MySmartList<Object>();
		
		list3.add("Hello");
		list3.add(11);
		list3.add(3.14f);
		list3.add('A');
		list3.add(new MyClass());
		//Object�� ����� ���� ������, �ٽ� ������ ������ �´� ������ �� ��ȯ�� ������ؼ�, �����ؼ� �� ��������.
		
		// �迭 �ʱ�ȭ
		list.clear();
		System.out.println(list);
		System.out.println("list[2]�� �� : " + list.get(2));
		System.out.println("size : " + list.size());
		System.out.println("=============================");
	}
}
