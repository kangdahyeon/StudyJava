package ch13_1_Test;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	public List <Board> getBoardList() {
		List<Board> list = new ArrayList<Board>();
		list.add(new Board("����1","����"));
		list.add(new Board("����2","����"));
		list.add(new Board("����3","����"));
		return list;
	}
}
