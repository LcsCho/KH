package oop.inherit8.copy;

public class Test02 {
	public static void main(String[] args) {
	  // Warrior a = new Warrior("테스터1");
		 Archer a = new Archer("테스터1");
      // Magician a = new Magician("테스터1");
		
      // Warrior b = new Warrior("테스터2");
		 Magician b = new Magician("테스터2");
	  // Archer b = new Archer("테스터2");
		
		 Warrior c = new Warrior("테스터3");
	  // Magician c = new Magician("테스터3");
	  // Archer c = new Archer("테스터3");	
		
		Interaction.battle(a, b, c); // 3명으로 바꿈
	}
}
