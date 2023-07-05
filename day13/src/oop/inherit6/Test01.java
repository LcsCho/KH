package oop.inherit6;

public class Test01 {
	public static void main(String[] args) {
		Galaxy23s s23 = new Galaxy23s("010-1234-5678", "크림");
		s23.show();
		s23.call();
		s23.sms();
		s23.samsungPay();
		s23.bixby();
		
		System.out.println();
		GalaxyFold4 fold4 = new GalaxyFold4("02-1234-5678", "실버");
		fold4.show();
		fold4.call();
		fold4.sms();
		fold4.samsungPay();
		fold4.iris();
		
		System.out.println();
		IPhone13 phone13 = new IPhone13("070-9999-8888", "블루");
		phone13.show();
		phone13.call();
		phone13.sms();
		phone13.itunes();
		phone13.siri();
		
		System.out.println();
		IPhone14 phone14 = new IPhone14("010-9999-8888", "다라이 레드");
		phone14.show();
		phone14.call();
		phone14.sms();
		phone14.facetime();
		phone14.siri();
		
	}
}
