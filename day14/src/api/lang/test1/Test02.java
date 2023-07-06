package api.lang.test1;

import java.util.Properties;

public class Test02 {
	public static void main(String[] args) {
		// 1. 객체 생성
		Properties prop = new Properties();
		
		// 2. 메서드 활용
		prop.setProperty("hello", "world");
		prop.setProperty("good", "bye");
		System.out.println(prop.toString());
		System.out.println(prop.get("hello"));
	}
}
