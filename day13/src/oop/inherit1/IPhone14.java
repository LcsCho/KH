package oop.inherit1;

public class IPhone14 {
	// 필드
	private String number, color; // 전화번호, 색상
	private int prive; // 가격
	
	// 메서드 - 기능
	// setter/getter 생략
	public void call() {
		System.out.println("전화걸기");
	}
	
	public void camera() {
		System.out.println("사진찍기");
	}
	
	public void facetime() {
		System.out.println("영상통화");
	}
}
