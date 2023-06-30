package oop.test2;

public class Test01 {
	public static void main(String[] args) {
		// 생성
		Pokemon p1 = new Pokemon();
		Pokemon p2 = new Pokemon();
		Pokemon p3 = new Pokemon();
		Pokemon p4 = new Pokemon();
		
		// 초기화
		p1.number = 1;
		p1.name = "이상해씨";
		p1.type = "풀";
		
		p2.number = 4;
		p2.name = "파이리";
		p2.type = "불꽃";
		
		p3.number = 7;
		p3.name = "꼬부기";
		p3.type = "물";
		
		p4.number = 25;
		p4.name = "피카츄";
		p4.type = "전기";
		
		// 출력
		System.out.println("번호, 이름, 속성\n-------------");
		System.out.println(p1.number + ", " + p1.name + ", " + p1.type);
		System.out.println(p2.number + ", " + p2.name + ", " + p2.type);
		System.out.println(p3.number + ", " + p3.name + ", " + p3.type);
		System.out.println(p4.number + ", " + p4.name + ", " + p4.type);
	}
}
