package oop.constructor3;

public class Character {
	private String id, job;
	private int lv;
	
	public Character(String id, String job, int lv) {
		this.setId(id);
		this.setJob(job);
		this.setLv(lv);
	}
	public Character(String id, String job) { this(id, job, 1); }
	private void setId(String id) {
		this.id = id;
	}
	private void setLv(int lv) {
		if (lv <= 0) return;
		this.lv = lv;
	}
	private void setJob(String job) {
		switch(job) {
		case "전사", "마법사", "궁수" :
			this.job = job;
		}
	}
	String getId() {
		return id;
	}
	String getJob() {
		return job;
	}
	int getLv() {
		return lv;
	}
	public void show() {
		System.out.println("아이디: " + id);
		System.out.println("직업: " + job);
		System.out.println("레벨: " + lv + "\n");
	}
}
