package oop.inherit8;

// 추상클래스가 되면 (1) 객체 생성 금지 (2) 추상 메서드 작성 가능
public abstract class Player {
	// 공통 필드
	private String id;
	private int lv;
	
	// setter, getter
	public String getId() { return id; }
	public void setId(String id) { this.id = id; }
	public int getLv() { return lv; }
	public void setLv(int lv) { 
		if (lv < 1) return;
		this.lv = lv; 
	}
	
	// 생성자 - 오직 아이디만 설정
	public Player(String id) {
		this.setId(id);
		this.setLv(1);
	}
	// 메서드
	public void show() { 
		System.out.println("<캐릭터 정보>");
		System.out.println("아이디: " + this.getId() + ", 레벨: " + this.getLv()); 
	}
	
	// 추상 메서드
	public abstract void attack();
	public abstract void move();
	public abstract void shop();	
}
