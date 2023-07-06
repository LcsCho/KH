package oop.multi2.copy;

public class Train implements Transportation, Reserve{

	@Override
	public void reserve() {
		System.out.println("비행기를 예약합니다.");
		
	}

	@Override
	public void move() {
		System.out.println("비행기가 이동합니다.");
		
	}



}
