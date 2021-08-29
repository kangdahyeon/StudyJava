package ch13_1_collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
/**
 *  - Ű ��ü, �� ��ü�� ������ Map.Entry��ü�� �����ϴ� ����.
 *   	: Entry Map 
 *  - Ű(key)�� �ߺ� ������ �� ������ ���� �ߺ� ���� ����.
 * @author KDH
 *
 */

public class HashMapExample {
	public static void main(String[] args) {
		//Map �÷��� ����
		Map<String, Integer> map = new HashMap<String, Integer>();	// hash : 
		
		//��ü ���� 1 : Set�� key�� ��� ���. 2. Set�� map.Entry(���)�� ��¹��(map.Entry�� key,value �� ��ģ����)
		
		map.put("�ſ��", 85);	// ����ڽ�
		map.put("ȫ�浿", 90);
		map.put("���屺", 80);
		
		// Ű�� �����Ƿ� ������ ���� ������ ��ü
		map.put("ȫ�浿", 95);	
		
		System.out.println("�� Entry �� : " + map.size());
		System.out.println(map);
		
		//��ü ã�� : Ű�� �� ��������
		System.out.println("\tȫ�浿 : " + map.get("ȫ�浿"));
		// Ű �˻�
		System.out.println("key���翩�� : " + map.containsKey("���屺"));
		System.out.println("-------------------------------");
		
		// ��ü ���� �� ó��
		// 1. Set<Key> �̿�.
		Set<String> keys = map.keySet();
		Iterator<String> itr = keys.iterator();
		while(itr.hasNext()) {
			String key = itr.next();	// Ű�� �������
			Integer iv = map.get(key);	// ���� �������
			System.out.printf("Key : %s, Value : %d\n",key, iv);
		}
		itr= keys.iterator();
		System.out.println("-------------------------------");
		
		// 2. Set<Map.Entry> �̿�.
		Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
		Iterator<Map.Entry<String, Integer>> eitr = entrySet.iterator();
		while(eitr.hasNext()) {
			Map.Entry<String, Integer> entry = eitr.next();	// Map.Entry �ָӴϿ��� �ϳ��� ������.
			String key = entry.getKey();	// Ű�� �������
			Integer iv = entry.getValue();	// ���� �������
			
			System.out.printf("Key : %s, Value : %d\n",key, iv);
		}
		eitr= entrySet.iterator();
		
		
		
//		// ��ü�� �ϳ��� ó��
//		Set<String> keySet = map.keySet();
//		Iterator<String> keyIterator = keySet.iterator();
//		while(keyIterator.hasNext()) {
//		String key = keyIterator.next();
//		Integer value = map.get(key);
//		System.out.println("\t" + key + " : " + value);
//		}
//		System.out.println();
//		
//		// ��ü ����
//		map.remove("ȫ�浿");
//		System.out.println("�� Entry �� : " + map.size());
//		
//		// ��ü�� �ϳ��� ó��
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
//		System.out.println("�� Entry �� : " + map.size());
	}
}
