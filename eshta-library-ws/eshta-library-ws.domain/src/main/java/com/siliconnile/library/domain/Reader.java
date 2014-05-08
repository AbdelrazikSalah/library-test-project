package com.siliconnile.library.domain;

import com.pearlox.framework.domain.BasicObject;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * User: Abdelrazik
 * Date: 08/5/14
 */
@SuppressWarnings("serial")
@Entity
@Table(name = "reader")
public class Reader extends BasicObject {


	
	private String name;
    
    private String date;

    
    @Column(name="name")
	private String getName() {
		return name;
	}

	private void setName(String name) {
		this.name = name;
	}
	 @Column(name="regdate")
	private String getDate() {
		return date;
	}

	private void setDate(String date) {
		this.date = date;
	}
    
    
    
    

    
    
   
	

    
    
  


    
    
}
