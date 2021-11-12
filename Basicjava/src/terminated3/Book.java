package terminated3;

import java.util.Objects;

public abstract class Book {
	//필드
	private int number;
	private String title;
	private String author;
	private static int countOfBooks;
	//생성자
	public Book() {
	}
	public Book(String title, String author) {		
		this.title = title;
		this.author = author;
		this.number = ++countOfBooks;
	}
	//메소드
	public int getNumber() {
		return number;	
	}
	public void setNumber(int number) {
		this.number = number;
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public abstract int getLateFee(int lateDays);
	
	@Override
	public int hashCode() {
		return Objects.hash(author, title);
	}
	public boolean equals(Object other) {
		Book book = (Book) other;
		return author.equals(book.author) && title.equals(book.title);
	}
	
//	@Override
//	public boolean equals(Object obj) {
//		if (this == obj)
//			return true;
//		if (obj == null)
//			return false;
//		if (getClass() != obj.getClass())
//			return false;
//		Book other = (Book) obj;
//		return Objects.equals(author, other.author) && Objects.equals(title, other.title);
//	}
	
	@Override
	public String toString() {
		return String.format("관리번호 %d 번, 제목: %s, 작가: %s (일주일 연체료: %,d원)",
				number,title,author,getLateFee(7));
	}	
}
