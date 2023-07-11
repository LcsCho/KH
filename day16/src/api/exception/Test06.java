package api.exception;

import java.time.LocalDate;
import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		try {
			Scanner sc = new Scanner(System.in);

			System.out.print("생년월일 입력(YYYY-MM-DD): ");
			String birth = sc.next();
			sc.close();
			LocalDate now = LocalDate.now();

			int year = Integer.parseInt(birth.substring(0, 4));
			if (year < 1900) {
				throw new Exception("연도를 1900보다 크게 입력하세요.\n");
			}

			int month = Integer.parseInt(birth.substring(5, 7));
			if (month < 1 || month > 12) {
				throw new Exception("월을 01~12로 입력하세요.\n");
			}
			int day = Integer.parseInt(birth.substring(8, 10));
			boolean isFuture = now.getYear() <= year && now.getMonthValue() <= month && now.getDayOfMonth() < day;
			if (isFuture) {
				throw new Exception("현재 이전의 날짜만 입력하세요.\n");
			}
			boolean isAgeMinus = now.getMonthValue() <= month && now.getDayOfMonth() < day;

			int age = now.getYear() - year; {
				if (isAgeMinus)
					age--;
			}
			System.out.println("만나이: " + age);

		} catch (Exception e) {
			System.out.println("형식에 맞게 '-'을 포함하여 10자리만 입력하시거나, 범위에 맞게 자연수만 입력하세요");
		}
	}
}
