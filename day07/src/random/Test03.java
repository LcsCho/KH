package random;

import java.util.Random;

public class Test03 {
	public static void main(String[] args) {
		// 윷놀이 게임
		
		Random r = new Random();
		int yut = r.nextInt(6);
		
		if (yut == 0) System.out.println("빽도");
		else if (yut == 1) System.out.println("도");
		else if (yut == 2) System.out.println("개");
		else if (yut == 3) System.out.println("걸");
		else if (yut == 4) System.out.println("윷");
		else System.out.println("모");
		
		yut = r.nextInt(16) + 1;
		switch(yut) {
		case 1: System.out.println("빽도"); break;
		case 2: case 3: case 4: System.out.println("도"); break;
		case 5: case 6: case 7: case 8: case 9: case 10: System.out.println("개"); break;
		case 11: case 12: case 13: case 14: System.out.println("걸"); break;
		case 15: System.out.println("윷"); break;
		default: System.out.println("모");
		}
	}
}
