package com.kh.springhome.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.springhome.dto.AttachDto;
import com.kh.springhome.dto.PokemonDto;
import com.kh.springhome.mapper.AttachMapper;
import com.kh.springhome.mapper.PokemonMapper;

@Repository
public class PokemonDaoImpl implements PokemonDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private PokemonMapper pokemonMapper;
	
	@Autowired
	private AttachMapper attachMapper;

	@Override
	public int sequence() {
		String sql = "select pokemon_seq.nextval from dual";
		return jdbcTemplate.queryForObject(sql, int.class);
	}

	@Override
	public void insert(PokemonDto pokemonDto) {
		String sql = "insert into pokemon(no, name, type) values(?, ?, ?)";
		Object[] data = {
			pokemonDto.getNo(), pokemonDto.getName(),
			pokemonDto.getType()
		};
		jdbcTemplate.update(sql, data);
		
	}

	@Override
	public void connect(int pokemonNo, int attachNo) {
		String sql = "insert into pokemon_image values(?, ?)";
		Object[] data = {pokemonNo, attachNo};
		jdbcTemplate.update(sql, data);
	}
	
	@Override
	public AttachDto findImage(int pokemonNo) {
		String sql = "select * from attach "
					+ "where attach_no = ("
						+ "select attach_no from pokemon_image "
						+ "where pokemon_no = ?"
					+ ");";
		Object[] data = {pokemonNo};
		List<AttachDto> list = jdbcTemplate.query(sql, attachMapper, data);
		return list.isEmpty() ? null : list.get(0);
	}
	
	
}
