package ch13_1_Test;

import java.util.List;

public class ListExample {
	public static void main(String[] args) {
		BoardDao dao = new BoardDao();
		List<Board> list = dao.getBoardList();
		for(Board b : list) {
			System.out.println(b.getTitle() + "-" + b.getContent());
		}
	}
}
