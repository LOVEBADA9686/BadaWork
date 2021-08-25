package a.b.c.board.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import a.b.c.board.sql.HbeBoardSqlMap;
import a.b.c.board.vo.HbeBoardVO;
import a.b.c.common.HbeConnProperty;

public class HbeBoardDAOImpl implements HbeBoardDAO {

	@Override
	public ArrayList<HbeBoardVO> hboardSelectAll() {
		// TODO Auto-generated method stub
		System.out.println("HbeBoardDAOImpl hboardSelectAll() 함수 진입 >>> : ");		
		
		// 사용할 객체를 지역변수로 선언하고 초기화 하기 
		Connection        conn = null;
		PreparedStatement pstmt = null;
		ResultSet         rsRs = null;
		
		ArrayList<HbeBoardVO> aList = null;
		
		try{
			conn = HbeConnProperty.getConnection();
			pstmt = conn.prepareStatement(HbeBoardSqlMap.getHboardSelectAllQueryMap());
			System.out.println("전체조회 :: \n" + HbeBoardSqlMap.getHboardSelectAllQueryMap());
			
			rsRs = pstmt.executeQuery();
			
			if (rsRs !=null){	
				aList = new ArrayList<HbeBoardVO>();
			
				while (rsRs.next()){
					
					HbeBoardVO _hvo = new HbeBoardVO();
					_hvo.setBnum(rsRs.getString(1));
					_hvo.setBsubject(rsRs.getString(2));
					_hvo.setBwriter(rsRs.getString(3));
					_hvo.setBcontents(rsRs.getString(4));
					_hvo.setBpw(rsRs.getString(5));					
					_hvo.setDeleteyn(rsRs.getString(6));
					_hvo.setInsertdate(rsRs.getString(7));
					_hvo.setUpdatedate(rsRs.getString(8));
					
					aList.add(_hvo);
				}
			}
			
			HbeConnProperty.conClose(conn, pstmt, rsRs);
		}catch (Exception sq){
			System.out.println(" 전체조회 DB 에러 " + sq.getMessage());
			System.out.println(" 에러 :: " + sq);
		}finally{
			HbeConnProperty.conClose(conn, pstmt, rsRs);	
		}
		
		return aList;
	}	

	@Override
	public ArrayList<HbeBoardVO> hboardSelect(HbeBoardVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeBoardDAOImpl hboardSelect() 함수 진입 >>> : ");		
		
		// 사용할 객체를 지역변수로 선언하고 초기화 하기 
		Connection        conn = null;
		PreparedStatement pstmt = null;
		ResultSet         rsRs = null;
		
		ArrayList<HbeBoardVO> aList = null;
		
		try{
			conn = HbeConnProperty.getConnection();
			pstmt = conn.prepareStatement(HbeBoardSqlMap.getHboardSelectQueryMap());
			System.out.println("조건조회 :: \n" + HbeBoardSqlMap.getHboardSelectQueryMap());
			
			pstmt.clearParameters();
			pstmt.setString(1, hvo.getBnum());
			rsRs = pstmt.executeQuery();
			
			if (rsRs !=null){	
				aList = new ArrayList<HbeBoardVO>();
			
				while (rsRs.next()){
					
					HbeBoardVO _hvo = new HbeBoardVO();
					_hvo.setBnum(rsRs.getString(1));
					_hvo.setBsubject(rsRs.getString(2));
					_hvo.setBwriter(rsRs.getString(3));
					_hvo.setBcontents(rsRs.getString(4));
					_hvo.setBpw(rsRs.getString(5));					
					_hvo.setDeleteyn(rsRs.getString(6));
					_hvo.setInsertdate(rsRs.getString(7));
					_hvo.setUpdatedate(rsRs.getString(8));
					
					aList.add(_hvo);
				}
			}
			
			HbeConnProperty.conClose(conn, pstmt, rsRs);
		}catch (Exception sq){
			System.out.println(" 전체조회 DB 에러 " + sq.getMessage());
			System.out.println(" 에러 :: " + sq);
		}finally{
			HbeConnProperty.conClose(conn, pstmt, rsRs);	
		}
		
		return aList;
	}

