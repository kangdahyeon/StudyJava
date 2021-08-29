package com.libs.collection;

public class MySmartList<E> implements MyList2<E>{
	// �ʵ�
		// ��Ҹ� ������ �迭
		private Object[] elementData;
		// ��� �ڷᱸ���� ������� Object������ �ؾ���.
		
		// ���� �迭�� �� ����
		private int capacity;
		
		//�÷��� �迭�� �뷮
		private final int amount;
		
		// �迭 ����� ���� ��ġ ��
		private int cursor;
		
	// ������
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
			// �迭 ���� ����
			// ���ο� �迭 ���� 
			Object[] tempArr  = new Object[capacity + amount];
		
			System.arraycopy(elementData, 0, tempArr, 0, elementData.length);	// �迭 ����
			// ���� ����
			elementData = tempArr;
			// �迭 �뷮 ������Ʈ.
			capacity += amount;
		} 
		elementData[cursor++] = element;
	}

	@SuppressWarnings("unchecked")
	@Override
	public E get(int idx) {
		return (E) elementData[idx]; // (E)���� ������ Object������ ����Ǳ⶧���� ���� ����ȯ ������.
	}

	@Override
	public int size() {
		return cursor;
	}

	@Override
	public void remove(int idx) {
		// ���� �ϰ��� �ϴ� idx�� �������̸� 0���� �ʱ�ȭ
				if(idx != cursor - 1) {
					// �迭�� ó�� 
					System.arraycopy(elementData, idx + 1, elementData, idx, (cursor-1) - idx);
				}
				// ������ ������ �ʱ�ȭ
				elementData[cursor-1] = 0;
				// ���� ��ġ �缳��
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
