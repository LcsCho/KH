package api.lang.string2;

public class Member1 {
	private String memberId, memberPw, memberName, memberLevel;
	private int memberPoint;
	
	public Member1(String memberId, String memberPw, String memberName) {
		this.setMemberId(memberId);
		this.setMemberPw(memberPw);
		this.setMemberName(memberName);
		this.setMemberLevel("일반회원");
		this.setMemberPoint(100);
	}
	public String getMemberId() { return memberId.toLowerCase(); } // 대문자로 아이디를 회원가입하여도 소문자로 바꾸어 처리
	public void setMemberId(String memberId) { this.memberId = memberId; }
	public String getMemberPw() { return memberPw; }
	public void setMemberPw(String memberPw) { this.memberPw = memberPw; }
	public String getMemberName() { return memberName; }
	public void setMemberName(String memberName) {
		if (memberName == "관리자" || memberName == "우수회원" || memberName == "일반회원") return;
		this.memberName = memberName;
	}
	public String getMemberLevel() { return memberLevel; }
	public void setMemberLevel(String memberLevel) { this.memberLevel = memberLevel; }
	public int getMemberPoint() { return memberPoint; }
	public void setMemberPoint(int memberPoint) {
		if (memberPoint < 0) return; 
		this.memberPoint = memberPoint;
	}
	public StringBuffer getReplacePW() {
		StringBuffer pwReplace = new StringBuffer(this.getMemberPw());
		return pwReplace.replace(1, pwReplace.length(), "**********"); // 글자수대로 *을 출력하면 오히려 비밀번호 글자수에 대한 데이터가 노출되어 *을 개수를 고정으로 출력
	}
	public boolean isId() {
		String regexId = "^(?=.*[a-zA-Z])(?=.*[0-9])[A-Za-z0-9]{8,20}$"; // 대소문자 구분없이 입력받음
		return this.memberId.matches(regexId) ? true : false;
	}
	public boolean isPw() {
		String regexPw = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$])[A-Za-z0-9!@#$]{8,15}$";
		return this.memberPw.matches(regexPw) ? true : false;
	}
	public boolean isName() {
		String regexName = "^[가-힣]{2,7}$";
		return this.memberName.matches(regexName) ? true : false;
	}
	public void showTrue() {
		System.out.println("<회원 정보>");
		System.out.println("회원 아이디: " + this.getMemberId());
		System.out.println("회원 비밀번호: " + this.getReplacePW());
		System.out.println("회원 이름: " + this.getMemberName());
		System.out.println("회원 레벨: " + this.getMemberLevel());
		System.out.println("회원 포인트: " + this.getMemberPoint());
	}
	public void showFalse() {
		System.out.println("오류! 아이디, 비밀번호, 이름 중 잘못 입력하였습니다. 처음부터 다시 입력해주세요!\n");
	}
}
