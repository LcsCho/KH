package api.time;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("날짜 입력: ");
		String date = sc.next();
		sc.close();
		
		// 계산
		// LocalDate a = LocalDate.parse(date);
		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("yyyy/MM/dd");
		LocalDate b = LocalDate.parse(date, fmt);
		
		long[] days = new long[] {
				100L, 200L, 300L, 365L, 400L, 
				500L, 600L, 700L, 730L, 800L, 
				900L, 1000L, 365L*3 
		};
		
		DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("y년 M월 d일 E요일");
		for (long day : days) 
			System.out.println(b.plusDays(day).format(fmt2));
	}
}
