package oop.method3;

public class Mobile {
	String name, telecom;
	int price, data, call, message;
	
	void setup(String type, String telecom, int price, int data, int call, int message) {
		this.name = type;
		this.telecom = telecom;
		this.price = price;
		this.data = data;
		this.call = call;
		this.message = message;	
	}
	
	void show() {
		System.out.print("통신사: " + this.name + ", ");
		System.out.print("상품명: " + this.telecom + ", ");
		System.out.println("월정액: " + this.price);
		System.out.print("데이터: " + this.data + ", ");
		System.out.print("통화: " + this.call + ", ");
		System.out.println("문자: " + message);
		System.out.println();
	}
}
