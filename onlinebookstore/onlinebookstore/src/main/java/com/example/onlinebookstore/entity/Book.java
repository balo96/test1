package com.example.onlinebookstore.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name="tbl_book")
public class Book {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name = "sku")
	private String sku;
	
	@Column(name = "name")
	private String name;
	
	@Column(name = "description")
	private String description;
	
	@Column(name = "image_url")
	private String imageUrl;
	
	@Column(name = "unit_price")
	private BigDecimal unitPrice;
	
	@Column(name = "active")
	private Boolean active;
	
	@Column(name = "units_in_stock")
	private int unitsInStock;
	
	@Column(name = "date_created")
	private Date createdOn;
	
	@Column(name = "last_updated")
	private Date updatedOn;
	
	@ManyToOne
	@JoinColumn(name = "category_id", nullable = false)
	private BookCategory category;

	public Book(long id, String sku, String name, String description, String imageUrl, BigDecimal unitPrice,
			Boolean active, int unitsInStock, Date createdOn, Date updatedOn, BookCategory category) {
		super();
		this.id = id;
		this.sku = sku;
		this.name = name;
		this.description = description;
		this.imageUrl = imageUrl;
		this.unitPrice = unitPrice;
		this.active = active;
		this.unitsInStock = unitsInStock;
		this.createdOn = createdOn;
		this.updatedOn = updatedOn;
		this.category = category;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public BigDecimal getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}

	public Boolean getActive() {
		return active;
	}

	public void setActive(Boolean active) {
		this.active = active;
	}

	public int getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(int unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public Date getCreatedOn() {
		return createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Date getUpdatedOn() {
		return updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	public BookCategory getCategory() {
		return category;
	}

	public void setCategory(BookCategory category) {
		this.category = category;
	}

	public Book() {
		super();
	}	
	
	
	
	
	
}
