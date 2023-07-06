package oop.poly1_2;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("노트북을 선택");
		System.out.print("1. 맥북, 2. 갤럭시북: ");
		int choice = sc.nextInt();
		
		System.out.println("테스트할 기능을 선택하세요");
		System.out.print("1. 전원, 2. 동영상재생, 3. 타이핑: ");
		int function = sc.nextInt();
		
		// Laptop laptop = 맥북 or 갤럭시북의 공통 기능 실행
		Laptop laptop;
		if (choice == 1) laptop = new MacBook();
		else laptop = new GalaxyBook();
		
		switch(function) {
		case 1: laptop.power(); 
		break;
		case 2: laptop.video();
		break;
		case 3: laptop.typing();
		break;
		}
	}
}
