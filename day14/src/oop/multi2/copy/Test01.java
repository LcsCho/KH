package oop.multi2.copy;

public class Test01 {
	public static void main(String[] args) {
		Drone d = new Drone();
		Airplane a = new Airplane();
		Train t = new Train();
		Bus b = new Bus();
		Kickboard k = new Kickboard();
		
		d.on();
		d.off();
		d.move();
		d.fly();
		
		a.move();
		a.fly();
		a.reserve();
		
		t.move();
		t.reserve();
		
		b.move();
		
		k.on();
		k.off();
		k.move();	
	}
}
