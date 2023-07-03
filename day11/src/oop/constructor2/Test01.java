package oop.constructor2;

public class Test01 {
	public static void main(String[] args) {
		Song s1 = new Song("그때 그 순간 그대로(그그그)", "WSG워너비", "WSG워너비 1집", 104250, 91835);
		Song s2 = new Song("보고싶었어", "WSG워너비", "WSG워너비 1집", 83127, 90805);
		Song s3 = new Song("LOVE DIVE", "IVE(아이브)", "LOVE DIVE", 64590, 174519);
		Song s4 = new Song("POP!", "나연(TWICE)", "IM NAYEON", 58826, 70313);
		
		System.out.println("<음원차트>");
		s1.show();
		s2.show();
		s3.show();
		s4.show();
	}
}
