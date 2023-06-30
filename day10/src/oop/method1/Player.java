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
	
	
	
	
}
