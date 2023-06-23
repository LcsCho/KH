package input;

import java.util.Scanner;

public class Test03_3 {
	public static void main(String[] args) {
		
		//입력
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수 입력하세요");
		int kor = sc.nextInt();
		System.out.println("영어점수 입력하세요");
		int eng = sc.nextInt();
		System.out.println("수학점수 입력하세요");
		int mat = sc.nextInt();
		
		sc.close();
		
		//계산
		int tot = kor + eng + mat;
		//float avg = tot / 3f;
		float avg = (float)tot / 3;
		
		//출력
		System.out.println("총점 = " + tot);
		System.out.println("평균 = " + avg);
		
	}
}



