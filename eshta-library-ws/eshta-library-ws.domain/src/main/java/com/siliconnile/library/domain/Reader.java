package com.siliconnile.library.domain;

import java.util.Collection;
import java.util.Date;

import com.pearlox.framework.domain.BasicObject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * User: Abdelrazik Date: 08/5/14
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "reader")
public class Reader extends BasicObject {

	private String name;

	private Date date;

	private Collection<BookReader> bookReader;

	@Column(name = "name")
	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}

	@Column(name = "regdate")
	private Date getDate() {
		return date;
	}

	private void setBookReader(Collection<BookReader> bookReader) {
		this.bookReader = bookReader;
	}

	private void setDate(Date date) {
		this.date = date;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "reader")
	private Collection<BookReader> getBookReader() {
		return bookReader;
	}

}
