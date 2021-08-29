package ch14_2_;

import java.io.Serializable;
import java.util.Date;

public class Board implements Serializable {	// implements Serializable 를 붙이면 바이너리 작성가능.
	private static final long serialVersionUID = -7579254361239741141L;
	private int bno;
	private String title;
	private String content;
	private String writer;
	private Date date;
	
	public Board(int bno,String title, String content, String writer, Date date) {
		this.bno = bno;
		this.title = title;
		this.content = content;
		this.writer = writer;
		this.date = date; 
	}

	public int getBno() {
		return bno;
	}

	public void setBno(int bno) {
		this.bno = bno;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getWriter() {
		return writer;
	}

	public void setWriter(String writer) {
		this.writer = writer;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}
}
