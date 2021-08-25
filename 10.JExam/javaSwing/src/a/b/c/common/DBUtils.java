package a.b.c.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class DBUtils {
	
	// Ä¿³Ø¼Ç
	private static final String ORCL_JDBCDRIVER="oracle.jdbc.driver.OracleDriver";
	private static final String ORCL_URL="jdbc:oracle:thin:@127.0.0.1:1521:orclKOSMO00";
	private static final String ORCL_USER="scott";
	private static final String ORCL_PASS="tiger";
	
	// Äõ¸®
	public static final String MEMBER_SELECT_ALL = "SELECT * FROM K_MEMBER WHERE DELETEYN = 'Y' ORDER BY 1 DESC ";
	public static final String MEMBER_SELECT = "SELECT * FROM K_MEMBER WHERE KNUM = ? ";
	public static final String MEMBER_INSERT 
		= "INSERT INTO K_MEMBER VALUES (?, ?, ?, ?, 'Y', SYSDATE, SYSDATE) ";
	public static final String MEMBER_UPDATE 
		= "UPDATE K_MEMBER SET KID = ?, UPDATEDATE = SYSDATE WHERE DELETEYN = 'Y' AND KNUM = ? ";
	public static final String MEMBER_DELETE 
		= "UPDATE K_MEMBER SET DELETEYN = 'N', UPDATEDATE = SYSDATE WHERE DELETEYN = 'Y' AND KNUM = ? ";
	public static final String MEMBER_ID_CHECK 
		=  "SELECT COUNT(A.KNUM) NCNT FROM K_MEMBER A WHERE A.KID = ? AND A.DELETEYN = 'Y' ";
	public static final String MEMBER_CHABUN 
		= "SELECT /*+ INDEX_DESC(SYS_C0011100) */ NVL(MAX(SUBSTR(A.KNUM, -4)) ,0) + 1 COMMNO FROM  K_MEMBER A ";
	
	public static Connection getConnection() throws Exception{
	
		Connection conn = null;
		Class.forName(DBUtils.ORCL_JDBCDRIVER);
		conn=DriverManager.getConnection(DBUtils.ORCL_URL, DBUtils.ORCL_USER, DBUtils.ORCL_PASS);		
		return conn;	
	} // end of getConnection

	public static void conClose(Connection conn, PreparedStatement pstmt, ResultSet rsRs){
		 try {
			if(rsRs !=null){try {rsRs.close(); rsRs=null;} catch (Exception ex) {}}
			if(pstmt !=null){try {pstmt.close(); pstmt=null;} catch (Exception ex) {}}
			if(conn !=null){try {conn.close(); conn=null;} catch (Exception ex) {}}
		 } catch (Exception e2) {
			 System.out.println("¿¡·¯ >>> : " + e2.getMessage());
		 }		
	} // end of conClose()

	public static void conClose(Connection conn, PreparedStatement pstmt){
		 try {		
			if(pstmt !=null){try {pstmt.close(); pstmt=null;} catch (Exception ex) {}}
			if(conn !=null){try {conn.close(); conn=null;} catch (Exception ex) {}}
		 } catch (Exception e2) {
			 System.out.println("¿¡·¯ >>> : " + e2.getMessage());
		 }		
	} // end of conClose()
}//end of ConnProperty