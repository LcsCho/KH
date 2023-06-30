package oop.method4;

public class Cafe {
	String name, type;
	int price;
	boolean onSale;
	
	void setup(String name, String type, int price, boolean onSale) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.onSale = onSale;
	}
	
	void show() {
		if (this.onSale) {
			System.out.print("이름: " + this.name + "(할인중), ");
			System.out.print("분류: " + this.type + ", ");
			System.out.println("할인 가격: " + (int)(this.price * 0.8) + "원(원가: " + this.price + "원)");
		}
		else {
			System.out.print("이름: " + this.name + ", ");
			System.out.print("분류: " + this.type + ", ");
			System.out.println("가격: " + this.price + "원");
		}
	}
}
