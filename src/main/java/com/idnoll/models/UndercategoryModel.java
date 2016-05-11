package com.idnoll.models;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

@SuppressWarnings("serial")
@Entity
@Table(name="undercategories")
public class UnderCategoryModel implements Serializable {

	@Id
	@GeneratedValue
	private Integer undercategories_id;

	private String undercategories_name;

	@Transient
	private CategoryModel categoryModel;
	
	


	public UnderCategoryModel(){

	}


	public String getUndercategories_name() {
		return undercategories_name;
	}


	public void setUndercategories_name(String undercategories_name) {
		this.undercategories_name = undercategories_name;
	}


	public Integer getUndercategories_id() {
		return undercategories_id;
	}

	

}
