package com.kh.spring14;

import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kh.spring14.dto.PokemonDto;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@SpringBootTest
public class Test04 {

   @Autowired
   private SqlSession sqlSession;
   
   @Test
   public void test() {
      PokemonDto dto = new PokemonDto();
      dto.setNo(1);
      dto.setName("바꿀이름");
      dto.setType("바꿈");
      
      int count = sqlSession.update("pokemon.edit", dto);
      boolean result = count >0;
      log.debug("result={}", result);
   }
}