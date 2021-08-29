package ch13_1_Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapExample {
	public static void main(String[] args) {
		Map<String,Integer> m = new HashMap<>();
		m.put("blue", 96);
		m.put("hong", 86);
		m.put("white", 92);
		
		String name = null;
		int maxScore = 0;
		int totalScore = 0;
		
		Set<Map.Entry<String, Integer>> es = m.entrySet();
		for(Map.Entry<String, Integer> es1 : es) {
			if(es1.getValue() > maxScore) {
				name = es1.getKey();
				maxScore = es1.getValue();
			}
			totalScore += es1.getValue();
		}
		int aS = totalScore / m.size();
		System.out.println("��� ���� : " + aS);
		
		System.out.println("�ְ� ���� : " + maxScore);
		System.out.println("�ְ� ������ ���� ���̵�: " + name);
	
	}
}
