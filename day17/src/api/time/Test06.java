package api.time;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Test06 {
	public static void main(String[] args) {
		Calendar c = Calendar.getInstance();
		
		c.set(c.get(Calendar.YEAR), c.get(Calendar.MONTH), c.get(Calendar.DAY_OF_MONTH) + 100);
		
		Date d = c.getTime();
		SimpleDateFormat fmt = new SimpleDateFormat("yyyy-MM-dd E");
		System.out.println(fmt.format(d));
	}
}
