package input;

import java.util.Scanner;

public class Test04_1 {
	public static void main(String[] args) {
		
		//입력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("입실시각(hhmm) : ");
		int enter = sc.nextInt();
		System.out.print("퇴실시각(hhmm) : ");
		int leave = sc.nextInt();
		
		sc.close();
		
		
		//계산
		int enterHour = enter / 100;
		int enterMin = enter % 100;
		//System.out.println("enterHour = " + enterHour);
		//System.out.println("enterMin = " + enterMin);
		
		int leaveHour = leave / 100;
		int leaveMin = leave % 100;
		
		int enterTime = enterHour * 60 + enterMin;
		int leaveTime = leaveHour * 60 + leaveMin;
		
		int time = leaveTime - enterTime;
		//System.out.println("time = " + time);
		
		int hour = time / 60;
		int minute = time % 60;
		
		//출력
		//System.out.println("참여 시간은 " + hour + " 시간 " + minute + "분 입니다");
		System.out.print("참여 시간은 ");
		System.out.print(hour);
		System.out.print(" 시간 ");
		System.out.print(minute);
		System.out.print(" 분 입니다");
		System.out.println();
	}
}




