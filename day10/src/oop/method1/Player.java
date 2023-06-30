package oop.method1;

// 클래스
public class Player {
	// 멤버 필드(멤버 변수) = 데이터
	int rank, goal;
	String name, nation;
	
	// 멤버 메소드 = 공통코드
	// void 이름(){코드}
	void show() {
		// this: 클래스의 멤버를 의미(나 자신)
		System.out.println(this.rank + ", " + this.name + ", " + this.nation + ", " + this.goal);
	}
	
	// 초기화용
	// - 설정될 값을 알 수 없으므로 외부에서 전달받아서 초기화
	// - 매개변수
	void setup(int rank, String name, String nation, int goal) {
		this.rank = rank;
		this.name = name;
		this.nation = nation;
		this.goal = goal;
	}
}
