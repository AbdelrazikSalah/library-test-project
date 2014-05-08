package com.siliconnile.library.ws.service.impl;


import com.siliconnile.library.domain.Book;
import com.siliconnile.library.dto.BookDTO;

import org.springframework.stereotype.Component;


/**
 * User: Abdelrazik
 * Date: 07/5/14
 */
@Component
public class DTOconverter {

	public DTOconverter() {

	}

	public BookDTO getBookDTO(final Book book) {
		BookDTO result = new BookDTO();
		result.setTitle(book.getTitle());
		result.setAuthor(book.getAuthor());
		result.setIsbn(book.getIsbn());
		result.setPictureUrl(book.getPictureUrl());

		return result;
	}

	
}
