package api.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test07 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		int d_day = 100;
		
		// 계산
		// int day = c.get(Calendar.DATE);
		// c.set(Calendar.DATE, day + d_day - 1);
		
		c.add(Calendar.DATE, d_day - 1);
		
		Date d = c.getTime();
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd E");
		System.out.println(fmt.format(d));
	}
}
