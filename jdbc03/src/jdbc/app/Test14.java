package jdbc.app;

import jdbc.dao.PokemonDao;
import jdbc.dto.PokemonDto;

public class Test14 {
	public static void main(String[] args) {
		// 포켓몬스터 번호를 이용하여 상세조회
		
		// 데이터
		int no = 1;
		
		// 처리
		PokemonDao dao = new PokemonDao();
		PokemonDto dto = dao.selectOne(no);
		
		// 출력
		if (dto == null) System.out.println("없는 번호의 몬스터입니다.");
		else {
			System.out.println(dto.getNo());
			System.out.println(dto.getName());
			System.out.println(dto.getType());
		}
	}
}
