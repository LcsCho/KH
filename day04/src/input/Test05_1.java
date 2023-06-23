package input;

public class Test05_1 {
	public static void main(String[] args) {
		//분식점 금액 계산기
		
		//입력
		int menu1Price = 3000;
		int menu2Price = 500;
		int menu3Price = 2000;
		
		int menu1Count = 1;
		int menu2Count = 0;
		int menu3Count = 0;
		
		int rate = 10;
		
		//계산
		int menu1Total = menu1Price * menu1Count;
		int menu2Total = menu2Price * menu2Count;
		int menu3Total = menu3Price * menu3Count;
		
		int total = menu1Total + menu2Total + menu3Total;
		int discount = total * rate / 100;
		int result = total - discount;
		
		//출력
		System.out.println("<결제 정보>");
		System.out.println("결제 금액 : " + total + "원");
		System.out.println("할인 금액 : " + discount + "원");
		System.out.println("최종 금액 : " + result + "원");
	}
}




