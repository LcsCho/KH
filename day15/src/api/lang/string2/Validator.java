package api.lang.string2;

public class Validator {
	// 회원가입을 할 때 정규식은 불변이어야 하므로 static final을 붙여 상수화시킴
	private static final String regexId = "^(?=.*[a-zA-Z])(?=.*[0-9])[A-Za-z0-9]{8,20}$";  // 대소문자 상관없이 입력받을 수 있게 구성
	private static final String regexPw = "^(?=.*[A-Z])(?=.*[a-z])(?=.*[0-9])(?=.*[!@#$])[A-Za-z0-9!@#$]{8,15}$";
	private static final String regexName = "^[가-힣]{2,7}$";
	
	// Member1 클래스에 메서드를 만들고 객체에 회원가입을 위한 정보를 저장한 뒤 유효성을 검사는 것은 객체에 대한 필터링 되지 않은 불확실한 정보가 저장된다.
	// 그래서 회원가입을 위한 회원정보의 유효성을 main에서 직접 검사 후 올바른 경우에만 객체에 저장을 하여 출력하는 형식으로 함
	public static boolean isValidId(String memberId) { return memberId.matches(regexId); }
    public static boolean isValidPw(String memberPw) { return memberPw.matches(regexPw); }
    public static boolean isValidName(String memberName) { return memberName.matches(regexName); }
}
