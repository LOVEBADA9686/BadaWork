package a.b.c.kosmo.mem.sql;

public abstract class KbdMemberSqlMap {

	public static String ID_CHECK = "SELECT COUNT(A.KNUM) NCNT FROM KBE_MEMBER A WHERE A.DELETEYN = 'Y' AND A.KID = ? ";
			
			// 회원 채번 MYYYYMMDD0001
			public static String getKbdMemberChanbunQuery() {
		
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT												\n");
		sb.append("			NVL(MAX(SUBSTR(A.KNUM, -4)), 0) + 1 COMMNO	\n");
		sb.append("FROM		KBD_MEMBER	A								\n");
		
		return sb.toString();
	}
	
	// 전체조회
	public static String getKbdMemberSelectAllQuery(){
		
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT									\n");
		sb.append("		A.KNUM					KNUM		\n");
		sb.append("		,A.KNAME				KNAME		\n");
		sb.append("		,A.KID					KID			\n");
		sb.append("		,A.KPW					KPW			\n");
		sb.append("		,A.KBIRTH				KBIRTH		\n");
		sb.append("		,A.KGENDER				KGENDER		\n");
		sb.append("		,A.KTEL					KTEL		\n");
		sb.append("		,A.KHP					KHP			\n");
		sb.append("		,A.KEMAIL				KEMAIL		\n");
		sb.append("		,A.KADDR				KADDR		\n");
		sb.append("		,A.KHOBBY				KHOBBY		\n");
		sb.append("		,A.KPHOTO				KPHOTO		\n");
		sb.append("		,A.KSKILL				KSKILL		\n");
		sb.append("		,A.KJOB					KJOB		\n");
		sb.append("		,A.DELETEYN				DELETEYN	\n");
		sb.append("		,TO_CHAR(A.INSERTDATE, 'YYYY-MM-DD')	INSERTDATE	\n");
		sb.append("		,TO_CHAR(A.UPDATEDATE, 'YYYY-MM-DD')	UPDATEDATE	\n");
		sb.append("FROM										\n");
		sb.append("		KBD_MEMBER	A						\n");
		sb.append("	WHERE DELETEYN = 'Y'					\n");
		sb.append("	ORDER BY 1 DESC							\n");

		return sb.toString();
	}
	
	// 조건 조회 :: 회원번호
	public static String getKbdMemberSelectQuery() {
		
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT												\n");
		sb.append("					A.KNUM					KNUM		\n");
		sb.append("					,A.KNAME				KNAME		\n");
		sb.append("					,A.KID					KID			\n");
		sb.append("					,A.KPW					KPW			\n");
		sb.append("					,A.KBIRTH				KBIRTH		\n");
		sb.append("					,A.KGENDER				KGENDER		\n");
		sb.append("					,A.KTEL					KTEL		\n");
		sb.append("					,A.KHP					KHP			\n");
		sb.append("					,A.KEMAIL				KEMAIL		\n");
		sb.append("					,A.KADDR				KADDR		\n");
		sb.append("					,A.KHOBBY				KHOBBY		\n");
		sb.append("					,A.KPHOTO				KPHOTO		\n");
		sb.append("					,A.KSKILL				KSKILL		\n");
		sb.append("					,A.KJOB					KJOB		\n");
		sb.append("					,A.DELETEYN				DELETEYN	\n");
		sb.append("					,TO_CHAR(A.INSERTDATE, 'YYYY-MM-DD')	INSERTDATE			\n");
		sb.append("					,TO_CHAR(A.UPDATEDATE, 'YYYY-MM-DD')	UPDATEDATE			\n");
		sb.append("FROM													\n");
		sb.append("					KBD_MEMBER	A						\n");
		sb.append("	WHERE DELETEYN = 'Y'								\n");
		sb.append("	AND		A.KNUM	= ?									\n"); // placeholder 1

		return sb.toString();
	}
	
	public static String getKbdMemberInsertQuery() {
		// 쿼리문에 사용하는 SELECT, INSERT, UPDATE, DELETE
		// ? : 플레이스 홀더 는 그 쿼리문 에서 맨 처음에 사용하느 것인 index 1 이다.
		// 이후는 순차로 증가한다.
		StringBuffer sb = new StringBuffer();
		sb.append("INSERT INTO													\n");
		sb.append("		KBD_MEMBER												\n");
		sb.append("							(									\n");
		sb.append("								KNUM							\n");
		sb.append("								,KNAME							\n");
		sb.append("								,KID							\n");
		sb.append("								,KPW							\n");
		sb.append("								,KBIRTH							\n");
		sb.append("								,KGENDER						\n");
		sb.append("								,KTEL							\n");
		sb.append("								,KHP							\n");
		sb.append("								,KEMAIL							\n");
		sb.append("								,KADDR							\n");
		sb.append("								,KHOBBY							\n");
		sb.append("								,KPHOTO							\n");
		sb.append("								,KSKILL							\n");
		sb.append("								,KJOB							\n");
		sb.append("								,DELETEYN						\n");
		sb.append("								,INSERTDATE						\n");
		sb.append("								,UPDATEDATE						\n");
		sb.append("							)									\n");
		sb.append("					VALUES										\n");
		sb.append("							(									\n");
		sb.append("									?							\n");
		sb.append("									,?							\n");
		sb.append("									,?							\n");
		sb.append("									,?							\n");
		sb.append("									,?							\n");
		sb.append("									,?							\n");
		sb.append("									,?							\n");
		sb.append("									,?							\n");
		sb.append("									,?							\n");
		sb.append("									,?							\n");
		sb.append("									,?							\n");
		sb.append("									,?							\n");
		sb.append("									,?							\n");
		sb.append("									,?							\n");
		sb.append("									,'Y'						\n");
		sb.append("									,SYSDATE					\n");
		sb.append("									,SYSDATE					\n");
		sb.append("							)									\n");

		return sb.toString();
	}
	
