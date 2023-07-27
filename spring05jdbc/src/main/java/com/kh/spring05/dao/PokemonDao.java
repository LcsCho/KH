package com.kh.spring05.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring05.dto.PokemonDto;
import com.kh.spring05.mapper.PokemonMapper;

// DAO 클래스
// = Spring에 등록해야됨
// = JdbcTemplate을 주세요 해야됨(DI, 의존성 주입)
// = @Repository로 등록 (영원히 변하지 않는 것을 다루는 객체, 영속성 제어 객체)
@Repository
public class PokemonDao {
	@Autowired // (주의) 등록을 하지 않으면 절대로 주지 않음
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private PokemonMapper mapper;
	
	public void insert(PokemonDto dto) {
		String sql = "insert into pokemon(no, name, type)"
				+ "values(?, ?, ?)";
		Object[] data = {
				dto.getNo(), dto.getName(), dto.getType()
		};
		jdbcTemplate.update(sql, data);
	}
	
	public boolean update(PokemonDto dto) {
		String sql = "update pokemon set name = ?, type = ?"
				+ " where no = ?";
		Object[] data = {dto.getName(), dto.getType(), dto.getNo()};
		return jdbcTemplate.update(sql, data) > 0;
	}

	public boolean delete(int no) {
		String sql = "delete pokemon where no = ?";
		Object[] data = {no};
		return jdbcTemplate.update(sql, data) > 0;
	}
	
	public List<PokemonDto> selectList() {
		String sql = "select * from pokemon order by no asc";
		return jdbcTemplate.query(sql, mapper);
		
	}
	
	public PokemonDto selectOne(int no) {
		String sql = "select * from pokemon where no = ?";
		Object[] data = {no};
		List<PokemonDto> list = jdbcTemplate.query(sql, mapper, data);
		return list.isEmpty() ? null : list.get(0);
	}
}
