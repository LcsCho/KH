package oop.constructor3;

public class Test01 {
	public static void main(String[] args) {
		Character c1 = new Character("헤라클레스", "전사", 50);
		Character c2 = new Character("포세이돈", "마법사", 20);
		Character c3 = new Character("아프로디테", "마법사");
		
		System.out.println("<캐릭터 정보>");
		c1.show();
		c2.show();
		c3.show();
	}
}
