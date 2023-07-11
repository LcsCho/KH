package api.time;

import java.time.Duration;
import java.time.LocalTime;
import java.util.Scanner;

public class Test10 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("시작시각 입력: ");
		String start = sc.next();
		System.out.print("종료시각 입력: ");
		String finish = sc.next();
		sc.close();
		
		LocalTime startTime = LocalTime.parse(start);
		LocalTime finishTime = LocalTime.parse(finish);
		
		Duration d = Duration.between(startTime, finishTime);
		
		System.out.println("총 이용시간: " + d.toHours() + "시간 " + d.toMinutes() % 60 + "분");
		System.out.println("총 이용요금: " + d.toHours() * 1000L + "원");
	}
}
