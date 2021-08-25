package a.b.c.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.text.SimpleDateFormat;
//import java.util.Date;

import a.b.c.board.sql.HbeBoardSqlMap;
import a.b.c.mem.sql.HbeMemberSqlMap;

public class HbeBoardChabun {
	
	public static final String BIZ_GUBUN_M = "M"; // ȸ��
	public static final String BIZ_GUBUN_B = "B"; // �Խ���
	

	// ä�� ����  �ҷ����� 
	public static String gubunNum() {
		
		// �������� ���� �ϰ� �ʱ�ȭ �ϱ� 		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		String commNO = "";
		
		try {
			conn = HbeConnProperty.getConnection();
			pstmt = conn.prepareStatement(HbeBoardSqlMap.getHboardChabunQueryMap());
			System.out.println("�Խ���ä�� ���� >>> \n" + HbeBoardSqlMap.getHboardChabunQueryMap());
			rsRs = pstmt.executeQuery();
			
			if (rsRs !=null) {
				while (rsRs.next()) {
					commNO = rsRs.getString("COMMNO");									
				}
			}else {
				System.out.println("ä������ ���� >>> : ");
			}
			
			// ��񿡼� ������  �ƽ��� :: 1
			System.out.println("commNO >>> : " + commNO);			
			// ��񿡼� ������  �ƽ��� :: 1 + 000 ä��� : 0001
			commNO = CodeUtil.numPad(commNO);
			System.out.println("commNO >>> : " + commNO);		
			// �������� �ڵ� ���̱� : �Խ��� B
			commNO = HbeBoardChabun.BIZ_GUBUN_B.concat(commNO);
			System.out.println("commNO >>> : " + commNO);
			
			HbeConnProperty.conClose(conn, pstmt, rsRs);			
		}catch(Exception e) {
			System.out.println("HbeMemberChabun gubunNum ��� ���� >>> : " + e.getMessage());
		}finally {
			HbeConnProperty.conClose(conn, pstmt, rsRs);
		}
		
		return commNO;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String commNO = HbeBoardChabun.gubunNum();
		System.out.println("main :: commNO >>> : " + commNO);
	}
}
