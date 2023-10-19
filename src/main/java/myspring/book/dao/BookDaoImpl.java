package myspring.book.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import myspring.book.dao.mapper.BookMapper;
import myspring.book.vo.BookVO;

@Repository("bookDao")
public class BookDaoImpl implements BookDao {
	
	@Autowired
	private BookMapper bookmapper;

	@Override
	public List<BookVO> selectAll() {
		List<BookVO> bookAll = bookmapper.selectBookList();
		return bookAll;
	}

	@Override
	public BookVO selectOne(String isbn) {
		BookVO bookIsbn = bookmapper.selectBookByIsbn(isbn);
		return bookIsbn;
	}

	
}
