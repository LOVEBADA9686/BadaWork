package a.b.c.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public abstract class ChabunUtils {

	// ä��
	private static final String BIZ_GUBUN_M	= "M"; // ȸ�� : MEMBER
	private static final String BIZ_GUBUN_B = "B"; // �Խ��� : BOARD
	
	// type : D : 20210001, M : YYYYMM, Y : YYYY, N : 
	public static String numPad(String t, String c){
	
		for (int i=c.length(); i < 4; i++) {
			c = "0" + c;
		}				
		String ymd = DateUtils.ymdFormats(t);		
		return ymd.concat(c);
	} // end of numPad()
	 
	public static String maxNum() {
		System.out.println("ChabunUtils maxNum() �Լ� ���� >>> : ");
		
		// �������� ���� �ϰ� �ʱ�ȭ �ϱ� 
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		String commNO = "";
		
		try {
			conn = DBUtils.getConnection();
			pstmt = conn.prepareStatement(DBUtils.MEMBER_CHABUN);
			System.out.println("ä�� ���� >>> \n" + DBUtils.MEMBER_CHABUN);
			rsRs = pstmt.executeQuery();
			
			if (rsRs !=null) {
				while (rsRs.next()) {
					commNO = rsRs.getString("COMMNO");									
				}
			}
		
			DBUtils.conClose(conn, pstmt, rsRs);			
		}catch(Exception e) {
			System.out.println("������ >>> : " + e.getMessage());
		}finally {
			DBUtils.conClose(conn, pstmt, rsRs);
		}		
		return commNO;
	}
	
	// ȸ�� ��ȣ
	public static String getMemberChabun(String type) {	
		return BIZ_GUBUN_M.concat(ChabunUtils.numPad(type, ChabunUtils.maxNum()));
	} // end of getMemberChabun()
	
	// �Խ��� �� ��ȣ  
	public static String getBoardChabun(String type) {		
		return BIZ_GUBUN_B.concat(ChabunUtils.numPad(type, ChabunUtils.maxNum()));
	} // end of getBoardChabun()
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ChabunUtils.getMemberChabun() >>> : " + ChabunUtils.getMemberChabun("D"));
	}
}
