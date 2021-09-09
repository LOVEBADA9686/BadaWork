package a.b.c.com.common;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public abstract class ConnProperty {

	// ��� ���� :  4type thin ����̺� ���
	// �����ͺ��̽� ���� ���� : DataSource ��� �θ���. 
	public static final String KBD_URL = "jdbc:oracle:thin:@localhost:1521:orcl";
	public static final String KBD_USER = "kbd";
	public static final String KBD_PASS = "kbd1234";	
	public static final String KBD_DRIVER = "oracle.jdbc.driver.OracleDriver";
		
	public static Connection getConnection() {		
		
		Connection conn = null;
		
		try {
			Class.forName(ConnProperty.KBD_DRIVER);
			conn = DriverManager.getConnection( ConnProperty.KBD_URL
					                           ,ConnProperty.KBD_USER
					                           ,ConnProperty.KBD_PASS);
		}catch(Exception c) {
			System.out.println("����̹� ã�⿡ ������ �߻� >>> : " + c);
		}	
				
		return conn;
	}
	
	public static void conClose( Connection conn
					            ,PreparedStatement pstmt 
					            ,ResultSet rsRs) {
		try{
			if (rsRs != null) try { rsRs.close(); rsRs = null; } catch(Exception ex){}
			if (pstmt != null) try { pstmt.close(); pstmt = null; } catch(Exception ex){}
			if (conn != null) try { conn.close(); conn = null; } catch(Exception ex){}
		}
		catch (Exception e2){}			
	}
	
	public static void conClose(Connection conn, PreparedStatement pstmt) {
		try{
			if (pstmt != null) try { pstmt.close(); pstmt = null; } catch(Exception ex){}
			if (conn != null) try { conn.close(); conn = null; } catch(Exception ex){}
		}
		catch (Exception e2){}			
	}	
}
