package input;

import java.util.Scanner;

public class Test03_1 {
	public static void main(String[] args) {
		
		//입력
		Scanner sc = new Scanner(System.in);
		
		int kor = sc.nextInt();
		int eng = sc.nextInt();
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



