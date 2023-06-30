package oop.method5;

public class Food {
	String name, type;
	int price;
	boolean dawnDelivery, onSale;
	
	void setup(String name, String type, int price) {
		this.setup(name, type, price, false, false);
	}
	
	void setup(String name, String type, int price, boolean dawnDelivery, boolean onSale) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.dawnDelivery = dawnDelivery;
		this.onSale = onSale;
	}
	
	
	void show() {
		System.out.println("이름: " + this.name);
		System.out.println("분류: " + this.type);
		if (this.onSale) {
			System.out.print("가격 행사중: " + this.price * 0.9 + "원");
			System.out.print("(원래가격: " + this.price + "원)");
			System.out.println();
		}
		else System.out.println("가격: " + this.price + "원");
	
		
		if(this.dawnDelivery) System.out.println("* 새벽배송 가능(+2500원)");
		else System.out.println("* 새벽배송 불가");
	}
}
