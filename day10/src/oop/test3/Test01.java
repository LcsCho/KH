package oop.test3;

public class Test01 {
	public static void main(String[] args) {
		// 생성
		WorldcupScore s1 = new WorldcupScore();
		WorldcupScore s2 = new WorldcupScore();
		WorldcupScore s3 = new WorldcupScore();
		WorldcupScore s4 = new WorldcupScore();
		
		// 초기화
		s1.rank = 1;
		s1.name = "킬리안 음바페";
		s1.nation = "프랑스";
		s1.goal = 8;
		
		s2.rank = 2;
		s2.name = "리오넬 메시";
		s2.nation = "아르헨티나";
		s2.goal = 7;
		
		s3.rank = 3;
		s3.name = "올리비에 지루";
		s3.nation = "프랑스";
		s3.goal = 4;
		
		s4.rank = 4;
		s4.name = "줄리안 알바레스";
		s4.nation = "아르헨티나";
		s4.goal = 4;
		
		// 출력
		System.out.println("순위\t이름\t국가\t골\n--------------------------");
		System.out.println(s1.rank + ", " + s1.name + ", " + s1.nation + ", " + s1.goal);
		System.out.println(s2.rank + ", " + s2.name + ", " + s2.nation + ", " + s2.goal);
		System.out.println(s3.rank + ", " + s3.name + ", " + s3.nation + ", " + s3.goal);
		System.out.println(s3.rank + ", " + s4.name + ", " + s4.nation + ", " + s4.goal);
	}
}
