package jdbc.dto;

import java.sql.Date;

public class MemberDto {
	private String member_id;
	private String member_pw;
	private String member_nickname;
	private Date member_birth;
	private String member_email;
	private String member_contact;
	private String member_level;
	private int member_point;
	private Date member_join;
	@Override
	public String toString() {
		return "MemberDto [member_id=" + member_id + ", member_pw=" + member_pw + ", member_nickname=" + member_nickname
				+ ", member_birth=" + member_birth + ", member_email=" + member_email + ", member_contact="
				+ member_contact + ", member_level=" + member_level + ", member_point=" + member_point
				+ ", member_join=" + member_join + "]";
	}
	public String getMember_id() {
		return member_id;
	}
	public void setMember_id(String member_id) {
		this.member_id = member_id;
	}
	public String getMember_pw() {
		return member_pw;
	}
	public void setMember_pw(String member_pw) {
		this.member_pw = member_pw;
	}
	public String getMember_nickname() {
		return member_nickname;
	}
	public void setMember_nickname(String member_nickname) {
		this.member_nickname = member_nickname;
	}
	public Date getMember_birth() {
		return member_birth;
	}
	public void setMember_birth(Date member_birth) {
		this.member_birth = member_birth;
	}
	public String getMember_email() {
		return member_email;
	}
	public void setMember_email(String member_email) {
		this.member_email = member_email;
	}
	public String getMember_contact() {
		return member_contact;
	}
	public void setMember_contact(String member_contact) {
		this.member_contact = member_contact;
	}
	public String getMember_level() {
		return member_level;
	}
	public void setMember_level(String member_level) {
		this.member_level = member_level;
	}
	public int getMember_point() {
		return member_point;
	}
	public void setMember_point(int member_point) {
		this.member_point = member_point;
	}
	public Date getMember_join() {
		return member_join;
	}
	public void setMember_join(Date member_join) {
		this.member_join = member_join;
	}
	public MemberDto() {
		super();
	}
}
