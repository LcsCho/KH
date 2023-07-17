package api.file.object;

import java.io.Serializable;

public class Player implements Serializable {
	private static final long serialVersionUID = 1L;
	private String id;
	private int lv, money;
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getLv() {
		return lv;
	}
	public Player(String id) {
		this.setId(id);
		this.setLv(1);
		this.setMoney(0);
	}
	
	public void setLv(int lv) {
		if (lv < 1) return;
		this.lv = lv;
	}
	
	public void setLvUp() {
		this.lv++;
		System.out.println("레벨이 1 증가했습니다!");
	}
	
	public void show() {
		System.out.println("아이디: " + this.getId());
		System.out.println("레벨: " + this.getLv());
		System.out.println("소지금: " + this.getMoney() + " gold");
	}
}
