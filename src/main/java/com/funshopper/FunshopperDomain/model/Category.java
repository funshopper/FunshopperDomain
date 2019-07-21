package com.funshopper.FunshopperDomain.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "category")
public class Category {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	private String name;
	
	private String description;
	
	@OneToMany(fetch=FetchType.LAZY, mappedBy = "category")
	private Set<Product> products;
}
