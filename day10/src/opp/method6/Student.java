package opp.method6;

public class Student {
	int grade, classroom;
	int kor, eng, math;
	String name;
	
	void setup(int grade, int classroom, String name, int kor, int eng, int math) {
		this.grade = grade;
		this.classroom = classroom;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	// (문제점)show에서 너무 많은 일을 하고 있다.
	// (해결책) 계산을 메소드가 할 수 있도록 추가 메소드 생성
	
	// 1. 총점 구하는 메서드 생성
	// (참고) return 키워드는 "반환"과 "종료"의 의미를 가지는 키워드
	// (참고) void 키워드는 "결과물이 없음"이란 의미를 가지는 키워드
	int getTot() {
		return this.kor + this.eng + this.math;
	} 
	
	// 2. 평균을 구해주는 메서드
	double getAvg() {
		return (double)this.getTot() / 3;
	}
	
	// 3. 합격/불합격을 판정하는 메서드
	boolean getPass() {
		return this.kor >= 40 && this.eng >= 40 && this.math >= 40 && this.getAvg() >= 60;
	}
	
	void show() {
		System.out.println(this.grade + "-" + this.classroom + ", " + this.name);
		System.out.println("국어: " + this.kor + ", 영어: " + this.eng + ", 수학: " + this.math);
		System.out.println("총점: " + this.getTot() + ", 평균: " + this.getAvg());
		if (this.getPass()) System.out.println("최종 결과: 통과\n");
		else System.out.println("최종결과: 불합격\n");
	}
}
