/*
	조회(SELECT)
	- 테이블의 
	

*/


-- 샘플 데이터
DROP TABLE product;
create table product(
	no number primary key,
	name varchar2(30) not null,
	type varchar2(15) check(type in ('과자','아이스크림','주류','사탕')),
	price number,
	made date,
	expire date
);

insert into product values(1, '스크류바', '아이스크림', 1200, TO_DATE('2020-05-01', 'YYYY-MM-DD'), TO_DATE('2020-10-01', 'YYYY-MM-DD'));
insert into product values(2, '마이쮸', '사탕', 900, TO_DATE('2020-01-01', 'YYYY-MM-DD'), TO_DATE('2021-01-01', 'YYYY-MM-DD'));
insert into product values(3, '초코파이', '과자', 3000, TO_DATE('2020-01-01', 'YYYY-MM-DD'), TO_DATE('2021-01-01', 'YYYY-MM-DD'));
insert into product values(4, '맛동산', '과자', 2200, TO_DATE('2020-02-01', 'YYYY-MM-DD'), TO_DATE('2020-10-20', 'YYYY-MM-DD'));
insert into product values(5, '참이슬', '주류', 1000, TO_DATE('2020-01-05', 'YYYY-MM-DD'), TO_DATE('2020-04-05', 'YYYY-MM-DD'));
insert into product values(6, '처음처럼', '주류', 1000, TO_DATE('2020-03-15', 'YYYY-MM-DD'), TO_DATE('2020-08-15', 'YYYY-MM-DD'));
insert into product values(7, '바나나킥', '과자', 1500, TO_DATE('2020-05-03', 'YYYY-MM-DD'), TO_DATE('2020-06-03', 'YYYY-MM-DD'));
insert into product values(8, '빠삐코', '아이스크림', 1000, TO_DATE('2019-12-01', 'YYYY-MM-DD'), TO_DATE('2020-06-01', 'YYYY-MM-DD'));
insert into product values(9, '멘토스', '사탕', 1200, TO_DATE('2020-03-20', 'YYYY-MM-DD'), TO_DATE('2020-12-31', 'YYYY-MM-DD'));
insert into product values(10, '오레오', '과자', 2100, TO_DATE('2019-06-01', 'YYYY-MM-DD'), TO_DATE('2020-06-01', 'YYYY-MM-DD'));

commit;

-- 기본 조회
SELECT *
FROM product;

-- 이름만 조회
SELECT NAME 
FROM product;

-- 이름과 가격만 조회
SELECT name, price FROM product;

-- 없는 항목은 조회 불가능!

-- 항목은 계산해서 조회할 수 있다.
-- 날짜 계산 시 기본 처리 단위는 일이다.
SELECT name, expire - made + 1
FROM product;

-- 조회한 항목에 표시된 이름을 지정할 수 있다(별칭 설정)
-- 쌍따옴표가 있으면 별칭에 띄어쓰기가 가능
SELECT name "이름", expire - made + 1 "유통기한"
FROM product;



-- 조건(where)

-- 2000원 이상인 상품 정보 조회
SELECT *
FROM product
WHERE price >= 2000;

-- 1000원 이상 2000원 이하인 상품 정보 조회
SELECT *
FROM product
WHERE price BETWEEN 1000 AND 2000;

-- 오라클에서는 같다가 =로 표현된다.
SELECT *
FROM product
WHERE price = 1000; 

SELECT *
FROM product
WHERE price != 1000; 

--SELECT *
--FROM product
--WHERE price <> 1000;

-- 문자열 조건
-- 시작검색만큼은 반드시 like를 써야할 정도로 압도적인 차이가 발생
-- 나머지 성능은 전체적으로 instr이 우수하다.
SELECT *
FROM product
WHERE name = '스크류바';

SELECT *
FROM product
WHERE name like '스크%';

SELECT *
FROM product
WHERE instr(name,'스크') = 1;

SELECT *
FROM product
WHERE instr(name,'스크') = 1;

SELECT *
FROM product
WHERE name LIKE '%이%';

SELECT *
FROM product
WHERE instr(name,'이') > 0;

