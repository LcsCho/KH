package oop.inherit6;

public class Phone {
	protected String number, color;

	public String getNumber() { return number; }
	public void setNumber(String number) { this.number = number; }
	public String getColor() { return color; }
	public void setColor(String color) { this.color = color; }
	public void call() { System.out.println("전화 기능 실행"); }
	public void sms() { System.out.println("문자 기능 실행"); }
	public void show() {
		System.out.println("전화번호: " + getNumber());
		System.out.println("색상: " + getColor());
	}

}
