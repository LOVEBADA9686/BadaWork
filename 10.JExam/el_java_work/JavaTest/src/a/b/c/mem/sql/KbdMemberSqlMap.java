package a.b.c.mem.sql;

public abstract class KbdMemberSqlMap {

	// 회원 채번 MYYYYMMDD0001
	public static String getKbdMemberChabunQuery() {
		
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT											\n");
		sb.append("		NVL(MAX(SUBSTR(A.KNUM, -4)), 0) + 1 COMMNO	\n");
		sb.append(" FROM 	KBD_MEMBER A							\n");	
		
		return sb.toString();
	}
	// 전체 조회
	public static String getKbdMemberSelectAllQuery() {
		
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT																	\n");
		sb.append("			A.KNUM				KNUM										\n");
		sb.append("			,A.KNAME			KNAME										\n");
		sb.append("			,A.KID				KID											\n");
		sb.append("			,A.KPW				KPW											\n");
		sb.append("			,A.KBIRTH			KBIRTH										\n");
		sb.append("			,A.KGENDER			KGENDER										\n");
		sb.append("			,A.KTEL				KTEL										\n");
		sb.append("			,A.KHP				KHP											\n");
		sb.append("			,A.KEMAIL			KEMAIL										\n");
		sb.append("			,A.KADDR			KADDR										\n");
		sb.append("			,A.KHOBBY			KHOBBY										\n");
		sb.append("			,A.KPHOTO			KPHOTO										\n");
		sb.append("			,A.KSKILL			KSKILL										\n");
		sb.append("			,A.KJOB				KJOB										\n");
		sb.append("			,A.DELETEYN			BDELETEYN									\n");
		sb.append("			,TO_CHAR(A.INSERTDATE, 'YYYY-MM-DD')  INSERTDATE				\n");
		sb.append("			,TO_CHAR(A.UPDATEDATE, 'YYYY-MM-DD')  UPDATEDATE				\n");
		sb.append("	FROM 																	\n");
	    sb.append("		 KBD_MEMBER A 														\n");
	    sb.append("	WHERE DELETEYN = 'Y'													\n");
	    sb.append("	ORDER BY 1 DESC															\n");
	    
	    return sb.toString();
	}
	
	// 전체 조회
	public static String getKbdMemberSelectQuery() {
		
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT																	\n");
		sb.append("			A.KNUM				KNUM										\n");
		sb.append("			,A.KNAME			KNAME										\n");
		sb.append("			,A.KID				KID											\n");
		sb.append("			,A.KPW				KPW											\n");
		sb.append("			,A.KBIRTH			KBIRTH										\n");
		sb.append("			,A.KGENDER			KGENDER										\n");
		sb.append("			,A.KTEL				KTEL										\n");
		sb.append("			,A.KHP				KHP											\n");
		sb.append("			,A.KEMAIL			KEMAIL										\n");
		sb.append("			,A.KADDR			KADDR										\n");
		sb.append("			,A.KHOBBY			KHOBBY										\n");
		sb.append("			,A.KPHOTO			KPHOTO										\n");
		sb.append("			,A.KSKILL			KSKILL										\n");
		sb.append("			,A.KJOB				KJOB										\n");
		sb.append("			,A.DELETEYN			BDELETEYN									\n");
		sb.append("			,TO_CHAR(A.INSERTDATE, 'YYYY-MM-DD')  INSERTDATE				\n");
		sb.append("			,TO_CHAR(A.UPDATEDATE, 'YYYY-MM-DD')  UPDATEDATE				\n");
		sb.append("	FROM 																	\n");
	    sb.append("		 KBD_MEMBER A 														\n");
	    sb.append("	WHERE DELETEYN = 'Y'													\n");
	    sb.append("	AND	A.KNUM	= ?															\n");
	    
	    return sb.toString();
	}
	
