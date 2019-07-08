package com.funshopper.FunshopperDomain.model;

import java.sql.Date;

import javax.persistence.Embeddable;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Embeddable
public class ProductDetail {
	
	private String description;
	private Date create_timestamp;
	private Date update_timestamp;
}
