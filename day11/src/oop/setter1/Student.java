package oop.setter1;

public class Student {
	// 필드가 만들어져야 클래스의 나머지 형태를 구성할 수 있다.
	String name;
	int score;
	
	// 메소드 - setup, show
	void setup(String name, int score) {
		this.name = name;
		this.score = score;
	}
	
	void show() {
		System.out.println(this.name);
		System.out.println(this.score);
	}
}
