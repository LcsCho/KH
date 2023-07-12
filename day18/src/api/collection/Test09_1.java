package api.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Card {
	private final String shape;//도형
	private final String number;//숫자
	public Card(String shape, String number) {
		this.shape = shape;
		this.number = number;
	}
	public String getNumber() {
		return number;
	}
	public String getShape() {
		return shape;
	}
	@Override
	public String toString() {
		return shape + "/" + number;
	}
	public boolean isSameShape(Card card) {
		return this.shape.equals(card.shape);
	}
	public boolean isSameNumbers(Card card) {
		return this.number.equals(card.number);
	}
}
class CardDeck {
	private String[] shapes = new String[] {"하트", "다이아몬드", "스페이드", "클로버"};
	private String[] numbers = new String[] {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K"};
	private List<Card> cards = new ArrayList<>();
	public CardDeck() {
		for(int i=0; i < shapes.length; i++) {
			for(int k=0; k < numbers.length; k++) {
				cards.add(new Card(shapes[i], numbers[k]));
			}
		}
	}
	public void shuffle() {
		Collections.shuffle(cards);
	}
	public Card getNextCard() {
		return this.cards.remove(0);
	}
}
class Player {
	private final String name;
	private List<Card> cards = new ArrayList<>();
	public Player(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void receive(Card card) {
		this.cards.add(card);
	}
	public String getCardStatus() {
		int count = 0;
		List<Card> dummy = new ArrayList<>();
		for(int i=0; i < this.cards.size(); i++) {
			Card card = this.cards.get(i);
			boolean contains = false;
			for(int k=0; k < dummy.size(); k++) {
				Card target = dummy.get(k);
				if(card.isSameNumbers(target)) {
					contains = true;
					break;
				}
			}
			if(contains) {
				count++;
			}
			else {
				dummy.add(card);
			}
		}
		if(count == 1) {
			return " (원페어)";
		}
		else if(count == 2) {
			return " (트리플)";
		}
		else {
			return "";
		}
	}
	@Override
	public String toString() {
		return "["+name+"] "+cards + getCardStatus();
	}
}
//객체 지향 풀이
public class Test09_1 {
	public static void main(String[] args) {
		//카드 덱 생성
		CardDeck deck = new CardDeck();
		
		//카드 덱 섞기
		deck.shuffle();
		
		//플레이어 생성
		int people = 3;
		List<Player> players = new ArrayList<>();
		for(int i=1; i <= people; i++) {
			players.add(new Player("테스터"+i));
		}
		
		for(int i=1; i<=people; i++) {
			for(Player player : players) {
				player.receive(deck.getNextCard());
			}
		}
		
		//출력
		for(Player player : players) {
			System.out.println(player);
		}
	}
}