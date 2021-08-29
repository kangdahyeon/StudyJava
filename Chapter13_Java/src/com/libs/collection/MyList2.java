package com.libs.collection;
/**
 * 자료구조 구현을 위한 메소드 규격을 정의한 인터페이스 작성
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
