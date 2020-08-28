package com.dto;

//  Dept테이블의 하나의 레코드 저장용도
public class Product {

	private String pdsubname;
	private int pdcost;
	private int pdprice;
	
	public Product(String pdsubname, int pdcost, int pdprice) {
		super();
		this.pdsubname = pdsubname;
		this.pdcost = pdcost;
		this.pdprice = pdprice;
	}

	/**
	 * @return the pdsubname
	 */
	public String getPdsubname() {
		return pdsubname;
	}

	/**
	 * @param pdsubname the pdsubname to set
	 */
	public void setPdsubname(String pdsubname) {
		this.pdsubname = pdsubname;
	}

	/**
	 * @return the pdcost
	 */
	public int getPdcost() {
		return pdcost;
	}

	/**
	 * @param pdcost the pdcost to set
	 */
	public void setPdcost(int pdcost) {
		this.pdcost = pdcost;
	}

	/**
	 * @return the pdprice
	 */
	public int getPdprice() {
		return pdprice;
	}

	/**
	 * @param pdprice the pdprice to set
	 */
	public void setPdprice(int pdprice) {
		this.pdprice = pdprice;
	}

	@Override
	public String toString() {
		return "Product [pdsubname=" + pdsubname + ", pdcost=" + pdcost + ", pdprice=" + pdprice + "]";
	}
	
	
	
	
	
}
