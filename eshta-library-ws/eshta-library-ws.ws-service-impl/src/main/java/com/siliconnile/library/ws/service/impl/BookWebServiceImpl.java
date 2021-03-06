package com.siliconnile.library.ws.service.impl;

import com.siliconnile.library.domain.Book;
import com.siliconnile.library.dto.BookDTO;
import com.siliconnile.library.service.api.BookMaintenance;
import com.siliconnile.library.ws.service.api.BookWS;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * User: Abdelrazik Date: 07/5/14
 */
public class BookWebServiceImpl implements BookWS {

	@Autowired
	private BookMaintenance bookMaintenance;

	@Autowired
	private DTOconverter converter;

	@Override
	public BookDTO getBookByid(long id) {
		Book book = bookMaintenance.getBookById(id);
		BookDTO bookDTO = converter.getBookDTO(book);
		return bookDTO;
	}

	@Override
	public BookDTO addOrUpdateNewBook(Long id, String title, String author,
			String isbn, String pictureURL) {
		if (id == null) {
			Book book = new Book();
			book.setTitle(title);
			book.setAuthor(author);
			book.setIsbn(isbn);
			book.setPictureUrl(pictureURL);

			Book e = bookMaintenance.addOrUpdateNewBook(book);

			DTOconverter converter = new DTOconverter();
			BookDTO result = converter.getBookDTO(e);
			return result;
		} else {
			Book book = bookMaintenance.getBookById(id);
			if (book != null) {

				if (title != null) {
					book.setTitle(title);

				}
				if (author != null) {
					book.setAuthor(author);

				}
				if (isbn != null) {
					book.setTitle(isbn);

				}
				if (pictureURL != null) {
					book.setPictureUrl(pictureURL);

				}
				Book e = bookMaintenance.addOrUpdateNewBook(book);

				DTOconverter converter = new DTOconverter();
				BookDTO result = converter.getBookDTO(e);
				return result;

			}
			
			

		}
		return null;

	}

	@Override
	public void deleteBook(Long id) {

		Book book = bookMaintenance.getBookById(id);

		bookMaintenance.deleteBook(book);

	}

}
