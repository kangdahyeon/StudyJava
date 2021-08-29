package ch13_1_collections;

import java.util.List;
import java.util.Vector;

class Board {
	String subject;
	String content;
	String writer;
	
//	public String getSubject() {
//		return subject;
//	}
//
//	public String getContent() {
//		return content;
//	}
//
//	public String getWriter() {
//		return writer;
//	}
	
	public Board(String subject, String content, String writer) {
		this.subject = subject;
		this.content = content;
		this.writer = writer;
	}
}

public class VectorExample {
	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		
		list.add(new Board("제목1", "내용", "글쓴이")); 
		list.add(new Board("제목2", "내용", "글쓴이"));
		list.add(new Board("제목3", "내용", "글쓴이"));
		list.add(new Board("제목4", "내용", "글쓴이"));
		list.add(new Board("제목5", "내용", "글쓴이"));
		
		System.out.println(list); // 주소 배열 출력
		
		list.remove(2);
		list.remove(3);
		
		for(int i = 0; i < list.size(); i++) {
			Board board = list.get(i);
//			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
			System.out.printf("%s\t%s\t%s\t\n",board.subject,board.content, board.writer);
		}
	}
}