SELECT *
FROM product
WHERE instr(name,'이') = 1;

SELECT *
FROM product
WHERE name LIKE '오%오';

-- 연습문제 --
SELECT *
FROM product
WHERE TYPE IN('과자', '아이스크림');

SELECT *
FROM product
WHERE instr(name, '초코') > 0;

SELECT *
FROM product
WHERE name LIKE '%초코%';

SELECT *
FROM product
WHERE name LIKE '바나나%';

SELECT *
FROM product
WHERE instr(name, '바나나') = 1;

SELECT *
FROM product
WHERE name NOT LIKE '%이%';

SELECT *
FROM product
WHERE instr(name, '이') = 0;

SELECT *
FROM product
WHERE price >= 1000 AND TYPE = '과자';


-- 날짜 조건 -- 
-- 기본 형식은 yyyy-mm-dd hh24:mi:ss
-- 문자열로 간주하고 조회할 수 있다.
-- 문자열로 간주하고 조회할 수 있다.(운영체제에 따라 작동여부 결정)
-- 문자열로 변환하고 싶다면 to_char()사용
-- 날짜 추출용 함수인 extract()를 사용하여 원하는 항목을 추출

-- 2020년에 제조된 상품 조회
--SELECT *
--FROM product
--WHERE made LIKE '2020%';

SELECT *
FROM product
WHERE to_char(made, 'yyyy') = '2020';

SELECT *
FROM product
WHERE EXTRACT(YEAR FROM made) = 2020;

SELECT *
FROM product
WHERE made BETWEEN to_date('2020-01-01 00:00:00', 'yyyy-MM-dd hh24:mi:ss') 
AND to_date('2020-12-31 23:59:59', 'yyyy-MM-dd hh24:mi:ss');

-- 문제
SELECT *
FROM product
WHERE EXTRACT(MONTH FROM made) IN(6, 7, 8);

SELECT *
FROM product
WHERE made BETWEEN to_date('2019-07-01', 'yyyy-mm-dd') AND to_date('2019-12-31', 'yyyy-mm-dd');

SELECT *
FROM product
WHERE made BETWEEN to_date('2020-01-01', 'yyyy-mm-dd') AND SYSDATE;

SELECT *
FROM product
WHERE made BETWEEN sysdate - 365 AND SYSDATE;

SELECT *
FROM product
where made between to_date(to_char(sysdate-365,'yyyy-mm-dd')||' '||'00:00:00','yyyy-mm-dd hh24:mi.ss') 
AND to_date(to_char(sysdate,'yy-mm-dd')||' '||'23:59:59','yyyy-mm-dd hh24:mi.ss');

------- 정렬
-- 모든 조회가 끝나고 나온 결과를 원하는 목적에 따라 재배열
-- asc(ascending) 오름차순, desc(descending) 내림차순

---- 문제
-- 최근에 제조된 상품부터 출력
SELECT *
FROM product
ORDER BY made DESC;
-- 폐기일이 오래된 상품부터 출력
SELECT *
FROM product
ORDER BY expire ASC;
-- 이름순으로 출력
SELECT *
FROM product
ORDER BY name;
-- 상품을 종류별로 가격이 비싼 순으로 출력
SELECT *
FROM product
ORDER BY type, no DESC;
-- 유통기한이 가장 짧은 상품부터 출력
SELECT NO, name, TYPE, price, made, expire, expire - made + 1 유통기한
FROM product
ORDER BY expire - made + 1 ASC;

SELECT p.*, expire - made + 1 유통기한
FROM PRODUCT P 
ORDER BY 유통기한 ASC, NO ASC;

-- 수정 UPDATE --
-- 이미 존재하는 데이터의 값을 바꾸는 작업
-- 개인정보 변경, 조회수 증가, 구독/해지, 좋아요, 게시글수정, ...

-- update 테이블 이름 set 변경내용[조건];


-- 모든 상품의 가격을 0으로 변경
UPDATE product SET price = 0;

ROLLBACK;
SELECT *
FROM product;

COMMIT;

UPDATE product
SET price = 0
WHERE TYPE = '과자';

