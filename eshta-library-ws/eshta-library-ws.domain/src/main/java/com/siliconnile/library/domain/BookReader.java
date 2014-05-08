package com.siliconnile.library.domain;

import com.pearlox.framework.domain.BasicObject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * User: Abdelrazik Date: 08/5/14
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "book_reader")
public class BookReader extends BasicObject {

	private String bookId;

	private String readerId;

	private Book book;

	private Reader reader;

	@Column(name = "book_id")
	private String getBookId() {
		return bookId;
	}

	@Column(name = "reader_id")
	private String getReaderId() {
		return readerId;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "book_id", insertable = false, updatable = false)
	private Book getBook() {
		return book;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "reader_id", insertable = false, updatable = false)
	private Reader getReader() {
		return reader;
	}

	private void setBookId(String bookId) {
		this.bookId = bookId;
	}

	private void setReaderId(String readerId) {
		this.readerId = readerId;
	}

	private void setBook(Book book) {
		this.book = book;
	}

	private void setReader(Reader reader) {
		this.reader = reader;
	}

}
