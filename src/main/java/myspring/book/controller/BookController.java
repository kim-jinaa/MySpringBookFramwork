package myspring.book.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import myspring.book.service.BookService;
import myspring.book.vo.BookVO;

@Controller
public class BookController {
	@Autowired
	private BookService bookService;
	
	@RequestMapping("/bookList.do")
	public ModelAndView bookList() {
		List<BookVO> bookList = bookService.getBookList();
		return new ModelAndView("bookList", "bookList", bookList);
	}
	
	@RequestMapping("/getBookIsbn.do")
	public String getBookIsbn(@RequestParam("isbn") String isbn, Model model) {
		BookVO bookVO = bookService.getBookIsbn(isbn);
		model.addAttribute("book", bookVO);
		return "bookInfo";
	}
	
}
