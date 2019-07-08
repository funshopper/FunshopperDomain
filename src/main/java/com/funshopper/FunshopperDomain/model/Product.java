package com.funshopper.FunshopperDomain.model;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Column;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	
	private String name;
	private String description;
	private double price;
	private String link;
	private String comment;
	
	@ManyToOne
	@JoinColumn(name="category_id", referencedColumnName = "id")
	private Category category;

	@Embedded
	@AttributeOverrides({
		  @AttributeOverride( name = "description", column = @Column(name = "long_description")),
		  @AttributeOverride( name = "lastName", column = @Column(name = "contact_last_name")),
		  @AttributeOverride( name = "phone", column = @Column(name = "contact_phone"))
		})
	private ProductDetail productDetails;
}
