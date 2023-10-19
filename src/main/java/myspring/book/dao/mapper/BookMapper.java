package myspring.book.dao.mapper;

import java.util.List;

import myspring.book.vo.BookVO;

public interface BookMapper {
	
	List<BookVO> selectBookList();
	BookVO selectBookByIsbn(String isbn);
}
