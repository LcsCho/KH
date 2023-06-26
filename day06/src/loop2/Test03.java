package loop2;

public class Test03 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i < 100; i++) {
			boolean r = (i % 10 == 3 || i % 10 == 6 || i % 10 == 9);
			boolean q = (i / 10 == 3 || i / 10 == 6 || i / 10 == 9);
			boolean clap = r || q;
			boolean doubleClap = r && q; 
			if (doubleClap) {
				count++;
				// System.out.println(i + "짝짝");
			}
			
			else if (clap) { 
				count++;
				// System.out.println(i + "짝");
			}
		}
		System.out.println(count);
	}
}
