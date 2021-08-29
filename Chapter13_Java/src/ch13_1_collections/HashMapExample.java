package ch13_1_collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/**
 *  - 키 객체, 값 객체로 구성된 Map.Entry객체를 저장하는 구조.
 *   	: Entry Map 
 *  - 키(key)는 중복 저장할 수 없지만 값은 중복 저장 가능.
 * @author KDH
 *
 */

public class HashMapExample {
	public static void main(String[] args) {
		//Map 컬렉션 생성
		Map<String, Integer> map = new HashMap<String, Integer>();	// hash : 
		
		//객체 저장 1 : Set에 key를 담는 방법. 2. Set에 map.Entry(덩어리)를 담는방법(map.Entry는 key,value 를 합친것임)
		
		map.put("신용권", 85);	// 오토박싱
		map.put("홍길동", 90);
		map.put("동장군", 80);
		
		// 키가 같으므로 마지막 저장 값으로 대체
		map.put("홍길동", 95);	
		
		System.out.println("총 Entry 수 : " + map.size());
		System.out.println(map);
		
		//객체 찾기 : 키로 값 가져오기
		System.out.println("\t홍길동 : " + map.get("홍길동"));
		// 키 검색
		System.out.println("key존재여부 : " + map.containsKey("동장군"));
		System.out.println("-------------------------------");
		
		// 객체 루핑 및 처리
		// 1. Set<Key> 이용.
		Set<String> keys = map.keySet();
		Iterator<String> itr = keys.iterator();
		while(itr.hasNext()) {
			String key = itr.next();	// 키를 가지고옴
			Integer iv = map.get(key);	// 값을 가지고옴
			System.out.printf("Key : %s, Value : %d\n",key, iv);
		}
		itr= keys.iterator();
		System.out.println("-------------------------------");
		
		// 2. Set<Map.Entry> 이용.
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> eitr = entrySet.iterator();
		while(eitr.hasNext()) {
			Map.Entry<String, Integer> entry = eitr.next();	// Map.Entry 주머니에서 하나씩 꺼낸다.
			String key = entry.getKey();	// 키를 가지고옴
			Integer iv = entry.getValue();	// 값을 가지고옴
			
			System.out.printf("Key : %s, Value : %d\n",key, iv);
		}
		eitr= entrySet.iterator();
		
		
		
//		// 객체를 하나씩 처리
//		Set<String> keySet = map.keySet();
//		Iterator<String> keyIterator = keySet.iterator();
//		while(keyIterator.hasNext()) {
//		String key = keyIterator.next();
//		Integer value = map.get(key);
//		System.out.println("\t" + key + " : " + value);
//		}
//		System.out.println();
//		
//		// 객체 삭제
//		map.remove("홍길동");
//		System.out.println("총 Entry 수 : " + map.size());
//		
//		// 객체를 하나씩 처리
//		Set<Map.Entry<String, Integer>> entrySet1 = map.entrySet();
//		Iterator<Map.Entry<String, Integer>> entryIterator = entrySet1.iterator();
//		
//		while(entryIterator.hasNext()) {
//			Map.Entry<String, Integer> entry = entryIterator.next();
//			String key = entry.getKey();
//			Integer value = entry.getValue();
//			System.out.println("\t" + key + " : " + value);
//		}
//		System.out.println();
//		
//		map.clear();
//		
//		System.out.println("총 Entry 수 : " + map.size());
	}
}
