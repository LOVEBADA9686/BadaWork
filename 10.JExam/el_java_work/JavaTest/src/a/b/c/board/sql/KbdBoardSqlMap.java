package a.b.c.board.sql;

public abstract class KbdBoardSqlMap {

	public static String getKbdBoardChabunQueryMap() {
		
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT											\n");
		sb.append("		NVL(MAX(SUBSTR(A.BNUM, -4)), 0) + 1 COMMNO	\n");
		sb.append(" FROM 	KBD_MEMBER A							\n");
		
		return sb.toString();
	};
	
	// ��ü ��ȸ
	public static String getKbdBoardSelectAllQueryMap() {
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT																	\n");
		sb.append("				A.BNUM				BNUM									\n");
		sb.append("				,A.BSUBJECT			BSUBJECT								\n");
		sb.append("				,A.BWRITER			BWRITER									\n");
		sb.append("				,A.BCONTENTS		BCONTENTS								\n");
		sb.append("				,A.BPW				BPW										\n");
		sb.append("				,A.DELETEYN				DELETEYN									\n");
		sb.append("				,TO_CHAR(A.INSERTDATE, 'YYYY-MM-DD')  INSERTDATE					\n");
		sb.append("				,TO_CHAR(A.UPDATEDATE, 'YYYY-MM-DD')  UPDATEDATE					\n");
		sb.append("	FROM 																	\n");
	    sb.append("		 KBD_BOARD A 														\n");
	    sb.append("	WHERE DELETEYN = 'Y'													\n");
	    sb.append("	ORDER BY 1 DESC															\n");
	    
	    return sb.toString();
	};
	
	// ���� ��ȸ
	public static String getKbdBoardSelectQueryMap() {
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT																	\n");
		sb.append("				A.BNUM				BNUM									\n");
		sb.append("				,A.BSUBJECT			BSUBJECT								\n");
		sb.append("				,A.BWRITER			WRITER									\n");
		sb.append("				,A.BCONTENTS		BCONTENTS								\n");
		sb.append("				,A.BPW				BPW										\n");
		sb.append("				,A.DELETEYN				DELETEYN									\n");
		sb.append("				,TO_CHAR(A.INSERTDATE, 'YYYY-MM-DD')  INSERTDATE					\n");
		sb.append("				,TO_CHAR(A.UPDATEDATE, 'YYYY-MM-DD')  UPDATEDATE					\n");
		sb.append("	FROM 																	\n");
	    sb.append("		 KBD_BOARD A 														\n");
	    sb.append("	WHERE DELETEYN = 'Y'													\n");
	    sb.append("	AND	A.BNUM	= ?															\n");
	    
	    return sb.toString();
	};
	
	// ���
	public static String getKbdBoardInsertQueryMap() {
		StringBuffer sb = new StringBuffer();
		sb.append("	INSERT INTO 								\n");	
		sb.append("		KBD_BOARD 				    			\n");
		sb.append("		          (			    				\n");
		sb.append("      			 BNUM 						\n");
		sb.append("      			 ,BSUBJECT 					\n");
		sb.append("      			 ,BWRITER 					\n");
		sb.append("      			 ,BCONTENTS 				\n");
		sb.append("      			 ,BPW 						\n");
		sb.append("      			 ,DELETEYN 					\n");
		sb.append("      			 ,INSERTDATE 				\n");
		sb.append("      			 ,UPDATEDATE 				\n");
		sb.append("			      )								\n");
		sb.append("	       VALUES   							\n");
		sb.append("	       		 (  							\n");
		sb.append("     				 ? 						\n");
		sb.append("						,? 						\n");
	    sb.append("						,?   					\n");
	    sb.append("						,?   					\n");
	    sb.append("						,? 						\n");
	    sb.append("						,'Y'					\n");
	    sb.append("						,SYSDATE 				\n");
	    sb.append("						,SYSDATE 				\n");	
		sb.append("	              )								\n");	
		
		return sb.toString();
	};
	
	// ����
	public static String getKbdboardUpdateQueryMap() {
		StringBuffer sb = new StringBuffer();
		sb.append("	UPDATE  							\n");	
		sb.append("		   	 KBD_BOARD	 			    \n");	
		sb.append("	SET  								\n");		
		sb.append("			BSUBJECT			= ?			\n"); // placeholder 2	    
		sb.append("			,BCONTENTS   		= ?			\n"); // placeholder 4	        		
	    sb.append("		  	,UPDATEDATE 		= SYSDATE	\n");
	  	sb.append("	WHERE  	 BNUM 				= ?			\n"); // placeholder 5	    
	  	sb.append("	AND    	 DELETEYN 			= 'Y'  		\n");	
	  	
	  	return sb.toString();
	};
	
	// ����
	public static String getKboardDeleteQueryMap() {
		
		StringBuffer sb = new StringBuffer();			
		sb.append("	UPDATE  							\n");	
		sb.append("		   KBD_BOARD 			    	\n");	
		sb.append("	SET  								\n");
	    sb.append("		   DELETEYN 	= 'N'			\n");	    	   
	    sb.append("		  ,UPDATEDATE 	= SYSDATE		\n");
		sb.append("	WHERE  BNUM	 		= ?				\n");	    
		sb.append("	AND    DELETEYN 	= 'Y'  			\n");		
					
		return sb.toString();	
	};
}

