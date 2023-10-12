package com.kh.spring14;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring14.dto.PokemonDto;

@SpringBootTest
public class Test03 {

   @Autowired
   private SqlSession sqlSession;
   
   @Test
   public void test() {
      //주의사항 - mybatis 구문을 호출할 때는 구문 옆에 단 한개의 데이터만 전달할 수 있다.(아래꺼에 데이터 = dto)
      PokemonDto dto = new PokemonDto();
      dto.setName("테스트");
      dto.setType("테스트");
      sqlSession.insert("pokemon.add",dto);
   }
}