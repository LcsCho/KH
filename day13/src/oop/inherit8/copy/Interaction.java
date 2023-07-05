package oop.inherit8.copy;

// 두 개의 캐릭터로 서로간의 상호작용을 하도록 처리하는 클래스
// - ex: 거래, 전투, ...

public class Interaction {

	// 전투 기능
	public static void battle(Fightable a, Fightable b, Fightable c) { // 2명도 가능하여 심심해서 추가로 3명으로 변경함
		a.attack();
		b.attack();
		c.attack();
	}
}
