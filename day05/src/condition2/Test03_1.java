package condition2;

public class Test03_1 {
	public static void main(String[] args) {
		
		//입력
		int age = 25;
		
		//출력
		if (age >= 65) {//어르신 
			System.out.println("요금은 0원입니다");
		}
		else if (age >= 20) {//성인
			System.out.println("요금은 1250원입니다");
		}
		else if (age >= 14) {//청소년
			System.out.println("요금은 720원입니다");
		}
		else if (age >= 8) {//어린이
			System.out.println("요금은 450원입니다");
		}
		else {//영유아
			System.out.println("요금은 0원입니다");
		}
		
	}
}