package com.libs.collection;
/**
 * �ڷᱸ�� ������ ���� �޼ҵ� �԰��� ������ �������̽� �ۼ�
 * @author KDH
 *
 */

public interface MyList2<E> {
	public abstract void add(E element);
	
	public abstract E get(int idx);
	
	public abstract int size();
	
	public abstract void remove(int idx);
	
	public abstract void clear();
	
}
