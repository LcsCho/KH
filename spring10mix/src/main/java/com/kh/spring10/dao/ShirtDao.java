package com.kh.spring10.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.spring10.dto.PokemonDto;
import com.kh.spring10.dto.ShirtDto;
import com.kh.spring10.mapper.ShirtMapper;

@Repository
public class ShirtDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private ShirtMapper mapper;
	
	public void add(ShirtDto dto) {
		String sql = "insert into shirt(shirt_no, shirt_name, shirt_color,"
				+ "shirt_price, shirt_kind, shirt_type, shirt_material, shirt_stock)"
				+ "values(shirt_seq.nextval, ?, ?, ?, ?, ?, ?, ?)";
		Object[] data = {
				dto.getShirtName(), dto.getShirtColor(), dto.getShirtPrice(), dto.getShirtKind(),
				dto.getShirtType(), dto.getShirtMaterial(), dto.getShirtStock()
		};
		jdbcTemplate.update(sql, data);
	}
	
	public int sequence() {
	    String sql = "select shirt_seq.nextval from dual";
	    return jdbcTemplate.queryForObject(sql, int.class);
	}
	
	public List<ShirtDto> selectList() {
		String sql = "select * from shirt order by shirt_no";
		return jdbcTemplate.query(sql, mapper);
	}
	
	public ShirtDto selectOne(int shirtNo) {
		String sql = "select * from shirt where shirt_no = ?";
		Object[] data = {shirtNo};
		List<ShirtDto> list = jdbcTemplate.query(sql, mapper, data);
		return list.isEmpty() ? null : list.get(0);
	}
	
	public boolean edit(ShirtDto dto) {
		String sql = "update shirt set shirt_name = ?, shirt_color = ?,"
				+ "shirt_price = ?, shirt_kind = ?, shirt_type = ?, shirt_material = ?,"
				+ "shirt_stock = ?"
				+ " where shirt_no = ?";
		Object[] data = {dto.getShirtName(), dto.getShirtColor(), dto.getShirtPrice(),
				dto.getShirtKind(), dto.getShirtType(), dto.getShirtMaterial(),
				dto.getShirtStock(), dto.getShirtNo()};
		return jdbcTemplate.update(sql, data) > 0;
	}

	public boolean delete(int shirtNo) {
		String sql = "delete shirt where shirt_no = ?";
		Object[] data = {shirtNo};
		return jdbcTemplate.update(sql, data) > 0;
	}
}
