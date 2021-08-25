-- 그룹 함수 
--그룹함수의 결과는 1개의 행으로 구해진다.
--단일함수의 결과는 여러개의 행으로 구해진다.

-- SUM(), COUNT(), AVG(), MIN(), MAX() 그룹 함수 
SELECT SUM(SAL) FROM EMP;
SELECT COUNT(SAL) FROM EMP;
SELECT AVG(SAL) FROM EMP;
SELECT ROUND(AVG(SAL)) FROM EMP;
SELECT ROUND(AVG(SAL), 3) FROM EMP;
SELECT MIN(SAL) FROM EMP;
SELECT MAX(SAL) FROM EMP;

-- ROUND(), TO_CHAR(), NVL() ..... 단일 함수
SELECT ROUND(SAL) FROM EMP;
SELECT ROUND(2222.1234) FROM DUAL;
SELECT ROUND(2222.6234) FROM DUAL;
SELECT TO_CHAR(HIREDATE, 'YYYY-MM-DD') FROM EMP;
SELECT NVL(COMM, 0) FROM EMP;

-- EMP 테이블에서 입사일이 제일 늦은 사원의 사원명, 입사일을 조회 하시오
SELECT * FROM EMP ORDER BY HIREDATE DESC;  -- 데이터를 아이체킹한다. 

SELECT ENAME, HIREDATE FROM EMP WHERE HIREDATE = '87/05/23';

SELECT MAX(HIREDATE) FROM EMP;
SELECT MIN(HIREDATE) FROM EMP;
SELECT ENAME, HIREDATE FROM EMP WHERE HIREDATE = (SELECT MAX(HIREDATE) FROM EMP);

-- EMP 테이블에서 사번이 제일 빠른 사원의 사원번호, 사원명, 입사일을 조회 하시오 
SELECT MAX(EMPNO), MIN(EMPNO) FROM EMP;
SELECT EMPNO, ENAME, HIREDATE FROM EMP WHERE EMPNO = '7934';
SELECT EMPNO, ENAME, HIREDATE FROM EMP WHERE EMPNO = (SELECT MIN(EMPNO) FROM EMP);

-- EMP 테이블에서 급여가 제일 많은 사원의 사원번호, 사원명, 입사일을 조회 하시오 
SELECT MAX(SAL), MIN(SAL) FROM EMP;
SELECT EMPNO, ENAME, HIREDATE FROM EMP WHERE SAL = (SELECT MAX(SAL) FROM EMP);

-- EMP 테이블에서 상여급 제일 많은 사원의 사원번호, 사원명, 입사일을 조회 하시오 
SELECT MAX(COMM), MIN(COMM) FROM EMP;
SELECT EMPNO, ENAME, HIREDATE FROM EMP WHERE COMM = (SELECT MAX(COMM) FROM EMP);


--GROUP BY 
SELECT DEPTNO FROM EMP;
SELECT COUNT(DEPTNO) FROM EMP;
SELECT DISTINCT DEPTNO FROM EMP;

SELECT DEPTNO FROM EMP GROUP BY DEPTNO;
SELECT * FROM EMP GROUP BY DEPTNO;
SELECT A.* FROM EMP A GROUP BY A.DEPTNO;
SELECT A.DEPTNO, A.ENAME FROM EMP A GROUP BY A.DEPTNO, A.ENAME;
SELECT A.DEPTNO, A.JOB FROM EMP A GROUP BY A.DEPTNO, A.JOB;


SELECT A.DEPTNO FROM EMP A GROUP BY A.DEPTNO HAVING A.DEPTNO = 30;
-- 30부서의 급여 총액 
SELECT A.DEPTNO, SUM(A.SAL) FROM EMP A GROUP BY A.DEPTNO HAVING A.DEPTNO = 30;
SELECT SUM(A.SAL) FROM EMP A WHERE A.DEPTNO = 30;
SELECT A.DEPTNO, SUM(A.SAL) FROM EMP A WHERE A.DEPTNO = 30;

SELECT   A.DEPTNO
        ,COUNT(A.SAL) 
        ,SUM(A.SAL)
        ,ROUND(AVG(A.SAL), 2)
        ,MAX(A.SAL)
        ,MIN(A.SAL)
FROM    EMP A 
GROUP BY A.DEPTNO 
HAVING A.DEPTNO = 30;

