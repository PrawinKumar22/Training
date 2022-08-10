package com.training;

public class Book {
	
	private String bookName;
	
	private String authorName;
	
	private int bookIdNumber;

	@Override
	public String toString() {
		return "Book [bookName=" + bookName + ", authorName=" + authorName + ", bookIdNumber=" + bookIdNumber + "]";
	}

	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Book(String bookName, String authorName, int bookIdNumber) {
		super();
		this.bookName = bookName;
		this.authorName = authorName;
		this.bookIdNumber = bookIdNumber;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public int getBookIdNumber() {
		return bookIdNumber;
	}

	public void setBookIdNumber(int bookIdNumber) {
		this.bookIdNumber = bookIdNumber;
	}
	

}
