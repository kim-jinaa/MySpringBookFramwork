package myspring.book.vo;

import java.sql.Date;

public class BookVO {
	private int id;
	private String title;
	private String author;
	private String isbn;
	private String genre;
	private Date created_at;
	
	public BookVO() {
		super();
	}

	public BookVO(int id, String title, String author, String isbn, String genre, Date created_at) {
		super();
		this.id = id;
		this.title = title;
		this.author = author;
		this.isbn = isbn;
		this.genre = genre;
		this.created_at = created_at;
	}

	@Override
	public String toString() {
		return "BookVO [id=" + id + ", title=" + title + ", author=" + author + ", isbn=" + isbn + ", genre=" + genre
				+ ", created_at=" + created_at + "]";
	}

	public int getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getAuthor() {
		return author;
	}

	public String getIsbn() {
		return isbn;
	}

	public String getGenre() {
		return genre;
	}

	public Date getCreated_at() {
		return created_at;
	}

	
	
	
}
