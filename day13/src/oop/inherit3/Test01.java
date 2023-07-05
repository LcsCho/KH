package oop.inherit3;

public class Test01 {
	public static void main(String[] args) {
		Chrome c = new Chrome();		
		c.url();
		c.refresh();
		c.move();
		c.develop();
		c.chromeStore();
		
		Edge e = new Edge();
		e.url();
		e.refresh();
		e.move();
		e.fullScreen();
		
		Whale w = new Whale();
		w.url();
		w.refresh();
		w.move();
		w.papago();
		w.naverSearch();
	}
}
