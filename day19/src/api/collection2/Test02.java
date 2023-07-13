package api.collection2;

import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Test02 {
	public static void main(String[] args) {
		Set<Integer> lotto = new TreeSet<>();

		Random r = new Random();

		while (lotto.size() < 6) {
			int num = r.nextInt(45) + 1;
			
			if (!lotto.contains(num)) {
				lotto.add(num);
			}
		}
		System.out.println(lotto);
	}
}
