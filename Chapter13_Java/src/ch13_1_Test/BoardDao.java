package ch13_1_Test;

import java.util.ArrayList;
import java.util.List;

public class BoardDao {
	public List <Board> getBoardList() {
		List<Board> list = new ArrayList<Board>();
		list.add(new Board("力格1","郴侩"));
		list.add(new Board("力格2","郴侩"));
		list.add(new Board("力格3","郴侩"));
		return list;
	}
}
