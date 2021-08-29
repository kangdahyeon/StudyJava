package ch13_1_collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
/**
 * [LinkedList] implements List
 *	 ArrayList�� ���� �迭�� ��ü�� �����ؼ� ����.
 *	 LinkedList�� ���� ������ ��ũ�ؼ� ü��ó�� ����
 *	 Ư�� �ε����� ��ü�� ����/���� �� �� �� ��ũ�� ����ǰ�
 *	 ������ ��ũ�� �Һ�(�迭���� ���ʿ�)
 *	 ����� ���������� �߰�/�����ϴ� ��� ArrayList�� ������
 *	 �߰��� �߰�/���� �ϴ°�쿣 LinkedList�� �� ������.
 */

public class LinkedListExample {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<String>(); // new�� String�� ��������.
		
		long startTime;
		long endTime;
		
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList �ɸ��ð�   : " + (endTime-startTime) + " ns");
		
		startTime = System.nanoTime();
		for(int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("Linkedlist �ɸ��ð� : " + (endTime-startTime) + " ns");
	}
}
