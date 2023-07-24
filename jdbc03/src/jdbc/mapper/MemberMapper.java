package jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import jdbc.dto.MemberDto;

public class MemberMapper implements RowMapper<MemberDto>{

	@Override
	public MemberDto mapRow(ResultSet rs, int idx) throws SQLException {
		MemberDto dto = new MemberDto();
		dto.setMember_id(rs.getString("member_id"));
		dto.setMember_pw(rs.getString("member_pw"));
		dto.setMember_nickname(rs.getString("member_nickname"));
		dto.setMember_birth(rs.getString("member_birth"));
		dto.setMember_email(rs.getString("member_email"));
		dto.setMember_contact(rs.getString("member_contact"));
		dto.setMember_level(rs.getString("member_level"));
		dto.setMember_point(rs.getInt("member_point"));
		return dto;
	}


}
