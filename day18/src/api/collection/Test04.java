package api.collection;

import java.util.ArrayList;
import java.util.Random;

public class Test04 {
	public static void main(String[] args) {
		ArrayList<Integer> lotto = new ArrayList<>();

		Random r = new Random();

		while (lotto.size() < 6) {
			int num = r.nextInt(45) + 1;
			
			if (!lotto.contains(num)) {
				lotto.add(num);
			}
		}
		System.out.println(lotto);
		lotto.sort(null);
		System.out.println(lotto);
	}
}
