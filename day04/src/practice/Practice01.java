package practice;

import java.util.Scanner;

public class Practice01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어, 영어, 수학의 점수를 입력하시오.");
		int kor = sc.nextInt(); 
		int eng = sc.nextInt();
		int mat = sc.nextInt();
		
		sc.close();
		
		int tot = kor + eng + mat;
		double avg = (double)tot / 3;
		
		System.out.println("총점: " + tot);
		System.out.println("평균: " + avg);
	}
}
