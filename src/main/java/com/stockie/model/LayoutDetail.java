package com.stockie.model;

// default package
// Generated Jun 25, 2017 1:53:14 PM by Hibernate Tools 5.2.3.Final

import java.util.Date;

/**
 * LayoutDetails generated by hbm2java
 */
public class LayoutDetail implements java.io.Serializable {

	private int layoutDetailId;
	private Layout layout;
	private Product product;
	private Integer pageNo;
	private Integer tabNo;
	private String colorCode;
	private Date createdTs;
	private Date modifiedTs;

	public LayoutDetail() {
	}

	public LayoutDetail(int layoutDetailId) {
		this.layoutDetailId = layoutDetailId;
	}

	public LayoutDetail(int layoutDetailId, Layout layout, Product product, Integer pageNo, Integer tabNo,
			String colorCode, Date createdTs, Date modifiedTs) {
		this.layoutDetailId = layoutDetailId;
		this.layout = layout;
		this.product = product;
		this.pageNo = pageNo;
		this.tabNo = tabNo;
		this.colorCode = colorCode;
		this.createdTs = createdTs;
		this.modifiedTs = modifiedTs;
	}

	public int getLayoutDetailId() {
		return this.layoutDetailId;
	}

	public void setLayoutDetailId(int layoutDetailId) {
		this.layoutDetailId = layoutDetailId;
	}

	public Layout getLayout() {
		return this.layout;
	}

	public void setLayout(Layout layout) {
		this.layout = layout;
	}

	public Product getProduct() {
		return this.product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public Integer getPageNo() {
		return this.pageNo;
	}

	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}

	public Integer getTabNo() {
		return this.tabNo;
	}

	public void setTabNo(Integer tabNo) {
		this.tabNo = tabNo;
	}

	public String getColorCode() {
		return this.colorCode;
	}

	public void setColorCode(String colorCode) {
		this.colorCode = colorCode;
	}

	public Date getCreatedTs() {
		return this.createdTs;
	}

	public void setCreatedTs(Date createdTs) {
		this.createdTs = createdTs;
	}

	public Date getModifiedTs() {
		return this.modifiedTs;
	}

	public void setModifiedTs(Date modifiedTs) {
		this.modifiedTs = modifiedTs;
	}

}