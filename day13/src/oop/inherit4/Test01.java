package oop.inherit4;

public class Test01 {
	public static void main(String[] args) {
		Mp3 mp3 = new Mp3();
		mp3.setFilename("mp3");
		mp3.setFilesize(5);
		mp3.setDuration(5);
		mp3.execute();
		mp3.forward();
		mp3.rewind();
		
		Mp4 mp4 = new Mp4();
		mp4.setFilename("mp4");
		mp4.setFilesize(10);
		mp4.setSpeed(10);
		mp4.execute();
		mp4.forward();
		mp4.rewind();
		
		Hwp h = new Hwp();
		h.setFilename("hwp");
		h.setFilesize(15);
		h.setPagesize(15);
		h.execute();
		h.preview();
		
		Ppt p = new Ppt();
		p.setFilename("ppt");
		p.setFilesize(20);
		p.setPagesize(20);
		p.execute();
		p.slideShow();
		
	}
}
