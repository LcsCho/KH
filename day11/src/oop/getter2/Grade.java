package oop.getter2;

public class Grade {
	private String name;
	private int year, kor, eng, math;
	
	public void setup(String name, int year, int kor, int eng, int math) {
		this.setName(name);
		this.setYear(year);
		this.setKor(kor);
		this.setEng(eng);
		this.setMath(math);
	}
	
	private void setName(String name) { this.name = name; }
	private void setYear(int year) {
		if (year < 0) return;
		this.year = year;
	}
	private void setKor(int kor) { 
		if (kor < 0 || kor > 100)  return;
		this.kor = kor; 
	}
	private void setEng(int eng) { 
		if (eng < 0 || eng > 100)  return;
		this.eng = eng;
	}
	private void setMath(int math) { 
		if (math < 0 || math > 100)  return;
		this.math = math; 
	}
	public void show() {
		System.out.print("이름: " + this.name);
		System.out.print(", 학년: " + this.year);
		System.out.print(", 국어점수: " + this.kor);
		System.out.print(", 영어점수: " + this.eng);
		System.out.println(", 수학점수: " + this.math);
		System.out.print("총점: " + this.getTot());
		System.out.print(", 평균: " + this.getAvg());
		System.out.println(", 등급: " + this.getGrade() + "\n");
	}
	private int getTot() { return this.kor + this.eng + this.math; }
	private float getAvg() { return this.getTot() / 3f; }
	private char getGrade() {
		if (this.getAvg() >= 90 && this.getAvg() <= 100) return 'A';
		else if (this.getAvg() >= 80 && this.getAvg() <= 89) return 'B';
		else if (this.getAvg() >= 70 && this.getAvg() <= 79) return 'C';
		else return 'F';
	}
}
