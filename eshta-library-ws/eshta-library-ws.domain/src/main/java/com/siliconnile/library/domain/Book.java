package com.siliconnile.library.domain;

import java.util.Collection;

import com.pearlox.framework.domain.BasicObject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * User: Abdelrazik Date: 07/5/14
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "book")
public class Book extends BasicObject {

	private String title;

	private String author;

	private String pictureUrl;

	private String isbn;

	private Collection<BookReader> bookReader;

	@Column(name = "title")
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "author")
	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	@Column(name = "picture_url")
	public String getPictureUrl() {
		return pictureUrl;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}

	@Column(name = "isbn")
	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	private void setBookReader(Collection<BookReader> bookReader) {
		this.bookReader = bookReader;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "book")
	public Collection<BookReader> getBookReader() {
		return bookReader;
	}

}
