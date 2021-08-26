package a.b.c.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import a.b.c.kosmo.mem.sql.HbeMemberSqlMap;

public class HbeMemberChabun {
	
	public static final String BIZ_GUBUN_M = "M"; // ȸ��

	// ä�� ����  �ҷ����� 
	public static String ymdNum() {
		
		// �������� ���� �ϰ� �ʱ�ȭ �ϱ� 		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		String commNO = "";
		
		try {
			conn = HbeConnProperty.getConnection();
			pstmt = conn.prepareStatement(HbeMemberSqlMap.getHbeMemberChabunQuery());
			System.out.println("ȸ��ä�� ���� >>> \n" + HbeMemberSqlMap.getHbeMemberChabunQuery());
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
			// ���� ��¥���� ���̱� : 20210809 :: 20210809 + 0001 = 202108090001
			commNO = DateUtil.yyyymmdd().concat(commNO);
			System.out.println("commNO >>> : " + commNO);
			// �������� �ڵ� ���̱� : ȸ�� M
			commNO = HbeMemberChabun.BIZ_GUBUN_M.concat(commNO);
			System.out.println("commNO >>> : " + commNO);
			
			HbeConnProperty.conClose(conn, pstmt, rsRs);			
		}catch(Exception e) {
			System.out.println("HbeMemberChabun ymdNum ��� ���� >>> : " + e.getMessage());
		}finally {
			HbeConnProperty.conClose(conn, pstmt, rsRs);
		}
		
		return commNO;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String commNO = HbeMemberChabun.ymdNum();
		System.out.println("main :: commNO >>> : " + commNO);
	}
}
