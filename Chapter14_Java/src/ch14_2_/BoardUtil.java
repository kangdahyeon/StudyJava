package ch14_2_;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
/**
 * Board를 이용해서 바이너리를 작성함.
 * 
 * @author KDH
 *
 */

public class BoardUtil {
	
	List<Board> list;
	
	public BoardUtil() {
		list = new ArrayList<>();
		list.add(new Board(1, "제목1", "내용", "글쓴이", new Date()));
		list.add(new Board(2, "제목2", "내용", "글쓴이", new Date()));
		list.add(new Board(3, "제목3", "내용", "글쓴이", new Date()));
		list.add(new Board(4, "제목4", "내용", "글쓴이", new Date()));
		list.add(new Board(5, "제목5", "내용", "글쓴이", new Date()));
		
	}
	
	// Board클래스를 직렬화 
	public void write() {
		String path = "C:/Users/KDH/Documents/Dev211/Temp/boardClass.db";
		try {
			FileOutputStream fos = new FileOutputStream(path);
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(list);
			oos.flush();
			oos.close();
			
		} catch (IOException e){}
	}
	// Board 클래스를 역직렬화
	public List<Board> read() throws ClassNotFoundException {
		String path = "C:/Users/KDH/Documents/Dev211/Temp/boardClass.db";
		try {
			FileInputStream fis = new FileInputStream(path);
			ObjectInputStream ois = new ObjectInputStream(fis);
			List<Board> list = (List<Board>)ois.readObject();
			ois.close();
			
		} catch (IOException ex) {ex.printStackTrace();}
		
		return list;
	}
}

	

