package com.kh.spring10.dto;

import lombok.Data;

// POJO 클래스
// = Plain Old Java Object
// = Spring에 등록하지 않아도 됨
// @Setter @Getter @NoArgsConstructor @ToString
@Data // @Setter + @Getter + @ToString + @EqualsAndHashCode
public class PokemonDto {
	private int no;
	private String name;
	private String type;
}
