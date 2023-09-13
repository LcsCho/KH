package com.kh.springhome.dao;

import com.kh.springhome.dto.PokemonDto;

public interface PokemonDao {
	int sequence();
	void insert(PokemonDto pokemonDto);
	void connect(int pokemonNo, int attachNo);
}
