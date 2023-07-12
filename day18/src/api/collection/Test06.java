package api.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList<>();
		System.out.println("<끝말잇기 게임>");
		String word = "자바";
		list.add(word);

		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("제시어: " + word);
			System.out.print("단어를 입력: ");
			String input = sc.next();
			String regex = "^[가-힣]{2,6}$";

			boolean isCorrect = word.charAt(word.length() - 1) == input.charAt(0);
			boolean isMatch = input.matches(regex);

			if (isCorrect && isMatch) {
				list.add(input);
				word = input;
			} else {
				sc.close();
				break;
			}
		}
		System.out.println("게임 오버!");
		System.out.print("단어 목록: ");
		System.out.println(list);
	}
}
