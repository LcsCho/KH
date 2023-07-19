/*
	테이블 제약 조건(table constraint)
	- 보관할 데이터의 유효성을 검사하기 위하여 컬럼에 설정하는 조건
	- and라는 키워드로 && 처리를 한다.
	- or이라는 키워드로 || 처리를 한다.
	- not이라는 키워드로 | 처리를 한다.
	- between은 ~이상 ~이하 처리를 한다(구간 설정).
	- 오라클에서 같다는 =이다.
	- in(a, b, c)는 or이다.
	
	조건의 종류
	- check: 추가할 데이터의 형식 검사를 설정(null은 제외)
	- not null: 해당 항목의 null을 허용하지 않겠다는 설정(즉, 필수항목)
	- unique: 특정 항목에 중복을 허용하지 않겠다는 설정
		(여러 항목을 묶어도 가능 - 복합키 설정이라고 부름)
*/

DROP TABLE score;
CREATE TABLE score(
	grade NUMBER not null CHECK(grade >= 1),
	room NUMBER not null CHECK(room >= 1),
	name varchar2(21) not null check(regexp_like(name, '^[가-힣]{2,7}$')),
	kor NUMBER(3) not null CHECK(kor between 0 and 100),
	eng NUMBER(3) not null CHECK(eng between 0 and 100),
	math NUMBER(3) not null CHECK(math between 0 and 100)
);

-- 지정된 형식을 벗어나는 값은 추가되지 않음
insert into score(grade, room, name, kor, eng, math)
values(1, 1, '김김', 50, 2, 100);




-- account 테이블을 삭제하고 조건을 설정하여 다시 생성
drop table account;
create table account(
	account_owner VARCHAR2(21) check(regexp_like(account_owner, '^[가-힣]{2,7}$')),
	account_period NUMBER(2) check (account_period in(1, 2, 3, 5, 10)), 
	account_count NUMBER(3) check(account_count > 0),
	month_pay NUMBER check(month_pay > 0 and mod(month_pay, 10000) = 0),
	total_money NUMBER check(total_money >= 0)
);

insert into account(account_owner, account_period, account_count, month_pay, total_money)
values('강호동', 5, 10, 1000000, 15000000);

SELECT *
FROM account;


-- unique 추가

DROP TABLE score;
CREATE TABLE score(
	grade NUMBER not null CHECK(grade >= 1),
	room NUMBER not null CHECK(room >= 1),
	name varchar2(21) not null check(regexp_like(name, '^[가-힣]{2,7}$')),
	kor NUMBER(3) not null CHECK(kor between 0 and 100),
	eng NUMBER(3) not null CHECK(eng between 0 and 100),
	math NUMBER(3) not null CHECK(math between 0 and 100),
	UNIQUE(grade, room, name)
);

-- 지정된 형식을 벗어나는 값은 추가되지 않음
insert into score(grade, room, name, kor, eng, math)
values(1, 2, '김김', 50, 2, 30);

SELECT *
FROM score;

DROP TABLE board;
CREATE TABLE board(
	board_no NUMBER PRIMARY KEY CHECK(board_no > 0),
	board_title varchar2(300) NOT NULL,
	board_content varchar2(4000) NOT NULL,
	board_writer varchar2(20) CHECK(regexp_like(board_writer, '^[A-Za-z0-9]{8,20}$')),
	board_readcount NUMBER DEFAULT 0 NOT NULL CHECK(board_readcount >= 0)
);

INSERT INTO board(board_no, board_title, board_content, board_writer, board_readcount)
VALUES(1, '안녕', '안녕하세요',NULL, 15);
INSERT INTO board(board_no, board_title, board_content, board_writer, board_readcount)
VALUES(2, '제목', '안녕', 'asdf1234', 15);
INSERT INTO board(board_no, board_title, board_content, board_writer, board_readcount)
VALUES(3, '이름', '하이요',NULL, 15);

-- 등록 시 항목을 제외시키면 null이 들어간다.
-- null이 아니라 다른 값을 초기값으로 넣고 싶다면 default 키워드 사용
INSERT INTO board(board_no, board_title, board_content, board_writer)
VALUES(4, '이름', '하이요',NULL);
SELECT *
FROM board;
DELETE FROM board;
-- 번호의 목적이 '식별'을 위한 값
-- 1. 번호가 변경될 수 있으면 NOT NULL UNIQUE로 본다.
-- 2. 번호가 영원히 변경될 수 없다면 PRIMARY KEY로 본다.

/* 
	결론적으로 사용하는 조건은 앞으로 5가지
	- NOT NULL(null 금지)
	- UNIQUE(중복 금지 조건(null 가능)
	- PRIMARY KEY(중복 금지, null 금지, 불변) -> 테이블 대표항목
	- CHECK(데이터 형식 검사 조건)
	- DEFAULT(미 지정시 자동 설정될 값 조건)
*/


