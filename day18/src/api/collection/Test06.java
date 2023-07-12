package api.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		ArrayList<String> wordList = new ArrayList<>();
		System.out.println("<끝말잇기 게임>");
		String currentWord = "자바";
		wordList.add(currentWord);

		final String koreanWordRegex = "^[가-힣]{2,6}$";
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("제시어: " + currentWord);
			System.out.print("단어를 입력: ");
			String inputWord = sc.next();

			boolean isCorrect = currentWord.charAt(currentWord.length() - 1) == inputWord.charAt(0);
			boolean isMatch = inputWord.matches(koreanWordRegex);

			if (isCorrect && isMatch) {
				wordList.add(inputWord);
				currentWord = inputWord;
			} else {
				sc.close();
				break;
			}
		}
		System.out.println("게임 오버!");
		System.out.print("단어 목록: ");
		System.out.println(wordList);
	}
}
