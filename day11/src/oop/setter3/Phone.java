package oop.setter3;

public class Phone {
	private String name, telecom;
	private int price, month;
	
	public void setup(String name, String telecom, int price, int month) {
		this.name(name);
		this.telecom(telecom);
		this.price(price);
		this.month(month);
	}
	
	private void name(String name) { this.name = name; }
	private void telecom(String telecom) { 
		switch(telecom) {
		case "SK", "KT", "LG": this.telecom = telecom;
		}
	}
	private void price(int price) { if (price >= 0)	this.price = price; }
	private void month(int montt) {
		if (month == 0 || month == 24 || month == 36) this.month = month;
	}
	
	public void show() {
		System.out.print("휴대폰명: " + this.name + ", 통신사: " + this.telecom);
		if (month == 0) System.out.print(",가격(약정 없음): " + this.price);
		else System.out.print(",가격: " + this.price);
		System.out.print(", 약정개월: " + this.month);
		if (month == 0) System.out.println(", 일시불(5%가격 할인): " + price * 0.95);
		else System.out.println(", 월 할부금: " + this.price / this.month);
	}
}
