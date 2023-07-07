package api.lang.string;

import java.util.Arrays;
import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문장을 입력: ");
		String line = sc.nextLine();
		
		String[] slangArr = new String[] {
			"수박씨", "신발끈", "개나리", "십장생", "시베리아", "주옥", "조카", "게불", "10원"
		};
		
		for (String slang : slangArr) { line = line.replace(slang, "*".repeat(slang.length())); }
        System.out.println(line);
		sc.close();
	}
}
