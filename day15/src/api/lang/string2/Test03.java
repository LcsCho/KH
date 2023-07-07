package api.lang.string2;

import java.util.Scanner;
import java.util.regex.Pattern;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("휴대전화번호를 입력: ");
		String phone = sc.next();
		sc.close();
		
		String regex = "^01[016789][0-9]{3,4}[0-9]{4}$";
		boolean isValid = Pattern.matches(regex, phone);
		if(isValid) System.out.println("휴대폰 번호가 정상적으로 입력");
		else System.out.println("휴대폰 번호가 비정상");
		
	}
}
