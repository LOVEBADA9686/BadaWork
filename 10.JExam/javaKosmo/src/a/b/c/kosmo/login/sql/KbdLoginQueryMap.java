package a.b.c.kosmo.login.sql;

public abstract class KbdLoginQueryMap {

		// �α��� Ȯ��
	public static String gethLoginCheckQuery() {
		
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT							\n");
		sb.append("		COUNT(A.KNUM)	NCNT		\n");
		sb.append("FROM								\n");
		sb.append("		KBD_MEMBER		A			\n");
		sb.append("WHERE A.DELETEYN		= 'Y'		\n");
		sb.append("AND	A.KID			= ?			\n");
		sb.append("AND	A.KPW			= ?			\n");

	    return sb.toString();
	    
		}
	}	
