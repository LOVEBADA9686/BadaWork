package a.b.c.swing.sample;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import a.b.c.common.DBUtils;

public class MemberDAO {

	public ArrayList<MemberVO> memberSelectAll() {
		// TODO Auto-generated method stub
		System.out.println("MemberDAO memberSelectAll() 함수 진입 >>> : ");
		
		// 사용할 객체를 지역변수로 선언하고 초기화 하기 
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		ArrayList<MemberVO> aList = null;
		
		try {			
			conn = DBUtils.getConnection();
			pstmt = conn.prepareStatement(DBUtils.MEMBER_SELECT_ALL);
			System.out.println("회원 전체 조회 >>> : \n"+ DBUtils.MEMBER_SELECT_ALL);
  
			rsRs = pstmt.executeQuery();
			
			if (rsRs !=null) {
				aList = new ArrayList<MemberVO>();
				
				while (rsRs.next()) {					
					MemberVO _mvo = new MemberVO();					
					_mvo.setKnum(rsRs.getString(1));
					_mvo.setKname(rsRs.getString(2));
					_mvo.setKid(rsRs.getString(3));
					_mvo.setKpw(rsRs.getString(4));											
					_mvo.setDeleteyn(rsRs.getString(5));
					_mvo.setInsertdate(rsRs.getString(6));
					_mvo.setUpdatedate(rsRs.getString(7));

					aList.add(_mvo);
					MemberVO.printMemberVO(_mvo);					
				}
			}	
			
			DBUtils.conClose(conn, pstmt, rsRs);
		}catch(Exception e) {
			System.out.println("디비연동에 문제가 생겼습니다. >>> : " + e);
		}finally {
			DBUtils.conClose(conn, pstmt, rsRs);				
		}
				
		return aList;
	}
	
	public ArrayList<MemberVO> memberSelect(MemberVO mvo) {
		// TODO Auto-generated method stub
		System.out.println("MemberDAO memberSelect() 함수 진입 >>> : ");
		MemberVO.printlnMemberVO(mvo);
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		ArrayList<MemberVO> aList = null;
		
		try {			
			conn = DBUtils.getConnection();
			pstmt = conn.prepareStatement(DBUtils.MEMBER_SELECT);
			System.out.println("회원번호 조회 >>> : \n"+ DBUtils.MEMBER_SELECT);
  
			pstmt.clearParameters();
			pstmt.setString(1, mvo.getKnum());
			rsRs = pstmt.executeQuery();			
			
			if (rsRs !=null) {
				aList = new ArrayList<MemberVO>();
				
				while (rsRs.next()) {
					MemberVO _mvo = new MemberVO();					
					_mvo.setKnum(rsRs.getString(1));
					_mvo.setKname(rsRs.getString(2));
					_mvo.setKid(rsRs.getString(3));
					_mvo.setKpw(rsRs.getString(4));											
					_mvo.setDeleteyn(rsRs.getString(5));
					_mvo.setInsertdate(rsRs.getString(6));
					_mvo.setUpdatedate(rsRs.getString(7));

					aList.add(_mvo);
					MemberVO.printMemberVO(_mvo);							
				}
			}	
			
			DBUtils.conClose(conn, pstmt, rsRs);
		}catch(Exception e) {
			System.out.println("디비연동에 문제가 생겼습니다. >>> : " + e);
		}finally {			
			DBUtils.conClose(conn, pstmt, rsRs);							
		}
				
		return aList;
	}
	
	public boolean memberInsert(MemberVO mvo) {
		// TODO Auto-generated method stub
		System.out.println("MemberDAO memberInsert() 함수 진입 >>> : ");
		MemberVO.printlnMemberVO(mvo);
		 
		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		boolean bool = false;
		
		try {			
			conn = DBUtils.getConnection();
			System.out.println("conn.getAutoCommit() >>> : " + conn.getAutoCommit());
			
			pstmt = conn.prepareStatement(DBUtils.MEMBER_INSERT);
			System.out.println("회원 입력하기 >>> : \n"+ DBUtils.MEMBER_INSERT);
  			
			pstmt.clearParameters();
			pstmt.setString(1, mvo.getKnum());
			pstmt.setString(2, mvo.getKname());
			pstmt.setString(3, mvo.getKid());
			pstmt.setString(4, mvo.getKpw());

			nCnt = pstmt.executeUpdate();
			if (!conn.getAutoCommit()) conn.commit();			
			System.out.println("nCnt >>> : " + nCnt + " 건 등록 되었음 ");
			
			if (nCnt > 0) { bool = true;}
			
			DBUtils.conClose(conn, pstmt);
		}catch(Exception e) {
			System.out.println("입력 디비연동에 문제가 생겼습니다. >>> : " + e);
		}finally {
			DBUtils.conClose(conn, pstmt);				
		}
				
		return bool;
	}
	
