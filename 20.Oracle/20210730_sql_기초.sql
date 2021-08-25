--SQL : Structered Query Language
--SQL 쿼리문을 해석해서 실행시키는 엔진이름 : Optimizer : 옵티마이저 
--sqlplus : 오라클에만 있는 응용 프로그램이다. sql 명령문을 실행 시키는 것

--계정 패스워드 변경 계정 lock를 푸는 것 
--sqlplus "/as sysdba"
--sql>ALTER USER 계정이름 IDENTIFIED BY 비밀번호;
--sql>ALTER USER scott IDENTIFIED BY tiger;
--sql>ALTER USER 계정이름 ACCOUNT UNLOCK;
--sql>ALTER USER scott ACCOUNT UNLOCK;

/*
실습용 테이블 
SELECT * FROM TAB;
----------------------
BONUS	    TABLE	
DEPT	    TABLE	
EMP	        TABLE	
SALGRADE	TABLE	

SELECT * FROM EMP;
----------------------------
EMPNO   ENAME   JOB     MGR     HIREDATE    SAL   COMM DEPTNO
7369	SMITH	CLERK	7902	80/12/17	800		20
7499	ALLEN	SALESMAN	7698	81/02/20	1600	300	30
7521	WARD	SALESMAN	7698	81/02/22	1250	500	30
7566	JONES	MANAGER	7839	81/04/02	2975		20
7654	MARTIN	SALESMAN	7698	81/09/28	1250	1400	30
7698	BLAKE	MANAGER	7839	81/05/01	2850		30
7782	CLARK	MANAGER	7839	81/06/09	2450		10
7788	SCOTT	ANALYST	7566	87/04/19	3000		20
7839	KING	PRESIDENT		81/11/17	5000		10
7844	TURNER	SALESMAN	7698	81/09/08	1500	0	30
7876	ADAMS	CLERK	7788	87/05/23	1100		20
7900	JAMES	CLERK	7698	81/12/03	950		30
7902	FORD	ANALYST	7566	81/12/03	3000		20
7934	MILLER	CLERK	7782	82/01/23	1300		10

DESC EMP;
이름       널?       유형           
-------- -------- ------------ 
EMPNO    NOT NULL NUMBER(4)    
ENAME             VARCHAR2(10) 
JOB               VARCHAR2(9)  
MGR               NUMBER(4)    
HIREDATE          DATE         
SAL               NUMBER(7,2)  
COMM              NUMBER(7,2)  
DEPTNO            NUMBER(2)    

DESC DEPT;
이름     널?       유형           
------ -------- ------------ 
DEPTNO NOT NULL NUMBER(2)    
DNAME           VARCHAR2(14) 
LOC             VARCHAR2(13) 
*/

SELECT * FROM TAB; -- 블럭잡고(Shift + 홈키, 커서키) Ctrl + enter
SELECT COUNT(*) FROM TAB;


--테이블에서 데이터를 조회하기 
--1. 키워드(예약어, 명령어) : SELECT , FROM 
--2. SELECT : 조회하는 키워드
--3. FROM : 어느 테이블에서 
--4. SELECT 컬럼이름, 컬럼이름, 컬럼이름 , ... (순차, INDEX) FROM 테이블이름;

--EMP 테이블에서 EMPNO 컬럼을 조회 하시오 
SELECT EMPNO FROM EMP;
-- EMP 테이블에서 EMPNO 컬럼에 있는 모든 데이터가(모든 행, ROW) 조회 된다. 

-- EMP 테이블에서 EMPNO, ENAME 컬럼을 조회 하시오 
SELECT EMPNO, ENAME FROM EMP;

-- * : 아스타리스크, 미풍표시, 별표 ... : 테이블을 FULL-SCAN(전체조회 : 전체 컬럼에 전체로우) 하시오 
-- EMP 테이블을 풀스캔 하시오 , EMP 테이블을 전체 조회 하시오 
SELECT * FROM EMP;

--오라클 데이터베이스는 관계형 데이터베이스 
--데이터베이스에서는 기본적으로 
--테이블에 CRUD, ISUD를 해야된다. 
--C : CREATE, I : INSERT : 테이블 컬럼에 데이터를 입력하는 것 
--R : READ, S : SELECT : 테이블에 있는 컬럼데이터를 로우단위로 조회하는 것이다. 
--U : UPDATE : 테이블 컬럼에 있는 데이터를 수정하는 것이다. 
--D : DELETE : 테이블 컬럼에 있는 데이터를 삭제하는 것이다 
--사용하는 키워드 :예약어, 명령어
--SELECT, FROM, INSERT, INTO, VALUES, UPDATE, SET, DELETE, WHERE 

/*
-- SELECT : 테이블에서 컬럼 인덱스로 조회하는 것 
SELECT 컬럼이름1, 컬럼이름2 ... 컬럼이름n FROM 테이블명
WHERE 조건 

-- INSERT : 테이블 컬럼에 데이터 입력
INSERT INTO 테이블명 (컬럼이름1, 컬럼이름2, ...컬럼이름n) 
             VALUES (컬럼이름1에 넣을값, 컬럼이름2에 넣을값, ... 컬럼이름n에 넣을값 );

-- UPDATE : 테이블 컬럼에 데이터 변경
UPDATE 테이블명 
SET 컬럼이름1 = 컬럼이름1에 변경할값,
    컬럼이름2 = 컬럼이름2에 변경할값,
    컬럼이름n = 컬럼이름n에 변경할값
WHERE 조건    

--  DELETE : 테이블에 컬럼을 로우단위로 삭제 
DELETE FROM 테이블명 
WHERE  조건
*/




