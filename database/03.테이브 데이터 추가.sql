-- 데이터 저장
-- 테이블에 데이터를 저장하는 구문을 작성

-- INSERT INTO 테이블이름(항목) VALUES(값);
INSERT INTO pokemon(NO, name, type) VALUES(1, '이상해씨', '풀');
INSERT INTO pokemon(NO, name, type) VALUES(2, '이상해풀', '풀');
INSERT INTO pokemon(NO, name, type) VALUES(3, '이상해꽃', '풀');
INSERT INTO pokemon(NO, name, type) VALUES(4, '파이리', '불');

-- 조회 명령
SELECT * FROM pokemon;
