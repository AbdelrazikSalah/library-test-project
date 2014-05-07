package com.siliconnile.library.service.impl;



import com.siliconnile.library.dao.BookDao;
import com.siliconnile.library.domain.Book;
import com.siliconnile.library.service.api.BookMaintenance;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * User: Abdelrazik
 * Date: 05/5/14
 */
@Service
public class BookMaintenanceImpl implements BookMaintenance {
    
    @Autowired
    private BookDao bookDao;
    
    
	@Override
	public Book addOrUpdateNewBook(Book book) {
		
		try {
			return bookDao.saveOrUpdate(book);
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}


	
		@Override
	    public Book getBookById(final Long id) {
	        Book result = null;
			try {
				result = bookDao.findById(id);
			} catch (Exception e) {
				e.printStackTrace();
			}
	        return result;
	    
	}
		
		public void deleteBook (Book book)
		{
			
			try {
				 bookDao.delete(book);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		


}
