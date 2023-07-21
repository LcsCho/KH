package jdbc;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test08 {
	public static void main(String[] args) {
		// 회원 가입 프로그램
		
		// 데이터
		// tip, 오라클에 추가하는 문자열은 null이든 ""이든 모두 null로 추가됨
		Scanner sc = new Scanner(System.in);
        System.out.print("아이디: ");
        String memberId = sc.nextLine();
        System.out.print("비밀번호: ");
        String memberPw = sc.nextLine();
        System.out.print("닉네임: ");
        String memberNickname = sc.nextLine();
        System.out.print("생년월일: ");
        String memberBirth = sc.nextLine();
        System.out.print("이메일: ");
        String memberEmail = sc.nextLine();
        System.out.print("연락처: ");
        String memberContact = sc.nextLine();
        System.out.print("멤버레벨: ");
        String memberLevel = sc.nextLine();
        System.out.print("멤버포인트: ");
        int memberPoint = sc.nextInt();
        sc.close();
   
        String sql = "insert into member(member_id, member_pw, member_nickname, member_birth, "
                + "member_email, member_contact, member_level, member_point) values(?, ?, ?, ?, ?, ?, ?, ?)";
        Object[] data = {memberId, memberPw, memberNickname,
                memberBirth, memberEmail, memberContact,
                memberLevel, memberPoint};

		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("c##kh");
		dataSource.setPassword("KH");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		jdbcTemplate.update(sql, data);
		System.out.println("Success");
	}
}
