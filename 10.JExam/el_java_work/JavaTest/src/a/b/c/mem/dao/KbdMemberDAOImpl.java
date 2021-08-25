package a.b.c.mem.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import a.b.c.mem.sql.KbdMemberSqlMap;
import a.b.c.mem.vo.KbdMemberVO;
import a.b.c.common.KbdConnProperty;

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
			
			if (rsRs !=null) {
				aList = new ArrayList<KbdMemberVO> ();
				
				while (rsRs.next()) {
					
					KbdMemberVO kvo = new KbdMemberVO();
					
					kvo.setKnum(rsRs.getNString(1));
					kvo.setKname(rsRs.getNString(2));
					kvo.setKid(rsRs.getNString(3));
					kvo.setKpw(rsRs.getNString(4));
					kvo.setKbirth(rsRs.getNString(5));
					kvo.setKgender(rsRs.getNString(6));
					kvo.setKtel(rsRs.getNString(7));
					kvo.setKhp(rsRs.getNString(8));
					kvo.setKemail(rsRs.getNString(9));
					kvo.setKaddr(rsRs.getNString(10));
					kvo.setKhobby(rsRs.getNString(11));
					kvo.setKphoto(rsRs.getNString(12));
					kvo.setKskill(rsRs.getNString(13));
					kvo.setKjob(rsRs.getNString(14));
					kvo.setDeleteyn(rsRs.getNString(15));
					kvo.setInsertdate(rsRs.getNString(16));
					kvo.setUpdatedate(rsRs.getNString(17));				
					
					aList.add(kvo);
				}
			}
		}catch (Exception e) {
			System.out.println("kmemSelectAll() 함수에서 디비연결 또는 쿼리에서 문제가 생겼네요 >>> : " + e.getMessage());
		}
		return aList;
	}

	@Override
	public ArrayList<KbdMemberVO> kmemSelect(KbdMemberVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KbdMemberDAOImpl.kmemSelect() 함수 진입 ");
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
			// 플레이스홀더에 바인딩한 변수를 세팅한다.
			pstmt.setNString(1, kvo.getKnum());
			rsRs = pstmt.executeQuery();
			
			if (rsRs.next()) {
				
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
		}catch(Exception e) {
			System.out.println("kmemSelect() 함수에서 디비연결 또는 쿼리에서 문제가 생겼네요 >>> : " + e.getMessage());
		}
		
		
		return aList;
	}

	@Override
	public boolean kmemInsert(KbdMemberVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KbdMemberDAOImpl kmemInsert() 함수 진입 >>> : ");
		KbdMemberVO.printKbdMemberVO(kvo);
		
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
			
			pstmt.setString(1, kvo.getKnum()); // 202108060007
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
			sb.append("      			 KNUM 				\n"); // COLUMN 1
			sb.append("					,KNAME 				\n"); // COLUMN 2
			sb.append("					,KID 				\n"); // COLUMN 3
		    sb.append("					,KPW   				\n"); // COLUMN 4
		    sb.append("					,KBIRTH				\n"); // COLUMN 5	    
		    sb.append("					,KGENDER 			\n"); // COLUMN 6	    
		    sb.append("					,KTEL   			\n"); // COLUMN 7	    
		    sb.append("					,KHP 				\n"); // COLUMN 8	    	    
		    sb.append("					,KEMAIL				\n"); // COLUMN 9
		    sb.append("					,KADDR 				\n"); // COLUMN 10	    	    
		    sb.append("					,KHOBBY				\n"); // COLUMN 11
		    sb.append("					,KPHOTO 			\n"); // COLUMN 12
		    sb.append("					,KSKILL				\n"); // COLUMN 13
		    sb.append("					,KJOB				\n"); // COLUMN 14	    	    	  
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
			
			System.out.println("nCnt >>> : " + nCnt + "건 등록 되었음");
			
			if(nCnt < 0) {bool = true;}
			
			KbdConnProperty.conClose(conn, pstmt);		
		}catch (Exception e) {
			System.out.println("입력 디비연동에 문제가 생겼습니다. >>> : " + e);
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
			
			// 파라미터 클리어 꼭 하기
			pstmt.clearParameters();
			
			pstmt.setString(1, kvo.getKemail());
			pstmt.setString(2, kvo.getKaddr());
			pstmt.setString(3, kvo.getKhobby());
			pstmt.setString(4, kvo.getKjob());
			pstmt.setString(5, kvo.getKnum());
			/*
		    sb.append("	SET  								\n");
			sb.append("			,KEMAIL 		= ?			\n"); // placeholder 1	    	    
			sb.append("			,KADDR			= ?			\n"); // placeholder 2	    
			sb.append("			,KHOBBY 		= ? 		\n"); // placeholder 3
			sb.append("			,KJOB   		= ?			\n"); // placeholder 4	        		
		    sb.append("		  	,UPDATEDATE 	= SYSDATE	\n");
			sb.append("	WHERE  	 KNUM 			= ?			\n"); // placeholder 5	    
			sb.append("	AND    	 DELETEYN 		= 'Y'  		\n");			
		*/
		
		// 쿼리문 전달 시작 
		// SELECT 는 executeQuery() 함수를 사용한다. : 리턴이 ResultSet 이다 . 
		// INSERT, UPDATE, DELETE 는 executeUpdate() 함수를 사용한다. : 리턴값이 int : 건수를 리턴한다. 
		// executeQuery() 나 executeUpdate() 함수를 사용하기 싫으면 exeute() 함수를 사용하면 된다. 
		nCnt = pstmt.executeUpdate();
		if (!conn.getAutoCommit()) conn.commit();
		
		System.out.println("nCnt >>> : " + nCnt + "건 수정 되었음");
		
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

	@Override
	public boolean kmemDelete(KbdMemberVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KbdMemberDAOImpl kmemDelete() 함수 진입 >>> : ");
		KbdMemberVO.printlnKbdMemberVO(kvo);
		
		// 사용할 객체를 지역변수로 선언하고 초기화 하기
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
			sb.append("	WHERE  KNUM 		= ?				\n");	 // placeholder 1    
			sb.append("	AND    DELETEYN 	= 'Y'  			\n");		
		*/
		
		// 쿼리문 전달 시작 
		// SELECT 는 executeQuery() 함수를 사용한다. : 리턴이 ResultSet 이다 . 
		// INSERT, UPDATE, DELETE 는 executeUpdate() 함수를 사용한다. : 리턴값이 int : 건수를 리턴한다. 
		// executeQuery() 나 executeUpdate() 함수를 사용하기 싫으면 exeute() 함수를 사용하면 된다. 
		nCnt = pstmt.executeUpdate();
		if (!conn.getAutoCommit()) conn.commit();
		
		System.out.println("nCnt >>> : " + nCnt + "건 삭제 되었음");
		
		if(nCnt > 0) {bool = true;}
		
		KbdConnProperty.conClose(conn, pstmt);		
		}catch(Exception e){
			System.out.println("입력 디비연동에 문제가 생겼습니다. >>> : " + e);
		}finally {
			try {
				KbdConnProperty.conClose(conn, pstmt);
			}catch(Exception e2) {}
		}
		return bool;
	}
}
