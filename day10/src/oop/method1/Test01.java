package oop.method1;

public class Test01 {
	public static void main(String[] args) {
		// 생성
		Player p1 = new Player();
		Player p2 = new Player();
		Player p3 = new Player();
		Player p4 = new Player();
		
		// 초기화
		p1.rank = 1;
		p1.name = "킬리안 음바페";
		p1.nation = "프랑스";
		p1.goal = 8;
		
		p2.rank = 2;
		p2.name = "리오넬 메시";
		p2.nation = "아르헨티나";
		p2.goal = 7;
		
		p3.rank = 3;
		p3.name = "올리비에 지루";
		p3.nation = "프랑스";
		p3.goal = 4;
		
		p4.rank = 4;
		p4.name = "줄리안 알바레스";
		p4.nation = "아르헨티나";
		p4.goal = 4;
		
		// 출력
		System.out.println("순위\t이름\t국가\t골\n--------------------------");
		System.out.println(p1.rank + ", " + p1.name + ", " + p1.nation + ", " + p1.goal);
		System.out.println(p2.rank + ", " + p2.name + ", " + p2.nation + ", " + p2.goal);
		System.out.println(p3.rank + ", " + p3.name + ", " + p3.nation + ", " + p3.goal);
		System.out.println(p3.rank + ", " + p4.name + ", " + p4.nation + ", " + p4.goal);
	}
}
