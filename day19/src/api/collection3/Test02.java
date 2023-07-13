package api.collection3;

import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Test02 {
	public static void main(String[] args) {
		Map<String, String> map = new TreeMap<>();
		
		map.put("admin", "admin1234");
		map.put("teacher", "teacher1234");
		map.put("student", "student1234");
		map.put("manager", "manager1234");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("아이디 입력: ");
		String id = sc.next();
		
		System.out.print("비밀번호 입력: ");
		String pw = sc.next();
		sc.close();
		if (map.containsKey(id) && pw.equals(map.get(id))) // 올바른 식
			System.out.println("로그인 성공");
		else
			System.out.println("로그인 실패");
		
	}
}