/*
 	날짜 데이터 다루기
 	- date 형태를 사용하며 연/월/일/시/분/초 까지 저장
 	- 날짜만 쓰거나 시간만 써야 되는 경우는 문자열로 하는 경우도 많음
 	- 날짜는 형식이 지정되어 있어 따로 설정할 것이 없음
 */
DROP TABLE emp;
CREATE TABLE emp(
	emp_no NUMBER PRIMARY KEY,
	emp_name varchar2(21) NOT NULL CHECK(regexp_like(emp_name, '^[가-힣]{2,8}$')),
	emp_salary NUMBER NOT NULL CHECK(emp_salary >= 0),
	emp_join DATE DEFAULT sysdate
);
-- 시간은 문자열 처럼도 넣을 수 있다(단, 국가별로 형식이 다름)
INSERT INTO emp(emp_no, emp_name, emp_salary, emp_join)
VALUES(1, '김사장', 100000000, '2001-01-01');
-- 문자열을 변환 명령을 써서 넣을 수도 있다
INSERT INTO emp(emp_no, emp_name, emp_salary, emp_join)
VALUES(2, '최상무', 800000000,  to_date('2001-01-01', 'yyyy-MM-dd'));

-- 현재 시간을 구해서 넣어야 할 때는 sysdate라는 항목을 사용
INSERT INTO emp(emp_no, emp_name, emp_salary, emp_join)
VALUES(3, '박전무', 75000000,  sysdate);

INSERT INTO emp(emp_no, emp_name, emp_salary)
VALUES(4, '이부장', 75000000);

SELECT *
FROM emp;

drop table member;
create table member(
member_id varchar2(25) primary key,
member_pw varchar2(20) not null,
member_nickname varchar2(30) not null,
member_birth char(10) not null unique,
member_email varchar2(100),
member_contact varchar2(11) not null,
member_level varchar2(9) default '일반' not null,
member_point number default 0 not null,
member_join date default sysdate not null,
check(regexp_like(member_id, '^[a-z][a-z0-9]{7,24}$')),
check(
	regexp_like(member_pw, '[A-Z]+') 
	and
	regexp_like(member_pw, '[a-z]+')
	and
	regexp_like(member_pw, '[0-9]+')
	and
	regexp_like(member_pw, '[!@#$]+')
	and
	regexp_like(member_pw, '^[A-Za-z0-9!@#$]{8,20}$')
),
check(regexp_like(member_nickname, '^[A-Za-z0-9가-힣]{2,10}$')),
check(regexp_like(member_birth, '^(19[0-9]{2}|20[0-9]{2})-(((0[13578]|1[02])-(0[1-9]|1[0-9]|2[0-9]|3[01]))|((0[469]|11)-(0[1-9]|1[0-9]|2[0-9]|30))|((02)-(0[1-9]|1[0-9]|2[0-9])))$')),
check(regexp_like(member_contact, '^01[016789][1-9][0-9]{2,3}[0-9]{4}$')),
check(member_level in ('일반', 'VIP', '관리자')),
check(member_point >= 0)
);

insert into member(
	member_id, member_pw, member_nickname, 
	member_birth, member_email, member_contact
)
values(
	'testuser1', 'Testuser1!', '테스트유저1', 
	'2023-07-19', null, '01012345678'
);

SELECT *
FROM MEMBER;

/*
	시퀀스(SEQUENCE)
	- 번호를 발행해주는 기계(도구/객체)
	- 데이터베이스 종류에 따라 시퀀스가 테이블과 합쳐져 있는 경우도 있음(ex: MySQL)
	- 오라클은 전반적으로 시퀀스를 따로 관리하는 것을 권장
	
	create sequence 이름[옵션];
*/

DROP TABLE item;
CREATE TABLE item(
	item_no NUMBER PRIMARY KEY,
	item_name varchar2(60) NOT NULL,
	item_price NUMBER NOT NULL
);

DROP SEQUENCE item_seq;

-- 기본 옵션으로 생성
CREATE SEQUENCE item_seq;

-- 옵션을 지정하여 생성(1001번부터 9999번까지 1씩증가, 캐시없음)
CREATE SEQUENCE item_seq
MINVALUE 1001
MAXVALUE 9999
INCREMENT BY 1
START WITH 1001
nocache;
-- cache 0;
INSERT INTO item(item_no, item_name, item_price)
-- VALUES(1, '컴퓨터', 1000000);
VALUES(item_seq.nextval, '컴퓨터', 1000000);

SELECT *
FROM item;

SELECT * FROM user_sequences;

