package a.b.c.com.kbd.board.sql;

public class BoardSqlMap {

	public static String getBoardSelectAllQuery(){
		return null;
	}
	
	public static String getBoardSelectQuery(){
		return null;
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
		return null;
	}
	
	public static String getBoardDeleteQuery(){
		return null;
	}
	
}
