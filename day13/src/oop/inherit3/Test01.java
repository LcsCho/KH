package oop.inherit3;

public class Test01 {
	public static void main(String[] args) {
		Chrome c = new Chrome();
		Edge e = new Edge();
		Whale w = new Whale();
		
		c.url();
		c.refresh();
		c.move();
		c.develop();
		c.chromeStore();
		
		e.url();
		e.refresh();
		e.move();
		e.fullScreen();
		
		w.url();
		w.refresh();
		w.move();
		w.papago();
		w.naverSearch();
	}
}
