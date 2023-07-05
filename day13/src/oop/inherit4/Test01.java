package oop.inherit4;

public class Test01 {
	public static void main(String[] args) {
		Mp3 mp3 = new Mp3();
		mp3.setFilename("mp3");
		mp3.setFilesize(5000L);
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
		
		Hwp hwp = new Hwp();
		hwp.setFilename("hwp");
		hwp.setFilesize(15);
		hwp.setPagesize(15);
		hwp.execute();
		hwp.preview();
		
		Ppt ppt = new Ppt();
		ppt.setFilename("ppt");
		ppt.setFilesize(20);
		ppt.setPagesize(20);
		ppt.execute();
		ppt.slideShow();
		
	}
}
