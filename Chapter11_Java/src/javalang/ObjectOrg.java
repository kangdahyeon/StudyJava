package javalang;

class Value {
	int value;
	@Override
	public boolean equals(Object obj) {
		if( this.value == ((Value)obj).value ) { 	// value값 서로 비교.
			return true;
		} else {
			return false;
		}
		
	}
	
	public Value(int value) {
		this.value = value;
	}
}

public class ObjectOrg {
	public static void main(String[] args) {
		
		Value v1 = new Value(701021);
		Value v2 = new Value(701021);
		
		System.out.println(v1 instanceof Value);
		System.out.println(v2 instanceof Value);
		
		System.out.println(v1);	// v1.toString() 이 실행된것.
		System.out.println(v2);
		
		System.out.println(v1 == v2);	//참조값(주소)이 같은가? 라는뜻.
		
		System.out.println(System.identityHashCode(v1));	//고유번호?주소?정도를 확인하는것.
		System.out.println(System.identityHashCode(v2));
		
		System.out.println(v1.hashCode());	//hashCode : hash란? 분류하기위한 식별자. 분류를 위한 코드 정도가 되겠다.
		System.out.println(v2.hashCode());
		
		System.out.println(v1.equals(v2)); // -> false equals : 오브젝트 클래스에선 주소값으로 확인함.
		
		
		
	}
}
