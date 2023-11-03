package com.kh.spring22.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

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

	@Override
	public void insert(PokemonDto pokemonDto) {
		sqlSession.insert("pokemon.save", pokemonDto);
	}
	
	@Override
	public boolean delete(int no) {
		return sqlSession.delete("pokemon.remove", no) > 0;
	}
	
	@Override
	public PokemonDto selectOne(int no) {
		return sqlSession.selectOne("pokemon.find", no);
	}
	
	@Override
	public boolean edit(int no, PokemonDto pokemonDto) {
		Map<String, Object> params = new HashMap<>();
		params.put("no", no);
		params.put("dto", pokemonDto);
		return sqlSession.update("pokemon.edit", params) > 0;
	}
	
	@Override
	public boolean editUnit(int no, PokemonDto pokemonDto) {
		Map<String, Object> params = new HashMap<>();
		params.put("no", no);
		params.put("dto", pokemonDto);
		return sqlSession.update("pokemon.editUnit", params) > 0;
	}
}
