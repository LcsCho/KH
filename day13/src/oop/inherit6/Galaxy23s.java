package oop.inherit6;

// 클래스에 final이 붙으면 이후에 상속이 불가능
public final class Galaxy23s extends Galaxy {
	public Galaxy23s(String number, String color) { super(number, color); }
	// 고유 기능
	public void samsungPay() { System.out.println("갤럭시23s 삼성페이 기능 실행"); }
	
	// 메서드 재정의
	public void call() { System.out.println("갤럭시23s 전화기능 실행"); }
	public void sms() { System.out.println("갤럭시23s 문자 기능 실행"); }
	public void bixby() { System.out.println("갤럭시23s 음성 인식 기능 실행"); }
}
