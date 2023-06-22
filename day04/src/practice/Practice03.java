package practice;

import java.util.Scanner;

public class Practice03 {
	public static void main(String[] args) {
		System.out.println("=========================");
		System.out.println("|이름\t|\t가격\t|");
		System.out.println("=========================");
		System.out.println("|떡볶이\t|\t3,000원\t|");
		System.out.println("|튀김\t|\t500원\t|");
		System.out.println("|순대\t|\t2,000원\t|");
		System.out.println("=========================");
		
		System.out.println("\n떡볶이, 튀김, 순대 개수를 입력하세요.(현재 행사중 -> 10%할인!)");
		
		Scanner sc = new Scanner(System.in);
		System.out.print("떡볶이: ");
		int count1 = sc.nextInt();
		int count1won = 3000;
		System.out.print("튀김: ");
		int count2 = sc.nextInt();
		int count2won = 500;
		System.out.print("순대: ");
		int count3 = sc.nextInt();
		int count3won = 2000;
		
		sc.close();
		
		double tot = (double)(count1 * count1won + count2 * count2won + count3 * count3won);
		
		System.out.println("=============영수증=============");
		System.out.println("할인 전 가격: " + tot + "원");
		System.out.println("할인 금액: " + tot * 0.1 + "원");
		System.out.println("할인 10%를 포함한 최종 가격: " + tot * 0.9 + "원");
	}
}
