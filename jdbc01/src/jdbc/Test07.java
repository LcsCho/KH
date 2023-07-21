package jdbc;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int boardNo = 2;
		String boardTitle = "안녕";
		String boardContent = "안녕하세요";
		String boardWriter = "asdf1234";
		int boardReadcount = 123;
		
		String sql = "INSERT INTO board(board_no, board_title, board_content, board_writer, board_readcount)"
				+ "values(?, ?, ?, ?, ?)";
		Object[] data = {boardNo, boardTitle, boardContent,
				boardWriter, boardReadcount};

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
