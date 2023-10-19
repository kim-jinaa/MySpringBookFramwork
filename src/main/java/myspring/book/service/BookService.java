package myspring.book.service;

import java.util.List;

import myspring.book.vo.BookVO;

public interface BookService {
	
	public List<BookVO> getBookList();
	public BookVO getBookIsbn(String isbn);
	
}
