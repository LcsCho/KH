package api.lang.string;

import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("닉네임을 입력: ");
		String nickname = sc.nextLine();
		sc.close();
		boolean isNickname1 = !nickname.contains("운영자");
		boolean isNickname2 = nickname.length() >= 2 && nickname.length() <= 10;
		if (!(isNickname2)) System.out.println("2글자 이상 10글자 이하로만 작성!");
		else if(!(isNickname1)) System.out.println("운영자라는 단어를 포함할 수 없음!");
		else System.out.println("닉네임 설정이 완료되었습니다.");
	}
}
