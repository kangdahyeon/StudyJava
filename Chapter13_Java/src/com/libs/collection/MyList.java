package com.libs.collection;
/**
 * �ڷᱸ�� ������ ���� �޼ҵ� �԰��� ������ �������̽� �ۼ�
 * @author KDH
 *
 */

public interface MyList {
	public abstract void add(int num);
	
	public abstract int get(int idx);
	
	public abstract int size();
	
	public abstract void remove(int idx);
	
	public abstract void clear();
	
}
