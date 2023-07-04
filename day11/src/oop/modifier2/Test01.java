package oop.modifier2;

public class Test01 {
	public static void main(String[] args) {
		Bankbook b1 = new Bankbook("유재석", 3, 3, 1000000, 15000000);
		Bankbook b2 = new Bankbook("강호동", 2, 5, 500000, 2500000);
		Bankbook b3 = new Bankbook("신동엽", 2, 8, 800000, 10000000);
		
		System.out.println("<KH 내집마련 적금통장 가입자 정보>");
		b1.show();
		b2.show();
		b3.show();
	}
}
