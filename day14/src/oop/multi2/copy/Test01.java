package oop.multi2.copy;

public class Test01 {
	public static void main(String[] args) {
		Drone d = new Drone();
		Airplane a = new Airplane();
		Train t = new Train();
		Bus b = new Bus();
		Kickboard k = new Kickboard();
		
		System.out.println("<드론>");
		d.on();
		d.off();
		d.move();
		d.fly();
		System.out.println();
		
		System.out.println("<비행기>");
		a.move();
		a.fly();
		a.reserve();
		System.out.println();
		
		System.out.println("<기차>");
		t.move();
		t.reserve();
		System.out.println();
		
		System.out.println("<버스>");
		b.move();
		System.out.println();
		
		System.out.println("<전동킥보드>");
		k.on();
		k.off();
		k.move();
		System.out.println();
	}
}
