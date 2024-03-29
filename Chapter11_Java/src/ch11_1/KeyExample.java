package ch11_1;

import java.util.HashMap;

class Key {
	int number;
	public Key(int number) {
		this.number = number;
	}
	@Override
	public int hashCode() {
		return number;
	}
	
	@Override
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			Key compareKey = (Key) obj;
			if(this.number == compareKey.number) {
				return true;
			}
		}
		return false;
		
	}
}

public class KeyExample {
	public static void main(String[] args) {
		//Key 객체를 식별키로 사용해서 Sting값을 저장하는 hashMap 객체 생성.
		HashMap<Key,String> hashMap = new HashMap<Key,String>();
		
		//식별키 newKey(1)로 "홍길동"을 저장함.
		hashMap.put(new Key(1),"홍길동");
		
		//식별키 newKey(1)로 "홍길동"을 읽어옴.
		//hashMap은 hashCode와 equals 를 동시에 다 오버라이딩 해줘야함!! 
		String value = hashMap.get(new Key(1));
		System.out.println(value);
	}
}
