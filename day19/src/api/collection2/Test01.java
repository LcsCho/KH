package api.collection2;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Test01 {
	public static void main(String[] args) {
		// 비선형 구조
		
		// Set
		// = 중복이 발생할 수 없는 구조
		// = 트리 구조면 TreeSet, 해시 구조면 HashSet
		
		Set<Integer> a = new TreeSet<>();
		Set<Integer> b = new HashSet<>();

		// 추가
		a.add(30);
		b.add(30);
		a.add(50);
		b.add(50);
		a.add(60);
		b.add(60);
		a.add(70);
		b.add(70);

		// 검색, 삭제
		System.out.println(a.contains(30));
		System.out.println(b.remove(50));
		
		// .get()없음 - Set에는 index 개념이 없다.

		// 출력
		System.out.println("a = " + a);
		System.out.println("b = " + b);
		System.out.println(a.size());
		System.out.println(b.size());
	}
}