SELECT   A.DEPTNO
        ,COUNT(A.SAL) 
        ,SUM(A.SAL)
        ,ROUND(AVG(A.SAL), 2)
        ,MAX(A.SAL)
        ,MIN(A.SAL)
FROM    EMP A 
GROUP BY A.DEPTNO 
ORDER BY 1;


-- ROLLUP 함수 
-- GROUP BY 절과 함께 사용
-- SELECT 된 데이터와 그 테이터의 총계를 구함  
SELECT JOB, SAL FROM EMP;
SELECT JOB FROM EMP GROUP BY JOB;
SELECT JOB, SUM(SAL) FROM EMP GROUP BY JOB;
SELECT JOB, SUM(SAL) FROM EMP GROUP BY ROLLUP(JOB);

SELECT DEPTNO, SAL FROM EMP;
SELECT DEPTNO FROM EMP GROUP BY DEPTNO;
SELECT DEPTNO, SUM(SAL) FROM EMP GROUP BY DEPTNO;
SELECT DEPTNO, SUM(SAL) FROM EMP GROUP BY ROLLUP(DEPTNO);

-- 부서별 인원수와 급여 합계
SELECT B.DNAME, A.JOB, SUM(A.SAL) SAL, COUNT(A.EMPNO) EMPCNT
FROM   EMP A, DEPT B
WHERE  A.DEPTNO = B.DEPTNO
GROUP BY B.DNAME, A.JOB
ORDER BY 1;

SELECT B.DNAME, A.JOB, SUM(A.SAL) SAL, COUNT(A.EMPNO) EMPCNT
FROM   EMP A, DEPT B
WHERE  A.DEPTNO = B.DEPTNO
GROUP BY ROLLUP(B.DNAME, A.JOB)
ORDER BY 1;

-- RANK() OVER()
-- 오라클에서 순위를 부여하는 함수 

-- 급여 순위를 구해보세요
SELECT EMPNO, ENAME, SAL FROM EMP ORDER BY 3 DESC; 

-- RK의 출력값이 급여가 같으면 같은 순위로 부여 된다. 
SELECT EMPNO, ENAME, SAL, 
       RANK() OVER(ORDER BY SAL DESC) AS RK 
FROM EMP;   

-- 중복 RANK의 수와 무관하게 넘버링 한다. 
SELECT EMPNO, ENAME, SAL, 
       DENSE_RANK() OVER(ORDER BY SAL DESC) AS RK 
FROM EMP; 

-- 그룹별로 순위 부여 
SELECT EMPNO, ENAME, SAL, 
       RANK() OVER(PARTITION BY DEPTNO ORDER BY SAL DESC) AS RK 
FROM EMP;  

-- ROW_NUMBER() OVER()
SELECT ROWNUM, EMPNO, ENAME, SAL,
       ROW_NUMBER() OVER(ORDER BY SAL DESC) AS RK
FROM   EMP;

--RANK : 중복 순위 다음 순서 건너뜀.(1,2,2,4)
--DENSE_RANK : 중복순위 다음 순위 연속.(1,2,2,3)
--ROW_NUMBER : 중복순위 없이 유일값. (1,2,3,4)
SELECT DEPTNO, EMPNO, ENAME, SAL 
      ,RANK() OVER(ORDER BY SAL DESC) AS RK 
      ,DENSE_RANK() OVER(ORDER BY SAL DESC) AS DR 
      ,ROW_NUMBER() OVER(ORDER BY SAL DESC) AS RN
FROM EMP; 

--순위 함수 - NTILE(분류)
-- 쿼리결과를 N개 그룹으로 분류하는 기능 
SELECT EMPNO
      ,NTILE(2) OVER(ORDER BY EMPNO) AS GRP_2 
      ,NTILE(3) OVER(ORDER BY EMPNO) AS GRP_3  
      ,NTILE(5) OVER(ORDER BY EMPNO) AS GRP_5 
FROM EMP; 

-- CUBE() 함수
SELECT B.DNAME, A.JOB, SUM(A.SAL) SAL, COUNT(A.EMPNO) EMPCNT
FROM   EMP A, DEPT B
WHERE  A.DEPTNO = B.DEPTNO
GROUP BY CUBE(B.DNAME, A.JOB)
ORDER BY 1;

-- 오라클 오브젝트

-- VIEW
--직접적인 테이블 접근을 제한하기 위해서 사용한다. 
--뷰는 테이블에 대한 제한을 가지고 
--테이블의 일정한 부분만 보일 수 있는 가상 테이블이다.

