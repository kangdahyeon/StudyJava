package com.libs.collection;

public class MySmartList<E> implements MyList2<E>{
	// 필드
		// 요소를 저장할 배열
		private Object[] elementData;
		// 모든 자료구조를 담기위해 Object형으로 해야함.
		
		// 현재 배열의 총 길이
		private int capacity;
		
		//늘려줄 배열의 용량
		private final int amount;
		
		// 배열 요소의 현재 위치 값
		private int cursor;
		
	// 생성자
		MySmartList(int amount) {
			this.amount = amount;
			capacity = this.amount;
			elementData = new Object[capacity];
			cursor = 0;
		}
		public MySmartList() {
			this(3);
		}

	@Override
	public void add(E element) {
		if(capacity <= cursor) {
			// 배열 복사 수행
			// 새로운 배열 생성 
			Object[] tempArr  = new Object[capacity + amount];
		
			System.arraycopy(elementData, 0, tempArr, 0, elementData.length);	// 배열 복사
			// 참조 변경
			elementData = tempArr;
			// 배열 용량 업데이트.
			capacity += amount;
		} 
		elementData[cursor++] = element;
	}

	@SuppressWarnings("unchecked")
	@Override
	public E get(int idx) {
		return (E) elementData[idx]; // (E)하지 않으면 Object형으로 저장되기때문에 강제 형변환 들어가야함.
	}

	@Override
	public int size() {
		return cursor;
	}

	@Override
	public void remove(int idx) {
		// 삭제 하고자 하는 idx가 마지막이면 0으로 초기화
				if(idx != cursor - 1) {
					// 배열의 처리 
					System.arraycopy(elementData, idx + 1, elementData, idx, (cursor-1) - idx);
				}
				// 마지막 데이터 초기화
				elementData[cursor-1] = 0;
				// 현재 위치 재설정
				cursor--;
		
	}

	@Override
	public void clear() {
		elementData = new Object[amount];
		capacity = amount;
		cursor = 0;
		
	}
	
	@Override
	public String toString() {
		String tmp = "";
		for(Object element : elementData) {
			tmp += (E)elementData + ", ";
		}
		return "[" + tmp + "]";
}
	
}
