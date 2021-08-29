package ch13_1_collections;

import com.libs.collection.MyList2;
import com.libs.collection.MySmartList;

class MyClass {
	
}

public class MyCollectionTest3 {
	public static void main(String[] args) {
	
		MyList2<String> list = new MySmartList<String>(); // 컨트롤 쉬프트 O 누르면 자동 임포트.
		
		list.add("왜");
		list.add("안돼");
		list.add("??");
		
		// ArrayIndexOutOfException 해결하기.

		System.out.println(list);
		System.out.println("list[2]의 값 : " + list.get(2));
		System.out.println("size : " + list.size());
		System.out.println("=============================");
		
		list.add("kor");
		list.add("ㅎㅎ");
		
	
		MyList2<Integer> list2 = new MySmartList<Integer>();
		
		list2.add(100);
		list2.add(300);
		
		System.out.println(list2);
		System.out.println("list2[2]의 값 : " + list2.get(2));
		System.out.println("size : " + list2.size());
		System.out.println("=============================");
		
		MyList2<Object> list3 = new MySmartList<Object>();
		
		list3.add("Hello");
		list3.add(11);
		list3.add(3.14f);
		list3.add('A');
		list3.add(new MyClass());
		//Object를 사용할 수는 있으나, 다시 꺼낼때 각각에 맞는 형으로 형 변환을 해줘야해서, 불편해서 잘 쓰지않음.
		
		// 배열 초기화
		list.clear();
		System.out.println(list);
		System.out.println("list[2]의 값 : " + list.get(2));
		System.out.println("size : " + list.size());
		System.out.println("=============================");
	}
}
