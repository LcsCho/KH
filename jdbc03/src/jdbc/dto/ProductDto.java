package jdbc.dto;

import java.sql.Date;

public class ProductDto {
	// 필드는 조회결과와 동일하게 구현
	private String name;
	private String type;
	public ProductDto() {
		super();
	}
	private int price;
	private Date made;
	private Date expire;
	@Override
	public String toString() {
		return "ProductDto [name=" + name + ", type=" + type + ", price=" + price + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public Date getMade() {
		return made;
	}
	public void setMade(Date made) {
		this.made = made;
	}
	public Date getExpire() {
		return expire;
	}
	public void setExpire(Date expire) {
		this.expire = expire;
	}

}
