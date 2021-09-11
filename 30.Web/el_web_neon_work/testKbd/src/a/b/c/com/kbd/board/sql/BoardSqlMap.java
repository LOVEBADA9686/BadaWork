package a.b.c.com.kbd.board.sql;

public abstract class BoardSqlMap {

	// MaxChabun ����
	public static String getMaxChabunQuery() {
		
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT  /*+ INDEX_DESC(A SYS_C0011474) */			 \n");
		sb.append("			 NVL(MAX(SUBSTR(A.BNUM, -4)), 0) + 1 MAXNUM  \n");
		sb.append("FROM MVC_BOARD A									     \n");
		
		return sb.toString();
	}
	
	public static String getBoardSelectAllQuery(){
		
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT												\n");
		sb.append("		A.BNUM				BNUM						\n");
		sb.append("		,A.BSUBJECT			BSUBJECT					\n");
		sb.append("		,A.BWRITER			BWRITER						\n");
		sb.append("		,A.BPW				BPW							\n");
		sb.append("		,A.BMEMO			BMEMO						\n");
		sb.append("		,A.BPHOTO			BPHOTO						\n");
		sb.append("		,A.DELETEYN			DELETEYN					\n");
		sb.append("		,TO_CHAR(A.INSERTDATE, 'YYYY-MM-DD')		INSERTDATE	\n");
		sb.append("		,TO_CHAR(A.UPDATEDATE, 'YYYY-MM-DD')		UPDATEDATE	\n");
		sb.append("	FROM												\n");
		sb.append("		MVC_BOARD A										\n");
		sb.append(" WHERE A.DELETEYN = 'Y'								\n");
		sb.append(" ORDER BY 1 DESC										\n");

		return sb.toString();
	}
	
	public static String getBoardSelectQuery(){ 
		
		StringBuffer sb = new StringBuffer();			
		sb.append(" SELECT 								\n");
		sb.append("      A.BNUM 		BNUM 			\n");
		sb.append("		,A.BSUBJECT  	BSUBJECT 		\n");
		sb.append("		,A.BWRITER  	BWRITER 		\n");
	    sb.append("		,A.BPW  		BPW   			\n");	    	    	    
	    sb.append("		,A.BMEMO  		BMEMO			\n");
	    sb.append("		,A.BPHOTO  		BPHOTO			\n");	 
	    sb.append("		,A.DELETEYN  	DELETEYN		\n");	
	    sb.append("		,TO_CHAR(A.INSERTDATE, 'YYYY-MM-DD')  INSERTDATE	\n");
	    sb.append("		,TO_CHAR(A.UPDATEDATE, 'YYYY-MM-DD')  UPDATEDATE	\n");	   
	    sb.append("	FROM 								\n");
	    sb.append("		 MVC_BOARD A 					\n");
	    sb.append("	WHERE A.DELETEYN = 'Y'				\n");
	    sb.append("	AND   A.BNUM 	 =  ?  				\n");

	    return sb.toString();	

	}
	
	public static String getBoardInsertQuery(){
		
		StringBuffer sb = new StringBuffer();
		sb.append("INSERT INTO												\n");
		sb.append("		MVC_BOARD											\n");
		sb.append("							(								\n");
		sb.append("							BNUM							\n");
		sb.append("							,BSUBJECT						\n");
		sb.append("							,BWRITER						\n");
		sb.append("							,BPW							\n");
		sb.append("							,BMEMO							\n");
		sb.append("							,BPHOTO							\n");
		sb.append("							,DELETEYN						\n");
		sb.append("							,INSERTDATE						\n");
		sb.append("							,UPDATEDATE						\n");
		sb.append("							)								\n");
		sb.append("						VALUES (							\n");
		sb.append("							?								\n");
		sb.append("							,?								\n");
		sb.append("							,?								\n");
		sb.append("							,?								\n");
		sb.append("							,?								\n");
		sb.append("							,?								\n");
		sb.append("							,'Y'							\n");
		sb.append("							,SYSDATE						\n");
		sb.append("							,SYSDATE						\n");
		sb.append("							)								\n");

		return sb.toString();
	}
	
	public static String getBoardUpdateQuery(){
		
		StringBuffer sb = new StringBuffer();
		sb.append("UPDATE								\n");
		sb.append("		MVC_BOARD						\n");
		sb.append("SET									\n");
		sb.append("		BSUBJECT			= ?			\n");
		sb.append("		,BMEMO				= ?			\n");
		sb.append("		,UPDATEDATE			= SYSDATE	\n");
		sb.append("WHERE BNUM				= ?			\n");
		sb.append("AND DELETEYN				= 'Y'		\n");
		
		return sb.toString();
	}
	
	public static String getBoardDeleteQuery(){
		
		StringBuffer sb = new StringBuffer();
		sb.append("UPDATE							\n");
		sb.append("		MVC_BOARD					\n");
		sb.append("SET								\n");
		sb.append("		DELETEYN		= 'N'		\n");
		sb.append("		,UPDATEDATE		= SYSDATE	\n");
		sb.append("WHERE BNUM			= ?			\n");
		sb.append("AND 	DELETEYN		= 'Y'		\n");
				
		return sb.toString();
	}
	
}
