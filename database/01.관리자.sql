-- 사용자 생성
CREATE USER C##test IDENTIFIED BY test;

-- 사용자에게 기본 권한 부여
GRANT CONNECT, RESOURCE, UNLIMITED TABLESPACE TO C##test;

-- 사용자 제거
DROP USER C##test; 
