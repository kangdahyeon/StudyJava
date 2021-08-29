package ch11_1;
class Member {
	String id;
	Member(String id) {
		this.id = id;
	}
	@Override	// 오버라이딩 해서 내용물 비교를 할 수 있게 바꿈.
	public boolean equals(Object obj) {
		// 매개값이 Member타입인지 확인.
		if(obj instanceof Member) {
			Member member = (Member) obj;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
}

public class MemberExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("blue");
		Member obj3 = new Member("red");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1과 obj2는 동등합니다.");
		} else {
			System.out.println("obj1과 obj2는 동등하지 않습니다.");
		}
		if(obj1.equals(obj3)) {
			System.out.println("obj1과 obj3는 동등합니다.");
		} else {
			System.out.println("obj1과 obj3는 동등하지않습니다.");
		}
	}
}
