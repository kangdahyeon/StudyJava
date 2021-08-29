package javalang;

class Value {
	int value;
	@Override
	public boolean equals(Object obj) {
		if( this.value == ((Value)obj).value ) { 	// value�� ���� ��.
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
		
		System.out.println(v1);	// v1.toString() �� ����Ȱ�.
		System.out.println(v2);
		
		System.out.println(v1 == v2);	//������(�ּ�)�� ������? ��¶�.
		
		System.out.println(System.identityHashCode(v1));	//������ȣ?�ּ�?������ Ȯ���ϴ°�.
		System.out.println(System.identityHashCode(v2));
		
		System.out.println(v1.hashCode());	//hashCode : hash��? �з��ϱ����� �ĺ���. �з��� ���� �ڵ� ������ �ǰڴ�.
		System.out.println(v2.hashCode());
		
		System.out.println(v1.equals(v2)); // -> false equals : ������Ʈ Ŭ�������� �ּҰ����� Ȯ����.
		
		
		
	}
}
