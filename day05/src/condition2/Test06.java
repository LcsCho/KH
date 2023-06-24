package condition2;

import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		//인바디 측정기
		
		//입력
		Scanner sc = new Scanner(System.in);
		
		System.out.print("신장(cm) 입력 : ");
		float height = sc.nextFloat();
		System.out.print("체중(kg) 입력 : ");
		float weight = sc.nextFloat();
		
		sc.close();
		
		//계산
		float heightMeter = height / 100;
		//System.out.println("heightMeter = " + heightMeter);
		
		//float bmi = weight / heightMeter / heightMeter;
		float bmi = weight / (heightMeter * heightMeter);
		
		//String status = "저체중" or "정상" or "과체중" or "경도비만" or "중등도비만";
		String status;
		if(bmi < 18.5f) {
			status = "저체중";
		}
		else if(bmi < 23f) {
			status = "정상";
		}
		else if(bmi < 25f) {
			status = "과체중";
		}
		else if(bmi < 30f) {
			status = "경도비만";
		}
		else {//bmi가 30이상
			status = "중등도비만";
		}
		
		//출력
		System.out.println("bmi 수치는 " + bmi + " 입니다");
		System.out.println("건강 상태 : " + status);
	}
}







