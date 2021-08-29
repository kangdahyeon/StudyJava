package ch13_3_example;

import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

public class LottoRaffle {
	
	static final int MAX 	= 45;
	static final int COUNT	= 6;
	
	public static void main(String[] args) {
		/**
		 * [�ζǹ�ȣ ������]
		 *  - �ߺ� ������� �ʴ� HashSet�̿�
		 */
		// ��ȣ ���� : Math.random();
		// HashSet�� 6��¥���� �����ؼ� �ȿ� ���빰�� ä�� �� ���.
		Set<Integer> set = new HashSet<>(COUNT);
		
		
		int n = 0;
		while(set.size() < COUNT) {
			set.add((int)(Math.random() * MAX) + 1);
			n++;
		}
		
		List<Integer> lotto = new LinkedList<>(set);
		
		Collections.sort(lotto);
		
		System.out.println(lotto + ", " + n + "ȸ");
	}
}
