package api.time;

import java.util.Calendar;
import java.util.Random;

public class Test05 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		Random r = new Random();
		int day = r.nextInt(365) + 1;
		
		c.set(2023, 0, day);
		
		System.out.println(c.get(Calendar.YEAR) + "년 " + (c.get(Calendar.MONTH) + 1) + "월 " + c.get(Calendar.DAY_OF_MONTH) + "일");
		
	}
}
