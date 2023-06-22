package input;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		// 문자열 입력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름: ");
		String name = sc.next();
		sc.close();
		
		System.out.println("입력한 이름 = " + name);		
	}

}
