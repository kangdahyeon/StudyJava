package ch15_generics;
/*
 * 사과를 담는 상자
 */

public class OrangeBox {
	private Orange or;
	
	// 사과를 담는다
	public void set(Orange o) {
		or = o;
	}
	
	// 사과를 꺼낸다
	public Orange get() {
		return or;
	}
}
