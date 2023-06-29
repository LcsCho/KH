package array3;

public class Test01 {
	public static void main(String[] args) {
		// 2차원 배열(3차원 배열, 4차원 배열, 다차원 배열, ...)
		
		// 학생 100명의 시험 점수를 저장
		// -> 변수 100개 or 1차원 배열 100칸
		int[] score1 = new int[100];
		
		// 5개 반에서 10명씩의 학생을 뽑아 얻은 시험 점수를 저장
		// 변수 50개 or 1차원 배열 50칸 or 2차원 배열 1개
		int[][] score2 = new int[5][10];
		
		// 3개 학년에서 5개 반을 뽑아 각각 10명씩의 학생을 선발하고
		// 그 학생들의 시험점수를 저장
		int[][][] score3 = new int[3][5][10];
		
		
		// 2개 학교 3개 학년에서 5개반 각각 10명의 시험점수를 뽑아 저장
		int[][][][] score4 = new int[2][3][5][10];
	}
}
