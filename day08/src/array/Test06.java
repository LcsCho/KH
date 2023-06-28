package array;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] nationName = new String[5];
		System.out.println("<나라를 입력>");
		for (int i = 0; i < nationName.length; i++)
			nationName[i] = sc.next();
		
		sc.close();
		System.out.println();
		
		System.out.println("<나라를 출력>");
		for (int i = 0; i < nationName.length; i++)
			System.out.println(nationName[i]);
	}
}
