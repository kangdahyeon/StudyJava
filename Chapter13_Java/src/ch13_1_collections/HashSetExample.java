package ch13_1_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * [HashSet]
 * List �÷���(�������̽�) 
 * @author KDH
 *
 */

public class HashSetExample {
	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		// hashCode() + equals()�� �̿��� ��
		set.add("Java");
		set.add("JDBC");
		set.add("Servlet/JSP");
		// ���� ��ü ����
		set.add("Java");
		
		set.add("iBATIS");
		
		int size = set.size();
		System.out.println("�� ��ü �� : " + size);
		
		Iterator<String> ite = set.iterator(); // �ش� �ڷᱸ���� �ݺ��� ��� 
		while(ite.hasNext()) {					// while�� ���� ite �κп� set.iterator() ���൵ ����.
			String e = ite.next(); // ite.next() -> ite++ �� ���ذͰ� ���� ���¶�� �����ϸ��. 
			System.out.println("\t" + e);
		}
		ite = set.iterator();	// �ݺ��� �ٽ� ��� : ���� while������  ite�� ������ ����������, ����ִ� ���¿��� �ٽ� �ʱ�ȭ �ؼ� ���빰�� ä���ذ���.
		// while������ �������� ������ ite = set.iterator(); �� ������ ������.
		System.out.println();
		
		set.remove("JDBC");
		set.remove("iBATIS");
		
		System.out.println("�� ��ü �� : " + set.size());
		System.out.println("=============================================");
		
		while(ite.hasNext()) {					
			String e = ite.next();
			System.out.println("\t" + e);
		}
		ite = set.iterator();	// �ݺ��� �ٽ� ��� : ���� while������  ite�� ������ ����������, ����ִ� ���¿��� �ٽ� �ʱ�ȭ �ؼ� ���빰�� ä���ذ���.
		// while������ �������� ������ ite = set.iterator(); �� ������ ������.
		System.out.println();
		
		System.out.println("=============================================");
		
		for(String e : set) {		// ���� for�� ���.
			System.out.println("\t" + e);
		}
		set.clear();
		if(set.isEmpty()) { System.out.println("�������");}
	}
}
