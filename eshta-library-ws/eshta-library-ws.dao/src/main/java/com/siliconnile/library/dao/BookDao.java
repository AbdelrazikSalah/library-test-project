package com.siliconnile.library.dao;



import com.pearlox.framework.dao.BasicDao;
import com.siliconnile.library.domain.Book;



/**
 * User: Abdelrazik
 * Date: 05/5/14
 */
public interface BookDao extends BasicDao<Book> {
    
	Book getBookBytitle(String title);
	
	Book getBookByAuthor(String author);

}
