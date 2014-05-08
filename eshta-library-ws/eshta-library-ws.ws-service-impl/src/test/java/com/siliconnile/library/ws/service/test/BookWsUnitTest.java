package com.siliconnile.library.ws.service.test;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.transaction.TransactionConfiguration;
import org.springframework.transaction.annotation.Transactional;
import org.testng.AssertJUnit;
import org.testng.annotations.Test;

import com.siliconnile.library.dto.BookDTO;
import com.siliconnile.library.ws.service.api.BookWS;

@ContextConfiguration(locations = { "/test-beans.xml", "classpath:/dao-config.xml",
"classpath:applicationContext-ws.xml" })
@TransactionConfiguration(transactionManager = "transactionManager", defaultRollback = false)
@Transactional
public class BookWsUnitTest {

	public BookWsUnitTest() {
		// TODO Auto-generated constructor stub
	}
	
	@Autowired
	private BookWS bookWS;
	
	


	@Test
    @Rollback
	public void testInsertNewBook() {
		
	BookDTO book= bookWS.addOrUpdateNewBook(null,"harrypotter", "J.K.Rowling", "1234", "1234");
	
	AssertJUnit.assertEquals("BookWsUnitTest.testInsertNewBook() failed", "J.K.Rowling", book.getAuthor() );
	AssertJUnit.assertEquals("BookWsUnitTest.testInsertNewBook() failed", "1234", book.getIsbn() );
	AssertJUnit.assertEquals("BookWsUnitTest.testInsertNewBook() failed", "1234", book.getPictureUrl() );
	
		
	}
	
	@Test
    @Rollback
    public void testDeleteBook() {

		bookWS.deleteBook(3l);
		BookDTO book= bookWS.getBookByid(2);
		AssertJUnit.assertNull("BookWsUnitTest.testDeleteBook() failed", book);

	}

}