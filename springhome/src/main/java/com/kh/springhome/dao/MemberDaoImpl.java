package com.kh.springhome.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.springhome.dto.MemberDto;
import com.kh.springhome.mapper.MemberMapper;

@Repository
public class MemberDaoImpl implements MemberDao{
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private MemberMapper memberMapper;

	@Override
	public void insert(MemberDto memberDto) {
		
	}

}