UPDATE product
SET price = 0
WHERE TYPE = '과자';

UPDATE product
SET price = 0, name = '증정품'
WHERE TYPE = '과자';

-- 문제 --
-- 1번 상품의 가격을 1500원으로 변경
UPDATE product
SET price = 1500
WHERE NO = 1;

-- 스크류바의 가격을 2000원으로 변경
UPDATE product
SET price = 2000
WHERE name = '스크류바';

-- 멘토스의 가격을 1000원으로 변경하고 분류를 과자로 변경
UPDATE product
SET price = 1000, TYPE = '과자'
WHERE name = '멘토스';

-- 과자의 가격을 500원 할인
UPDATE product
SET price = price - 500
WHERE TYPE = '과자';

-- 아이스크림의 가격을 10% 인상
UPDATE product
SET price = (price * 1.1);
WHERE TYPE = '아이스크림';

ROLLBACK;
COMMIT;

SELECT *
FROM product;

-- 삭제 -- 

-- 데이터베이스에 저장된 값을 영구적으로 제거하는 것
-- commit/rollback의 영향을 받음

-- delete [from] 테이블 이름 [조건];

-- 전부다 삭제(비추천)
DELETE product;


-- 문제 
ROLLBACK;

-- 1번 상품 정보 삭제
DELETE product
WHERE NO = 1;

-- 과자와 아이스크림 상품 정보 삭제
DELETE product
WHERE TYPE IN('과자', '아이스크림');

-- 2020년 상반기에 생산한 상품 정보 삭제
DELETE FROM product
WHERE made BETWEEN to_date('2020-01-01', 'yyyy-MM-dd') AND to_date('2020-06-30', 'yyyy-MM-dd');

SELECT *
FROM product;

-- 함수(function)  <--->  메서드(method)
-- 입력과 출력으로 이루어진 기능 집합
-- 부르면 무언가 작업해주는 도구
-- <단일행 함수> - 입력과 출력이 1대1인 함수
SELECT book_title FROM book;
SELECT upper(book_title) FROM book;
SELECT lower(book_title) FROM book;

SELECT LENGTH(book_title) FROM book;

-- <집계 함수> - 
SELECT max(book_price) FROM book;
SELECT min(book_price) FROM book;
SELECT sum(book_price) FROM book;
SELECT avg(book_price) FROM book;
-- count는 해당 항목이 null이면 카운트 하지 않는다.
SELECT count(book_price) FROM book;
-- null 여부와 관계없이 카운트 하고 싶다면 다음과 같이 사용
SELECT count(*) FROM book;
 --(주의) 집계함수는 정해진 자리에만 사용할 수 있다.

-- <분석 함수>



-- 서브쿼리(sub query)
-- 여러 개의 구문을 순차적으로 실행하도록 만드는 기술
-- (ex) 가장 비싼 금액의 상품 정보를 조회
SELECT max(price)
FROM product;

SELECT * 
FROM product
WHERE price = (
	SELECT max(price)
	FROM product
);



-- 문제
-- 가장 최근에 제조된 상품 정보
SELECT *
FROM product;

SELECT *
FROM product
WHERE made = (
	SELECT max(made)
	FROM product
);

SELECT *
FROM product
WHERE price = (
	SELECT min(price)
	FROM product
);

-- 가격이 비싼 순서로 3개만 조회
-- Top N Query

-- 서브쿼리를 사용하여 데이터를 원하는 구간만큼 끊어내는 기술
-- 오라클은 rownum이라는 값을 조회 시 사용할 수 있다.
-- rownum은 조회 결과에 순서를 부여한다.

-- 문제: 상품을 번호순으로 3개만 조회
SELECT *
FROM product
WHERE NO <= 3 ORDER BY NO ASC;

-- 문제: 상품을 가격이 저렴한 순으로 3개만 조회

SELECT *
FROM product
ORDER BY price ASC;

SELECT *
FROM product
ORDER BY price DESC;

SELECT *
FROM product
ORDER BY NO ASC;

SELECT rownum, product.*
FROM product
ORDER BY price ASC;

