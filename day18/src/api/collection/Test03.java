package api.collection;

import java.util.ArrayList;
import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		ArrayList<String> nationList = new ArrayList<>();

		System.out.println("<나라이름 게임>");
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("나라 이름: ");
			String nationName = sc.next();

			if (nationList.contains(nationName)) {
				sc.close();
				break;
			} 
			else nationList.add(nationName);
		}
		System.out.println("게임 오버!");
		System.out.println("나라이름 개수: " + nationList.size());
	}
}
