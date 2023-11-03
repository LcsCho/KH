package com.kh.spring22.dao;

import java.util.List;

import com.kh.spring22.dto.PokemonDto;

public interface PokemonDao {

	List<PokemonDto> selectList();
	void insert(PokemonDto pokemonDto);
	boolean delete(int no);
	PokemonDto selectOne(int no);
	boolean edit(int no, PokemonDto pokemonDto);
	boolean editUnit(int no, PokemonDto pokemonDto);
}
