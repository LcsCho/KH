package loop2;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		sc.close();
		
		int count = 0;
		for (int i = 2; i < num; i++) {
			if (num % i == 0) count++;
		}
		
		if (count == 1) System.out.println(num + "은 소수입니다.");
		else System.out.println(num + "은 소수가 아닙니다.");
	}
}
