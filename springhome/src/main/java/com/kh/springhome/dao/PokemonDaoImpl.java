package com.kh.springhome.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.kh.springhome.dto.AttachDto;
import com.kh.springhome.dto.PokemonDto;
import com.kh.springhome.mapper.AttachMapper;
import com.kh.springhome.mapper.PokemonMapper;

@Repository
public class PokemonDaoImpl implements PokemonDao {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Autowired
	private PokemonMapper pokemonMapper;

	@Autowired
	private AttachMapper attachMapper;

	@Override
	public int sequence() {
		String sql = "select pokemon_seq.nextval from dual";
		return jdbcTemplate.queryForObject(sql, int.class);
	}

	@Override
	public void insert(PokemonDto pokemonDto) {
		String sql = "insert into pokemon(no, name, type) values(?, ?, ?)";
		Object[] data = { pokemonDto.getNo(), pokemonDto.getName(), pokemonDto.getType() };
		jdbcTemplate.update(sql, data);

	}

	@Override
	public void connect(int pokemonNo, int attachNo) {
		String sql = "insert into pokemon_image values(?, ?)";
		Object[] data = { pokemonNo, attachNo };
		jdbcTemplate.update(sql, data);
	}

	@Override
	public AttachDto findImage(int pokemonNo) {
		String sql = "select * from attach " + "where attach_no = (" + "select attach_no from pokemon_image "
				+ "where pokemon_no = ?" + ")";
		Object[] data = { pokemonNo };
		List<AttachDto> list = jdbcTemplate.query(sql, attachMapper, data);
		return list.isEmpty() ? null : list.get(0);
	}

	@Override
	public PokemonDto selectOne(int no) {
		String sql = "select p.*, pm.attach_no from " + "pokemon p " + "left outer join pokemon_image pm "
				+ "on p.no = pm.pokemon_no " + "where no = ?";
		Object[] data = { no };
		List<PokemonDto> list = jdbcTemplate.query(sql, pokemonMapper, data);
		return list.isEmpty() ? null : list.get(0);
	}

	@Override
	public List<PokemonDto> selectList() {
		String sql = "select p.*, pm.attach_no from " + "pokemon p " + "left outer join pokemon_image pm "
				+ "on p.no = pm.pokemon_no " + "order by p.no asc";
		return jdbcTemplate.query(sql, pokemonMapper);
	}

	@Override
	public boolean delete(int no) {
		String sql = "delete pokemon where no = ?";
		Object[] data = { no };
		return jdbcTemplate.update(sql, data) > 0;
	}

	@Override
		public boolean update(PokemonDto pokemonDto) {
			String sql = "update pokemon set name = ?, type = ? where no = ?";
			Object[] data = {pokemonDto.getName(), pokemonDto.getType(),
					pokemonDto.getNo()
			};
			return jdbcTemplate.update(sql, data) > 0;
		}
}
