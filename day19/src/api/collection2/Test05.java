package api.collection2;

import java.util.Set;
import java.util.TreeSet;

public class Test05 {
	public static void main(String[] args) {
		Set cs = Set.of("범죄도시3", "늑대사냥", "드림", "퍼펙트게임");
		Set yh = Set.of("파수꾼", "늑대사냥", "리바운드", "익스트랙션2", "드림");
		
		Set<String> both = new TreeSet<>();
		
		both.addAll(cs);
		both.retainAll(yh);
		System.out.println("철수와 영희가 둘 다 본 영화: " + both);
		
		
		Set<String> minus1 = new TreeSet<>();
		minus1.addAll(cs);
		minus1.removeAll(yh);
		System.out.println("철수만 본 영화: " + 	minus1);
		
		
		Set<String> minus2 = new TreeSet<>();
		minus2.addAll(yh);
		minus2.removeAll(cs);
		System.out.println("영희만 본 영화: " + minus2);
		
		Set<String> any = new TreeSet<>();
		any.addAll(minus1);
		any.addAll(minus2);
		System.out.println("둘 중 한 명만 본 영화: " + any);
		
		// Set도 전체 출력이 되긴 된다.
		// = 확장반복(foreach)은 가능
		
		for (String name : any) System.out.println("name = " + name);
	}
}
