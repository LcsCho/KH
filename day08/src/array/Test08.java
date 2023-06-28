package array;

import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		// 학생 5명의 시험점수를 입력받아서 저장하고 문제를 풀기
		// 1. 통과하지 못한 학생의 점수만 출력
		// 2. 우수한 성적(90점 이상)으로 통과한 학생의 점수만 출력
		// 3. 만약 75점인 학생이 전학을 왔다면 몇 등인지 구해서 출력
		Scanner sc = new Scanner(System.in);
		
		int[] scoreList = new int[5];
		for (int i = 0; i < scoreList.length; i++) {
			System.out.print("점수를 입력: ");
			scoreList[i] = sc.nextInt();
		}
		
		sc.close();
		for (int i = 0; i < scoreList.length; i++) {
			
			if (scoreList[i] >= 90) {
				System.out.print("우수성적 출력: ");
				System.out.println(scoreList[i]);
			}
		}
		
		int newStudent = 75;
		int rank = 1;
		
		for (int i = 0; i < scoreList.length; i++) {
			if (newStudent < scoreList[i]) rank++;
		}
		
		System.out.println("전학온 학생의 등수는: " + rank);
	}
}