SELECT rownum, product.*
FROM product
ORDER BY price DESC;

SELECT rownum, product.*
FROM product
ORDER BY NO ASC;

DROP TABLE book;
create table book(
book_id number primary key,
book_title varchar2(300),
book_author varchar2(90),
book_publication_date char(10),
book_price number(*,2),
book_publisher varchar2(90),
book_page_count number,
book_genre varchar2(30),
check(regexp_like(book_author, '[^!@#$]+')),
check(book_price >= 0),
check(book_page_count > 0),
check(regexp_like(book_publication_date, '^(19[0-9]{2}|20[0-9]{2})-(((0[13578]|1[02])-(0[1-9]|1[0-9]|2[0-9]|3[01]))|((0[469]|11)-(0[1-9]|1[0-9]|2[0-9]|30))|((02)-(0[1-9]|1[0-9]|2[0-9])))$'))
);
create sequence book_seq;

INSERT INTO BOOK(book_id, book_title, book_author, book_publication_date, book_price, book_publisher, book_page_count, book_genre) VALUES(book_seq.nextval, 'Harry Potter 1', 'J.K. Rowling', '2001-06-26', 19.99, 'Scholastic', 320, 'Fantasy');
INSERT INTO BOOK(book_id, book_title, book_author, book_publication_date, book_price, book_publisher, book_page_count, book_genre) VALUES(book_seq.nextval, 'To Kill a Mockingbird', 'Harper Lee', '1960-07-11', 14.99, 'Grand Central Publishing', 336, 'Classic');
INSERT INTO BOOK(book_id, book_title, book_author, book_publication_date, book_price, book_publisher, book_page_count, book_genre) VALUES(book_seq.nextval, 'The Great Gatsby', 'F. Scott Fitzgerald', '1925-04-10', 12.99, 'Scribner', 180, 'Classic');
INSERT INTO BOOK(book_id, book_title, book_author, book_publication_date, book_price, book_publisher, book_page_count, book_genre) VALUES(book_seq.nextval, '1984', 'George Orwell', '1949-06-08', 10.99, 'Secker & Warburg', 328, 'Dystopian');
INSERT INTO BOOK(book_id, book_title, book_author, book_publication_date, book_price, book_publisher, book_page_count, book_genre) VALUES(book_seq.nextval, 'Pride and Prejudice', 'Jane Austen', '1913-01-28', 9.99, 'Penguin Classics', 432, 'Romance');
INSERT INTO BOOK(book_id, book_title, book_author, book_publication_date, book_price, book_publisher, book_page_count, book_genre) VALUES(book_seq.nextval, 'The Hobbit', 'J.R.R. Tolkien', '1937-09-21', 15.99, 'Houghton Mifflin Harcourt', 320, 'Fantasy');
INSERT INTO BOOK(book_id, book_title, book_author, book_publication_date, book_price, book_publisher, book_page_count, book_genre) VALUES(book_seq.nextval, 'The Catcher in the Rye', 'J.D. Salinger', '1951-07-16', 11.99, 'Little, Brown and Company', 224, 'Classic');
INSERT INTO BOOK(book_id, book_title, book_author, book_publication_date, book_price, book_publisher, book_page_count, book_genre) VALUES(book_seq.nextval, 'Lord of the Rings', 'J.R.R. Tolkien', '1954-07-29', 29.99, 'Allen & Unwin', 1178, 'Fantasy');
INSERT INTO BOOK(book_id, book_title, book_author, book_publication_date, book_price, book_publisher, book_page_count, book_genre) VALUES(book_seq.nextval, 'To the Lighthouse', 'Virginia Woolf', '1927-05-05', 13.99, 'Harcourt, Brace and Company', 209, 'Modernist');
INSERT INTO BOOK(book_id, book_title, book_author, book_publication_date, book_price, book_publisher, book_page_count, book_genre) VALUES(book_seq.nextval, 'The Alchemist', 'Paulo Coelho', '1988-06-01', 9.99, 'HarperOne', 208, 'Fiction');

select * from book;

