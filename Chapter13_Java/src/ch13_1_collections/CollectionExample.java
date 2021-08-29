package ch13_1_collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Vector;

class MyClass{}

public class CollectionExample {
	public static void main(String[] args) {
		
		// 값을 저장하는 배열
		int[] arr1 = new int[3];
		arr1[0] = 1;
		System.out.println(arr1[0]);
		System.out.println(Arrays.toString(arr1));
		
		// 번지를 저장하는 배열 
		MyClass[] arr2 = new MyClass[3];
		arr2[0] = new MyClass();
		System.out.println(Arrays.toString(arr2));
		
		// 배열의 한계때문에 생긴것 Collection 자료구조 등장.
		
		List<String> list1 = new ArrayList<>(); // List 자료형으로 ArrayList를 구현함
		list1.add("kor");
		list1.add("1");
		System.out.println(list1);
		
		List<Integer> list2 = new ArrayList<>(); // <> 이 안에는 클래스만 들어갈 수 있고, 기본 자료형을 넣고싶으면 랩퍼클래스로 해야함. 
		list2.add(1); // -> list2.add(new Integer(1));  이렇게 적은것과 동일하고 오토박싱이라고 부름.
//		System.out.println(list2.get(1));
		System.out.println(list2);
		
		List<Character> list3 = new Vector<>();
		list3.add('e'); list3.add('f');
		System.out.println(list3);
		
		List<Float> list4 = new LinkedList<>();
		list4.add(0.1f); list4.add(1.2f);
		
		List<Double> list5 = new LinkedList<>();
		list5.add(0.1);
		
		Set<Double> set = new HashSet<>();
		set.add(0.1);
		set.add(0.1);
		set.add(0.1);
		System.out.println(set);
		
		Map<Integer, String> map = new HashMap<>();
		map.put(211, "강남");
		map.put(201, "종로");
		System.out.println(map);
		
	}
}
