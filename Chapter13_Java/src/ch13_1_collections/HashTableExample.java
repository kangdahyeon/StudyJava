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
			System.out.println("아이디와 비밀번호를 입력해주세요.");
			System.out.print("아이디 : ");
			String id = sc.nextLine().trim();
			System.out.print("비밀번호 : ");
			String password = sc.nextLine().trim();
			System.out.println("--------------------------");
			
			// id가 틀린경우
			if(!map.containsKey(id)) {
				System.out.println("입력하신 ID가 존재하지 않습니다. 다시 입력해주세요.");
				continue;
			} 
			// id가 맞을경우
			else {
				// pw불일치
				if(!map.get(id).equals(password)) {
					System.out.println("비밀번호가 일치하지 않습니다. 다시 입력해주세요.");
				}
				// pw일치
				else { 
					System.out.println("로그인 되었습니다.");
					break;
				}
			}
		}
		sc.close();
	} 
}
