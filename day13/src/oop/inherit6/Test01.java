package oop.inherit6;

public class Test01 {
	public static void main(String[] args) {
		Galaxy23s s23 = new Galaxy23s();
		s23.setNumber("010-1234-5678");
		s23.setColor("크림");
		s23.show();
		s23.call();
		s23.sms();
		s23.samsungPay();
		s23.bixby();
		
		System.out.println();
		GalaxyFold4 fold4 = new GalaxyFold4();
		fold4.setNumber("02-1234-5678");
		fold4.setColor("실버");
		fold4.show();
		fold4.call();
		fold4.sms();
		fold4.samsungPay();
		fold4.bixby();
		
		System.out.println();
		IPhone13 phone13 = new IPhone13();
		phone13.setNumber("070-9999-8888");
		phone13.setColor("블루");
		phone13.show();
		phone13.call();
		phone13.sms();
		phone13.itunes();
		phone13.siri();
		
		System.out.println();
		IPhone14 phone14 = new IPhone14();
		phone14.setNumber("010-9999-8888");
		phone14.setColor("다라이 레드");
		phone14.show();
		phone14.call();
		phone14.sms();
		phone14.itunes();
		phone14.siri();
		
	}
}
