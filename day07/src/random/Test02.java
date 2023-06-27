package random;

import java.text.DecimalFormat;
import java.text.Format;
import java.util.Random;

public class Test02 {
	public static void main(String[] args) {
		Random r = new Random();
		
		// 1. 무작위 로또 번호 한 개
		int lotto = r.nextInt(45) + 1;
		System.out.println(lotto);
		
		// 2. 무작위 두 자리 정수 한 개
		int number = r.nextInt(90) + 10;
		System.out.println(number);
		
		// 3. otp 6자리 숫자
		int otp = r.nextInt(1000000);
		Format f = new DecimalFormat("000000");
		System.out.println(f.format(otp));
	
		// 4. 앞 뒤
		int fOrB = r.nextInt(2);
		if (fOrB == 0) System.out.println("앞");
		else System.out.println("뒤");
		
		// 5. 가위바위보
		int rcp = r.nextInt(3);
		if (rcp == 0) System.out.println("가위!");
		else if (rcp == 1) System.out.println("바위!");
		else System.out.println("보!");
	}
}
