package oop.setter2;

public class Test01 {
	public static void main(String[] args) {
		Study s1 = new Study();
		Study s2 = new Study();
		Study s3 = new Study();	
		
		s1.setup("자바 마스터 과정", 90, 1000000, "온라인");
		s2.setup("파이썬 기초", 60, 600000, "온라인");
		s3.setup("웹 개발자 단기완성", 120, 1200000, "오프라인");
		
		System.out.println("<학원 강의 요금표>");
		
		s1.show();
		s2.show();
		s3.show();
	}
}
