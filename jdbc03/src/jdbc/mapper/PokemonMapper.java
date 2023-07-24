package jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import jdbc.dto.PokemonDto;

// Mapper 클래스
// = 데이터베이스 조회결과(ResultSet)를
// 어떻게 PokemonDto에 넣어야 하는지 알려주기 위한 클래스
// = Spring에서 제공하는 RowMapper라는 클래스를 상속받아서 구현
// = 테이블 당 1개 이상 필요
public class PokemonMapper implements RowMapper<PokemonDto>{

	// 변환 메서드
	// - ResultSet은 데이터베이스에서 조회된 결과물을 의미
	// - idx는 현재 변환중인 회차를 의미
	@Override
	public PokemonDto mapRow(ResultSet rs, int idx) throws SQLException {
		PokemonDto dto = new PokemonDto();
//		dto.setNo(rs의 no 컬럼에 있는 값);
		dto.setNo(rs.getInt("no"));
//		dto.setName(rs의 name 컬럼에 있는 값);
		dto.setName(rs.getString("name"));
//		dto.setType(rs의 type 컬럼에 있는 값);
		dto.setType(rs.getString("type"));
		
		return dto;
	}
}
