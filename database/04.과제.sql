-- 문제 1
CREATE TABLE score (
	grade NUMBER(1) NOT NULL,
	class NUMBER(2) NOT NULL,
	name VARCHAR2(10) NOT NULL,
	kor NUMBER(3) NULL,
	eng NUMBER(3) NULL,
	math NUMBER(3) NULL,
);
DROP TABLE score;
INSERT INTO score(grade, class, name, kor, eng, math) VALUES(1, 1, '마리오', 50, 60, 50);
INSERT INTO score(grade, class, name, kor, eng, math) VALUES(1, 1, '루이지', 60, 90, 50);
INSERT INTO score(grade, class, name, kor, eng, math) VALUES(1, 2, '쿠파', 70, 70, 80);
INSERT INTO score(grade, class, name, kor, eng, math) VALUES(1, 2, '요시', 80, 85, 35);

SAVEPOINT sp1; -- Savepoint 추가

SELECT * FROM score;

COMMIT;

ROLLBACK TO sp1; -- Savepoint로 롤백

-- 문제 2
CREATE TABLE account (
	name VARCHAR2(20) PRIMARY KEY NOT NULL,
	period NUMBER NOT NULL,
	count NUMBER NOT NULL,
	month_pay NUMBER NOT NULL,
	total_money NUMBER NULL,
	CONSTRAINT account_total_money_check CHECK (total_money >= 0) -- 제약사항 추가
);

INSERT INTO account(name, period, count, month_pay, total_money) VALUES('유재석', 3, 15, 1000000, 15000000);
INSERT INTO account(name, period, count, month_pay, total_money) VALUES('강호동', 2, 15, 500000, 2500000);
INSERT INTO account(name, period, count, month_pay, total_money) VALUES('신동엽', 2, 8, 800000, 10000000);

SAVEPOINT sp2; -- Savepoint 추가

SELECT * FROM account;

COMMIT;

INSERT INTO account(name, period, count, month_pay, total_money) VALUES('신동엽', 2, 8, 800000, 10000000);

ROLLBACK TO sp2; -- Savepoint로 롤백
