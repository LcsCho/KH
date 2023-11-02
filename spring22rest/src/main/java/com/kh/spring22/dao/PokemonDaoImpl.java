package com.kh.spring22.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.kh.spring22.dto.PokemonDto;

@Repository
public class PokemonDaoImpl implements PokemonDao{
	
	@Autowired
	private SqlSession sqlSession;

	@Override
	public List<PokemonDto> selectList() {
		return sqlSession.selectList("pokemon.list");
	}

	
}
