package api.lang.string;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		String word = "바나나";
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("제시어: " + word);
			System.out.print("입력: ");
			String inputWord = sc.next();
			
			boolean isWordLength = inputWord.length() == 3;
		    boolean isWordCorrect = inputWord.charAt(0) == word.charAt(word.length() - 1);
		    boolean isWordKorean = inputWord.matches(".*[ㄱ-ㅎㅏ-ㅣ가-힣]+.*");
			if (!isWordLength) {
				System.out.println("게임오버!(글자수 안맞음)"); 
				break;
			}
			else if (!isWordKorean) {
				System.out.println("게임오버!(한글이 아님)");
				break;
			}
			else if (!isWordCorrect) {
				System.out.println("게임오버!(제시된 끝글자와 입력한 첫글자가 일치하지 않음)");
				break;
			}
			word = inputWord;
			System.out.println();
		}
		sc.close();
	}
}
