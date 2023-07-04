package oop.total1;

class TimeCalculator {
    public static Time plus(Time time1, Time time2) {
        int totalSeconds = time1.getSeconds() + time2.getSeconds();
        totalSeconds += (time1.getMinutes() + time2.getMinutes()) * 60;
        totalSeconds += (time1.getHours() + time2.getHours()) * 3600;
        return new Time(totalSeconds);
    }

    public static Time minus(Time time1, Time time2) {
        int totalSeconds = time1.getSeconds() - time2.getSeconds();
        totalSeconds += (time1.getMinutes() - time2.getMinutes()) * 60;
        totalSeconds += (time1.getHours() - time2.getHours()) * 3600;
        return new Time(totalSeconds);
    }
}
