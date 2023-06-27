package random;

import java.util.Random;

public class Test02 {
	public static void main(String[] args) {
		Random r = new Random();
		
		int lotto = r.nextInt(45) + 1;
		System.out.println(lotto);
		
		int number = r.nextInt(90) + 10;
		System.out.println(number);
		
		int otp = r.nextInt(1000000);
		System.out.println(otp);
	
		int fOrB = r.nextInt(2);
		if (fOrB == 0) System.out.println("앞");
		else System.out.println("뒤");
		
		int rcp = r.nextInt(3);
		if (rcp == 0) System.out.println("가위!");
		else if (rcp == 1) System.out.println("바위!");
		else System.out.println("보!");
	}
}
