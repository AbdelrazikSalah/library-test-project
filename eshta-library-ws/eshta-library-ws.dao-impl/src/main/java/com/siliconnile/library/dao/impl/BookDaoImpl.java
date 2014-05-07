package com.siliconnile.library.dao.impl;



import javax.persistence.NoResultException;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;


import com.pearlox.framework.dao.impl.BasicJpaDao;
import com.siliconnile.library.dao.BookDao;
import com.siliconnile.library.domain.Book;

/**
 * User: Abdelrazik
 * Date: 04/16/14
 */
@Repository
public class BookDaoImpl extends BasicJpaDao<Book> implements BookDao {
    public BookDaoImpl() {
        super(Book.class);
    }


    
    
    @Override
    public Book getBookBytitle(final String title) {
        try {
            Query query = getEntityManager().createQuery("FROM Book WHERE title=:title")
                    .setParameter("title", title);
            return (Book) query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
        
    
}
	@Override
	public Book getBookByAuthor(String author) {
		try {
            Query query = getEntityManager().createQuery("FROM Book WHERE author=:author")
                .setParameter("author", author);
            return (Book) query.getSingleResult();
        } catch (NoResultException e) {
            return null;
        }
	
	}

}
