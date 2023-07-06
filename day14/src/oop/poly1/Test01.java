package oop.poly1;

import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		MacBook mac = new MacBook();
		GalaxyBook galaxy = new GalaxyBook();
		Laptop a = new Laptop();
		
		System.out.println("노트북을 선택: ");
		System.out.print("1. 맥북, 2. 갤럭시북: ");
		int choice = sc.nextInt();
		
		System.out.println("테스트할 기능을 선택하세요");
		System.out.print("1. 전원, 2. 동영상재생, 3. 타이핑: ");
		int function = sc.nextInt();
		
		if (choice == 1) { mac.show(); } 
		else galaxy.show();
		
		if (choice == 1) mac.power();
		
		switch(function) {
		case 1: a.power();
		break;
		case 2: a.video();
		break;
		case 3: a.typing();
		}
	}
}