	public boolean memberUpdate(MemberVO mvo) {
		// TODO Auto-generated method stub
		System.out.println("MemberDAO memberUpdate() 함수 진입 >>> : ");
		MemberVO.printlnMemberVO(mvo);
		 
		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		boolean bool = false;
		
		try {			
			conn = DBUtils.getConnection();
			System.out.println("conn.getAutoCommit() >>> : " + conn.getAutoCommit());
			
			pstmt = conn.prepareStatement(DBUtils.MEMBER_UPDATE);
			System.out.println("회원정보 수정하기 >>> : \n"+ DBUtils.MEMBER_UPDATE);
  			
			pstmt.clearParameters();			
			pstmt.setString(1, mvo.getKid());			
			pstmt.setString(2, mvo.getKnum());
			
			nCnt = pstmt.executeUpdate();
			if (!conn.getAutoCommit()) conn.commit();			
			System.out.println("nCnt >>> : " + nCnt + " 건 수정 되었음 ");
			
			if (nCnt > 0) { bool = true;}
			
			DBUtils.conClose(conn, pstmt);
		}catch(Exception e) {
			System.out.println("업데이트 디비연동에 문제가 생겼습니다. >>> : " + e);
		}finally {
			DBUtils.conClose(conn, pstmt);				
		}
				
		return bool;
	}
	
	public boolean memberDelete(MemberVO mvo) {
		// TODO Auto-generated method stub
		System.out.println("MemberDAO memberDelete() 함수 진입 >>> : ");
		MemberVO.printMemberVO(mvo);
		
		// 사용할 객체를 지역변수로 선언하고 초기화 하기 
		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		boolean bool = false;
		
		try {			

			conn = DBUtils.getConnection();
			System.out.println("conn.getAutoCommit() >>> : " + conn.getAutoCommit());
			
			pstmt = conn.prepareStatement(DBUtils.MEMBER_DELETE);
			System.out.println("회원정보 플래그 삭제하기 >>> : \n"+ DBUtils.MEMBER_DELETE);
  			
			pstmt.clearParameters();					
			pstmt.setString(1, mvo.getKnum());
			
			nCnt = pstmt.executeUpdate();
			if (!conn.getAutoCommit()) conn.commit();			
			System.out.println("nCnt >>> : " + nCnt + " 건 삭제 되었음 ");
			
			if (nCnt > 0) { bool = true;}
			
			DBUtils.conClose(conn, pstmt);
		}catch(Exception e) {
			System.out.println("삭제 디비연동에 문제가 생겼습니다. >>> : " + e);
		}finally {			
			DBUtils.conClose(conn, pstmt);							
		}
				
		return bool;
	}

	public int idCheck(MemberVO mvo) {
		// TODO Auto-generated method stub
		System.out.println("MemberDAO idCheck() 함수 진입 >>> : ");
		MemberVO.printlnMemberVO(mvo);
		 
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		int nCnt = 0;
		
		try {			

			conn = DBUtils.getConnection();
			pstmt = conn.prepareStatement(DBUtils.MEMBER_ID_CHECK);
			System.out.println("회원아이디 중복체크 >>> : \n"+ DBUtils.MEMBER_ID_CHECK);
  
			pstmt.setString(1, mvo.getKid());
			rsRs = pstmt.executeQuery();
			
			if (rsRs !=null) {
				while (rsRs.next()) {
					nCnt = rsRs.getInt(1);								
				}
			}	
			
			DBUtils.conClose(conn, pstmt, rsRs);
		}catch(Exception e) {
			System.out.println("디비연동에 문제가 생겼습니다. >>> : " + e);
		}finally {
			DBUtils.conClose(conn, pstmt, rsRs);				
		}
				
		return nCnt;
	}	
}
