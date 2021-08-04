package com.shop.zephyr.dto;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

public class ProductDto {
	
	@NotNull
	@NotEmpty
	private String productName;
	
	@NotNull
	@NotEmpty
	private String productPrice;
	
	@NotNull
	@NotEmpty
	private String productImage;
	
	@NotNull
	@NotEmpty
	private String productSize;
	
	@NotNull
	@NotEmpty
	private String productDescription;
	
	@NotNull
	@NotEmpty
	private String productBrand;
	
	@NotNull
	@NotEmpty
	private String productGenderTarget;
	
	@NotNull
	@NotEmpty
	private int productStock;
	
	public ProductDto() {
		
	}
	
	public ProductDto(@NotNull @NotEmpty String productName, @NotNull @NotEmpty String productPrice,
			@NotNull @NotEmpty String productImage, @NotNull @NotEmpty String productSize,
			@NotNull @NotEmpty String productDescription, @NotNull @NotEmpty String productBrand,
			@NotNull @NotEmpty String productGenderTarget, @NotNull @NotEmpty int productStock) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.productImage = productImage;
		this.productSize = productSize;
		this.productDescription = productDescription;
		this.productBrand = productBrand;
		this.productGenderTarget = productGenderTarget;
		this.productStock = productStock;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductImage() {
		return productImage;
	}

	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}

	public String getProductSize() {
		return productSize;
	}

	public void setProductSize(String productSize) {
		this.productSize = productSize;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public String getProductBrand() {
		return productBrand;
	}

	public void setProductBrand(String productBrand) {
		this.productBrand = productBrand;
	}

	public String getProductGenderTarget() {
		return productGenderTarget;
	}

	public void setProductGenderTarget(String productGenderTarget) {
		this.productGenderTarget = productGenderTarget;
	}

	public int getProductStock() {
		return productStock;
	}

	public void setProductStock(int productStock) {
		this.productStock = productStock;
	}

}
