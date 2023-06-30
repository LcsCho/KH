package oop.method5;

public class Food {
	String name, type;
	int price;
	boolean dawnDelivery, onSale;
	
	void setup(String name, String type, int price, boolean dawnDelivery, boolean onSale) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.dawnDelivery = dawnDelivery;
		this.onSale = onSale;
	}
	
	
	void setup(String name, String type, int price, boolean onSale) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.onSale = onSale;
		this.dawnDelivery = false;
	}
	
	
	void show() {
		if (this.dawnDelivery && this.onSale) {
			System.out.print("상품명: " + this.name + "(행사중)");
			System.out.print(", 상품분류: " + this.type);
			System.out.print("판매가: " + (this.price * 0.9) + 2500 + "원(2500원의 배송비가 추가됨)");	
		}
		
		else if (this.dawnDelivery) {
			System.out.print("상품명: " + this.name);
			System.out.print(", 상품분류: " + this.type);
			System.out.print("판매가: " + (this.price + 2500) + "원(2500원의 배송비가 추가됨)");
			
		}
		
		else if (this.onSale) {
			System.out.print("상품명: " + this.name + "(행사중)");
			System.out.print(", 상품분류: " + this.type);
			System.out.print("판매가: " + (this.price * 0.9) + "원");
		}
		else {
			System.out.print("상품명: " + this.name );
			System.out.print(", 상품분류: " + this.type);
			System.out.print("판매가: " + this.price + "원");
		}
	}
}
