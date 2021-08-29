package ch11_1;
class Member {
	String id;
	Member(String id) {
		this.id = id;
	}
	@Override	// �������̵� �ؼ� ���빰 �񱳸� �� �� �ְ� �ٲ�.
	public boolean equals(Object obj) {
		// �Ű����� MemberŸ������ Ȯ��.
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
			System.out.println("obj1�� obj2�� �����մϴ�.");
		} else {
			System.out.println("obj1�� obj2�� �������� �ʽ��ϴ�.");
		}
		if(obj1.equals(obj3)) {
			System.out.println("obj1�� obj3�� �����մϴ�.");
		} else {
			System.out.println("obj1�� obj3�� ���������ʽ��ϴ�.");
		}
	}
}
