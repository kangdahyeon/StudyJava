package ch07_polyex2;
/**
 * 상속없이 만든것을 상속구조로 바꿔보자.
 * 
 * 공통점을 먼저 찾아보고,
 * @author KDH
 *
 */
class Friends {
	//필드
	private String name;
	private String phone;
	
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	//생성자
	public Friends(String na, String ph) {
		name = na;
		phone = ph;
	}
	
	//메소드
	public void showInfo() {
		System.out.print("이름 : " + name);
		System.out.print("전화 : " + phone);
	}
}

class UnivFriend extends Friends {
	
	private String major;

	public UnivFriend(String na, String ma, String ph) {
		super(na, ph);
		major = ma;
	
	}
	public void showInfo() {
		super.showInfo();
		System.out.println("전공 : " + major);

	}
}

class CompFriend extends Friends {
	//필드
	
	private String department;
	
	
	//생성자
	public CompFriend(String na, String de, String ph) {
		super(na, ph);
		department = de;
	}
	//메소드
	public void showInfo() {
		super.showInfo();
		System.out.println("부서 : " + department);
	}	
}

public class MyFriends {
	public static void main(String[] args) {
		//대학친구의 관리를 위한 배열과 변수
		Friends[] frns = new Friends[6];
		int cnt = 0;
	
		
		//대학 친구 추가
		frns[cnt++] = new UnivFriend("1","Computer","010-");
		frns[cnt++] = new UnivFriend("2","Computer","010-");
		frns[cnt++] = new UnivFriend("3","Computer","010-");
	
		//직장 친구 추가
		frns[cnt++] = new CompFriend("4","R&D","010-");
		frns[cnt++] = new CompFriend("5","R&D","010-");
		frns[cnt++] = new CompFriend("6","R&D","010-");
		
		//대학친구목록 일괄출력
		for(int i = 0; i < frns.length; i++) {
			frns[i].showInfo();
			if(frns[i].getName().equals(2)) {
				System.out.printf("친구목록 %d번째 에서 찾았습니다./n", i+1 );
			}
		}
	}
}