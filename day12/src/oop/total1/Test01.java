package oop.total1;

public class Test01 {
    public static void main(String[] args) {
        Time time1 = new Time(3, 30, 40);
        Time time2 = new Time(1, 10, 100);
        Time time3 = new Time(50, 20);
        Time time4 = new Time(30000);
        
        System.out.println("<시간 정보>");
        time1.show();
        time2.show();
        time3.show();
        time4.show();

        Time result1 = TimeCalculator.minus(time1, new Time(1, 50, 30));
        System.out.println("\n<시간의 뺄셈 결과>");
        result1.show();

        Time result2 = TimeCalculator.minus(new Time(4000), new Time(1, 10, 0));
        result2.show();
    }
}
