package api.file.object;

import java.io.Serializable;

// 클래스를 만들 때 파일로도 저장할 계획이라면 마킹(marking)을 해야 함
// = java.io.Serializable 인터페이스를 상속받으면 해결

// 1. 클래스의 버전을 설정할 수 있다.
public class Student implements Serializable{
	private String name;
	private int score;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getScore() {
		return score;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public Student(String name, int score) {
		this.setName(name);
		this.setScore(score);
	}
}
