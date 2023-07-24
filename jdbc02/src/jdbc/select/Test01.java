package jdbc.select;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.PokemonDto;
import jdbc.mapper.PokemonMapper;
import jdbc.util.JdbcUtils;

public class Test01 {
	public static void main(String[] args) {
		// JDBC 조회(select)
		// - 두 가지 준비물이 필요하다
		// - 첫 번째는 조회 결과 중 한 줄을 담을 객체(DTO)
		// - 두 번째는 조회 결과를 DTO에 옮겨담는 방법을 가진 객체(Mapper)
		
		
		String sql = "select * from pokemon order by no asc";
//		Object[] data = {};
		
		PokemonMapper mapper = new PokemonMapper();
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		
		List<PokemonDto> list = jdbcTemplate.query(sql,  mapper);
		
		System.out.println("조회 결과: " + list.size());
		for (PokemonDto dto : list) System.out.println(dto);
		
	}
}
