package loop;

public class Test04_1 {
	public static void main(String[] args) {
		
		for (int i = 1; i < 100; i++) {
			boolean r = i % 10 == 5;
			boolean q = i / 10 == 5;
			if (r || q)
				System.out.println(i);
		}
	}
}
