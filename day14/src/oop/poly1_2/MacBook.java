package oop.poly1_2;

public class MacBook extends Laptop{
	@Override
	public void power() { System.out.println("맥북 전원 기능 테스트"); }
	
	@Override
	public void video() { System.out.println("맥북 영상재생 기능 테스트"); }

	@Override
	public void typing() { System.out.println("맥북 타이핑 기능 테스트"); }
}
