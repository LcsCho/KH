package oop.poly1_1;

import java.util.Scanner;

// 다형성 없이 만든 코드
public class Test01 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int type = 1;
		int action = 1;

		if (type == 1) {
			MacBook mac = new MacBook();
			if(action == 1) {
				mac.power();
			}
			else if (action == 2) {
				mac.video();
			}
			else {
				mac.typing();
			}
		}
		else {
			GalaxyBook galaxy = new GalaxyBook();
			if(action == 1) {
				galaxy.power();
			}
			else if (action == 2) {
				galaxy.video();
			}
			else {
				galaxy.typing();
			}
		}




		
		
	}
}
