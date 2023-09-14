package com.kh.springhome.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.kh.springhome.dto.PokemonDto;

@Component
public class PokemonMapper implements RowMapper<PokemonDto>{

	@Override
	public PokemonDto mapRow(ResultSet rs, int rowNum) throws SQLException {
		PokemonDto dto = new PokemonDto();
		dto.setNo(rs.getInt("no"));
		dto.setName(rs.getNString("name"));
		dto.setType(rs.getString("type"));
		// dto.setImage(rs.getInt("attach_no") > 0); // int일 때는 0이냐 아니냐로 구분
		dto.setImage(rs.getObject("attach_no") != null);
		return dto;
	}
}
