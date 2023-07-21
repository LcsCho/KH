package jdbc;

import java.util.Scanner;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test05_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("예금주: ");
		String name = sc.nextLine();
		System.out.print("예금기간(년): ");
		int period = sc.nextInt();
		int count = period * 12 + 1;
		System.out.print("1회 예금액: ");
		int month_pay = sc.nextInt();
		int total_money = 0;
		
		String sql = "insert into account(name, period, count, month_pay, total_money) values(?, ?, ?, ?, ?)";
		Object[] data = { name, period, count, month_pay, total_money };

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
