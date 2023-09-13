package com.kh.springhome.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.springhome.dto.PokemonDto;
import com.kh.springhome.mapper.PokemonMapper;

@Repository
public class PokemonDaoImpl implements PokemonDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Autowired
	private PokemonMapper pokemonMapper;

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
}
