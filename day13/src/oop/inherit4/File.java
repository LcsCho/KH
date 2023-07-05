package oop.inherit4;

public class File {
	private String filename;
	private int filesize;
	public String getFilename() {
		return filename;
	}
	public void setFilename(String name) {
		this.filename = filename;
	}
	public int getFilesize() {
		return filesize;
	}
	public void setFilesize(int size) {
		this.filesize = filesize;
	}
	public void execute() {
		System.out.println("실행");
	}
}
