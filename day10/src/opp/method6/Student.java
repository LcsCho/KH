package opp.method6;

public class Student {
	int grade, classroom;
	float kor, eng, math;
	String name;
	
	void setup(int grade, int classroom, String name, float kor, float eng, float math) {
		this.grade = grade;
		this.classroom = classroom;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	void show() {
		System.out.println(this.grade + "-" + this.classroom + ", " + this.name);
		System.out.println("국어: " + this.kor + ", 영어: " + this.eng + ", 수학: " + this.math);
		System.out.println("총점: " + (kor + eng + math) + ", 평균: " + (kor + eng + math) / 3);
		if ((this.kor < 40 || this.eng < 40 || this.math < 40) || (kor + eng + math) / 3 < 60) System.out.println("최종 결과: 재평가\n");
		else System.out.println("최종결과: 통과\n");
	}
}
