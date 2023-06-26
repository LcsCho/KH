package loop;

public class Test05_1 {
	public static void main(String[] args) {
		for (int i = 1; i < 100; i++) {
			boolean r = (i % 10 == 3 || i % 10 == 6 || i % 10 == 9);
			boolean q = (i / 10 == 3 || i / 10 == 6 || i / 10 == 9);
			boolean clap = r || q;
			boolean doubleClap = r && q; 
			if (doubleClap) 
				System.out.println(i + "짝짝");
			else if (clap)
				System.out.println(i + "작");
			
		}
	}
}
