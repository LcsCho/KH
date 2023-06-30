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
		System.out.print("이름: " + this.name + ", ");
		System.out.print("분류: " + this.type + ", ");
		if (this.onSale == true) {
			System.out.print("정상 가격: " + this.price + "원, 할인 가격(20%할인) " + (int)(this.price * 0.8) + "원, ");
			System.out.println("행사여부: 행사중");
		}
		else System.out.println("가격: " + this.price + "원");
	}
}
