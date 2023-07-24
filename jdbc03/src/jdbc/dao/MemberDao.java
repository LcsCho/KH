package jdbc.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import jdbc.dto.MemberDto;
import jdbc.util.JdbcUtils;

public class MemberDao {

	public void insert(MemberDto dto) {
		String sql = "insert into member(member_id, member_pw, member_nickname, "
				+ "member_birth, member_email, member_contact, member_level, "
				+ "member_point, member_join)"
				+ "values(?, ?, ?, ?, ?, ?, ?, ?, sysdate)";
				
				
		Object[] data = {dto.getMember_id(), dto.getMember_pw(), dto.getMember_nickname(), dto.getMember_birth(),
				dto.getMember_email(), dto.getMember_contact(), dto.getMember_level(),
				dto.getMember_point()};
			
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		jdbcTemplate.update(sql, data);
	}
}
