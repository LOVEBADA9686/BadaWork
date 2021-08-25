package a.b.c.kosmo.mem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import a.b.c.common.KbdConnProperty;
import a.b.c.kosmo.mem.sql.KbdMemberSqlMap;
import a.b.c.kosmo.mem.vo.KbdMemberVO;

public class KbdMemberDAOImpl implements KbdMemberDAO {

	@Override
	public ArrayList<KbdMemberVO> kmemSelectAll() {
		// TODO Auto-generated method stub
		System.out.println("KbdMemberDAOImpl.kmemSelectAll() 함수 진입 ");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		
		ArrayList<KbdMemberVO> aList = null;
		
		try {
			
			conn = KbdConnProperty.getConnection();
			pstmt = conn.prepareStatement(KbdMemberSqlMap.getKbdMemberSelectAllQuery());
			
			System.out.println("전체조회 \n" + KbdMemberSqlMap.getKbdMemberSelectAllQuery());
			
			rsRs = pstmt.executeQuery();
			
			if(rsRs !=null) {
				
				aList = new ArrayList<KbdMemberVO>();
				
				while (rsRs.next()) {
					
					KbdMemberVO kvo = new KbdMemberVO();
					
					kvo.setKnum(rsRs.getString(1));
					kvo.setKname(rsRs.getString(2));
					kvo.setKid(rsRs.getString(3));
					kvo.setKpw(rsRs.getString(4));
					kvo.setKbirth(rsRs.getString(5));
					kvo.setKgender(rsRs.getString(6));
					kvo.setKtel(rsRs.getString(7));
					kvo.setKhp(rsRs.getString(8));
					kvo.setKemail(rsRs.getString(9));
					kvo.setKaddr(rsRs.getString(10));
					kvo.setKhobby(rsRs.getString(11));
					kvo.setKphoto(rsRs.getString(12));
					kvo.setKskill(rsRs.getString(13));
					kvo.setKjob(rsRs.getString(14));
					kvo.setDeleteyn(rsRs.getString(15));
					kvo.setInsertdate(rsRs.getString(16));
					kvo.setUpdatedate(rsRs.getString(17));
					
					aList.add(kvo);
				}
			}
			KbdConnProperty.conClose(conn, pstmt, rsRs);
		}catch(Exception e) {
			System.out.println("kmemSelectAll() 함수에서 디비연결 또는 쿼리에서 문제가 생겼네요 >>> : " + e.getMessage());
		}finally {
			KbdConnProperty.conClose(conn, pstmt, rsRs);
		}
		return aList;
	}

	@Override
	public ArrayList<KbdMemberVO> kmemSelect(KbdMemberVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KbdMemberDAOImpl.kmemSelect() 함수 진입");
		KbdMemberVO.printlnKbdMemberVO(kvo);
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		
		ArrayList<KbdMemberVO> aList = null;
		
		try {
			
			conn = KbdConnProperty.getConnection();
			pstmt = conn.prepareStatement(KbdMemberSqlMap.getKbdMemberSelectQuery());
			System.out.println("조건조회 \n" + KbdMemberSqlMap.getKbdMemberSelectQuery());
			
			pstmt.clearParameters();
			//플레이스홀더에 바인딩한 변수를 세팅한다.
			pstmt.setString(1, kvo.getKnum());
			rsRs = pstmt.executeQuery();
			
			if(rsRs !=null) {
				
				aList = new ArrayList<KbdMemberVO>();
				
				while (rsRs.next()) {
					
					KbdMemberVO _kvo = new KbdMemberVO();
					_kvo.setKnum(rsRs.getString(1));
					_kvo.setKname(rsRs.getString(2));
					_kvo.setKid(rsRs.getString(3));
					_kvo.setKpw(rsRs.getString(4));
					_kvo.setKbirth(rsRs.getString(5));
					_kvo.setKgender(rsRs.getString(6));
					_kvo.setKtel(rsRs.getString(7));
					_kvo.setKhp(rsRs.getString(8));
					_kvo.setKemail(rsRs.getString(9));
					_kvo.setKaddr(rsRs.getString(10));
					_kvo.setKhobby(rsRs.getString(11));
					_kvo.setKphoto(rsRs.getString(12));
					_kvo.setKskill(rsRs.getString(13));
					_kvo.setKjob(rsRs.getString(14));
					_kvo.setDeleteyn(rsRs.getString(15));
					_kvo.setInsertdate(rsRs.getString(16));
					_kvo.setUpdatedate(rsRs.getString(17));

					aList.add(_kvo);
				}
			}
			KbdConnProperty.conClose(conn, pstmt, rsRs);
		}catch(Exception e) {
			System.out.println("kmemSelect() 함수에서 디비연결 또는 쿼리에서 문제가 생겼네요 >>> : " + e.getMessage());
		}finally {
			KbdConnProperty.conClose(conn, pstmt, rsRs);
		}
		
		return aList;
	}

