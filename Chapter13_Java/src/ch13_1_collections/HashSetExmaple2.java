package ch13_1_collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetExmaple2 {
	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("È«±æµ¿", 30));
		set.add(new Member("ÀÓ²©Á¤", 27));
		set.add(new Member("È«±æµ¿", 25));
		set.add(new Member("ÀÓ²©Á¤", 27));
		
		System.out.println("ÃÑ °´Ã¼ ¼ö : " + set.size());
		System.out.println(set);
		
		Iterator<Member> itr = set.iterator();
		while(itr.hasNext()) {
			Member member = itr.next();
			System.out.println(member.name + ", " + member.age);
		}
		itr = set.iterator(); // ÃÊ±âÈ­
	}
}
