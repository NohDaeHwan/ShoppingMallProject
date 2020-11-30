/*
 *  상품 클래스를 정의하고 삼품ID, 상품명, 상품 가격, 상품 정보, 상품 가테고리, 제조사, 재고수, 제품 상태를 
 *  나타내는 속성과 이들 속성을 set, get하는 메소드를 포함하고 있다
 *  또한 ProductRepository JavaBeans 클래스에게 상품의 속성 값을 추가하기 위한 메소드를 제공한다 
*/  

package dto;

import java.io.Serializable;

public class Product implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private String productId;    //상품 아이디
	private String pname;        //상품명
	private Integer unitPrice;   //상품 가격
	private String description;  //상품 설명
	private String manufacturer; //제조사
	private String category;     //분류
	private long unitsInStock;   //재고수
	private String condition;    //신상품 or 중고품 or 재생품
	private String filename;     //이미지 파일명
	
	public Product() {
		super();
	}
	
	public Product(String productId, String pname, Integer unitPrice) {
		this.productId = productId;
		this.pname = pname;
		this.unitPrice = unitPrice;
	}
	
	public String getFilename() {
		return filename;
	}

	public void setFilename(String filename) {
		this.filename = filename;
	}	
	
	public String getProductId() {
		return productId;
	}

	public void setProductId(String productId) {
		this.productId = productId;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public Integer getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(Integer unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public long getUnitsInStock() {
		return unitsInStock;
	}

	public void setUnitsInStock(long unitsInStock) {
		this.unitsInStock = unitsInStock;
	}

	public String getCondition() {
		return condition;
	}

	public void setCondition(String condition) {
		this.condition = condition;
	}
	
}