	@Override
	public boolean kmemInsert(KbdMemberVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KbdMemberDAOImpl kmemInsert() 함수 진입 >>> : ");
		KbdMemberVO.printlnKbdMemberVO(kvo);
		
		// 사용할 객체를 지역변수로 선언하고 초기화 하기
		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		boolean bool = false;
		
		try {
			
			conn = KbdConnProperty.getConnection();
			System.out.println("conn.getAutoCommit() >>> : " + conn.getAutoCommit());
			
			pstmt = conn.prepareStatement(KbdMemberSqlMap.getKbdMemberInsertQuery());
			System.out.println("입력하기 >>> : \n" + KbdMemberSqlMap.getKbdMemberInsertQuery());
			
			// 파라미터 클리어 꼭 하기
			pstmt.clearParameters();
			
			pstmt.setString(1, kvo.getKnum());
			pstmt.setString(2, kvo.getKname());
			pstmt.setString(3, kvo.getKid());
			pstmt.setString(4, kvo.getKpw());
			pstmt.setString(5, kvo.getKbirth());
			pstmt.setString(6, kvo.getKgender());
			pstmt.setString(7, kvo.getKtel());
			pstmt.setString(8, kvo.getKhp());
			pstmt.setString(9, kvo.getKemail());
			pstmt.setString(10, kvo.getKaddr());
			pstmt.setString(11, kvo.getKhobby());
			pstmt.setString(12, kvo.getKphoto());
			pstmt.setString(13, kvo.getKskill());
			pstmt.setString(14, kvo.getKjob());
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
			// SELECT 는 executeQuery() 함수를 사용한다. : 리턴이 ResultSet 이다.
			// INSERT, UPDATE, DELETE 는 executeUpdate() 함수를 사용한다. : 리턴값이 int : 건수를 리턴한다.
			// executeQuery() 나 executeUpdate() 함수를 사용하기 싫으면 exeute() 함수를 사용하면 된다.
			nCnt = pstmt.executeUpdate();
			if (!conn.getAutoCommit()) conn.commit();
			
			System.out.println("nCnt >>> : " + nCnt + "건 등록 되었음");
			
			if(nCnt > 0) {bool = true;}
			
			KbdConnProperty.conClose(conn, pstmt);
		}catch(Exception e) {
			System.out.println("입력 디비연동에 문제가 생겼습니다. >>>  "+ e);
		}finally {
			try {
				KbdConnProperty.conClose(conn, pstmt);
			}catch(Exception e2) {}
		}
		
		return bool;
	}

	@Override
	public boolean kmemUpdate(KbdMemberVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KbdMemberDAOImpl kmemUpdate() 함수 진입 >>> : ");
		KbdMemberVO.printlnKbdMemberVO(kvo);
		
		// 사용할 객체를 지역변수로 선언하고 초기화 하기
		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		boolean bool = false;
		
		try {
			
			conn = KbdConnProperty.getConnection();
			System.out.println("conn.getAutoCommit() >>> : " + conn.getAutoCommit());
			
			pstmt = conn.prepareStatement(KbdMemberSqlMap.getKbdMemberUpdateQuery());
			System.out.println("수정하기 >>> : \n" + KbdMemberSqlMap.getKbdMemberUpdateQuery());
			
			// 파라미터 클러어 꼭 하기
			pstmt.clearParameters();
			
			pstmt.setString(1, kvo.getKemail());
			pstmt.setString(2, kvo.getKaddr());
			pstmt.setString(3, kvo.getKhobby());
			pstmt.setString(4, kvo.getKjob());
			pstmt.setString(5, kvo.getKnum());
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
			// SELECT 는 executeQuery() 함수를 사용한다. : 리턴이 ResultSet 이다.
			// INSERT, UPDATE, DELETE 는 executeUpdate() 함수를 사용한다. : 리턴값이 int : 건수를 리턴한다.
			// executeQuery() 나 executeUpdate() 함수를 사용하기 싫으면 exeute() 함수를 사용하면 된다.
			nCnt = pstmt.executeUpdate();
			if(!conn.getAutoCommit()) conn.commit();
			
			System.out.println("nCnt >>> : " + nCnt + "건 수정 되었음");
			
			if(nCnt > 0) {bool = true;}
			
			KbdConnProperty.conClose(conn, pstmt);
		}catch (Exception e) {
			System.out.println("입력 디비연도에 문제가 생겼습니다. >>> : " + e);
		}finally {
			try {
				KbdConnProperty.conClose(conn, pstmt);
			}catch(Exception e2) {}
		}
		
		return bool;
	}

