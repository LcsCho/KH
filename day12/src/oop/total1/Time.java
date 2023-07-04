package oop.total1;

class Time {
    private int seconds;

    public Time(int hours, int minutes, int seconds) { this.seconds = hours * 3600 + minutes * 60 + seconds; }
    public Time(int minutes, int seconds) { this.seconds = minutes * 60 + seconds; }
    public Time(int seconds) { this.seconds = seconds; }
    public int getHours() { return seconds / 3600; }
    public int getMinutes() { return (seconds % 3600) / 60; }
    public int getSeconds() { return seconds % 60; }
    public void show() { System.out.println(getHours() + "시간 " + getMinutes() + "분 " + getSeconds() + "초"); }
}
