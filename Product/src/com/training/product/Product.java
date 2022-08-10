package com.training.product;

public class Product implements Comparable<Product>{
	
	
	private int productId;
	
	private String productName;
	
	private double ratePerUnit;

	public Product() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Product(int productId, String productName, double ratePerUnit) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.ratePerUnit = ratePerUnit;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", ratePerUnit=" + ratePerUnit
				+ "]";
	}

	@Override
	public int compareTo(Product otherObj) {
		// TODO Auto-generated method stub
		
		if(otherObj.ratePerUnit<this.ratePerUnit)return -1;
		
		if(otherObj.ratePerUnit>this.ratePerUnit)return 1;
		
		return 0;
	}
	
	
	
	

}
