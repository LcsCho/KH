package data4;

public class Test01 {

	public static void main(String[] args) {
		// 글자(문자열)
		// 1. 컴퓨터는 전자제품이다.
		// 2. 컴퓨터는 사람이 쓴다.
		// 3. 컴퓨터는 미국인이 만들었다.(영어권 글자만 교육)
		// 		ASCII CODE(128ea)
		// 4. 유럽인은 ASCII 코드로 글자를 다 못쓴다.
		//		ASCII CODE Extension -> 256ea
		// 5. 전세계 사람들도 각자 쓰는 언어가 있다.
		// 		자체 코드
		// 6. MS가 Windows를 개발하면서 개발한 방식 -> CP949(MS949) 라고 부름
		// 7. 옛날 글자 빼고 자주 쓰는 것만 모아서 유니코드를 개발
		//		한글은 11,172자 포함
		// 		완성된 글자마다 번호를 부여하여 무식하게 처리(창제원리 무시)
		// 		UTF-8이라는 형태로 사용
		
		char a = 'H';
		char b = '밥';
		System.out.println(a);
		System.out.println(b);
		
		System.out.println((int)b);
		int c = b;
		System.out.println(b);
	}

}
