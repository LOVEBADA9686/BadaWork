package a.b.c.common;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//import java.text.SimpleDateFormat;
//import java.util.Date;

import a.b.c.board.sql.HbeBoardSqlMap;
import a.b.c.mem.sql.HbeMemberSqlMap;

public class HbeBoardChabun {
	
	public static final String BIZ_GUBUN_M = "M"; // 회원
	public static final String BIZ_GUBUN_B = "B"; // 게시판
	

	// 채번 쿼리  불러오기 
	public static String gubunNum() {
		
		// 지역변수 선언 하고 초기화 하기 		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		String commNO = "";
		
		try {
			conn = HbeConnProperty.getConnection();
			pstmt = conn.prepareStatement(HbeBoardSqlMap.getHboardChabunQueryMap());
			System.out.println("게시판채번 쿼리 >>> \n" + HbeBoardSqlMap.getHboardChabunQueryMap());
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
			// 업무구분 코드 붙이기 : 게시판 B
			commNO = HbeBoardChabun.BIZ_GUBUN_B.concat(commNO);
			System.out.println("commNO >>> : " + commNO);
			
			HbeConnProperty.conClose(conn, pstmt, rsRs);			
		}catch(Exception e) {
			System.out.println("HbeMemberChabun gubunNum 디비 에러 >>> : " + e.getMessage());
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
