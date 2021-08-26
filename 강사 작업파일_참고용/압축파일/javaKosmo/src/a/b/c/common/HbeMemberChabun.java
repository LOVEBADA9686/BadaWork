package a.b.c.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import a.b.c.kosmo.mem.sql.HbeMemberSqlMap;

public class HbeMemberChabun {
	
	public static final String BIZ_GUBUN_M = "M"; // 회원

	// 채번 쿼리  불러오기 
	public static String ymdNum() {
		
		// 지역변수 선언 하고 초기화 하기 		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		String commNO = "";
		
		try {
			conn = HbeConnProperty.getConnection();
			pstmt = conn.prepareStatement(HbeMemberSqlMap.getHbeMemberChabunQuery());
			System.out.println("회원채번 쿼리 >>> \n" + HbeMemberSqlMap.getHbeMemberChabunQuery());
			rsRs = pstmt.executeQuery();
			
			if (rsRs !=null) {
				while (rsRs.next()) {
					commNO = rsRs.getString("COMMNO");									
				}
			}else {
				System.out.println("채번쿼리 실패 >>> : ");
			}
			
			// 디비에서 가져온  맥스값 :: 1
			System.out.println("commNO >>> : " + commNO);			
			// 디비에서 가져온  맥스값 :: 1 + 000 채우기 : 0001
			commNO = CodeUtil.numPad(commNO);
			System.out.println("commNO >>> : " + commNO);
			// 현재 날짜형식 붙이기 : 20210809 :: 20210809 + 0001 = 202108090001
			commNO = DateUtil.yyyymmdd().concat(commNO);
			System.out.println("commNO >>> : " + commNO);
			// 업무구분 코드 붙이기 : 회원 M
			commNO = HbeMemberChabun.BIZ_GUBUN_M.concat(commNO);
			System.out.println("commNO >>> : " + commNO);
			
			HbeConnProperty.conClose(conn, pstmt, rsRs);			
		}catch(Exception e) {
			System.out.println("HbeMemberChabun ymdNum 디비 에러 >>> : " + e.getMessage());
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