	@Override
	public boolean kmemDelete(KbdMemberVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KbdMemberDAOImpl kmemDelete() 함수 진입 >>> : ");
		KbdMemberVO.printlnKbdMemberVO(kvo);
		
		// 사용할 객체를 지역변ㄴ수로 선언하고 초기화 하기
		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		boolean bool = false;
		
		try {
			
			conn = KbdConnProperty.getConnection();
			System.out.println("conn.getAutoCommit() >>> : " + conn.getAutoCommit());
			
			pstmt = conn.prepareStatement(KbdMemberSqlMap.getKbdMemberDeleteQuery());
			System.out.println("삭제하기 >>> : \n" + KbdMemberSqlMap.getKbdMemberDeleteQuery());
			
			// 파라미터 클리어 꼭 하기
			pstmt.clearParameters();
			pstmt.setString(1, kvo.getKnum());
			/*
			sb.append("	SET  								\n");
		    sb.append("		   DELETEYN 	= 'N'			\n");	    	   
		    sb.append("		  ,UPDATEDATE 	= SYSDATE		\n");
			sb.append("	WHERE  HNUM 		= ?				\n");	 // placeholder 1    
			sb.append("	AND    DELETEYN 	= 'Y'  			\n");		
			 */
			
			// 쿼리문 전달 시작
			// SELECT 는 exexuteQuery() 함수를 사용한다. : 리턴이 ResultSet 이다.
			// INSERT, UPDATE, DELETE 는 executeUpdate() 함수를 사용한다. : 리턴값이 int : 건수를 리턴한다.
			// executeQuery() 나 executeUpdate() 함수를 사용하기 싫으면 exeute() 함수를 사용하면 된다.
			nCnt = pstmt.executeUpdate();
			if(!conn.getAutoCommit()) conn.commit();
			System.out.println("nCnt >>> : " + nCnt + "건 삭제 되었음");
			if(nCnt > 0) {bool = true;}
			
			KbdConnProperty.conClose(conn, pstmt);
		}catch(Exception e) {
			System.out.println("입력 디비연동에 문제가 생겼습니다. >>> : " + e);
		}finally {
			try {
				KbdConnProperty.conClose(conn, pstmt);
			}catch(Exception e2) {}
		}
		
		return bool;
	}

	// 조건조회 :: 회원 이름
	@Override
	public ArrayList<KbdMemberVO> kmemSelectName(KbdMemberVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KbdMemberDAOImpl.kmemSelectName() 함수 진입");
		KbdMemberVO.printlnKbdMemberVO(kvo);
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		
		ArrayList<KbdMemberVO> aList = null;
		
		try {
			
			conn = KbdConnProperty.getConnection();
			pstmt = conn.prepareStatement(KbdMemberSqlMap.getKbdMemberSelectNameQuery());
			System.out.println("조건조회 :: 회원이름 :: \n" + KbdMemberSqlMap.getKbdMemberSelectNameQuery());
			
			pstmt.clearParameters();
			// 플레이스홀더에 바인딩한 변수를 세팅한다.
			pstmt.setString(1, kvo.getKname());
			rsRs = pstmt.executeQuery();
			
			if(rsRs !=null) {
				
				aList = new ArrayList<KbdMemberVO>();
				
				while (rsRs.next()) {
					KbdMemberVO _kvo = new KbdMemberVO();
					_kvo.setKnum(rsRs.getString(1));
					_kvo.setKname(rsRs.getString(2));
					_kvo.setKid(rsRs.getString(3));
					_kvo.setKpw(rsRs.getString(4));
					_kvo.setKbirth(rsRs.getString(5));
					_kvo.setKgender(rsRs.getString(6));
					_kvo.setKtel(rsRs.getString(7));
					_kvo.setKhp(rsRs.getString(8));
					_kvo.setKemail(rsRs.getString(9));
					_kvo.setKaddr(rsRs.getString(10));
					_kvo.setKhobby(rsRs.getString(11));
					_kvo.setKphoto(rsRs.getString(12));
					_kvo.setKskill(rsRs.getString(13));
					_kvo.setKjob(rsRs.getString(14));
					_kvo.setDeleteyn(rsRs.getString(15));
					_kvo.setInsertdate(rsRs.getString(16));
					_kvo.setUpdatedate(rsRs.getString(17));
					
					aList.add(_kvo);
				}
			}
		}catch(Exception e) {
			System.out.println("kmemSelectName() 함수에서 디비연결 또는 쿼리에서 문제가 생겼네요 >>> : " + e.getMessage());
		}
				
		return aList;
	}

