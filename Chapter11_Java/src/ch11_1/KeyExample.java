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
		//Key ��ü�� �ĺ�Ű�� ����ؼ� Sting���� �����ϴ� hashMap ��ü ����.
		HashMap<Key,String> hashMap = new HashMap<Key,String>();
		
		//�ĺ�Ű newKey(1)�� "ȫ�浿"�� ������.
		hashMap.put(new Key(1),"ȫ�浿");
		
		//�ĺ�Ű newKey(1)�� "ȫ�浿"�� �о��.
		//hashMap�� hashCode�� equals �� ���ÿ� �� �������̵� �������!! 
		String value = hashMap.get(new Key(1));
		System.out.println(value);
	}
}
