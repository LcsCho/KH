package jdbc.app;

import java.sql.Date;

import jdbc.dao.ProductDao;
import jdbc.dto.ProductDto;

public class Test05 {
	public static void main(String[] args) {
		ProductDto dto = new ProductDto();
		dto.setName("오징어땅콩");
		dto.setType("과자");
		dto.setPrice(1700);
		dto.setMade(Date.valueOf("2022-01-01"));
		dto.setExpire(Date.valueOf("2023-01-01"));
		
		ProductDao dao = new ProductDao();
		dao.insert(dto);
		
		System.out.println("둥록 완료!");
	}
}
