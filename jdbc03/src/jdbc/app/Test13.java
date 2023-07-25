package jdbc.app;

import java.util.List;

import jdbc.dao.PokemonDao;
import jdbc.dto.PokemonDto;

public class Test13 {
	public static void main(String[] args) {
		// 저장된 포켓몬스터를 모두 불러오겠다.
		
		PokemonDao dao = new PokemonDao();
		List<PokemonDto> list = dao.selectList();
		
		// list를 활용해서 하고 싶은 작업을 하면 된다.
		System.out.println("조회 결과 수: " + list.size());
		for(PokemonDto dto : list) System.out.println(dto);
	}
}
