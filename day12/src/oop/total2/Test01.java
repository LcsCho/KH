package oop.total2;

public class Test01 {
	public static void main(String[] args) {
		Time t1 = new Time(3, 20, 20);
		t1.show();
		
		Time t2 = new Time(40000);
		t2.show();
		
		Time t3 = new Time(t1.getValue() + t2.getValue());
		t3.show();
	}
}
