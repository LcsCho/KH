package oop.inherit7;

// 추상 클래스(abstract class)
// = 상속 관계에서 추상적인 개념을 정의하기 위해 만들어진 클래스
// = 부모클래스
// = 일반클래스처럼 필드, 메서드, 생성자를 가질 수 있다.
// = (중요) 추상 클래스는 추상 메서드를 가질 수 있다.
public abstract class Mobile {
	// 공통필드
	protected String number;
	protected String color;
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
	
	public Mobile(String number, String color) {
		this.setNumber(number);
		this.setColor(color);
	}
	
	// 전화기라면 통화(call)라는 기능이 있어야 한다. 근데 내용은 몰라
	public abstract void call();
	
	// 전화기라면 문자(sms)라는 기능이 있어야 한다. 근데 내용은 몰라
	public abstract void sms();
}
