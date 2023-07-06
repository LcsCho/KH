package api.lang.test2;

import java.util.Properties;


public class Test01 {
	public static void main(String[] args) {
		// 1.
		Properties prop = new Properties();
		
		// 2.
		prop.setProperty("hello", "world");
		prop.setProperty("good", "bye");
		System.out.println(prop.toString());
		System.out.println(prop.get("hello"));
	}
}
