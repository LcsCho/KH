package condition;

public class Test02_2 {
	public static void main(String[] args) {
		
		int birth = 2005;
		int year = 2023;
		
		int age = year - birth + 1;
		
		if(age == 19) {
			System.out.println("이벤트 대상입니다");
		}
		else {
			System.out.println("이벤트 대상이 아닙니다");
		}
		
	}
}