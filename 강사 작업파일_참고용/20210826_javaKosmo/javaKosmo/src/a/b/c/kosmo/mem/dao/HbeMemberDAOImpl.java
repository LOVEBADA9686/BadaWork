package a.b.c.kosmo.mem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import a.b.c.kosmo.mem.sql.HbeMemberSqlMap;
import a.b.c.common.HbeConnProperty;
import a.b.c.kosmo.mem.vo.HbeMemberVO;

public class HbeMemberDAOImpl implements HbeMemberDAO {

	@Override
	public ArrayList<HbeMemberVO> hmemSelectAll() {
		// TODO Auto-generated method stub
		System.out.println("HbeMemberDAOImpl.hmemSelectAll() 함수 진입 ");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		
		ArrayList<HbeMemberVO> aList = null;
		
		try {
			
			conn = HbeConnProperty.getConnection();
			pstmt = conn.prepareStatement(HbeMemberSqlMap.getHbeMemberSelectAllQuery());
			
			System.out.println("전체조회 \n" + HbeMemberSqlMap.getHbeMemberSelectAllQuery());			
			
			rsRs = pstmt.executeQuery();			
			
			if (rsRs !=null) {
				
				aList = new ArrayList<HbeMemberVO>();
				
				while (rsRs.next()) {
					
					HbeMemberVO hvo = new HbeMemberVO();
					
					hvo.setHnum(rsRs.getString(1)); 
					hvo.setHname(rsRs.getString(2)); 
					hvo.setHid(rsRs.getString(3));
					hvo.setHpw(rsRs.getString(4));
					hvo.setHbirth(rsRs.getString(5));
					hvo.setHgender(rsRs.getString(6));
					hvo.setHtel(rsRs.getString(7));
					hvo.setHhp(rsRs.getString(8));
					hvo.setHemail(rsRs.getString(9));
					hvo.setHaddr(rsRs.getString(10));
					hvo.setHhobby(rsRs.getString(11));
					hvo.setHphoto(rsRs.getString(12));
					hvo.setHskill(rsRs.getString(13));
					hvo.setHjob(rsRs.getString(14));
					hvo.setDeleteyn(rsRs.getString(15));
					hvo.setInsertdate(rsRs.getString(16));
					hvo.setUpdatedate(rsRs.getString(17));
					
					aList.add(hvo);
				}				
			}
			HbeConnProperty.conClose(conn, pstmt, rsRs);
		}catch(Exception e) {
			System.out.println("hmemSelectAll() 함수에서 디비연결 또는 쿼리에서 문제가 생겼네요 >>> : " + e.getMessage());
		}finally {
			HbeConnProperty.conClose(conn, pstmt, rsRs);
		}
		
		return aList;
	}

	@Override
	public ArrayList<HbeMemberVO> hmemSelect(HbeMemberVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeMemberDAOImpl.hmemSelect() 함수 진입 ");
		HbeMemberVO.printlnHbeMemberVO(hvo);
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		
		ArrayList<HbeMemberVO> aList = null;
		
		try {
			
			conn = HbeConnProperty.getConnection();
			pstmt = conn.prepareStatement(HbeMemberSqlMap.getHbeMemberSelectQuery());
			System.out.println("조건조회 \n" + HbeMemberSqlMap.getHbeMemberSelectQuery());
			
			pstmt.clearParameters();
			// 플레이스홀더에 바인딩한 변수를 세팅한다. 
			pstmt.setString(1, hvo.getHnum());
			rsRs = pstmt.executeQuery();			
						
			if (rsRs !=null) {
				
				aList = new ArrayList<HbeMemberVO>();
				
				while (rsRs.next()) {
					
					HbeMemberVO _hvo = new HbeMemberVO();
					_hvo.setHnum(rsRs.getString(1));
					_hvo.setHname(rsRs.getString(2));
					_hvo.setHid(rsRs.getString(3));
					_hvo.setHpw(rsRs.getString(4));
					_hvo.setHbirth(rsRs.getString(5));
					_hvo.setHgender(rsRs.getString(6));
					_hvo.setHtel(rsRs.getString(7));
					_hvo.setHhp(rsRs.getString(8));
					_hvo.setHemail(rsRs.getString(9));
					_hvo.setHaddr(rsRs.getString(10));
					_hvo.setHhobby(rsRs.getString(11));
					_hvo.setHphoto(rsRs.getString(12));
					_hvo.setHskill(rsRs.getString(13));
					_hvo.setHjob(rsRs.getString(14));
					_hvo.setDeleteyn(rsRs.getString(15));
					_hvo.setInsertdate(rsRs.getString(16));
					_hvo.setUpdatedate(rsRs.getString(17));
										
					aList.add(_hvo);
				}				
			}
			HbeConnProperty.conClose(conn, pstmt, rsRs);
		}catch(Exception e) {
			System.out.println("hmemSelect() 함수에서 디비연결 또는 쿼리에서 문제가 생겼네요 >>> : " + e.getMessage());
		}finally {
			HbeConnProperty.conClose(conn, pstmt, rsRs);
		}
		
		return aList;
	}

