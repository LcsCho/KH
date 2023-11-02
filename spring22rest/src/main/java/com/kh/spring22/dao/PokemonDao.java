package com.kh.spring22.dao;

import java.util.List;

import com.kh.spring22.dto.PokemonDto;

public interface PokemonDao {

	List<PokemonDto> selectList();
}
