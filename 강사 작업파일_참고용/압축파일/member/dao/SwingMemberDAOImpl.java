package a.b.c.swing.member.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import a.b.c.common.HbeConnProperty;
import a.b.c.swing.member.sql.SwingMemberSqlMap;
import a.b.c.swing.member.vo.SwingMemberVO;

public class SwingMemberDAOImpl implements SwingMemberDAO {

	@Override
	public ArrayList<SwingMemberVO> smSelectAll() {
		// TODO Auto-generated method stub
		System.out.println("SwingMemberDAOImpl smSelectAll() 함수 진입 >>> : ");		
		
		// 사용할 객체를 지역변수로 선언하고 초기화 하기 
		Connection        conn = null;
		PreparedStatement pstmt = null;
		ResultSet         rsRs = null;
		
		ArrayList<SwingMemberVO> aList = null;
		
		try{
			conn = HbeConnProperty.getConnection();
			pstmt = conn.prepareStatement(SwingMemberSqlMap.getSmSelectAllQuery());
			System.out.println("전체조회 :: \n" + SwingMemberSqlMap.getSmSelectAllQuery());
			
			rsRs = pstmt.executeQuery();
			
			if (rsRs !=null){	
				aList = new ArrayList<SwingMemberVO>();
			
				while (rsRs.next()){
					
					SwingMemberVO _svo = new SwingMemberVO();
					_svo.setSwnum(rsRs.getString(1));
					_svo.setSwname(rsRs.getString(2));
					_svo.setSwid(rsRs.getString(3));
					_svo.setSwpw(rsRs.getString(4));									
					_svo.setDeleteyn(rsRs.getString(5));
					_svo.setInsertdate(rsRs.getString(6));
					_svo.setUpdatedate(rsRs.getString(7));
					
					aList.add(_svo);
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
	public ArrayList<SwingMemberVO> smSelect(SwingMemberVO svo) {
		// TODO Auto-generated method stub
		System.out.println("SwingMemberDAOImpl smSelect() 함수 진입 >>> : ");		
		
		// 사용할 객체를 지역변수로 선언하고 초기화 하기 
		Connection        conn = null;
		PreparedStatement pstmt = null;
		ResultSet         rsRs = null;
		
		ArrayList<SwingMemberVO> aList = null;
		
		try{
			conn = HbeConnProperty.getConnection();
			pstmt = conn.prepareStatement(SwingMemberSqlMap.getSmSelectQuery());
			System.out.println("조건조회 :: \n" + SwingMemberSqlMap.getSmSelectQuery());
			
			pstmt.clearParameters();
			pstmt.setString(1, svo.getSwnum());
			rsRs = pstmt.executeQuery();
			
			if (rsRs !=null){	
				aList = new ArrayList<SwingMemberVO>();
			
				while (rsRs.next()){
					
					SwingMemberVO _svo = new SwingMemberVO();
					_svo.setSwnum(rsRs.getString(1));
					_svo.setSwname(rsRs.getString(2));
					_svo.setSwid(rsRs.getString(3));
					_svo.setSwpw(rsRs.getString(4));									
					_svo.setDeleteyn(rsRs.getString(5));
					_svo.setInsertdate(rsRs.getString(6));
					_svo.setUpdatedate(rsRs.getString(7));
					
					aList.add(_svo);
				}
			}
			
			HbeConnProperty.conClose(conn, pstmt, rsRs);
		}catch (Exception sq){
			System.out.println(" 조건조회 DB 에러 " + sq.getMessage());
			System.out.println(" 에러 :: " + sq);
		}finally{
			HbeConnProperty.conClose(conn, pstmt, rsRs);	
		}
		
		return aList;
	}

	@Override
	public boolean smInsert(SwingMemberVO svo) {
		// TODO Auto-generated method stub
		System.out.println("SwingMemberDAOImpl smInsert() 함수 진입 >>> : ");
		
		// 사용할 객체를 지역변수로 선언하고 초기화 하기 
		Connection        conn = null;
		PreparedStatement pstmt = null;		
		int nCnt = 0;
		boolean bool = false;
		
		try{
			conn = HbeConnProperty.getConnection();
			pstmt = conn.prepareStatement(SwingMemberSqlMap.getSmInsertQuery());
			System.out.println("인서트 :: \n" + SwingMemberSqlMap.getSmInsertQuery());
			
			pstmt.clearParameters();
			pstmt.setString(1, svo.getSwnum());
			pstmt.setString(2, svo.getSwname());
			pstmt.setString(3, svo.getSwid());
			pstmt.setString(4, svo.getSwpw());	
								
			nCnt = pstmt.executeUpdate();
			if (!conn.getAutoCommit()) conn.commit();	
			if (nCnt > 0) { bool = true;}
			System.out.println("nCnt >>> : " + nCnt + " 건 등록 되었음 ");			
			
			HbeConnProperty.conClose(conn, pstmt);
		}catch (Exception sq){
			System.out.println(" 인서트 DB 에러 " + sq.getMessage());
			System.out.println(" 에러 :: " + sq);
		}finally{
			HbeConnProperty.conClose(conn, pstmt);	
		}
		
		return bool;
	}

	@Override
	public boolean smUpdate(SwingMemberVO svo) {
		// TODO Auto-generated method stub
		System.out.println("SwingMemberDAOImpl smUpdate() 함수 진입 >>> : ");
		
		// 사용할 객체를 지역변수로 선언하고 초기화 하기 
		Connection        conn = null;
		PreparedStatement pstmt = null;		
		int nCnt = 0;
		boolean bool = false;
		
		try{
			conn = HbeConnProperty.getConnection();
			pstmt = conn.prepareStatement(SwingMemberSqlMap.getSmUpdateQuery());
			System.out.println("업데이트 :: \n" + SwingMemberSqlMap.getSmUpdateQuery());
			
			pstmt.clearParameters();			
			pstmt.setString(1, svo.getSwname());
			pstmt.setString(2, svo.getSwnum());
			
			nCnt = pstmt.executeUpdate();
			if (!conn.getAutoCommit()) conn.commit();	
			if (nCnt > 0) { bool = true;}
			System.out.println("nCnt >>> : " + nCnt + " 건  수정 되었음 ");			
			
			HbeConnProperty.conClose(conn, pstmt);
		}catch (Exception sq){
			System.out.println(" 업데이트 DB 에러 " + sq.getMessage());
			System.out.println(" 에러 :: " + sq);
		}finally{
			HbeConnProperty.conClose(conn, pstmt);	
		}
		
		return bool;
	}

	@Override
	public boolean smDelete(SwingMemberVO svo) {
		// TODO Auto-generated method stub
		System.out.println("SwingMemberDAOImpl smDelete() 함수 진입 >>> : ");
		
		// 사용할 객체를 지역변수로 선언하고 초기화 하기 
		Connection        conn = null;
		PreparedStatement pstmt = null;		
		int nCnt = 0;
		boolean bool = false;
		
		try{
			conn = HbeConnProperty.getConnection();
			pstmt = conn.prepareStatement(SwingMemberSqlMap.getSmDeleteQuery());
			System.out.println("딜리트 :: \n" + SwingMemberSqlMap.getSmDeleteQuery());
			
			pstmt.clearParameters();						
			pstmt.setString(1, svo.getSwnum());
			
			nCnt = pstmt.executeUpdate();
			if (!conn.getAutoCommit()) conn.commit();	
			if (nCnt > 0) { bool = true;}
			System.out.println("nCnt >>> : " + nCnt + " 건  삭제 되었음 ");			
			
			HbeConnProperty.conClose(conn, pstmt);
		}catch (Exception sq){
			System.out.println(" 딜리트 DB 에러 " + sq.getMessage());
			System.out.println(" 에러 :: " + sq);
		}finally{
			HbeConnProperty.conClose(conn, pstmt);	
		}
		
		return bool;
	}
	
	// 조건조회 :: 이름 
	@Override
	public ArrayList<SwingMemberVO> smSelectName(SwingMemberVO svo) {
		// TODO Auto-generated method stub
		System.out.println("SwingMemberDAOImpl smSelectName() 함수 진입 >>> : ");		
		
		// 사용할 객체를 지역변수로 선언하고 초기화 하기 
		Connection        conn = null;
		PreparedStatement pstmt = null;
		ResultSet         rsRs = null;
		
		ArrayList<SwingMemberVO> aList = null;
		
		try{
			conn = HbeConnProperty.getConnection();
			pstmt = conn.prepareStatement(SwingMemberSqlMap.getSmSelectNameQuery());
			System.out.println("조건조회 :: 이름  :: \n" + SwingMemberSqlMap.getSmSelectNameQuery());
			
			pstmt.clearParameters();
			pstmt.setString(1, svo.getSwname());
			rsRs = pstmt.executeQuery();
			
			if (rsRs !=null){	
				aList = new ArrayList<SwingMemberVO>();
			
				while (rsRs.next()){
					
					SwingMemberVO _svo = new SwingMemberVO();
					_svo.setSwnum(rsRs.getString(1));
					_svo.setSwname(rsRs.getString(2));
					_svo.setSwid(rsRs.getString(3));
					_svo.setSwpw(rsRs.getString(4));									
					_svo.setDeleteyn(rsRs.getString(5));
					_svo.setInsertdate(rsRs.getString(6));
					_svo.setUpdatedate(rsRs.getString(7));
					
					aList.add(_svo);
				}
			}
			
			HbeConnProperty.conClose(conn, pstmt, rsRs);
		}catch (Exception sq){
			System.out.println(" 조건조회 DB 에러 " + sq.getMessage());
			System.out.println(" 에러 :: " + sq);
		}finally{
			HbeConnProperty.conClose(conn, pstmt, rsRs);	
		}
		
		return aList;	
	}	

	// 조건조회 :: 아이디
	@Override
	public ArrayList<SwingMemberVO> smSelectId(SwingMemberVO svo) {
		// TODO Auto-generated method stub		
		System.out.println("SwingMemberDAOImpl smSelectId() 함수 진입 >>> : ");		
		
		// 사용할 객체를 지역변수로 선언하고 초기화 하기 
		Connection        conn = null;
		PreparedStatement pstmt = null;
		ResultSet         rsRs = null;
		
		ArrayList<SwingMemberVO> aList = null;
		
		try{
			conn = HbeConnProperty.getConnection();
			pstmt = conn.prepareStatement(SwingMemberSqlMap.getSmSelectIdQuery());
			System.out.println("조건조회 :: 아이디 :: \n" + SwingMemberSqlMap.getSmSelectIdQuery());
			
			pstmt.clearParameters();
			pstmt.setString(1, svo.getSwid());
			rsRs = pstmt.executeQuery();
			
			if (rsRs !=null){	
				aList = new ArrayList<SwingMemberVO>();
			
				while (rsRs.next()){
					
					SwingMemberVO _svo = new SwingMemberVO();
					_svo.setSwnum(rsRs.getString(1));
					_svo.setSwname(rsRs.getString(2));
					_svo.setSwid(rsRs.getString(3));
					_svo.setSwpw(rsRs.getString(4));									
					_svo.setDeleteyn(rsRs.getString(5));
					_svo.setInsertdate(rsRs.getString(6));
					_svo.setUpdatedate(rsRs.getString(7));
					
					aList.add(_svo);
				}
			}
			
			HbeConnProperty.conClose(conn, pstmt, rsRs);
		}catch (Exception sq){
			System.out.println(" 조건조회 DB 에러 " + sq.getMessage());
			System.out.println(" 에러 :: " + sq);
		}finally{
			HbeConnProperty.conClose(conn, pstmt, rsRs);	
		}
		
		return aList;		
	}

	// 로그인 체크 
	@Override
	public int smLoginCheck(SwingMemberVO svo) {
		// TODO Auto-generated method stub
		System.out.println("SwingMemberDAOImpl smLoginCheck() 함수 진입 >>> : ");		
		
		// 사용할 객체를 지역변수로 선언하고 초기화 하기 
		Connection        conn = null;
		PreparedStatement pstmt = null;
		ResultSet         rsRs = null;
		int nCnt = 0;
		
		try{
			conn = HbeConnProperty.getConnection();
			pstmt = conn.prepareStatement(SwingMemberSqlMap.getSmLoginCheckQuery());
			System.out.println("로그인 체크  :: \n" + SwingMemberSqlMap.getSmLoginCheckQuery());
			
			pstmt.clearParameters();
			pstmt.setString(1, svo.getSwid());
			pstmt.setString(2, svo.getSwpw());
			rsRs = pstmt.executeQuery();
			
			if (rsRs !=null){	
				while (rsRs.next()){
					nCnt = rsRs.getInt(1);
				}
			}
			
			HbeConnProperty.conClose(conn, pstmt, rsRs);
		}catch (Exception sq){
			System.out.println(" 로그인체크 DB 에러 " + sq.getMessage());
			System.out.println(" 에러 :: " + sq);
		}finally{
			HbeConnProperty.conClose(conn, pstmt, rsRs);	
		}
		
		return nCnt;
	}
}
