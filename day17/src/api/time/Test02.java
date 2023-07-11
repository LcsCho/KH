package api.time;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Test02 {
	public static void main(String[] args) {
		Date d = new Date();
		SimpleDateFormat f1 = new SimpleDateFormat("y년 M월 d일");
		SimpleDateFormat f2 = new SimpleDateFormat("a h시 m분");
		SimpleDateFormat f3 = new SimpleDateFormat("H:mm:ss");
		SimpleDateFormat f4 = new SimpleDateFormat("yyyy-MM-dd E HH:mm:ss");
		
		System.out.println(f1.format(d));
		System.out.println(f2.format(d));
		System.out.println(f3.format(d));
		System.out.println(f4.format(d));
	}
}
