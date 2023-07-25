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
	
    // 비밀번호 변경 기능
    // 1. 기존 비밀번호와 신규 비밀번호를 입력받아 검사 후 변경(권장하진 않음)
    // 2. 임시 비밀번호 변경하는 기능
    // 3. 아이디에 맞는 계정의 비밀번호를 변경하는 기능
	
	public boolean updateMemberPassword(MemberDto dto) {
		String sql = "update member set member_pw = ? where member_id = ?";
		Object[] data = {dto.getMember_pw(), dto.getMember_id()};
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		int result = jdbcTemplate.update(sql, data);

		return result > 0;
	}
	
	public boolean updateMemberInfo(MemberDto dto) {
		String sql = "update member set member_nickname = ?, member_contact = ?, member_email = ?, "
				+ "member_birth = ? where member_id = ?";
		Object[] data = {dto.getMember_nickname(), dto.getMember_contact(), dto.getMember_email(), 
				dto.getMember_birth(), dto.getMember_id()};
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		int result = jdbcTemplate.update(sql, data);

		return result > 0;
	}
	
	public boolean delete(int member_id) {
		String sql = "delete member where member_id = ?";
		Object[] data = {member_id};
		
		JdbcTemplate jdbcTemplate = JdbcUtils.getJdbcTemplate();
		return jdbcTemplate.update(sql, data) > 0;
	}
}
