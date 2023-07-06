package loop;

import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) throws InterruptedException {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("분을 입력: ");
		int min = sc.nextInt();
		System.out.print("초를 입력: ");
		int sec = sc.nextInt();
		int totSec = 60 * min + sec;
		sc.close();
		
		for (int i = totSec; i > 0; i--) {
			System.out.println(totSec / 60 + "분" + totSec % 60 + "초 후 알람이 울립니다!");
			totSec--;
			
			
			// 1초 대기
			if (i > 0)
				Thread.sleep(1000);
			
			
		}
	}
}
