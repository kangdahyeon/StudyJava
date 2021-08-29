package ch13_1_collections;

public class Member {

		public String name;
		public int age;
		
		public Member(String name, int age) {
			this.name = name;
			this.age = age;
		}
		
		@Override
		public boolean equals(Object obj) {
			if(obj instanceof Member) {
				Member member = (Member) obj;
				return member.name.equals(name) && (member.age == age);
			} else {return false;}
		}
		@Override
		public int hashCode() {
			return name.hashCode() + age;	// name.hashCode + age 라서 이것 하나만으로도 검사 가능함.위의 equals를 굳이 쓰지 않아도 됌.
	}
}

