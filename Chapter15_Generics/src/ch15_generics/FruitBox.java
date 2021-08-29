package ch15_generics;

public class FruitBox {
	public static void main(String[] args) {
		
		// 사과 상자 생성
		Box<Apple> aBox = new Box<Apple>();
		// 오렌지 상자 생성
		Box<Orange> oBox = new Box<Orange>();
		
		// 상자에 각각 사과, 오렌지를 담음.
		aBox.set(new Apple());
		oBox.set(new Orange());
		
		// 상자에서 과일 꺼내기
		Apple ap = aBox.get();
		Orange og = oBox.get();
		
		System.out.println(ap);		// ap.toString() 이랑 동일.(오버라이딩했기때문에)
		System.out.println(og);
	}
}
