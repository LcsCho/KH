package jdbc.app;

import jdbc.dao.PokemonDao;
import jdbc.dto.PokemonDto;

public class Test06 {
	public static void main(String[] args) {
		// Pokemon 정보수정
		
		// 데이터 준비 - DTO
		PokemonDto dto = new PokemonDto();
		dto.setNo(3);
		dto.setName("이상해꽃");
		dto.setType("독");
		
		// DB처리
		PokemonDao dao = new PokemonDao();
		boolean result = dao.update(dto);
		
		if (result) System.out.println("변경 완료");
		else System.out.println("존재하지 않는 몬스터 번호");
	}
}
