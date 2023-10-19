package myspring.book;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import myspring.book.dao.mapper.BookMapper;
import myspring.book.service.BookService;
import myspring.book.vo.BookVO;

@ExtendWith(SpringExtension.class)
@ContextConfiguration(locations = "classpath:spring-beans-book.xml")
public class BookDBTest {
	
	@Autowired
	DataSource dataSource;
	
	@Autowired
	SqlSessionFactory sessionFactory;
	
	@Autowired
	SqlSession sqlSession;
	
	@Autowired
	BookMapper bookMapper;
	
	@Autowired
	BookService bookService;
	
	@Test
	public void service() {
		BookVO book = bookMapper.selectBookByIsbn("9788925554");
		System.out.println(book);
	}
	
	@Test @Disabled
	public void mapper() {
		BookVO book = bookMapper.selectBookByIsbn("9788925554");
		System.out.println(book);
	}
	
	@Test @Disabled
	public void session() {
		BookVO book = sqlSession.selectOne("selectBookByIsbn", "9788925554");
		System.out.println(book);
	}
	
	@Test
	public void sessionFactory() {
		System.out.println(sessionFactory.getClass().getName());
	}
	
	@Test
	public void conn() {
		try {
			Connection conn = dataSource.getConnection();
			DatabaseMetaData metaData = conn.getMetaData();
			System.out.println("DB Product Name : " + metaData.getDatabaseProductName());
			System.out.println("DB Driver : " + metaData.getDriverName());
			System.out.println("DB URL : " + metaData.getURL());
			System.out.println("DB Username : " + metaData.getUserName());
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}// conn()
	
}
