-- �Խ��� �����
CREATE TABLE KBD_BOARD (
    BNUM        VARCHAR2(20) PRIMARY KEY
    ,BSUBJECT   VARCHAR2(50)
    ,BWRITER    VARCHAR2(50)
    ,BCONTENTS  VARCHAR2(2000)
    ,BPW        VARCHAR2(20)
    ,DELETEYN   VARCHAR2(1)
    ,INSERTDATE DATE
    ,UPDATEDATE DATE
);

SELECT * FROM KBD_BOARD;
SELECT SYSDATE FROM DUAL;

INSERT INTO KBD_BOARD (
    BNUM       
    ,BSUBJECT  
    ,BWRITER    
    ,BCONTENTS  
    ,BPW        
    ,DELETEYN   
    ,INSERTDATE 
    ,UPDATEDATE                   
) VALUES ('B0001', '�׽�Ʈ �Խ���', '�۾���', '�׽�Ʈ �Խ��� �Դϴ�.', 'ABCDEFGH', 'Y', SYSDATE, SYSDATE);

INSERT INTO KBD_BOARD (
    BNUM       
    ,BSUBJECT  
    ,BWRITER    
    ,BCONTENTS  
    ,BPW        
    ,DELETEYN   
    ,INSERTDATE 
    ,UPDATEDATE                   
) VALUES ('B0005', '�׽�Ʈ �Խ���5', '�۾���5', '�׽�Ʈ �Խ��� �Դϴ�.', 'ABCDEFGH', 'Y', SYSDATE, SYSDATE);

SELECT * FROM KBD_BOARD;
ROLLBACK;

COMMIT;


