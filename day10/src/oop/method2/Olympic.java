package oop.method2;

public class Olympic {
	String name, event, season;
	int gold, silver, bronze;
	
	void setup(String name, String event, String season, int gold, int silver, int bronze) {
		this.name = name;
		this.event = event;
		this.season = season;
		this.gold = gold;
		this.silver = silver;
		this.bronze = bronze;
	}
	
	void show() {
		System.out.print("이름: " + this.name + ", ");
		System.out.print("종목: " + this.event + ", ");
		System.out.println("구분: " + this.season);
		System.out.print("금메달: " + this.gold + ", ");
		System.out.print("은메달: " + this.silver + ", ");
		System.out.println("동메달: " + this.bronze + "\n");
		
	}
}
