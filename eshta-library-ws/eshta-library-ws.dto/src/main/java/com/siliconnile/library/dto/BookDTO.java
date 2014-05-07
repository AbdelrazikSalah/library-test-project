package com.siliconnile.library.dto;

import com.pearlox.framework.converter.DomainClassRef;
import com.pearlox.framework.dto.BasicDTO;


import javax.xml.bind.annotation.XmlRootElement;

/**
 * User: Abdelrazik
 * Date: 05/5/14
 */
@SuppressWarnings("serial")
@XmlRootElement
@DomainClassRef(name = "Book")
public class BookDTO extends BasicDTO {
    
private String title;
    
    private String author;
    
    private String pictureUrl;
    
    private String isbn;

	private String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getPictureUrl() {
		return pictureUrl;
	}

	public void setPictureUrl(String pictureUrl) {
		this.pictureUrl = pictureUrl;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

    
    
    
}
