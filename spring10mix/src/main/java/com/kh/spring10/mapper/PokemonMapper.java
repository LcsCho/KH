package com.kh.spring10.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.kh.spring10.dto.PokemonDto;

@Component // 컨트롤러도 아니고 리파지토리도 아닌 애매한 것들
public class PokemonMapper implements RowMapper<PokemonDto>{

	@Override
	public PokemonDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		PokemonDto dto = new PokemonDto();
		dto.setNo(rs.getInt("no"));
		dto.setName(rs.getNString("name"));
		dto.setType(rs.getString("type"));
		return dto;
	}
}
