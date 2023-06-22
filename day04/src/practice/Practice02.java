package practice;

import java.util.Scanner;

public class Practice02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("입실시각 입력: ");
		int enter = sc.nextInt();

		System.out.print("퇴실시각 입력: ");
		int exit = sc.nextInt();

		sc.close();

		int gapHour = (exit - enter) / 100;
		int gapMin = (exit - enter) % 100;

		System.out.println("\n점심시간을 포함한 수업에 참여한 시간은 " + gapHour + "시간 " + gapMin + "분 입니다.");
		System.out.println("점심시간을 제외한 수업에 참여한 시간은 " + (gapHour - 1) + "시간 " + gapMin + "분 입니다.");
	}
}
