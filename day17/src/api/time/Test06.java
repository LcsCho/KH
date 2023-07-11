package api.time;

import java.util.Calendar;

public class Test06 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		c.set(c.get(Calendar.YEAR), c.get(Calendar.MONTH) + 1, c.get(Calendar.DAY_OF_MONTH) + 100);
		
		System.out.print(c.get(Calendar.YEAR) + "년 ");
		System.out.print(c.get(Calendar.MONTH) + "월 ");
		System.out.println(c.get(Calendar.DAY_OF_MONTH) + "일");
	}
}
