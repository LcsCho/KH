package oop.keyword2;

public class Calculator {
	// 필드
	private int left, right;
	
	// setter+getter 생략
	public int getTot() {
		return this.left + this.right;
	}
	
	// 생성자
	public Calculator(int left, int right) {
		this.left = left;
		this.right = right;
	}
}	
