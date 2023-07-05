package oop.inherit6_1;

// 최상위 클래스 - 휴대폰
public class Mobile {
	// 공통 필드
	protected String number;
	protected String color;
	
	// setter&getter
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	// 생성자
	public Mobile(String number, String color) {
		this.setNumber(number);
		this.setNumber(number);
	}
	
	// 출력 메서드 - 재정의 금지 처리
	public final void show() {
		System.out.println("<휴대폰 정보>");
		System.out.println("번호: " + this.number);
		System.out.println("색상: " + this.color);
	}
}
