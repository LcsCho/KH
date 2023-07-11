package api.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);

		// 입력
		System.out.print("연도를 입력: ");
		int year = sc.nextInt();
		System.out.print("월을 입력: ");
		int month = sc.nextInt();
		sc.close();

		// 계산
		// = 달력은 일요일부터 출력
		// = 1일이 무슨요일이냐에 따라서 전달의 출력 일수가 달라진다
		// = 1일이 일요일(week 1)이면 전달 출력 일수는 0일
		// = 1일이 월요일(week 2)이면 전달 출력 일수는 1일
		// = 1일이 화요일(week 3)이면 전달 출력 일수는 2일
		// = 1일이 수요일(week 4)이면 전달 출력 일수는 3일
		// = 1일이 목요일(week 5)이면 전달 출력 일수는 4일
		// = 1일이 금요일(week 6)이면 전달 출력 일수는 5일
		// = 1일이 토요일(week 7)이면 전달 출력 일수는 6일
		c.set(year, month - 1, 1);
		int week = c.get(Calendar.DAY_OF_WEEK);
		c.add(Calendar.DATE, -(week - 1));

		// 출력 - 42번
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		for (int i = 0; i < 6; i++) {
			for (int j = 0; j < 7; j++) {
				Date d = c.getTime();
				SimpleDateFormat fmt = new SimpleDateFormat("d");
				System.out.print(fmt.format(d));
				System.out.print("\t");

				c.add(Calendar.DATE, 1);
			}
			System.out.println();
		}
	}
}
