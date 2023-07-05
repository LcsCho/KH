package oop.inherit8;

public class Test01 {
	public static void main(String[] args) {
		Warrior w = new Warrior("전사");
		w.show();
		w.attack();
		w.move();
		w.shop();
		
		Magician m = new Magician("마법사");
		m.show();
		m.attack();
		m.move();
		m.shop();
		
		Archer a = new Archer("궁수");
		a.show();
		a.attack();
		a.move();
		a.shop();
	}
}
