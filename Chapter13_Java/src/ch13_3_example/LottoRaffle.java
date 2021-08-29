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
		 * [로또번호 생성기]
		 *  - 중복 저장되지 않는 HashSet이용
		 */
		// 번호 생성 : Math.random();
		// HashSet을 6개짜리로 저장해서 안에 내용물을 채운 뒤 출력.
		Set<Integer> set = new HashSet<>(COUNT);
		
		
		int n = 0;
		while(set.size() < COUNT) {
			set.add((int)(Math.random() * MAX) + 1);
			n++;
		}
		
		List<Integer> lotto = new LinkedList<>(set);
		
		Collections.sort(lotto);
		
		System.out.println(lotto + ", " + n + "회");
	}
}
