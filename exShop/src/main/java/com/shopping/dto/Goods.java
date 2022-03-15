package com.shopping.dto;

public class Goods {
	
//	CREATE TABLE goods (
//		gdsId		INT(10) UNSIGNED 	NOT NULL	AUTO_INCREMENT,
//		gdsName		VARCHAR(30) 		NOT NULL,
//		brand		VARCHAR(30) 		NOT NULL,
//		largeCtgr	VARCHAR(2)			NOT NULL,
//		smallCtgr	VARCHAR(2)			NOT NULL,
//		price		INT(10) UNSIGNED	NOT NULL,
//		stock		INT(10) UNSIGNED	NOT NULL,
//		img			VARCHAR(100) 		NULL 		DEFAULT NULL,
//		detail		VARCHAR(100) 		NULL 		DEFAULT NULL,
//		gdsRegDate	TIMESTAMP			NOT NULL 	DEFAULT current_timestamp(),
//		post		CHAR(1) 			NULL 		DEFAULT 'Y',
//		PRIMARY KEY (gdsId)
//	)
	
	int gdsId;
	String gdsName;
	String brand;
	String largeCtgr;
	String smallCtgr;
	int price;
	int stock;
	String img;		//대표 이미지.썸네일.
	String detail;	//상세 이미지
	String gdsRegDate;	//상품상세(게시물)을 수정할 때 등록일을 수정일로 업데이트. 그냥 수정일 컬럼을 추가해야 할까?
	char post;	//등록된 게시물 공개 여부
	
	
	public int getGdsId() {
		return gdsId;
	}
	public String getGdsName() {
		return gdsName;
	}
	public String getBrand() {
		return brand;
	}
	public String getLargeCtgr() {
		return largeCtgr;
	}
	public String getSmallCtgr() {
		return smallCtgr;
	}
	public int getPrice() {
		return price;
	}
	public int getStock() {
		return stock;
	}
	public String getImg() {
		return img;
	}
	public String getDetail() {
		return detail;
	}
	public String getGdsRegDate() {
		return gdsRegDate;
	}
	public char getPost() {
		return post;
	}
	
	
	/*
	 * public void setGdsId(int gdsId) { this.gdsId = gdsId; }
	 */
	public void setGdsName(String gdsName) {
		this.gdsName = gdsName;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public void setLargeCtgr(String largeCtgr) {
		this.largeCtgr = largeCtgr;
	}
	public void setSmallCtgr(String smallCtgr) {
		this.smallCtgr = smallCtgr;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public void setImg(String img) {
		this.img = img;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	public void setGdsRegDate(String gdsRegDate) {
		this.gdsRegDate = gdsRegDate;
	}
	public void setPost(char post) {
		this.post = post;
	}

}