	@Override
	public boolean hmemInsert(HbeMemberVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeMemberDAOImpl hmemInsert() 함수 진입 >>> : ");
		HbeMemberVO.printlnHbeMemberVO(hvo);
		
		// 사용할 객체를 지역변수로 선언하고 초기화 하기 
		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		boolean bool = false;
		
		try {			

			conn = HbeConnProperty.getConnection();
			System.out.println("conn.getAutoCommit() >>> : " + conn.getAutoCommit());
			
			pstmt = conn.prepareStatement(HbeMemberSqlMap.getHbeMemberInsertQuery());
			System.out.println("입력하기 >>> : \n"+ HbeMemberSqlMap.getHbeMemberInsertQuery());
  			
			// 파라미터 클리어 꼭 하기 
			pstmt.clearParameters();
			
			pstmt.setString(1, hvo.getHnum()); // 202108060007
			pstmt.setString(2, hvo.getHname()); // GGGG
			pstmt.setString(3, hvo.getHid());   // GG00
			pstmt.setString(4, hvo.getHpw());
			pstmt.setString(5, hvo.getHbirth());
			pstmt.setString(6, hvo.getHgender());
			pstmt.setString(7, hvo.getHtel());
			pstmt.setString(8, hvo.getHhp());			
			pstmt.setString(9, hvo.getHemail());
			pstmt.setString(10, hvo.getHaddr());
			pstmt.setString(11, hvo.getHhobby());
			pstmt.setString(12, hvo.getHphoto());
			pstmt.setString(13, hvo.getHskill());
			pstmt.setString(14, hvo.getHjob());
			/*
			sb.append("      			 HNUM 				\n"); // COLUMN 1
			sb.append("					,HNAME 				\n"); // COLUMN 2
			sb.append("					,HID 				\n"); // COLUMN 3
		    sb.append("					,HPW   				\n"); // COLUMN 4
		    sb.append("					,HBIRTH				\n"); // COLUMN 5	    
		    sb.append("					,HGENDER 			\n"); // COLUMN 6	    
		    sb.append("					,HTEL   			\n"); // COLUMN 7	    
		    sb.append("					,HHP 				\n"); // COLUMN 8	    	    
		    sb.append("					,HEMAIL				\n"); // COLUMN 9
		    sb.append("					,HADDR 				\n"); // COLUMN 10	    	    
		    sb.append("					,HHOBBY				\n"); // COLUMN 11
		    sb.append("					,HPHOTO 			\n"); // COLUMN 12
		    sb.append("					,HSKILL				\n"); // COLUMN 13
		    sb.append("					,HJOB				\n"); // COLUMN 14	    	    	  
		    sb.append("					,DELETEYN			\n"); // COLUMN 15
		    sb.append("					,INSERTDATE			\n"); // COLUMN 16
		    sb.append("					,UPDATEDATE			\n"); // COLUMN 17
			sb.append("			      )						\n");
			sb.append("	       VALUES   					\n");
			sb.append("	       		 (  					\n");
			sb.append("     				 ? 				\n"); // placeholder 1 202108060007
			sb.append("						,? 				\n"); // placeholder 2 GGGG
		    sb.append("						,?   			\n"); // placeholder 3 GG00
		    sb.append("						,?   			\n"); // placeholder 4
		    sb.append("						,? 				\n"); // placeholder 5
		    sb.append("						,? 				\n"); // placeholder 6
		    sb.append("						,?				\n"); // placeholder 7
		    sb.append("						,?				\n"); // placeholder 8
		    sb.append("						,?				\n"); // placeholder 9
		    sb.append("						,?   			\n"); // placeholder 10
		    sb.append("						,? 				\n"); // placeholder 11
		    sb.append("						,? 				\n"); // placeholder 12
		    sb.append("						,?				\n"); // placeholder 13
		    sb.append("						,?				\n"); // placeholder 14
			*/
			
			// 쿼리문 전달 시작 
			// SELECT 는 executeQuery() 함수를 사용한다. : 리턴이 ResultSet 이다 . 
			// INSERT, UPDATE, DELETE 는 executeUpdate() 함수를 사용한다. : 리턴값이 int : 건수를 리턴한다. 
			// executeQuery() 나 executeUpdate() 함수를 사용하기 싫으면 exeute() 함수를 사용하면 된다. 
			nCnt = pstmt.executeUpdate();						
			if (!conn.getAutoCommit()) conn.commit();			
			
			System.out.println("nCnt >>> : " + nCnt + " 건 등록 되었음 ");
			
			if (nCnt > 0) { bool = true;}
			
			HbeConnProperty.conClose(conn, pstmt);
		}catch(Exception e) {
			System.out.println("입력 디비연동에 문제가 생겼습니다. >>> : " + e);
		}finally {
			try {
				HbeConnProperty.conClose(conn, pstmt);				
			}catch(Exception e2) {}
		}
				
		return bool;
	}

