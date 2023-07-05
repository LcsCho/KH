package oop.inherit8;

public abstract class Character {
	protected String id;
	protected int lv;
	public String getId() {
		return id;
	}
	public void setId(String id) { this.id = id; }
	public int getLv() { return lv; }
	public void setLv(int lv) { this.lv = lv; }
	public Character(String id) {
		this.setId(id);
		this.lv = 1;
	}
	public abstract void attack();
	public abstract void move();
	public abstract void shop();
	public void show() { 
		System.out.println("<캐릭터 정보>");
		System.out.println("아이디: " + this.getId() + ", 레벨: " + this.getLv()); 
	}
}
