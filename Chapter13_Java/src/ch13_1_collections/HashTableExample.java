package ch13_1_collections;

import java.util.Hashtable;
import java.util.Map;
import java.util.Scanner;

public class HashTableExample {
	public static void main(String[] args) {
		Map<String, String> map = new Hashtable<String, String>();
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345");
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("���̵�� ��й�ȣ�� �Է����ּ���.");
			System.out.print("���̵� : ");
			String id = sc.nextLine().trim();
			System.out.print("��й�ȣ : ");
			String password = sc.nextLine().trim();
			System.out.println("--------------------------");
			
			// id�� Ʋ�����
			if(!map.containsKey(id)) {
				System.out.println("�Է��Ͻ� ID�� �������� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
				continue;
			} 
			// id�� �������
			else {
				// pw����ġ
				if(!map.get(id).equals(password)) {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�. �ٽ� �Է����ּ���.");
				}
				// pw��ġ
				else { 
					System.out.println("�α��� �Ǿ����ϴ�.");
					break;
				}
			}
		}
		sc.close();
	} 
}
