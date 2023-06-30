package oop.method4;

public class Cafe {
	String name, type;
	int price;
	boolean onSale;
	
	// setup을 두 종류로 구현(메소드 오버로딩, method overloading)
	// 1. 3개의 데이터가 들어오면 이벤트는 안하는 걸로 생각하여 처리
	// 2. 4개의 데이터가 들어오면 이벤트 정보도 설정하는 걸로 처리
	
	void setup(String name, String type, int price, boolean onSale) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.onSale = onSale;
	}
	
	void setup(String name, String type, int price) {
		this.name = name;
		this.type = type;
		this.price = price;
		this.onSale = false;
	}
	
	void show() {
		if (this.onSale) {
			System.out.print("이름: " + this.name + "(할인중), ");
			System.out.print("분류: " + this.type + ", ");
			System.out.println("할인 가격: " + (int)(this.price * 0.8) + "원(원가: " + this.price + "원)");
		} else {
			System.out.print("이름: " + this.name + ", ");
			System.out.print("분류: " + this.type + ", ");
			System.out.println("가격: " + this.price + "원");
		}
	}
}
