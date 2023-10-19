package myspring.book.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import myspring.book.dao.BookDao;
import myspring.book.vo.BookVO;

@Service("bookService")
public class BookServiceImpl implements BookService {

	@Autowired
	BookDao bookDao;
	
	@Override
	public List<BookVO> getBookList() {
		return bookDao.selectAll();
	}

	@Override
	public BookVO getBookIsbn(String isbn) {
		return bookDao.selectOne(isbn);
	}
	
}
