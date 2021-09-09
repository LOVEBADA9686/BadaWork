package a.b.c.kosmo.login.sql;

public abstract class HbeLoginQueryMap {
	
	// 로그인 확인
	public static String gethLoginCheckQuery() {
			
		StringBuffer sb = new StringBuffer();			
		sb.append(" SELECT 								\n");
		sb.append("       COUNT(A.HNUM)  NCNT 			\n");		
	    sb.append("	FROM 								\n");	    
	    sb.append("		  HBE_MEMBER 	A 				\n");
	    sb.append("	WHERE A.DELETEYN 	= 'Y'			\n");	    
	    sb.append("	AND   A.HID 	  	= ?				\n");
	    sb.append("	AND   A.HPW  		= ?   			\n");

	    return sb.toString();
	}

}
