package myspring.book.dao;

import java.util.List;

import myspring.book.vo.BookVO;

public interface BookDao {
	
	public List<BookVO> selectAll();
	public BookVO selectOne(String isbn);
	
}
