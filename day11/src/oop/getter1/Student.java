package oop.getter1;

public class Student {
	String name;
	int kor, eng;
	// setter 메서드 - 값을 설정하는 메서드(+조건)
	void setName(String name) {
		this.name = name;
	}
	void setKor(int kor) {
		this.kor = kor;
	}
	void setEng(int eng) {
		this.eng = eng;
	}
	// getter 메서드 - 설정된 값을 반환하는 메서드
	// - 설정된 값을 반환하는 메서드
	// - 이름은 get + 필드명, 반환형은 필드의 자료형과 같다.
	// - 가상의 항목(존재하지 않는 필드)에 대해서 getter 메서드를 만들면 계산을 간소화할 수 있다.
	String getName() {
		return this.name;
	}
	int getKor() {
		return this.kor;
	}
	int getEng() {
		return this.eng;
	}
	int getTot() {
		return this.kor + this.eng;
	}
	float getAvg() {
		return this.getTot() / 2f;
	}
	
	void setup(String name, int kor, int eng) {
		this.setName(name);
		this.setKor(kor);
		this.setEng(eng);
	}
	void show() {
		System.out.println("<성적 정보>");
		System.out.println("이름: " + this.name);
		System.out.println("국어: " + this.kor);
		System.out.println("영어: " + this.eng);
		System.out.println("총점: " + this.getAvg());
		System.out.println("평균: " + this.getTot());
	}
}
