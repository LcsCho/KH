package data2;

public class Test02 {
	public static void main(String[] args) {
		//BMI 계산기
		
		//입력
		int cm = 180;
		int kg = 80;
		
		//계산
		//int m = cm / 100;
		//float m = cm / 100f;
		//double m = cm / 100d;
		double m = (double)cm / 100;
		
		double bmi = kg / (m * m);
		//double bmi = kg / m / m;
		
		//출력
		System.out.println(bmi);
		
	}
}










