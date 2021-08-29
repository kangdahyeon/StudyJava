package ch15_generics;

public class FruitBox {
	public static void main(String[] args) {
		
		// ��� ���� ����
		Box<Apple> aBox = new Box<Apple>();
		// ������ ���� ����
		Box<Orange> oBox = new Box<Orange>();
		
		// ���ڿ� ���� ���, �������� ����.
		aBox.set(new Apple());
		oBox.set(new Orange());
		
		// ���ڿ��� ���� ������
		Apple ap = aBox.get();
		Orange og = oBox.get();
		
		System.out.println(ap);		// ap.toString() �̶� ����.(�������̵��߱⶧����)
		System.out.println(og);
	}
}
