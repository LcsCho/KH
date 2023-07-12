package api.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("인원수 입력: ");
		int count = sc.nextInt();
		sc.close();
		List<String> card = new ArrayList<>();

		String[] cardSahpe = { "하트", "스페이드", "클로버", "다이아몬드" };
		String[] cardNumber = { "A", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K" };

		for (int i = 0; i < 4; i++) {
			for (int j = 0; j <= 13; j++) {
				card.add(cardSahpe[i] + "/" + cardNumber[j]);
			}
		}

		System.out.println(card);
		Collections.shuffle(card);

		for (int i = 0; i < count * 3; i += 3) {

			System.out.println("플레이어[" + (i / 3 + 1) + "]: " + card.subList(i, i + 3));

			if (card.get(i).equals(card.get(i + 1)) && card.get(i).equals(card.get(i + 2))) {
				System.out.println("트리플!");
			} else if (card.get(i).equals(card.get(i + 1)) || card.get(i).equals(card.get(i + 2))
					|| card.get(i + 1).equals(card.get(i + 2))) {
				System.out.println("원페어!");
			}
		}
	}
}
