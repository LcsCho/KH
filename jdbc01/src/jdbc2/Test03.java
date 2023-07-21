package jdbc2;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test03 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("바꿀 번호 입력: ");
		int boardNo = sc.nextInt();
		sc.nextLine();
		System.out.print("바꿀 제목: ");
		String boardTitle = sc.nextLine();
		System.out.print("바꿀 내용: ");
		String boardContent = sc.nextLine();
		System.out.print("바꿀 작성자 이름: ");
		String boardWriter = sc.next();
		sc.close();
		
		String sql = "update board set board_title = ?, board_content = ?, board_writer = ? where board_no = ?";
		Object[] data = {boardTitle, boardContent, boardWriter, boardNo};
		
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName("oracle.jdbc.OracleDriver");
		dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		dataSource.setUsername("c##kh");
		dataSource.setPassword("KH");
		
		JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
		
		int result = jdbcTemplate.update(sql, data);
		System.out.println("result = " + result);
		
		if (result > 0) System.out.println("Success");
		else System.out.println("Fail");
	}
}