	@Override
	public boolean hmemUpdate(HbeMemberVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeMemberDAOImpl hmemUpdate() 함수 진입 >>> : ");
		HbeMemberVO.printlnHbeMemberVO(hvo);
		
		// 사용할 객체를 지역변수로 선언하고 초기화 하기 
		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		boolean bool = false;
		
		try {			

			conn = HbeConnProperty.getConnection();
			System.out.println("conn.getAutoCommit() >>> : " + conn.getAutoCommit());
			
			pstmt = conn.prepareStatement(HbeMemberSqlMap.getHbeMemberUpdateQuery());
			System.out.println("수정하기 >>> : \n"+ HbeMemberSqlMap.getHbeMemberUpdateQuery());
  			
			// 파라미터 클리어 꼭 하기 
			pstmt.clearParameters();
			
			pstmt.setString(1, hvo.getHemail());
			pstmt.setString(2, hvo.getHaddr());
			pstmt.setString(3, hvo.getHhobby());			
			pstmt.setString(4, hvo.getHjob());
			pstmt.setString(5, hvo.getHnum()); 
			/*
			    sb.append("	SET  								\n");
				sb.append("			,HEMAIL 		= ?			\n"); // placeholder 1	    	    
				sb.append("			,HADDR			= ?			\n"); // placeholder 2	    
				sb.append("			,HHOBBY 		= ? 		\n"); // placeholder 3
				sb.append("			,HJOB   		= ?			\n"); // placeholder 4	        		
			    sb.append("		  	,UPDATEDATE 	= SYSDATE	\n");
				sb.append("	WHERE  	 HNUM 			= ?			\n"); // placeholder 5	    
				sb.append("	AND    	 DELETEYN 		= 'Y'  		\n");			
			*/
			
			// 쿼리문 전달 시작 
			// SELECT 는 executeQuery() 함수를 사용한다. : 리턴이 ResultSet 이다 . 
			// INSERT, UPDATE, DELETE 는 executeUpdate() 함수를 사용한다. : 리턴값이 int : 건수를 리턴한다. 
			// executeQuery() 나 executeUpdate() 함수를 사용하기 싫으면 exeute() 함수를 사용하면 된다. 
			nCnt = pstmt.executeUpdate();						
			if (!conn.getAutoCommit()) conn.commit();			
			
			System.out.println("nCnt >>> : " + nCnt + " 건 수정 되었음 ");
			
			if (nCnt > 0) { bool = true;}
			
			HbeConnProperty.conClose(conn, pstmt);
		}catch(Exception e) {
			System.out.println("입력 디비연동에 문제가 생겼습니다. >>> : " + e);
		}finally {
			try {
				HbeConnProperty.conClose(conn, pstmt);				
			}catch(Exception e2) {}
		}
				
		return bool;
	}