--CREATE [OR REPLACE][FORCE | NOFORCE] VIEW viewname
--[(alias, alias ....)]
--AS subquery
SELECT * FROM TAB;

CREATE TABLE EMP02
AS 
SELECT EMPNO, ENAME, SAL, DEPTNO FROM EMP;

SHOW USER;
--CONN SYSTEM/1234
--GRANT CREATE VIEW TO SCOTT;

--단순 뷰 또는 복합 뷰에서 뷰는 조회 용으로만 사용하기 

-- 단순 뷰(Simple View) : 기본 테이블이 1개 일 때
-- ISUD 가능 
CREATE VIEW VIEW_EMP02
AS 
SELECT * 
FROM  EMP02
WHERE DEPTNO = 10;

SELECT * FROM VIEW_EMP02;

INSERT INTO VIEW_EMP02
VALUES (8000, 'ANGEL', 7000, 10);

SELECT * FROM EMP02;

COMMIT;

-- 복합 뷰(Complex View) : 기본 테이블이 2개 이상 일 때 
-- ISUD 불가능 
CREATE VIEW VIEW_EMP_DEPT
AS 
SELECT A.EMPNO, A.ENAME, A.SAL, B.DEPTNO, B.DNAME
FROM   EMP A, DEPT B
WHERE  A.DEPTNO = B.DEPTNO
AND    A.DEPTNO = 10;

SELECT * FROM VIEW_EMP_DEPT;

INSERT INTO VIEW_EMP_DEPT
VALUES (8001, 'AAAA', 4000, 10, 'ACCUNT');

-- 뷰 생성시 컬럼명을 조정할 수 있다. 
CREATE OR REPLACE VIEW VIEW_EMP02_COL(사원번호, 사원명, 급여, 부서번호)
AS 
SELECT EMPNO, ENAME, SAL, DEPTNO
FROM   EMP02;

SELECT * FROM VIEW_EMP02_COL;

SELECT * FROM VIEW_EMP02_COL WHERE 부서번호 = 10;
SELECT * FROM VIEW_EMP02_COL WHERE DEPTNO = 10;

-- 뷰를 새로 만든 것 
CREATE OR REPLACE VIEW VIEW_EMP02_COL_1
AS 
SELECT EMPNO AS E_1, ENAME AS E_2, SAL AS E_3, DEPTNO AS E_4
FROM   EMP02;
SELECT * FROM VIEW_EMP02_COL_1;

-- 뷰를 변경하는 것 
CREATE OR REPLACE VIEW VIEW_EMP02_COL
AS 
SELECT EMPNO T_1, ENAME T_2, SAL T_3, DEPTNO T_4
FROM   EMP02;

SELECT * FROM VIEW_EMP02_COL;

-- NOFORCE : DEFAULT : 기본테이블이 없으면 뷰를 생성하지 않음 
CREATE OR REPLACE VIEW VIEW_EMP02_1
AS 
SELECT EMPNO, ENAME, SAL, DEPTNO
FROM   EMP02_NOTABLE
WHERE  ROWNUM <= 3;

-- FORCE : 기본 테이블이 없어도 USER_VIEWS 테이터 사전에 뷰를 생성한다.
CREATE OR REPLACE FORCE VIEW VIEW_EMP02_2
AS 
SELECT EMPNO, ENAME, SAL, DEPTNO
FROM   EMP02_NOTABLE
WHERE  ROWNUM <= 3;
--00942. 00000 -  "table or view does not exist"
--*Cause:    
--*Action:
--경고: 컴파일 오류와 함께 뷰가 생성되었습니다.

-- WITH CHECK OPTION
CREATE OR REPLACE VIEW VIEW_EMP03
AS 
SELECT EMPNO, ENAME, DEPTNO, JOB
FROM   EMP
WHERE  JOB LIKE 'MANAGER' WITH CHECK OPTION;

INSERT INTO VIEW_EMP03
VALUES (9000, 'ABC', 30, 'SALESMAN');

INSERT INTO VIEW_EMP03
VALUES (9000, 'ABC', 30, 'MANAGER');

SELECT * FROM VIEW_EMP03;
ROLLBACK;

-- WITH READ ONLY : 읽기만 가능 
-- 대부분의 뷰는 리드온리로 생성할 것 
CREATE OR REPLACE VIEW VIEW_EMP04
AS 
SELECT EMPNO, ENAME, DEPTNO, JOB
FROM   EMP
WHERE  JOB LIKE 'MANAGER' WITH READ ONLY;

