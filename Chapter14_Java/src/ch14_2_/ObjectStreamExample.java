package ch14_2_;

import java.text.SimpleDateFormat;
import java.util.List;

public class ObjectStreamExample {
	public static void main(String[] args) throws ClassNotFoundException {
		
		BoardUtil util = new BoardUtil();
		
		// ����Ʈ ����ȭ
		util.write();
		
		// ����Ʈ ������ȭ
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		for(Board b : util.read()) {
			System.out.printf("%d\t%s\t%s\t%s\t%s\n",
					b.getBno(),b.getTitle(),b.getContent(),b.getWriter(),sdf.format(b.getDate()));
		}
	}
}
