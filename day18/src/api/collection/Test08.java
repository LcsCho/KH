package api.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		List<String> ladder = new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		
		System.out.println("<사다리 게임>");
		System.out.print("인원수 선택: ");
		int count = sc.nextInt();
		System.out.print("당첨 인원 선택: ");
		int winCount = sc.nextInt();
		
		for (int i = 0; i < count; i++) {
			System.out.print("이름 입력: ");
			String name = sc.next();
			ladder.add(name);
		}
		sc.close();
		Collections.shuffle(ladder);

		System.out.print("당첨자는: " + ladder.subList(0, winCount));
	}
}
