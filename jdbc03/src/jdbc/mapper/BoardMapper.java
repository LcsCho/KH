package jdbc.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import jdbc.dto.BoardDto;

public class BoardMapper implements RowMapper<BoardDto>{

	@Override
	public BoardDto mapRow(ResultSet rs, int idx) throws SQLException {
		BoardDto dto = new BoardDto();
		dto.setBoardNo(rs.getInt("boardNo"));
		dto.setBoardTitle(rs.getString("boardTitle"));
		dto.setBoardContent(rs.getString("boardContent"));
		dto.setBoardWriter(rs.getString("boardWriter"));

		return dto;
	}
}