	@Override
	public int hboardInsert(HbeBoardVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeBoardDAOImpl hboardInsert() 함수 진입 >>> : ");
				
		// 사용할 객체를 지역변수로 선언하고 초기화 하기 
		Connection        conn = null;
		PreparedStatement pstmt = null;		
		int nCnt = 0;
		
		try{
			conn = HbeConnProperty.getConnection();
			pstmt = conn.prepareStatement(HbeBoardSqlMap.getHboardInsertQueryMap());
			System.out.println("인서트 :: \n" + HbeBoardSqlMap.getHboardInsertQueryMap());
			
			pstmt.clearParameters();
			pstmt.setString(1, hvo.getBnum());
			pstmt.setString(2, hvo.getBsubject());
			pstmt.setString(3, hvo.getBwriter());
			pstmt.setString(4, hvo.getBcontents());	
			pstmt.setString(5, hvo.getBpw());			
								
			nCnt = pstmt.executeUpdate();
			if (!conn.getAutoCommit()) conn.commit();						
			System.out.println("nCnt >>> : " + nCnt + " 건 등록 되었음 ");			
			
			HbeConnProperty.conClose(conn, pstmt);
		}catch (Exception sq){
			System.out.println(" 인서트 DB 에러 " + sq.getMessage());
			System.out.println(" 에러 :: " + sq);
		}finally{
			HbeConnProperty.conClose(conn, pstmt);	
		}
		
		return nCnt;
	}

	@Override
	public int hboardUpdate(HbeBoardVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeBoardDAOImpl hboardUpdate() 함수 진입 >>> : ");
		
		// 사용할 객체를 지역변수로 선언하고 초기화 하기 
		Connection        conn = null;
		PreparedStatement pstmt = null;		
		int nCnt = 0;
		
		try{
			conn = HbeConnProperty.getConnection();
			pstmt = conn.prepareStatement(HbeBoardSqlMap.getHboardUpdateFQueryMap());
			System.out.println("업데이트 :: \n" + HbeBoardSqlMap.getHboardUpdateFQueryMap());
			
			pstmt.clearParameters();
			pstmt.clearParameters();
			pstmt.setString(1, hvo.getBsubject());
			pstmt.setString(2, hvo.getBcontents());
			pstmt.setString(3, hvo.getBnum());						
			
			nCnt = pstmt.executeUpdate();
			if (!conn.getAutoCommit()) conn.commit();						
			System.out.println("nCnt >>> : " + nCnt + " 건 수정 되었음 ");			
			
			HbeConnProperty.conClose(conn, pstmt);
		}catch (Exception sq){
			System.out.println(" 업데이트 DB 에러 " + sq.getMessage());
			System.out.println(" 에러 :: " + sq);
		}finally{
			HbeConnProperty.conClose(conn, pstmt);	
		}
		
		return nCnt;
	}

	@Override
	public int hboardDelete(HbeBoardVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeBoardDAOImpl hboardDelete() 함수 진입 >>> : ");
		
		// 사용할 객체를 지역변수로 선언하고 초기화 하기 
		Connection        conn = null;
		PreparedStatement pstmt = null;		
		int nCnt = 0;
		
		try{
			conn = HbeConnProperty.getConnection();
			pstmt = conn.prepareStatement(HbeBoardSqlMap.getHboardDeleteQueryMap());
			System.out.println("딜리트 :: \n" + HbeBoardSqlMap.getHboardDeleteQueryMap());
			
			pstmt.clearParameters();
			pstmt.setString(1, hvo.getBnum());						
			
			nCnt = pstmt.executeUpdate();
			if (!conn.getAutoCommit()) conn.commit();						
			System.out.println("nCnt >>> : " + nCnt + " 건 삭제 되었음 ");			
			
			HbeConnProperty.conClose(conn, pstmt);
		}catch (Exception sq){
			System.out.println(" 딜리트 DB 에러 " + sq.getMessage());
			System.out.println(" 에러 :: " + sq);
		}finally{
			HbeConnProperty.conClose(conn, pstmt);	
		}
		
		return nCnt;
	}

}
