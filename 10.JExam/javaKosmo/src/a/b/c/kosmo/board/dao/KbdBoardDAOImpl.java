package a.b.c.kosmo.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import a.b.c.common.KbdConnProperty;
import a.b.c.kosmo.board.sql.KbdBoardSqlMap;
import a.b.c.kosmo.board.vo.KbdBoardVO;

public class KbdBoardDAOImpl implements KbdBoardDAO {

	@Override
	public ArrayList<KbdBoardVO> kboardSelectAll() {
		// TODO Auto-generated method stub
		System.out.println("KbdBoardDAOImpl kboardSelectAll() 함수 진입 >>> : ");
		
		// 사용할 객체를 지역변수로 선언하고 초기화 하기
		Connection				conn = null;
		PreparedStatement		pstmt = null;
		ResultSet				rsRs = null;
		
		ArrayList<KbdBoardVO> aList = null;
		
		try {
			conn = KbdConnProperty.getConnection();
			pstmt = conn.prepareStatement(KbdBoardSqlMap.getKboardSelectAllQueryMap());
			System.out.println("전체조회 :: \n" + KbdBoardSqlMap.getKboardSelectAllQueryMap());
			
			rsRs = pstmt.executeQuery();
			
			if(rsRs !=null) {
				aList = new ArrayList<KbdBoardVO>();
				
				while (rsRs.next()) {
					
					KbdBoardVO _kvo = new KbdBoardVO();
					_kvo.setBnum(rsRs.getString(1));
					_kvo.setBsubject(rsRs.getString(2));
					_kvo.setBwriter(rsRs.getString(3));
					_kvo.setBcontents(rsRs.getString(4));
					_kvo.setBpw(rsRs.getString(5));
					_kvo.setDeleteyn(rsRs.getString(6));
					_kvo.setInsertdate(rsRs.getString(7));
					_kvo.setUpdatedate(rsRs.getString(8));

					aList.add(_kvo);
				}
			}
			
			KbdConnProperty.conClose(conn, pstmt, rsRs);
		}catch (Exception sq) {
			System.out.println("전체조회 DB 에러" + sq.getMessage());
			System.out.println("에러 :: " + sq);
		}finally {
			KbdConnProperty.conClose(conn, pstmt, rsRs);
		}
		
		return aList;
	}

	@Override
	public ArrayList<KbdBoardVO> kboardSelect(KbdBoardVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KbdBoardDAOImpl kboardSelect() 함수 진입 >>> : ");
		
		// 사용할 객체를 지역변수로 선언하고 초기화 하기
		Connection			conn = null;
		PreparedStatement	pstmt = null;
		ResultSet			rsRs = null;
			
		ArrayList<KbdBoardVO> aList = null;
		
		try {
			conn = KbdConnProperty.getConnection();
			pstmt = conn.prepareStatement(KbdBoardSqlMap.getKboardSelectQueryMap());
			System.out.println("조건조회 :: \n" + KbdBoardSqlMap.getKboardSelectQueryMap());
			
			pstmt.clearParameters();
			pstmt.setString(1, kvo.getBnum());
			rsRs = pstmt.executeQuery();
			
			if(rsRs !=null) {
				aList = new ArrayList<KbdBoardVO>();
				
				while (rsRs.next()) {
					
					KbdBoardVO _kvo = new KbdBoardVO();
					_kvo.setBnum(rsRs.getString(1));
					_kvo.setBsubject(rsRs.getString(2));
					_kvo.setBwriter(rsRs.getString(3));
					_kvo.setBcontents(rsRs.getString(4));
					_kvo.setBpw(rsRs.getString(5));
					_kvo.setDeleteyn(rsRs.getString(6));
					_kvo.setInsertdate(rsRs.getString(7));
					_kvo.setUpdatedate(rsRs.getString(8));

					aList.add(_kvo);
				}
			}
			
			KbdConnProperty.conClose(conn, pstmt, rsRs);
		}catch(Exception sq) {
			System.out.println("전체조회 DB 에러" + sq.getMessage());
			System.out.println("에러 :: " + sq);
		}finally {
			KbdConnProperty.conClose(conn, pstmt, rsRs);
		}
		
		return aList;
	}

