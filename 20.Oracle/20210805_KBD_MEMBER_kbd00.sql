SHOW USER;
SELECT * FROM TAB;

CREATE TABLE Kbd_MEMBER (
    KNUM VARCHAR2(20) PRIMARY KEY 
   ,KNAME VARCHAR2(20)
   ,KID VARCHAR2(20) NOT NULL
   ,KPW VARCHAR2(200) NOT NULL
   ,KBIRTH VARCHAR2(10)
   ,KGENDER VARCHAR2(2)
   ,KTEL VARCHAR2(16)
   ,KHP VARCHAR2(16) 
   ,KEMAIL VARCHAR2(200)
   ,KADDR VARCHAR2(300) NOT NULL
   ,KHOBBY VARCHAR2(2)
   ,KPHOTO VARCHAR2(200) 
   ,KSKILL VARCHAR2(100)
   ,KJOB VARCHAR2(2) 
   ,DELETEYN VARCHAR2(1)NOT NULL
   ,INSERTDATE DATE
   ,UPDATEDATE DATE 
);

SELECT * FROM Kbd_MEMBER;

SELECT SYSDATE FROM DUAL;

INSERT INTO Kbd_MEMBER (
                        KNUM
                        ,KNAME
                        ,KID
                        ,KPW
                        ,KBIRTH
                        ,KGENDER
                        ,KTEL
                        ,KHP
                        ,KEMAIL
                        ,KADDR
                        ,KHOBBY
                        ,KPHOTO
                        ,KSKILL
                        ,KJOB
                        ,DELETEYN
                        ,INSERTDATE
                        ,UPDATEDATE
) VALUES (202108050001, 'AAAA', 'AA00', 'AA1234', 20210101, 01, 0212344567, 01012344567, 'AA00@abc.com', '경기 광명시 소하동11', 05, 'C:\00.KOSMO93\20.Oracle', '없음', 05, 'Y', SYSDATE, SYSDATE);

INSERT INTO Kbd_MEMBER (
                        KNUM
                        ,KNAME
                        ,KID
                        ,KPW
                        ,KBIRTH
                        ,KGENDER
                        ,KTEL
                        ,KHP
                        ,KEMAIL
                        ,KADDR
                        ,KHOBBY
                        ,KPHOTO
                        ,KSKILL
                        ,KJOB
                        ,DELETEYN
                        ,INSERTDATE
                        ,UPDATEDATE
) VALUES (202108050002, 'AAAA', 'AA00', 'AA1234', 20210101, 02, 0212344567, 01012344567, 'AA00@abc.com', '경기 광명시 소하동22', 04, 'C:\00.KOSMO93\20.Oracle', '없음', 04, 'Y', SYSDATE, SYSDATE);

INSERT INTO Kbd_MEMBER (
                        KNUM
                        ,KNAME
                        ,KID
                        ,KPW
                        ,KBIRTH
                        ,KGENDER
                        ,KTEL
                        ,KHP
                        ,KEMAIL
                        ,KADDR
                        ,KHOBBY
                        ,KPHOTO
                        ,KSKILL
                        ,KJOB
                        ,DELETEYN
                        ,INSERTDATE
                        ,UPDATEDATE
) VALUES (202108050003, 'AAAA', 'AA00', 'AA1234', 20210101, 01, 0212344567, 01012344567, 'AA00@abc.com', '경기 광명시 소하동33', 03, 'C:\00.KOSMO93\20.Oracle', '없음', 03, 'Y', SYSDATE, SYSDATE);

INSERT INTO Kbd_MEMBER (
                        KNUM
                        ,KNAME
                        ,KID
                        ,KPW
                        ,KBIRTH
                        ,KGENDER
                        ,KTEL
                        ,KHP
                        ,KEMAIL
                        ,KADDR
                        ,KHOBBY
                        ,KPHOTO
                        ,KSKILL
                        ,KJOB
                        ,DELETEYN
                        ,INSERTDATE
                        ,UPDATEDATE
) VALUES (202108050004, 'AAAA', 'AA00', 'AA1234', 20210101, 02, 0212344567, 01012344567, 'AA00@abc.com', '경기 광명시 소하동44', 02, 'C:\00.KOSMO93\20.Oracle', '없음', 02, 'Y', SYSDATE, SYSDATE);

