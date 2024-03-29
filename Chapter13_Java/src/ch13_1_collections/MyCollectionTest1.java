package ch13_1_collections;

import com.libs.collection.MyIntList;


public class MyCollectionTest1 {
	public static void main(String[] args) {
	
		MyIntList list = new MyIntList(3);
		
		list.add(1);
		list.add(3);
		list.add(5);
		
		// ArrayIndexOutOfException 해결하기.
		list.add(7);
		System.out.println(list);
		System.out.println("list[2]의 값 : " + list.get(2));
		System.out.println("size : " + list.size());
		System.out.println("=============================");
	
		//삭제 해결하기
		//[1, 3, 5, ] -> [1, 5, ]
		list.remove(1);
		System.out.println(list);
		System.out.println("list[2]의 값 : " + list.get(2));
		System.out.println("size : " + list.size());
		System.out.println("=============================");
		
		// 배열 초기화
		list.clear();
		System.out.println(list);
		System.out.println("list[2]의 값 : " + list.get(2));
		System.out.println("size : " + list.size());
		System.out.println("=============================");
	}
}
