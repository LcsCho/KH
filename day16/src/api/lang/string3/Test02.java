package api.lang.string3;

public class Test02 {
	public static void main(String[] args) {
		// 문자열 덧셈 성능 측정
		// - 싱글 스레드 환경에서는 StringBuilder가 효율적(잠금장치가 없으니까)
		// - 멀티 스레트 환경에서는 StringBuffer가 효율적(느리지만 안전)
		long start = System.currentTimeMillis();
		
		StringBuffer buffer = new StringBuffer();
		StringBuilder builder = new StringBuilder();
		for (int i = 0; i < 1000; i++) builder.append("*");
		
		String star = buffer.toString();
		
		long finish = System.currentTimeMillis();
		
		long time = finish - start;
		System.out.println("time = " + time);
	}
}
