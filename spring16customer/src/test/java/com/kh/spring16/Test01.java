package com.kh.spring16;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring16.dto.CustomerDto;

@SpringBootTest
public class Test01 {

	@Autowired
	private SqlSession sqlSession;
	
	@Test
	public void test() {
		sqlSession.insert("customer.insert", CustomerDto.builder()
				.customerId("fdaf1234")
				.customerContact("010-1239-5678")
				.customerJoin("2023-10-10")
				.customerPurchase("2023-10-10")
				.customerMileage(20)
				.customerLevel("일반")
				.build());
	}
}
