package jdbc2;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("바꿀 번호 입력: ");
		int bookId = sc.nextInt();
		sc.nextLine();
		System.out.print("바꿀 이름: ");
		String bookTitle = sc.nextLine();
		System.out.print("바꿀 가격: ");
		double bookPrice = sc.nextDouble();
		sc.close();
		
		String sql = "update book set book_title = ?, book_price = ? where book_id = ?";
		Object[] data = {bookTitle, bookPrice, bookId};
		
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
