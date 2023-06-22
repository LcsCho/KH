package output;

public class Test01 {

	public static void main(String[] args) {
		// 출력 - CPU를 기준으로 데이터가 외부로 나가는 것
		// 표준 출력 - 표준 출력장치로 데이터가 나가는 것, System.out을 사용
		
		// System.out.print()는 글자를 외부로 단순 출력
		System.out.print("hello");
		System.out.print("world");
		
		// 줄바꿈
		System.out.print("\n");
		System.out.println();
		
		// System.out.println()는 글자를 외부로 출력 후 개행 실행
		System.out.println("hello");
		System.out.println("world");
		
		
		// C언어 방식
		System.out.print("hello");
		System.out.print("world");
		
		System.out.println();
		
		int a = 10;
		int b = 20;
		int c = a + b;
		
		System.out.printf("%d + %d = %d\n", a, b, c);
		System.out.println(a + " + " + b + " = " + c);
		
		
	}

}