DROP table customer;
CREATE TABLE customer(
	customer_no NUMBER PRIMARY KEY,
	customer_id varchar2(20) UNIQUE CHECK(regexp_like(customer_id, '^[a-zA-Z0-9]{8,20}$')) NOT NULL,
	customer_tel char(13) UNIQUE CHECK(regexp_like(customer_tel, '^010-[0-9]{4}-[0-9]{4}$')) NOT NULL,
	customer_reg char(10) CHECK(regexp_like(customer_reg, '^(19[0-9]{2}|20[0-9]{2})-(((0[13578]|1[02])-(0[1-9]|1[0-9]|2[0-9]|3[01]))|((0[469]|11)-(0[1-9]|1[0-9]|2[0-9]|30))|((02)-(0[1-9]|1[0-9]|2[0-9])))$')) NOT NULL,
	customer_fin_buy char(10) CHECK(regexp_like(customer_fin_buy, '^(19[0-9]{2}|20[0-9]{2})-(((0[13578]|1[02])-(0[1-9]|1[0-9]|2[0-9]|3[01]))|((0[469]|11)-(0[1-9]|1[0-9]|2[0-9]|30))|((02)-(0[1-9]|1[0-9]|2[0-9])))$')) NOT NULL,
	customer_mileage NUMBER DEFAULT 0 CHECK(customer_mileage >= 0),
	customer_lv varchar2(12) DEFAULT '일반' CHECK(customer_lv IN('일반', 'VIP', 'VVIP', '플래티넘')) NOT NULL
);

DROP SEQUENCE customer_seq;
CREATE SEQUENCE customer_seq;

INSERT INTO customer(customer_no, customer_id, customer_tel, customer_reg, 
customer_fin_buy, customer_mileage, customer_lv)
VALUES(customer_seq.nextval, 'testuser1', '010-1212-3434', '2022-01-01', '2022-03-11', 5500, 'VIP');

INSERT INTO customer(customer_no, customer_id, customer_tel, customer_reg, 
customer_fin_buy, customer_mileage, customer_lv)
VALUES(customer_seq.nextval, 'testuser2', '010-2323-4545', '2020-05-11', '2022-01-30', 7200, 'VVIP');

INSERT INTO customer(customer_no, customer_id, customer_tel, customer_reg, 
customer_fin_buy, customer_mileage, customer_lv)
VALUES(customer_seq.nextval, 'testuser3', '010-3434-5656', '2021-11-26', '2021-12-25', 30000, '플래티넘');

INSERT INTO customer(customer_no, customer_id, customer_tel, customer_reg, 
customer_fin_buy, customer_mileage, customer_lv)
VALUES(customer_seq.nextval, 'testuser4', '010-4545-6767', '2022-02-03', '2022-03-15', 500, '일반');

INSERT INTO customer(customer_no, customer_id, customer_tel, customer_reg, 
customer_fin_buy, customer_mileage, customer_lv)
VALUES(customer_seq.nextval, 'testuser5', '010-5656-7878', '2021-12-31', '2022-01-31', 800, '일반');

SELECT *
FROM CUSTOMER;

SELECT *
FROM user_sequences;

DROP TABLE book;
CREATE TABLE book(
	book_id NUMBER PRIMARY KEY,
	book_title varchar2(300) CHECK(regexp_like(book_title, '^[a-zA-Z0-9가-힣]{1,100}$')) NOT NULL, 
	book_author varchar2(90) CHECK(regexp_like(book_author, '^[^!@#$]*$')),
	book_publication_date char(10) CHECK(regexp_like(book_publication_date, 
	'^(19[0-9]{2}|20[0-9]{2})-(((0[13578]|1[02])-(0[1-9]|1[0-9]|2[0-9]|3[01]))|
((0[469]|11)-(0[1-9]|1[0-9]|2[0-9]|30))|((02)-(0[1-9]|1[0-9]|2[0-9])))$')),
	book_price NUMBER(5, 2) CHECK(book_price >= 0) NOT NULL,
	book_publisher varchar2(90) CHECK(regexp_like(book_publisher, '^[a-zA-Z0-9가-힣]{1,30}$')),
	book_page_count NUMBER CHECK(book_page_count >= 1) NOT NULL,
	book_genre varchar2(12) CHECK(book_genre IN('소설', '동화', '자기개발'))
);

DROP SEQUENCE book_seq;
CREATE SEQUENCE book_seq;

INSERT INTO book(book_id, book_title, book_author, book_publication_date, book_price, book_publisher, book_page_count, book_genre)
VALUES(book_seq.nextval, 'asdf', 'asdfasdf','1998-10-05', 132.45, '미나리', 123, '소설');

SELECT *
FROM book;
