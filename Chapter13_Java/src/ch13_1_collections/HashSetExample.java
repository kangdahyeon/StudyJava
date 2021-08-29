package ch13_1_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * [HashSet]
 * List 컬렉션(인터페이스) 
 * @author KDH
 *
 */

public class HashSetExample {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		// hashCode() + equals()를 이용한 비교
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		// 동일 객체 저장
		set.add("Java");
		
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("총 객체 수 : " + size);
		
		Iterator<String> ite = set.iterator(); // 해당 자료구조의 반복자 얻기 
		while(ite.hasNext()) {					// while문 안의 ite 부분에 set.iterator() 해줘도 가능.
			String e = ite.next(); // ite.next() -> ite++ 을 해준것과 같은 상태라고 생각하면됌. 
			System.out.println("\t" + e);
		}
		ite = set.iterator();	// 반복자 다시 얻기 : 위에 while문으로  ite의 모든것이 빠져나가서, 비어있는 상태에서 다시 초기화 해서 내용물을 채워준것임.
		// while문으로 돌렸으면 무조건 ite = set.iterator(); 을 무조건 해주자.
		System.out.println();
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("총 객체 수 : " + set.size());
		System.out.println("=============================================");
		
		while(ite.hasNext()) {					
			String e = ite.next();
			System.out.println("\t" + e);
		}
		ite = set.iterator();	// 반복자 다시 얻기 : 위에 while문으로  ite의 모든것이 빠져나가서, 비어있는 상태에서 다시 초기화 해서 내용물을 채워준것임.
		// while문으로 돌렸으면 무조건 ite = set.iterator(); 을 무조건 해주자.
		System.out.println();
		
		System.out.println("=============================================");
		
		for(String e : set) {		// 향상된 for문 사용.
			System.out.println("\t" + e);
		}
		set.clear();
		if(set.isEmpty()) { System.out.println("비어있음");}
	}
}