	// 조건조회 :: 회원 아이디
	@Override
	public ArrayList<KbdMemberVO> kmemSelectId(KbdMemberVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KbdMemberDAOImpl.kmemSelectId() 함수 진입");
		KbdMemberVO.printlnKbdMemberVO(kvo);
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		
		ArrayList<KbdMemberVO> aList = null;
		
		try {
			conn = KbdConnProperty.getConnection();
			pstmt = conn.prepareStatement(KbdMemberSqlMap.getKbdMemberSelectNameQuery());
			
			pstmt.clearParameters();
			// 플레이스홀더에 바인딩한 변수를 세팅한다.
			pstmt.setString(1, kvo.getKid());
			rsRs = pstmt.executeQuery();
			
			if (rsRs !=null) {
				
				aList = new ArrayList<KbdMemberVO>();
				
				while (rsRs.next()) {
					
					KbdMemberVO _kvo = new KbdMemberVO();
					_kvo.setKnum(rsRs.getString(1));
					_kvo.setKname(rsRs.getString(2));
					_kvo.setKid(rsRs.getString(3));
					_kvo.setKpw(rsRs.getString(4));
					_kvo.setKbirth(rsRs.getString(5));
					_kvo.setKgender(rsRs.getString(6));
					_kvo.setKtel(rsRs.getString(7));
					_kvo.setKhp(rsRs.getString(8));
					_kvo.setKemail(rsRs.getString(9));
					_kvo.setKaddr(rsRs.getString(10));
					_kvo.setKhobby(rsRs.getString(11));
					_kvo.setKphoto(rsRs.getString(12));
					_kvo.setKskill(rsRs.getString(13));
					_kvo.setKjob(rsRs.getString(14));
					_kvo.setDeleteyn(rsRs.getString(15));
					_kvo.setInsertdate(rsRs.getString(16));
					_kvo.setUpdatedate(rsRs.getString(17));
					
					aList.add(_kvo);
				}
			}
		}catch(Exception e) {
			System.out.println("kmemSelectId() 함수에서 디비연결 또는 쿼리에서 문제가 생겼네요 >>> : " + e.getMessage());
		}
		return aList;
	}

	// 회원 아이디 중복 체크 하기
	@Override
	public boolean kmemIdCheck(KbdMemberVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KbdMemberDAOImpl.kmemIdCheck() 함수 진입");
		KbdMemberVO.printlnKbdMemberVO(kvo);
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		int nCnt = 0;
		boolean bool = false;
		
		try {
			
			conn = KbdConnProperty.getConnection();
			pstmt = conn.prepareStatement(KbdMemberSqlMap.ID_CHECK);
			System.out.println("아이디중복체크 \n" + KbdMemberSqlMap.ID_CHECK);
			
			pstmt.clearParameters();
			//플레이스홀더에 바인딩한 변수를  세팅한다.
			pstmt.setString(1, kvo.getKid());
			rsRs = pstmt.executeQuery();
			
			if(rsRs !=null) {
				while (rsRs.next()) {
					nCnt = rsRs.getInt(1);
				}
			}
			
			if(nCnt > 0) {bool = true;}
			KbdConnProperty.conClose(conn, pstmt, rsRs);
		}catch(Exception e) {
			System.out.println("kmemSelect() 함수에서 디비연결 또는 쿼리에서 문제가 생겼네요 >>> : " + e.getMessage());
		}finally {
			KbdConnProperty.conClose(conn, pstmt, rsRs);
		}
		
		return bool;
	}
}
