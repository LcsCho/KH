package com.kh.springhome.dao;

import java.util.List;

import com.kh.springhome.dto.AttachDto;
import com.kh.springhome.dto.PokemonDto;

public interface PokemonDao {
	int sequence();
	void insert(PokemonDto pokemonDto);
	PokemonDto selectOne(int no);
	List<PokemonDto> selectList();
	boolean delete(int no);
	boolean update(PokemonDto pokemonDto);
	
	
	void connect(int pokemonNo, int attachNo);
	AttachDto findImage(int pokemonNo);
}