	public static String getKbdMemberInsertQuery() {
		// 쿼리문에 사용하는 SELECT, INSERT, UPDATE, DELETE 
		// ? : 플레이스 홀더 는 그 쿼리문 에서 맨 처음에 사용한 것인 index 1 이다.
		// 이후는 순차로 증가한다. 
		StringBuffer sb = new StringBuffer();			
		sb.append("	INSERT INTO 						\n");	
		sb.append("		KBD_MEMBER 				    	\n");
		sb.append("		          (			    		\n");
		sb.append("      			 KNUM 				\n"); // COLUMN 1
		sb.append("					,KNAME 				\n"); // COLUMN 2
		sb.append("					,KID 				\n"); // COLUMN 3
	    sb.append("					,KPW   				\n"); // COLUMN 4
	    sb.append("					,KBIRTH				\n"); // COLUMN 5	    
	    sb.append("					,KGENDER 			\n"); // COLUMN 6	    
	    sb.append("					,KTEL   			\n"); // COLUMN 7	    
	    sb.append("					,KHP 				\n"); // COLUMN 8	    	    
	    sb.append("					,KEMAIL				\n"); // COLUMN 9
	    sb.append("					,KADDR 				\n"); // COLUMN 10	    	    
	    sb.append("					,KHOBBY				\n"); // COLUMN 11
	    sb.append("					,KPHOTO 			\n"); // COLUMN 12
	    sb.append("					,KSKILL				\n"); // COLUMN 13
	    sb.append("					,KJOB				\n"); // COLUMN 14	    	    	  
	    sb.append("					,DELETEYN			\n"); // COLUMN 15
	    sb.append("					,INSERTDATE			\n"); // COLUMN 16
	    sb.append("					,UPDATEDATE			\n"); // COLUMN 17
		sb.append("			      )						\n");
		sb.append("	       VALUES   					\n");
		sb.append("	       		 (  					\n");
		sb.append("     				 ? 				\n"); // placeholder 1
		sb.append("						,? 				\n"); // placeholder 2
	    sb.append("						,?   			\n"); // placeholder 3
	    sb.append("						,?   			\n"); // placeholder 4
	    sb.append("						,? 				\n"); // placeholder 5
	    sb.append("						,? 				\n"); // placeholder 6
	    sb.append("						,?				\n"); // placeholder 7
	    sb.append("						,?				\n"); // placeholder 8
	    sb.append("						,?				\n"); // placeholder 9
	    sb.append("						,?   			\n"); // placeholder 10
	    sb.append("						,? 				\n"); // placeholder 11
	    sb.append("						,? 				\n"); // placeholder 12
	    sb.append("						,?				\n"); // placeholder 13
	    sb.append("						,?				\n"); // placeholder 14
	    sb.append("						,'Y'			\n"); // placeholder 15
	    sb.append("						,SYSDATE 		\n"); // placeholder 16
	    sb.append("						,SYSDATE 		\n"); // placeholder 17	
		sb.append("	              )						\n");		
		
		return sb.toString();
	}
	
	// 수정
	public static String getKbdMemberUpdateQuery() {
		
		StringBuffer sb = new StringBuffer();			
		sb.append("	UPDATE  							\n");	
		sb.append("		   	 KBD_MEMBER 			    \n");	
		sb.append("	SET  								\n");		
		sb.append("			 KEMAIL 		= ?			\n"); // placeholder 1	    	    
		sb.append("			,KADDR			= ?			\n"); // placeholder 2	    
		sb.append("			,KHOBBY 		= ? 		\n"); // placeholder 3
		sb.append("			,KJOB   		= ?			\n"); // placeholder 4	        		
	    sb.append("		  	,UPDATEDATE 	= SYSDATE	\n");
		sb.append("	WHERE  	 KNUM 			= ?			\n"); // placeholder 5	    
		sb.append("	AND    	 DELETEYN 		= 'Y'  		\n");		
					
		return sb.toString();
	}
	// 삭제
	public static String getKbdMemberDeleteQuery() {
		StringBuffer sb = new StringBuffer();			
		sb.append("	UPDATE  							\n");	
		sb.append("		   KBD_MEMBER 			    	\n");	
		sb.append("	SET  								\n");
	    sb.append("		   DELETEYN 	= 'N'			\n");	    	   
	    sb.append("		  ,UPDATEDATE 	= SYSDATE		\n");
		sb.append("	WHERE  KNUM 		= ?				\n");	 // placeholder 1    
		sb.append("	AND    DELETEYN 	= 'Y'  			\n");		
					
		return sb.toString();
	}
}