INSERT INTO Kbd_MEMBER (
                        KNUM
                        ,KNAME
                        ,KID
                        ,KPW
                        ,KBIRTH
                        ,KGENDER
                        ,KTEL
                        ,KHP
                        ,KEMAIL
                        ,KADDR
                        ,KHOBBY
                        ,KPHOTO
                        ,KSKILL
                        ,KJOB
                        ,DELETEYN
                        ,INSERTDATE
                        ,UPDATEDATE
) VALUES (202108050005, 'AAAA', 'AA00', 'AA1234', 20210101, 02, 0212344567, 01012344567, 'AA00@abc.com', '경기 광명시 소하동55', 01, 'C:\00.KOSMO93\20.Oracle', '없음', 01, 'Y', SYSDATE, SYSDATE);

INSERT INTO Kbd_MEMBER (
                        KNUM
                        ,KNAME
                        ,KID
                        ,KPW
                        ,KBIRTH
                        ,KGENDER
                        ,KTEL
                        ,KHP
                        ,KEMAIL
                        ,KADDR
                        ,KHOBBY
                        ,KPHOTO
                        ,KSKILL
                        ,KJOB
                        ,DELETEYN
                        ,INSERTDATE
                        ,UPDATEDATE
) VALUES (202108050006, 'AAAA', 'AA00', 'AA1234', 20210101, 02, 0212344567, 01012344567, 'AA00@abc.com', '경기 광명시 소하동55', 01, 'C:\00.KOSMO93\20.Oracle', '없음', 01, 'Y', SYSDATE, SYSDATE);

INSERT INTO Kbd_MEMBER (
                        KNUM
                        ,KNAME
                        ,KID
                        ,KPW
                        ,KBIRTH
                        ,KGENDER
                        ,KTEL
                        ,KHP
                        ,KEMAIL
                        ,KADDR
                        ,KHOBBY
                        ,KPHOTO
                        ,KSKILL
                        ,KJOB
                        ,DELETEYN
                        ,INSERTDATE
                        ,UPDATEDATE
) VALUES (202108050007, 'AAAA', 'AA00', 'AA1234', 20210101, 02, 0212344567, 01012344567, 'AA00@abc.com', '경기 광명시 소하동55', 01, 'C:\00.KOSMO93\20.Oracle', '없음', 01, 'Y', SYSDATE, SYSDATE);

INSERT INTO Kbd_MEMBER (
                        KNUM
                        ,KNAME
                        ,KID
                        ,KPW
                        ,KBIRTH
                        ,KGENDER
                        ,KTEL
                        ,KHP
                        ,KEMAIL
                        ,KADDR
                        ,KHOBBY
                        ,KPHOTO
                        ,KSKILL
                        ,KJOB
                        ,DELETEYN
                        ,INSERTDATE
                        ,UPDATEDATE
) VALUES (202108050008, 'AAAA', 'AA00', 'AA1234', 20210101, 02, 0212344567, 01012344567, 'AA00@abc.com', '경기 광명시 소하동55', 01, 'C:\00.KOSMO93\20.Oracle', '없음', 01, 'Y', SYSDATE, SYSDATE);

INSERT INTO Kbd_MEMBER (
                        KNUM
                        ,KNAME
                        ,KID
                        ,KPW
                        ,KBIRTH
                        ,KGENDER
                        ,KTEL
                        ,KHP
                        ,KEMAIL
                        ,KADDR
                        ,KHOBBY
                        ,KPHOTO
                        ,KSKILL
                        ,KJOB
                        ,DELETEYN
                        ,INSERTDATE
                        ,UPDATEDATE
) VALUES (202108050009, 'AAAA', 'AA00', 'AA1234', 20210101, 02, 0212344567, 01012344567, 'AA00@abc.com', '경기 광명시 소하동55', 01, 'C:\00.KOSMO93\20.Oracle', '없음', 01, 'Y', SYSDATE, SYSDATE);

INSERT INTO Kbd_MEMBER (
                        KNUM
                        ,KNAME
                        ,KID
                        ,KPW
                        ,KBIRTH
                        ,KGENDER
                        ,KTEL
                        ,KHP
                        ,KEMAIL
                        ,KADDR
                        ,KHOBBY
                        ,KPHOTO
                        ,KSKILL
                        ,KJOB
                        ,DELETEYN
                        ,INSERTDATE
                        ,UPDATEDATE
) VALUES (202108050010, 'AAAA', 'AA00', 'AA1234', 20210101, 02, 0212344567, 01012344567, 'AA00@abc.com', '경기 광명시 소하동55', 01, 'C:\00.KOSMO93\20.Oracle', '없음', 01, 'Y', SYSDATE, SYSDATE);

COMMIT;

SELECT * FROM Kbd_MEMBER;
