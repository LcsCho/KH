package oop.inherit1;

public class IPhone13 {
	// 필드
	private String number, color; // 전화번호, 색상
	private int price; // 가격
	
	// 메서드 - 기능
	// setter/getter 생략
	public void call() {
		System.out.println("전화걸기");
	}
	
	public void camera() {
		System.out.println("사진찍기");
	}
	
	public void siri() {
		System.out.println("시리야");
	}
}
