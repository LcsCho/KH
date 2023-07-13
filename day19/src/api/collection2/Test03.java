package api.collection2;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Test03 {
	public static void main(String[] args) {
		Set<Integer> feed = new HashSet<>();
		
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("글 번호를 정수로 입력: ");
			int num = sc.nextInt();
			if (num <= 0) {
				sc.close();
				break;
			}
			if (feed.contains(num)) {
				System.out.println(num + "번 글에 좋아요를 취소했습니다.");
				feed.remove(num);
			}
				
			else {
				System.out.println(num + "번 글에 좋아요를 눌렀습니다.");
				feed.add(num);
			}
		}
		System.out.print("현재까지 좋아요 설정한 글 번호: " + feed);
	}
}