	@Override
	public boolean hmemDelete(HbeMemberVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeMemberDAOImpl hmemDelete() 함수 진입 >>> : ");
		HbeMemberVO.printlnHbeMemberVO(hvo);
		
		// 사용할 객체를 지역변수로 선언하고 초기화 하기 
		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		boolean bool = false;
		
		try {			

			conn = HbeConnProperty.getConnection();
			System.out.println("conn.getAutoCommit() >>> : " + conn.getAutoCommit());
			
			pstmt = conn.prepareStatement(HbeMemberSqlMap.getHbeMemberDeleteQuery());
			System.out.println("삭제하기 >>> : \n"+ HbeMemberSqlMap.getHbeMemberDeleteQuery());
  			
			// 파라미터 클리어 꼭 하기 
			pstmt.clearParameters();
			pstmt.setString(1, hvo.getHnum()); 
			/*
				sb.append("	SET  								\n");
			    sb.append("		   DELETEYN 	= 'N'			\n");	    	   
			    sb.append("		  ,UPDATEDATE 	= SYSDATE		\n");
				sb.append("	WHERE  HNUM 		= ?				\n");	 // placeholder 1    
				sb.append("	AND    DELETEYN 	= 'Y'  			\n");		
			*/
			
			// 쿼리문 전달 시작 
			// SELECT 는 executeQuery() 함수를 사용한다. : 리턴이 ResultSet 이다 . 
			// INSERT, UPDATE, DELETE 는 executeUpdate() 함수를 사용한다. : 리턴값이 int : 건수를 리턴한다. 
			// executeQuery() 나 executeUpdate() 함수를 사용하기 싫으면 exeute() 함수를 사용하면 된다. 
			nCnt = pstmt.executeUpdate();						
			if (!conn.getAutoCommit()) conn.commit();						
			System.out.println("nCnt >>> : " + nCnt + " 건 삭제 되었음 ");			
			if (nCnt > 0) { bool = true;}
			
			HbeConnProperty.conClose(conn, pstmt);
		}catch(Exception e) {
			System.out.println("입력 디비연동에 문제가 생겼습니다. >>> : " + e);
		}finally {
			try {
				HbeConnProperty.conClose(conn, pstmt);				
			}catch(Exception e2) {}
		}
				
		return bool;	
	}
	
	// 조건조회 :: 회원 이름 
	@Override
	public ArrayList<HbeMemberVO> hmemSelectName(HbeMemberVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeMemberDAOImpl.hmemSelectName() 함수 진입 ");
		HbeMemberVO.printlnHbeMemberVO(hvo);
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		
		ArrayList<HbeMemberVO> aList = null;
		
		try {
			
			conn = HbeConnProperty.getConnection();
			pstmt = conn.prepareStatement(HbeMemberSqlMap.getHbeMemberSelectNameQuery());
			System.out.println("조건조회 :: 회원이름 :: \n" + HbeMemberSqlMap.getHbeMemberSelectNameQuery());
			
			pstmt.clearParameters();
			// 플레이스홀더에 바인딩한 변수를 세팅한다. 
			pstmt.setString(1, hvo.getHname());
			rsRs = pstmt.executeQuery();			
						
			if (rsRs !=null) {
				
				aList = new ArrayList<HbeMemberVO>();
				
				while (rsRs.next()) {
					
					HbeMemberVO _hvo = new HbeMemberVO();
					_hvo.setHnum(rsRs.getString(1));
					_hvo.setHname(rsRs.getString(2));
					_hvo.setHid(rsRs.getString(3));
					_hvo.setHpw(rsRs.getString(4));
					_hvo.setHbirth(rsRs.getString(5));
					_hvo.setHgender(rsRs.getString(6));
					_hvo.setHtel(rsRs.getString(7));
					_hvo.setHhp(rsRs.getString(8));
					_hvo.setHemail(rsRs.getString(9));
					_hvo.setHaddr(rsRs.getString(10));
					_hvo.setHhobby(rsRs.getString(11));
					_hvo.setHphoto(rsRs.getString(12));
					_hvo.setHskill(rsRs.getString(13));
					_hvo.setHjob(rsRs.getString(14));
					_hvo.setDeleteyn(rsRs.getString(15));
					_hvo.setInsertdate(rsRs.getString(16));
					_hvo.setUpdatedate(rsRs.getString(17));
										
					aList.add(_hvo);
				}				
			}
		}catch(Exception e) {
			System.out.println("hmemSelectName() 함수에서 디비연결 또는 쿼리에서 문제가 생겼네요 >>> : " + e.getMessage());
		}
		
		return aList;
	}