	// 수정
	public static String getKbdMemberUpdateQuery() {
		
		StringBuffer sb = new StringBuffer();
		sb.append("UPDATE								\n");
		sb.append("			KBD_MEMBER					\n");
		sb.append("SET									\n");
		sb.append("			KEMAIL		= ?				\n");// placeholder 1
		sb.append("			,KADDR		= ?				\n");// placeholder 2
		sb.append("			,KHOBBY		= ?				\n");// placeholder 3
		sb.append("			,KJOB		= ?				\n");// placeholder 4
		sb.append("			,UPDATEDATE	= SYSDATE		\n");
		sb.append("WHERE KNUM			= ?				\n");// placeholder 5
		sb.append("AND DELETEYN			= 'Y'			\n");

		return sb.toString();
	}
	
	// 삭제 : FLAG 삭제
	public static String getKbdMemberDeleteQuery() {
		
		StringBuffer sb = new StringBuffer();
		sb.append("UPDATE								\n");
		sb.append("			KBD_MEMBER					\n");
		sb.append("SET									\n");
		sb.append("			DELETEYN	= 'N'			\n");
		sb.append("			,UPDATEDATE	= SYSDATE		\n");
		sb.append("WHERE	KNUM		= ?				\n");// placeholder 1
		sb.append("AND		DELETEYN	= 'Y'			\n");

		return sb.toString();
	}
	
	// 조건 조회 :: 회원 이름
	public static String getKbdMemberSelectNameQuery() {
		
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT								\n");
		sb.append("		A.KNUM			KNUM			\n");
		sb.append("		,A.KNAME		KNAME			\n");
		sb.append("		,A.KID			KID				\n");
		sb.append("		,A.KPW			KPW				\n");
		sb.append("		,A.KBIRTH		KBIRTH			\n");
		sb.append("		,A.KGENDER		KGENDER			\n");
		sb.append("		,A.KTEL			KTEL			\n");
		sb.append("		,A.KHP			KHP				\n");
		sb.append("		,A.KEMAIL		KEMAIL			\n");
		sb.append("		,A.KADDR		KADDR			\n");
		sb.append("		,A.KHOBBY		KHOBBY			\n");
		sb.append("		,A.KPHOTO		KPHOTO			\n");
		sb.append("		,A.KSKILL		KSKILL			\n");
		sb.append("		,A.KJOB			KJOB			\n");
		sb.append("		,A.DELETEYN			DELETEYN	\n");
		sb.append("		,TO_CHAR(A.INSERTDATE, 'YYYY_MM_DD') INSERTDATE		\n");
		sb.append("		,TO_CHAR(A.INSERTDATE, 'YYYY_MM_DD') UPDATEDATE		\n");
		sb.append("FROM									\n");
		sb.append("			KBD_MEMBER	A				\n");
		sb.append("WHERE DELETEYN	=	'Y'				\n");
		sb.append("AND	A.KNAME LIKE '%' || ? || '%'	\n");// placeholder 1

		return sb.toString();
	}
	
	// 회원 조회 :: 회원 아이디
	public static String getKbdMemberSelectIdQuery() {
		
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT								\n");
		sb.append("		A.KNUM			KNUM			\n");
		sb.append("		,A.KNAME		KNAME			\n");
		sb.append("		,A.KID			KID				\n");
		sb.append("		,A.KPW			KPW				\n");
		sb.append("		,A.KBIRTH		KBIRTH			\n");
		sb.append("		,A.KGENDER		KGENDER			\n");
		sb.append("		,A.KTEL			KTEL			\n");
		sb.append("		,A.KHP			KHP				\n");
		sb.append("		,A.KEMAIL		KEMAIL			\n");
		sb.append("		,A.KADDR		KADDR			\n");
		sb.append("		,A.KHOBBY		KHOBBY			\n");
		sb.append("		,A.KPHOTO		KPHOTO			\n");
		sb.append("		,A.KSKILL		KSKILL			\n");
		sb.append("		,A.KJOB			KJOB			\n");
		sb.append("		,A.DELETEYN		DELETEYN		\n");
		sb.append("		,TO_CHAR(A.INSERTDATE, 'YYYY_MM_DD') INSERTDATE		\n");
		sb.append("		,TO_CHAR(A.INSERTDATE, 'YYYY_MM_DD') UPDATEDATE		\n");
		sb.append("FROM									\n");
		sb.append("			KBD_MEMBER	A				\n");
		sb.append("WHERE DELETEYN	=	'Y'				\n");
		sb.append("AND	A.KID LIKE '%' || ? || '%'		\n");// placeholder 1

		return sb.toString();
	}
}
