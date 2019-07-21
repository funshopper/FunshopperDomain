package com.funshopper.FunshopperDomain.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.sql.Date;

@Getter
@Setter
@Entity
@Table(name = "product")
public class Product {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@NotNull(message = "Product name is required.")
	@Basic(optional = false)
	private String name;
	private Double price;
	private String link;
	
	@ManyToOne
	@JoinColumn(name="category_id", referencedColumnName = "id")
	private Category category;

//	@Embedded
//	@AttributeOverrides({
//		  @AttributeOverride( name = "description", column = @Column(name = "long_description")),
//		  @AttributeOverride( name = "lastName", column = @Column(name = "contact_last_name")),
//		  @AttributeOverride( name = "phone", column = @Column(name = "contact_phone"))
//		})
//	private ProductDetail productDetails;
	private String description;
	private Date create_timestamp;
	private Date update_timestamp;
	private String comment;
}
