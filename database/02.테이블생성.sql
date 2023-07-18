-- 문제1: 포켓몬 정보
CREATE TABLE pocketmon(
	no number,
	name varchar2(21),
	type varchar2(9)
);
-- 문제2: 월드컵 정보
CREATE TABLE worldcup(
	grade number,
	name varchar2(34),
	nation varchar2(54),
	goal number
);
-- 문제3: 메달리스트 정보
CREATE TABLE medallist(
	name varchar2(66),
	game varchar2(50),
	season varchar2(6),
	gold number,
	silver number,
	bronze number
);
