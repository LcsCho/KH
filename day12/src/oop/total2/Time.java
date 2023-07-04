package oop.total2;

public class Time {
	// 필드 - 초
	private long value;

	// 필드에 대한 setter/getter
	public long getValue() {
		return value;
	}

	public void setValue(long value) {
		if (value < 0L) return;
		this.value = value;
	}
	
	// 생성자
	public Time(long hour, long minute, long second) {
		long total = hour * 60 * 60 + minute * 60 + second;
		this.setValue(total);
	}
	public Time(long minute, long second) { 
		long total = 60 * minute + second;
		this.setValue(total);
		}
	public Time(long second) { this.setValue(second); }
}
