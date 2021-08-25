--SQL : Structered Query Language
--SQL �������� �ؼ��ؼ� �����Ű�� �����̸� : Optimizer : ��Ƽ������ 
--sqlplus : ����Ŭ���� �ִ� ���� ���α׷��̴�. sql ��ɹ��� ���� ��Ű�� ��

--���� �н����� ���� ���� lock�� Ǫ�� �� 
--sqlplus "/as sysdba"
--sql>ALTER USER �����̸� IDENTIFIED BY ��й�ȣ;
--sql>ALTER USER scott IDENTIFIED BY tiger;
--sql>ALTER USER �����̸� ACCOUNT UNLOCK;
--sql>ALTER USER scott ACCOUNT UNLOCK;

/*
�ǽ��� ���̺� 
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
�̸�       ��?       ����           
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
�̸�     ��?       ����           
------ -------- ------------ 
DEPTNO NOT NULL NUMBER(2)    
DNAME           VARCHAR2(14) 
LOC             VARCHAR2(13) 
*/

SELECT * FROM TAB; -- �����(Shift + ȨŰ, Ŀ��Ű) Ctrl + enter
SELECT COUNT(*) FROM TAB;


--���̺��� �����͸� ��ȸ�ϱ� 
--1. Ű����(�����, ��ɾ�) : SELECT , FROM 
--2. SELECT : ��ȸ�ϴ� Ű����
--3. FROM : ��� ���̺��� 
--4. SELECT �÷��̸�, �÷��̸�, �÷��̸� , ... (����, INDEX) FROM ���̺��̸�;

--EMP ���̺��� EMPNO �÷��� ��ȸ �Ͻÿ� 
SELECT EMPNO FROM EMP;
-- EMP ���̺��� EMPNO �÷��� �ִ� ��� �����Ͱ�(��� ��, ROW) ��ȸ �ȴ�. 

-- EMP ���̺��� EMPNO, ENAME �÷��� ��ȸ �Ͻÿ� 
SELECT EMPNO, ENAME FROM EMP;

-- * : �ƽ�Ÿ����ũ, ��ǳǥ��, ��ǥ ... : ���̺��� FULL-SCAN(��ü��ȸ : ��ü �÷��� ��ü�ο�) �Ͻÿ� 
-- EMP ���̺��� Ǯ��ĵ �Ͻÿ� , EMP ���̺��� ��ü ��ȸ �Ͻÿ� 
SELECT * FROM EMP;

--����Ŭ �����ͺ��̽��� ������ �����ͺ��̽� 
--�����ͺ��̽������� �⺻������ 
--���̺� CRUD, ISUD�� �ؾߵȴ�. 
--C : CREATE, I : INSERT : ���̺� �÷��� �����͸� �Է��ϴ� �� 
--R : READ, S : SELECT : ���̺� �ִ� �÷������͸� �ο������ ��ȸ�ϴ� ���̴�. 
--U : UPDATE : ���̺� �÷��� �ִ� �����͸� �����ϴ� ���̴�. 
--D : DELETE : ���̺� �÷��� �ִ� �����͸� �����ϴ� ���̴� 
--����ϴ� Ű���� :�����, ��ɾ�
--SELECT, FROM, INSERT, INTO, VALUES, UPDATE, SET, DELETE, WHERE 

/*
-- SELECT : ���̺��� �÷� �ε����� ��ȸ�ϴ� �� 
SELECT �÷��̸�1, �÷��̸�2 ... �÷��̸�n FROM ���̺��
WHERE ���� 

-- INSERT : ���̺� �÷��� ������ �Է�
INSERT INTO ���̺�� (�÷��̸�1, �÷��̸�2, ...�÷��̸�n) 
             VALUES (�÷��̸�1�� ������, �÷��̸�2�� ������, ... �÷��̸�n�� ������ );

-- UPDATE : ���̺� �÷��� ������ ����
UPDATE ���̺�� 
SET �÷��̸�1 = �÷��̸�1�� �����Ұ�,
    �÷��̸�2 = �÷��̸�2�� �����Ұ�,
    �÷��̸�n = �÷��̸�n�� �����Ұ�
WHERE ����    

--  DELETE : ���̺� �÷��� �ο������ ���� 
DELETE FROM ���̺�� 
WHERE  ����
*/




