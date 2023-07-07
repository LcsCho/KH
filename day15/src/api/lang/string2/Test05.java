package api.lang.string2;

public class Test05 {
	public static void main(String[] args) {
		String birthDate = "1998-06-22";
		
		
		String regex = "^(19|20)[0-9]{2}-(0[13578]-(0[1-9]|2[0-9]|3[01])|1[02]-(0[1-9]|2[0-9]|3[01])|02-(0[1-9]|1[0-9]|2[0-9])|0[469]-(0[1-9]|2[0-9]|30)|11-(0[1-9]|2[0-9]|30))$";
		boolean isValue = birthDate.matches(regex);
		if (isValue) System.out.println("생년월일을 정상적으로 입력함");
		else System.out.println("생년월일을 비정상적으로 입력함");
	}
}
