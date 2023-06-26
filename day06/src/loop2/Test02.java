package loop2;

public class Test02 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1 ; i < 100; i++) {
			boolean q = i / 10 == 7;
			boolean r = i % 10 == 7;
			
			if (q || r) {
				// System.out.println(i);
				count++;
			}	
		}
		System.out.println(count);
	}
}