-- 정렬을 먼저하도록 구조 개선
SELECT rownum, tmp.*
FROM (
	SELECT *
	FROM product
	product
	ORDER BY price ASC
)tmp 
WHERE rownum <= 3;

-- 해결책: rownum을 모두 붙인 다음 조회하도록 서브쿼리 추가
-- 문제점: rownum은 select 마다 생긴다.
SELECT *
FROM (
	SELECT rownum, tmp.* FROM (
		SELECT *
		FROM product
		ORDER BY price ASC
	)tmp
)
WHERE rownum BETWEEN 3 AND 5;

-- 해결책: 두 번째 select에서 발생한 rownum에 별칭을 부여
SELECT *
FROM (
	SELECT rownum rn, tmp.* FROM (
		SELECT *
		FROM product
		ORDER BY price ASC
	)tmp
)
WHERE rn BETWEEN 3 AND 5;


-- 문제
-- q. 가격이 가장 비싼 책 Top 5
SELECT *
FROM (
	SELECT rownum rn, tmp.* FROM (
		SELECT *
		FROM book
		ORDER BY book_price DESC 
	)tmp
)
WHERE rn <= 5;

-- q. 제목이 가장 짧은 책 Top 3 조회
SELECT *
FROM (
	SELECT rownum rn, tmp.* FROM (
		SELECT *
		FROM book
		ORDER BY LENGTH(book_title)
	)tmp
)
WHERE rn <= 5;
-- q. 출간한지 가장 오래된 책 6등 ~ 10등 조회
SELECT *
FROM (
	SELECT rownum rn, tmp.* FROM (
		SELECT *
		FROM book
		ORDER BY book_publication_date ASC
	)tmp
)
WHERE rn BETWEEN 6 AND 10;

SELECT *
FROM book;

COMMIT;




-- 과제
CREATE SEQUENCE kpop_song_seq;
DROP TABLE kpop_song;
CREATE TABLE kpop_song (
	kpop_song_no NUMBER PRIMARY KEY,
	kpop_song_title varchar2(300) NOT NULL,
	kpop_song_artist varchar2(300) NOT NULL,
	kpop_song_album varchar2(300) NOT NULL,
	kpop_song_playcount NUMBER DEFAULT 0 CHECK(kpop_song_playcount >= 0),
	kpop_song_likecount NUMBER DEFAULT 0 CHECK(kpop_song_likecount >= 0)
);

BEGIN
  FOR i IN 1..1000 LOOP
    INSERT INTO kpop_song (
      kpop_song_no,
      kpop_song_title,
      kpop_song_artist,
      kpop_song_album,
      kpop_song_playcount,
      kpop_song_likecount
    ) VALUES (
      kpop_song_seq.NEXTVAL,
      'Sample Title ' || i,
      'Sample Artist ' || i,
      'Sample Album ' || i,
      ROUND(DBMS_RANDOM.VALUE(10, 99999)), -- 재생 횟수 (10 이상 10만 미만)
      ROUND(DBMS_RANDOM.VALUE(10, 49999)) -- 좋아요 수 (10 이상 5만 미만)
    );
  END LOOP;
  COMMIT;
END;

SELECT *
FROM kpop_song;

-- 1. 좋아요를 가장 많이 받은 곡 top 100을 출력
SELECT *
FROM (
	SELECT rownum rn, tmp.* FROM (
		SELECT *
		FROM kpop_song
		ORDER BY kpop_song_likecount DESC
	)tmp
)
WHERE rn <= 100;

-- 2. 재생을 가장 많이 한 곡 top 100을 출력
SELECT *
FROM (
	SELECT rownum rn, tmp.* FROM (
		SELECT *
		FROM kpop_song
		ORDER BY kpop_song_playcount DESC
	)tmp
)
WHERE rn <= 100;

-- 3. 랭킹 포인트를 계산하여 top 100을 출력
SELECT *
FROM (
	SELECT rownum rn, tmp.* FROM (
		SELECT kpop_song.*, (kpop_song_playcount * 0.6 + kpop_song_likecount * 0.4) kpop_song_point
		FROM kpop_song
		ORDER BY kpop_song_point DESC
	)tmp
)
WHERE rn <= 100;

