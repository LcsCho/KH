package api.lang.string2;

public class Test05_1 {
    public static void main(String[] args) {
        String birthDate = "1998-06-22";

        String[] dateParts = birthDate.split("-");
        int year = Integer.parseInt(dateParts[0]);

        boolean isLeapYear = false;
        if (year % 4 == 0) {
            if (year % 100 != 0 || year % 400 == 0) {
                isLeapYear = true;
            }
        }

        String regex;
        if (isLeapYear) {
            regex = "^(19|20)[0-9]{2}-(0[13578]-(0[1-9]|2[0-9]|3[01])|1[02]-(0[1-9]|2[0-9]|3[01])|02-(0[1-9]|1[0-9]|2[0-9])|0[469]-(0[1-9]|2[0-9]|30)|11-(0[1-9]|2[0-9]|30))$";
        } else {
            regex = "^(19|20)[0-9]{2}-(0[13578]-(0[1-9]|2[0-9]|3[01])|1[02]-(0[1-9]|2[0-9]|3[01])|02-(0[1-9]|1[0-9]|2[0-8])|0[469]-(0[1-9]|2[0-9]|30)|11-(0[1-9]|2[0-9]|30))$";
        }

        boolean isValue = birthDate.matches(regex);
        if (isValue) {
            System.out.println("생년월일을 정상적으로 입력함");
            if (isLeapYear) {
                System.out.println("윤년입니다.");
            } else {
                System.out.println("평년입니다.");
            }
        } else {
            System.out.println("생년월일을 비정상적으로 입력함");
        }
    }
}



