package ch07_polyex;
/**
 * 상속없이 만든것을 상속구조로 바꿔보자.
 * @author KDH
 *
 */

class UnivFriend {
	private String name;
	private String major;
	private String phone;
	
	public UnivFriend(String na, String ma, String ph) {
		name = na;
		major = ma;
		phone = ph;
	}
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("전공 : " + major);
		System.out.println("전화 : " + phone);
	}
	
}

class CompFriend {
	//필드
	private String name;
	private String department;
	private String phone;
	
	//생성자
	public CompFriend(String na, String de, String ph) {
		name = na;
		department = de;
		phone = ph;
		
		
	}
	//메소드
	public void showInfo() {
		System.out.println("이름 : " + name);
		System.out.println("부서 : " + department);
		System.out.println("전화 : " + phone);
	}	
}

public class MyFriends {
	public static void main(String[] args) {
		//대학친구의 관리를 위한 배열과 변수
		UnivFriend[] ufrns = new UnivFriend[3];
		int ucnt = 0;
		
		//직장동료의 관리를 위한 배열과 변수
		CompFriend[] cfrns = new CompFriend[3];
		int ccnt = 0;
		
		//대학 친구 추가
		ufrns[ucnt++] = new UnivFriend("1","Computer","010-");
		ufrns[ucnt++] = new UnivFriend("2","Computer","010-");
		ufrns[ucnt++] = new UnivFriend("3","Computer","010-");
	
		//직장 친구 추가
		cfrns[ccnt++] = new CompFriend("4","R&D","010-");
		cfrns[ccnt++] = new CompFriend("5","R&D","010-");
		cfrns[ccnt++] = new CompFriend("6","R&D","010-");
		
		//대학친구목록 일괄출력
		for(int i = 0; i < ufrns.length; i++) {
			ufrns[i].showInfo();
		}
		//직장친구목록 일괄출력
				for(int i = 0; i < cfrns.length; i++) {
					cfrns[i].showInfo();
		}
	}
}