	@Override
	public int kboardInsert(KbdBoardVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KbdBoardDAOImpl kboardInsert() 함수 진입 >>> : ");
		
		// 사용할 객체를 지역변수로 선언하고 초기화 하기
		Connection				conn = null;
		PreparedStatement		pstmt = null;
		int nCnt = 0;
		
		try {
			conn = KbdConnProperty.getConnection();
			pstmt = conn.prepareStatement(KbdBoardSqlMap.getKboardInserQueryMap());
			System.out.println("인서트 :: \n" + KbdBoardSqlMap.getKboardInserQueryMap());
			
			pstmt.clearParameters();
			pstmt.setString(1, kvo.getBnum());
			pstmt.setString(2, kvo.getBsubject());
			pstmt.setString(3, kvo.getBwriter());
			pstmt.setString(4, kvo.getBcontents());
			pstmt.setString(5, kvo.getBpw());

			nCnt = pstmt.executeUpdate();
			if(! conn.getAutoCommit()) conn.commit();
			System.out.println("nCnt >>> : " + nCnt + "건 등록 되었음");
			
			KbdConnProperty.conClose(conn, pstmt);
		}catch(Exception sq) {
			System.out.println("인서트 DB 에러" + sq.getMessage());
			System.out.println("에러 ::" + sq);
		}finally {
			KbdConnProperty.conClose(conn, pstmt);
		}
		
		return nCnt;
	}

	@Override
	public int kboardUpdate(KbdBoardVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KbdBoardDAOImpl kboardUpdate() 함수 진입 >>> : ");
		KbdBoardVO.printlnKbdBoardVO(kvo);
		
		// 사용할 객체를 지역변수로 선언하고  초기화 하기
		Connection 			conn = null;
		PreparedStatement	pstmt = null;
		int nCnt = 0;
		
		try {
			conn = KbdConnProperty.getConnection();
			pstmt = conn.prepareStatement(KbdBoardSqlMap.getKboardUpdateQueryMap());
			System.out.println("업데이트 :: \n" + KbdBoardSqlMap.getKboardUpdateQueryMap());
			
			pstmt.clearParameters();
			pstmt.clearParameters();
			pstmt.setString(1, kvo.getBsubject());
			pstmt.setString(2, kvo.getBcontents());
			pstmt.setString(3, kvo.getBnum());
			
			nCnt = pstmt.executeUpdate();
			if(! conn.getAutoCommit()) conn.commit();
			System.out.println("nCnt >>> : " + nCnt + "건 등록 되었음");
			
			KbdConnProperty.conClose(conn, pstmt);
		}catch(Exception sq) {
			System.out.println("업데이트 DB 에러 " + sq.getMessage());
			System.out.println("에러 :: " + sq);
		}finally {
			KbdConnProperty.conClose(conn, pstmt);
		}	
		
		return nCnt;
	}

	@Override
	public int kboardDelete(KbdBoardVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KbdBoardDAOImpl kboardDelete() 함수 진입 >>> : ");
		
		// 사용할 객체를 지역변수로 선언하고 초기화 하기
		Connection		conn = null;
		PreparedStatement	pstmt = null;
		int nCnt = 0;
		
		try {
			conn = KbdConnProperty.getConnection();
			pstmt = conn.prepareStatement(KbdBoardSqlMap.getKboardDeleteQueryMap());
			System.out.println("딜리트 :: \n" + KbdBoardSqlMap.getKboardDeleteQueryMap());
			
			pstmt.clearParameters();
			pstmt.setString(1, kvo.getBnum());
			
			nCnt = pstmt.executeUpdate();
			if (! conn.getAutoCommit()) conn.commit();
			System.out.println("nCnt >>> : " + nCnt + "건 삭제 되었음");
			
			KbdConnProperty.conClose(conn, pstmt);
		}catch (Exception sq) {
			System.out.println("딜리트 DB 에러" + sq.getMessage());
			System.out.println("에러 :: " + sq);
		}finally {
			KbdConnProperty.conClose(conn, pstmt);
		}
		
		return nCnt;
	}
	
}
