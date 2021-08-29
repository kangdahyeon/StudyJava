package ch14_2_;

import java.text.SimpleDateFormat;
import java.util.List;

public class ObjectStreamExample {
	public static void main(String[] args) throws ClassNotFoundException {
		
		BoardUtil util = new BoardUtil();
		
		// 리스트 직렬화
		util.write();
		
		// 리스트 역직렬화
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for(Board b : util.read()) {
			System.out.printf("%d\t%s\t%s\t%s\t%s\n",
					b.getBno(),b.getTitle(),b.getContent(),b.getWriter(),sdf.format(b.getDate()));
		}
	}
}
