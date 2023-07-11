package api.time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02 {
	public static void main(String[] args) {
		Date a = new Date();
		SimpleDateFormat fmt1 = new SimpleDateFormat("y년 M월 d일");
		SimpleDateFormat fmt2 = new SimpleDateFormat("a h시 m분");
		SimpleDateFormat fmt3 = new SimpleDateFormat("H:m:s");
		SimpleDateFormat fmt4 = new SimpleDateFormat("y-M-d E H:m:s");
		
		String time = fmt1.format(a);
		System.out.println("time = " + time);
		time = fmt2.format(a);
		System.out.println("time = " + time);
		time = fmt3.format(a);
		System.out.println("time = " + time);
		time = fmt4.format(a);
		System.out.println("time = " + time);
	}
}
