package api.lang.string2;

import java.util.Scanner;

public class Test03 {
	public static void main(String[] args) {
		// 정규 표현식(REGular EXpression)
		
		Scanner sc = new Scanner(System.in);
		System.out.print("휴대전화번호를 입력: ");
		String phoneNum = sc.next();
		sc.close();
		
		String regex = "^01[016-9][1-9][0-9]{2,3}[0-9]{4}$";
		// boolean isValid = Pattern.matches(regex, phoneNum);
		boolean isValid = phoneNum.matches(regex);
		if(isValid) System.out.println("휴대폰 번호가 정상적으로 입력");
		else System.out.println("휴대폰 번호가 비정상");
		
	}
}
