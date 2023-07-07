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
		if (isNickname1 && isNickname2) System.out.println("닉네임 설정이 완료되었습니다.");
		else System.out.println("닉네임 설정 불가!");
	}
}