INSERT INTO VIEW_EMP04
VALUES (9000, 'ABC', 30, 'MANAGER');


-- SEQUENCE 
-- 오라클 시퀀스 는 자동 증가 하는 기능 
-- MYSQL, 마리아디비 : AUTO_INCREMENT : 자동 증가 

CREATE SEQUENCE EMP05_SEQ
       START WITH 1
       INCREMENT BY 1
       MAXVALUE 1000000;

CREATE SEQUENCE EMP05_SEQ_1
       START WITH 1
       INCREMENT BY 1
       MAXVALUE 1000000;

CREATE SEQUENCE EMP05_SEQ_2
       START WITH 1
       INCREMENT BY 3
       MAXVALUE 1000000;
       
SELECT * FROM USER_SEQUENCES;      

CREATE TABLE EMP05
AS
SELECT EMPNO, ENAME, HIREDATE 
FROM   EMP 
WHERE  1=0;

SELECT * FROM EMP05;

INSERT INTO EMP05 VALUES (EMP05_SEQ.NEXTVAL, 'AAA', SYSDATE);
INSERT INTO EMP05 VALUES (EMP05_SEQ.NEXTVAL, 'AAA01', SYSDATE); 
INSERT INTO EMP05 VALUES (EMP05_SEQ.NEXTVAL, 'AAA02', SYSDATE);
INSERT INTO EMP05 VALUES (EMP05_SEQ.NEXTVAL, 'AAA03', SYSDATE);
INSERT INTO EMP05 VALUES (EMP05_SEQ.NEXTVAL, 'AAA04', SYSDATE);

SELECT EMP05_SEQ_2.NEXTVAL FROM DUAL;
SELECT EMP05_SEQ_2.CURRVAL FROM DUAL;

SELECT EMP05_SEQ.NEXTVAL FROM DUAL;
SELECT EMP05_SEQ.CURRVAL FROM DUAL;

--맥스(MAX())값 채번 로직 
SELECT MAX(NVL(NULL, 0)) + 1 FROM DUAL;

-- INDEX : 색인 : 영어사전 : 색인 A, B, C ... , 한글 사전 : 색인 ㄱ, ㄴ, ㄷ ....
-- 오라클 데이터베이스에서 INDEX 성능 향상(조회 속도 향상)에서 양날의 검 
SELECT  TABLE_NAME, INDEX_NAME, COLUMN_NAME
FROM    USER_IND_COLUMNS
WHERE   TABLE_NAME IN ('EMP', 'DEPT', 'INDEX_TEST_1', 'T2');

--테이블 생성시 프라이머리 키(PK)를 생성하면
--오라클 엔진에서 자동으로 인덱스를 생성한다. 
--생성하는 이름은 SYS_  접두어 + C + 0000000 규칙으로 생성한다. 
--SYS_C0011065 : SYS  접두어 + C + 0000000
CREATE TABLE INDEX_TEST_1 (
    INDEX_1 NUMBER PRIMARY KEY 
);
-- PK 생성시 자동으로 시스템에서 시스템을 인덱스를 생성하기 때문에
-- 사용자 정의로 인덱스를 생성할 수 없다. 
CREATE INDEX INDEX_TEST_1_111 ON INDEX_TEST_1(INDEX_1);

-- 인덱스 생성하기 
CREATE TABLE T2 (
    T2_1 NUMBER,
    T2_2 VARCHAR2(10)
);

--단일 인덱스
CREATE INDEX INDEX_T2_T2_1 ON T2(T2_1);
--결합 인덱스
CREATE INDEX INDEX_T2_T2_1_T2_2 ON T2(T2_1, T2_2);

-- MAX 값 채번로직 완성하기 
CREATE TABLE T3 (
    T3_NUM VARCHAR2(20) PRIMARY KEY 
   ,DELETEYN VARCHAR2(1)
   ,INSERTDATE DATE
   ,UPDATEDATE DATE
);
-- SYS_C0011066
SELECT  TABLE_NAME, INDEX_NAME, COLUMN_NAME
FROM    USER_IND_COLUMNS
WHERE   TABLE_NAME IN ('T3');

SELECT /*+ INDEX_DESC(SYS_C0011066) */
        NVL(MAX(SUBSTR(A.T3_NUM, -4)), 0) + 1 COMMNO 
FROM    T3 A;        


-- 오라클 Constraint

