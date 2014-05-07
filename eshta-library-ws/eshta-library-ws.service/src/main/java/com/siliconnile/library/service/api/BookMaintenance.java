package com.siliconnile.library.service.api;


import com.siliconnile.library.domain.Book;


/**
 * User: Abdelrazik
 * Date: 05/5/14
 */
public interface BookMaintenance {


	
	Book addOrUpdateNewBook(Book book);

	Book getBookById(Long id);

	public void deleteBook (Book book);
	
    
}
