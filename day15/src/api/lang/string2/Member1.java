package api.lang.string2;

public class Member1 {
	private final String memberId; // 아이디는 불변이므로 한 번만 저장
	private String memberPw, memberName, memberLevel;
	private int memberPoint;
	
	public Member1(String memberId, String memberPw, String memberName, String memberLevel) {
		this.memberId = memberId.toLowerCase();
		this.setMemberPw(memberPw);
		this.setMemberName(memberName);
		this.setMemberLevel(memberLevel);
		this.setMemberPoint(100);
	}
	public Member1(String memberId, String memberPw, String memberName) {
		this(memberId, memberPw, memberName, "일반회원");
	}
	
	public String getMemberId() { return memberId; } 
	// setMemberId() 메서드 생성 불가
	public String getMemberPw() { return memberPw; }
	public void setMemberPw(String memberPw) { this.memberPw = memberPw; }
	public String getMemberName() { return memberName; }
	public void setMemberName(String memberName) { this.memberName = memberName; }
	public String getMemberLevel() { return memberLevel; }
	public void setMemberLevel(String memberLevel) { 
		if (!(memberLevel.equals("관리자") || memberLevel.equals("우수회원"))) {
			this.memberLevel = "일반회원"; // 잘못된 값을 넣어도 일반회원으로 출력되게 기본값을 설정해놓음
			return;
		}
		this.memberLevel = memberLevel; 
	}
	public int getMemberPoint() { return memberPoint; }
	public void setMemberPoint(int memberPoint) {
		if (memberPoint < 0) return; 
		this.memberPoint = memberPoint;
	}
	public String getMaskedPw() {
		StringBuilder maskedPw = new StringBuilder(this.memberPw);
		return maskedPw.replace(1, maskedPw.length(), "**********").toString(); // 글자수대로 *을 출력하면 오히려 비밀번호 글자수에 대한 데이터가 노출되기 때문에 *개수를 고정으로 출력
		// return pwReplace.replace(1, pwReplace.length(), "*".repeat(pwReplace.length() - 1)); // 이 방법은 글자수만큼 *을 출력
	}
	public void displayMemberInfo() {
		System.out.println("<회원 정보>");
		System.out.println("회원 아이디: " + this.getMemberId());
		System.out.println("회원 비밀번호: " + this.getMaskedPw());
		System.out.println("회원 이름: " + this.getMemberName());
		System.out.println("회원 레벨: " + this.getMemberLevel());
		System.out.println("회원 포인트: " + this.getMemberPoint());
	}
		
}
