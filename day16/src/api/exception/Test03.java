package api.exception;

import java.util.Scanner;

public class Test03 {
    public static void main(String[] args) {
        // 사용자에게 생년월일을 'YYYY-MM-DD' 형태로 입력받아서 
        // '연도', '월', '일'을 각각 분리한 뒤 숫자로 변환해서 출력

        try {
          Scanner sc = new Scanner(System.in);

          System.out.print("생년월일 입력(YYYY-MM-DD): ");
          String birth = sc.next();
          sc.close();

          if (birth.length() != 10) {
              throw new IllegalArgumentException("형식(YYYY-MM-DD)에 맞게 입력해주세요.");
          }
            
          int year = Integer.parseInt(birth.substring(0, 4));
          int month = Integer.parseInt(birth.substring(5, 7));
          int day = Integer.parseInt(birth.substring(8, 10));

          System.out.println("출생년도: " + year + "년");
          System.out.println("출생월: " + month + "월");
          System.out.println("출생일: " + day + "일");

        } catch (NumberFormatException e) { // 플랜 B - 숫자 변환이 안될 때
            System.err.println("올바른 숫자(자연수)를 입력해주세요.");
        } catch (StringIndexOutOfBoundsException e) { // 플랜 B - 입력 길이가 짧을 때
            System.err.println("입력값이 형식보다 짧습니다.");
        } catch (IllegalArgumentException e) {
            System.err.println("형식(YYYY-MM-DD)에 맞게 입력해주세요.");
        }
    }
}