	// 조건조회 :: 회원 아이디 
	@Override
	public ArrayList<HbeMemberVO> hmemSelectId(HbeMemberVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeMemberDAOImpl.hmemSelectId() 함수 진입 ");
		HbeMemberVO.printlnHbeMemberVO(hvo);
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		
		ArrayList<HbeMemberVO> aList = null;
		
		try {
			
			conn = HbeConnProperty.getConnection();
			pstmt = conn.prepareStatement(HbeMemberSqlMap.getHbeMemberSelectIdQuery());
			System.out.println("조건조회 :: 회원아이디 :: \n" + HbeMemberSqlMap.getHbeMemberSelectIdQuery());
			
			pstmt.clearParameters();
			// 플레이스홀더에 바인딩한 변수를 세팅한다. 
			pstmt.setString(1, hvo.getHid());
			rsRs = pstmt.executeQuery();			
						
			if (rsRs !=null) {
				
				aList = new ArrayList<HbeMemberVO>();
				
				while (rsRs.next()) {
					
					HbeMemberVO _hvo = new HbeMemberVO();
					_hvo.setHnum(rsRs.getString(1));
					_hvo.setHname(rsRs.getString(2));
					_hvo.setHid(rsRs.getString(3));
					_hvo.setHpw(rsRs.getString(4));
					_hvo.setHbirth(rsRs.getString(5));
					_hvo.setHgender(rsRs.getString(6));
					_hvo.setHtel(rsRs.getString(7));
					_hvo.setHhp(rsRs.getString(8));
					_hvo.setHemail(rsRs.getString(9));
					_hvo.setHaddr(rsRs.getString(10));
					_hvo.setHhobby(rsRs.getString(11));
					_hvo.setHphoto(rsRs.getString(12));
					_hvo.setHskill(rsRs.getString(13));
					_hvo.setHjob(rsRs.getString(14));
					_hvo.setDeleteyn(rsRs.getString(15));
					_hvo.setInsertdate(rsRs.getString(16));
					_hvo.setUpdatedate(rsRs.getString(17));
										
					aList.add(_hvo);
				}				
			}
		}catch(Exception e) {
			System.out.println("hmemSelectId() 함수에서 디비연결 또는 쿼리에서 문제가 생겼네요 >>> : " + e.getMessage());
		}
		
		return aList;
	}

	// 회원 아이디 중복 체크 하기 
	@Override
	public boolean hmemIdCheck(HbeMemberVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeMemberDAOImpl.hmemIdCheck() 함수 진입 ");
		HbeMemberVO.printlnHbeMemberVO(hvo);
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		int nCnt = 0;
		boolean bool = false;

		try {
			
			conn = HbeConnProperty.getConnection();
			pstmt = conn.prepareStatement(HbeMemberSqlMap.ID_CHECK);
			System.out.println("아이디중복체크 \n" + HbeMemberSqlMap.ID_CHECK);
			
			pstmt.clearParameters();
			// 플레이스홀더에 바인딩한 변수를 세팅한다. 
			pstmt.setString(1, hvo.getHid());
			rsRs = pstmt.executeQuery();			
						
			if (rsRs !=null){	
				while (rsRs.next()){
					nCnt = rsRs.getInt(1);
				}
			}
			
			if (nCnt > 0) { bool = true;}
			HbeConnProperty.conClose(conn, pstmt, rsRs);
		}catch(Exception e) {
			System.out.println("hmemSelect() 함수에서 디비연결 또는 쿼리에서 문제가 생겼네요 >>> : " + e.getMessage());
		}finally {
			HbeConnProperty.conClose(conn, pstmt, rsRs);
		}
		
		return bool;
	}	
}
