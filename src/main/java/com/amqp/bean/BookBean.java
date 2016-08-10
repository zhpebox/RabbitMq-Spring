package com.amqp.bean;

import java.io.Serializable;

public class BookBean implements Serializable{

	private static final long serialVersionUID = 1L;

	private int bookId;
	private String bookName;
	private String[] bookEditer;
	
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public String[] getBookEditer() {
		return bookEditer;
	}
	public void setBookEditer(String[] bookEditer) {
		this.bookEditer = bookEditer;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	
	
}
