package oop.keyword6;

public class Member {
	private final String id;
	private String pw, nickname;
	
	public Member(String id, String pw, String nickname) {
		this.id = id;
		this.setPw(pw);
		this.setNickname(nickname);
	}

	public String getPw() { return this.pw.substring(0, 2) + "**********"; }
	public String getNickname() { return this.nickname; }
	public void setPw(String pw) { this.pw = pw; }
	public void setNickname(String nickname) { this.nickname = nickname; }
	public void show() {
		System.out.println("아이디: " + this.id);
		System.out.println("비밀번호: " + this.getPw());
		System.out.println("닉네임: " + this.nickname + "\n");
	}
	
	public String getPwMasking() {
		String tot = "";
		for (int i = 0; i < pw.length(); i++) {
			if (i <= 1) tot += this.pw.charAt(0);
			else tot += "*";
		}
		return tot;
	}
}
