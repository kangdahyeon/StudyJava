package ch13_1_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 * [LinkedList] implements List
 *	 ArrayList는 내부 배열에 객체를 저장해서 관리.
 *	 LinkedList는 인접 참조를 링크해서 체인처럼 관리
 *	 특정 인덱스의 객체를 삽입/삭제 시 앞 뒤 링크만 변경되고
 *	 나머지 링크는 불변(배열복사 불필요)
 *	 따라사 끝에서부터 추가/삭제하는 경우 ArrayList가 빠르고
 *	 중간에 추가/삭제 하는경우엔 LinkedList가 더 빠르다.
 */

public class LinkedListExample {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<String>(); // new쪽 String은 생략가능.
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간   : " + (endTime-startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("Linkedlist 걸린시간 : " + (endTime-startTime) + " ns");
	}
}
