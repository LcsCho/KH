package oop.setter2;

public class Study {
	private String name, type;
	private int time, price;
	
	public void setup(String name, int time, int price, String type) {
		this.setName(name);
		this.setTime(time);
		this.setPrice(price);
		this.setType(type);
	}
	
	private void setName(String name) { this.name = name; }
	private void setTime(int time) { if (time % 30 == 0 && time > 0) this.time = time; }
	private void setPrice(int price) { 
		if (price < 0) // if (price >= 0) this.price = price; 
			return; 
		this.price = price;
	}
		
	private void setType(String type) {
		switch (type) {
		case "온라인":
		case "오프라인":
		case "혼합":
			this.type = type;
		}
	}
	
	public void show() {
		System.out.print("강좌명: " + this.name + ", 강의시간: " + this.time);
		System.out.println(", 수강료: " + this.price + ", 구분: " + this.type);
	}
}
