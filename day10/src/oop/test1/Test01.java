package oop.test1;

public class Test01 {
	public static void main(String[] args) {
		// 시험 성적 정보 1개를 저장
		// 이름: 피카츄, 국어: 90, 영어: 80, 수학: 70
		Grade g = new Grade();
		
		// g -> Grade 객체(이름, 국어, 영어, 수학)
		
		g.name = "피카츄";
		g.korean = 90;
		g.english = 80;
		g.math = 70;
		
		System.out.println(g.name);
		System.out.println(g.korean);
		System.out.println(g.english);
		System.out.println(g.math);
	}
}
