package jdbc;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Test05 {
	public static void main(String[] args) {
		String name = "김수박";
		int period = 3;
		int count = 15;
		int month_pay = 100000;
		int total_money = 10000000;
		
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
