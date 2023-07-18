-- 문제1: 포켓몬 정보
DROP TABLE pokemon;
CREATE TABLE pokemon(
	no number,
	name varchar2(21),
	type varchar2(9)
);
-- 문제2: 월드컵 정보
DROP TABLE worldcup;
CREATE TABLE worldcup(
   grade number,
   name varchar2(34),
   nation varchar2(54),
   goal number
);
-- 문제3: 메달리스트 정보
DROP TABLE medalist;
CREATE TABLE medalist(
   name varchar2(66),
   game varchar2(50),
   season varchar2(6),
   gold number,
   silver number,
   bronze number
);
-- 문제4: 요금제 정보
-- 통신사가 무조건 2자리라면 고정문자열 처리
-- (장점) 빠른 처리 속도
-- (단점) 글자자 수가 다를 수 없음
CREATE TABLE plan (
	telecom VARCHAR2(5),
	name VARCHAR2(20),
	price NUMBER,
	data NUMBER,
	call NUMBER,
	msg NUMBER
);
DROP TABLE plan;
-- 문제5: 메뉴 정보 테이블
-- (참고) 테이블 자료형에는 논리가 없다.
-- Y/N으로 처리하거나 1/0으로 처리
CREATE TABLE menu (
	name VARCHAR2(60),
	TYPE VARCHAR2(9),
	price NUMBER,
	event CHAR(1)
);
