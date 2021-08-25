package a.b.c.ch9.kbdmem;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

import a.b.c.ch9.kbdmem.sql.KbdMemberSqlMap;
import a.b.c.ch9.kbdmem.vo.KbdMemberVO;
import a.b.c.common.KbdConnProperty;

public class KbdMember {
	
	// ��ü ��ȸ �Լ� 
	public ArrayList<KbdMemberVO> kmemSelectAll() {
		System.out.println("KbdMember.kmemSelectAll() �Լ� ���� ");
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		
		ArrayList<KbdMemberVO> aList = null;
		
		try {
			
			conn = KbdConnProperty.getConnection();
			pstmt = conn.prepareStatement(KbdMemberSqlMap.getKbdMemberSelectAllQuery());
			System.out.println("��ü��ȸ \n" + KbdMemberSqlMap.getKbdMemberSelectAllQuery());
			
			rsRs = pstmt.executeQuery();			
						
			if (rsRs !=null) {
				
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
		}catch(Exception e) {
			System.out.println("kmemSelectAll() �Լ����� ��񿬰� �Ǵ� �������� ������ ����׿� >>> : " + e.getMessage());
		}
		
		return aList;
	}
	
	// ��ü ���� �Լ� 
	public ArrayList<KbdMemberVO> kmemSelect(KbdMemberVO kvo) {
		System.out.println("KbdMember.kmemSelect() �Լ� ���� ");
		KbdMemberVO.printlnKbdMemberVO(kvo);
		
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rsRs = null;
		
		ArrayList<KbdMemberVO> aList = null;
		
		try {
			
			conn = KbdConnProperty.getConnection();
			pstmt = conn.prepareStatement(KbdMemberSqlMap.getKbdMemberSelectQuery());
			System.out.println("������ȸ \n" + KbdMemberSqlMap.getKbdMemberSelectQuery());
			
			pstmt.clearParameters();
			// �÷��̽�Ȧ���� ���ε��� ������ �����Ѵ�.
			pstmt.setString(1, kvo.getKnum());
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
			System.out.println("kmemSelect() �Լ����� ��񿬰� �Ǵ� �������� ������ ����׿� >>> : " + e.getMessage());
		}
		
		return aList;
	}
	
	// ȸ�����
	public boolean kmemInsert(KbdMemberVO kvo) {
		System.out.println("KbdMember kmemInsert() �Լ� ���� >>> : ");
		KbdMemberVO.printlnKbdMemberVO(kvo);
		
		// ����� ��ü�� ���������� �����ϰ� �ʱ�ȭ �ϱ�
		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		boolean bool = false;
		
		try {
			conn = KbdConnProperty.getConnection();
			System.out.println("conn.getAutoCommit() >>> : " + conn.getAutoCommit());
			
			pstmt = conn.prepareStatement(KbdMemberSqlMap.getKbdMemInsertQuery());
			System.out.println("�Է��ϱ� >>> : \n" + KbdMemberSqlMap.getKbdMemInsertQuery());
			
			//�Ķ���� Ŭ���� �� �ϱ�			
			pstmt.clearParameters();
			
			pstmt.setString(1, kvo.getKnum()); // 202108060007
			pstmt.setString(2, kvo.getKname()); // GGGG
			pstmt.setString(3, kvo.getKid()); // GG00
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
			 		sb.append("				KNUM					\n"); // COLUMN 1
					sb.append(" 			KNAME					\n"); // COLUMN 2
					sb.append("				KIN					 	\n"); // COLUMN 3
					sb.append("				KPW					 	\n"); // COLUMN 4
					sb.append("				KBIRTH					\n"); // COLUMN 5
					sb.append("				KGENDER 				\n"); // COLUMN 6
					sb.append("				KTEL			 		\n"); // COLUMN 7
					sb.append("				KHP						\n"); // COLUMN 8
					sb.append("				KEMAIL					\n"); // COLUMN 9
					sb.append("				KADDR					\n"); // COLUMN 10
					sb.append("				KHOBBY					\n"); // COLUMN 11
					sb.append("				KPHOTO 					\n"); // COLUMN 12
					sb.append("				KSKILL 					\n"); // COLUMN 13
					sb.append("				KJOB					\n"); // COLUMN 14
					sb.append("				DELETEYN 				\n"); // COLUMN 15
					sb.append("				INSERTDATE 				\n"); // COLUMN 16
					sb.append("				UPDATEDATE				\n"); // COLUMN 17
					sb.append(" 			) 						\n");
					sb.append(" 	VALUES 							\n");
					sb.append("				( 						\n");
					sb.append("					 ?					\n"); // placeholder 1 202108060007
					sb.append(" 				,?					\n"); // placeholder 2 GGGG
					sb.append(" 				,?					\n"); // placeholder 3 GG00
					sb.append(" 				,?					\n"); // placeholder 4
					sb.append(" 				,?					\n"); // placeholder 5
					sb.append(" 				,?					\n"); // placeholder 6
					sb.append(" 				,?					\n"); // placeholder 7
					sb.append(" 				,?					\n"); // placeholder 8
					sb.append(" 				,?					\n"); // placeholder 9
					sb.append(" 				,?					\n"); // placeholder 10
					sb.append(" 				,?					\n"); // placeholder 11
					sb.append(" 				,?					\n"); // placeholder 12
					sb.append(" 				,?					\n"); // placeholder 13
					sb.append(" 				,?					\n"); // placeholder 14
			*/
			
			// ������ ���޽��� \
			// SELECT �� executeQuery() �Լ��� ����Ѵ�. : ������ ResultSet �̴�.
			// INSERT, UPDATE, DELETE �� executeUpdate() �Լ��� ����Ѵ�. : ���ϰ��� int : �Ǽ��� �����Ѵ�.
			// executeQuery() �� executeUpdate() �Լ��� ����ϱ� ������ exeute() �Լ��� ����ϸ� �ȴ�.
			nCnt = pstmt.executeUpdate();
			if (!conn.getAutoCommit()) conn.commit();
			
			System.out.println("nCnt >>> : " + nCnt + "�� ��� �Ǿ���");
			
			if(nCnt > 0) {bool = true;}
			
			KbdConnProperty.conClose(conn, pstmt);			
		}catch(Exception e) {
			System.out.println("�Է� ��񿬵��� ������ ������ϴ�. >>> : " + e);
		}finally {
			try {
				KbdConnProperty.conClose(conn, pstmt);
			}catch(Exception e2) {}
		}
		return bool;
	}
	
	// ȸ�� ����
	public boolean kmemUpdate(KbdMemberVO kvo) {
		System.out.println("KbdMember kmemUpdate() �Լ� ���� >>> : ");
		KbdMemberVO.printlnKbdMemberVO(kvo);
		
		// ����� ��ü�� ���������� �����ϰ� �ʱ�ȭ �ϱ�
		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		boolean bool = false;
		
		try {
			conn = KbdConnProperty.getConnection();
			System.out.println("conn.getAutoCommit() >>> : " + conn.getAutoCommit());
			
			pstmt = conn.prepareStatement(KbdMemberSqlMap.getKbdMemberUpdateQuery());
			System.out.println("�����ϱ� >>> : \n" + KbdMemberSqlMap.getKbdMemberUpdateQuery());
			
			// �Ķ���� Ŭ���� ���ϱ�
			pstmt.clearParameters();
			
			pstmt.setString(1, kvo.getKemail());
			pstmt.setString(2, kvo.getKaddr());
			pstmt.setString(3, kvo.getKhobby());
			pstmt.setString(4, kvo.getKjob());
			pstmt.setString(5, kvo.getKnum());
			/*
				sb.append("SET								\n");
				sb.append("			KEMAIL  = ?				\n"); // placeholder 1
				sb.append("			,KADDR  = ?				\n"); // placeholder 2
				sb.append("			,KHOBBY = ?				\n"); // placeholder 3
				sb.append("			,KJOB   = ? 			\n"); // placeholder 4
				sb.append("			,UPDATEDATE  = SYSDATE	\n");
				sb.append("WHERE 	 HNUM   = ?				\n"); // placeholder 5
				sb.append("AND 		 DELETEYN   = 'Y'		\n");
			 */
			
			// ������ ���޽��� \
			// SELECT �� executeQuery() �Լ��� ����Ѵ�. : ������ ResultSet �̴�.
			// INSERT, UPDATE, DELETE �� executeUpdate() �Լ��� ����Ѵ�. : ���ϰ��� int : �Ǽ��� �����Ѵ�.
			// executeQuery() �� executeUpdate() �Լ��� ����ϱ� ������ exeute() �Լ��� ����ϸ� �ȴ�.
			nCnt = pstmt.executeUpdate();
			if (!conn.getAutoCommit()) conn.commit();
			
			System.out.println("nCnt >>> : " + nCnt + "�� ���� �Ǿ���");
			
			if (nCnt > 0) {bool = true;}
			
			KbdConnProperty.conClose(conn, pstmt);
		}catch (Exception e) {
			System.out.println("�Է� ��񿬵��� ������ ������ϴ�. >>> : " + e);
		}finally {
			try {
				KbdConnProperty.conClose(conn, pstmt);
			}catch (Exception e2) {}
		}
		
		return bool;
	}
	
	// ȸ�� ����
	public boolean kmemDelete(KbdMemberVO kvo) {
		System.out.println("KbdMember kmemDelete() �Լ� ���� >>> : ");
		KbdMemberVO.printKbdMemberVO(kvo);
		
		// ����� ��ü�� ���������� �����ϰ� �ʱ�ȭ �ϱ�
		Connection conn = null;
		PreparedStatement pstmt = null;
		int nCnt = 0;
		boolean bool = false;
		
		try {
			
			conn = KbdConnProperty.getConnection();
			System.out.println("conn.getAutoCommit() >>> : " + conn.getAutoCommit());
			
			pstmt = conn.prepareStatement(KbdMemberSqlMap.getKbdMemberDeleteQuery());
			System.out.println("�����ϱ� >>> : \n" + KbdMemberSqlMap.getKbdMemberDeleteQuery());
			
			// �Ķ���� Ŭ���� �� �ϱ�
			pstmt.clearParameters();
			pstmt.setString(1, kvo.getKnum());
			/*
			 	sb.append(" SET								\n");
				sb.append("			 DELETEYN 	= 'N'		\n");
				sb.append("			,UPDATEDATE = SYSDATE	\n");
				sb.append(" WHERE 	 KNUM  		= ?			\n"); // placeholder 1
				sb.append("AND 		 DELETEYN 		= 'Y'	\n");
			 */
			
		// ������ ���޽��� \
		// SELECT �� executeQuery() �Լ��� ����Ѵ�. : ������ ResultSet �̴�.
		// INSERT, UPDATE, DELETE �� executeUpdate() �Լ��� ����Ѵ�. : ���ϰ��� int : �Ǽ��� �����Ѵ�.
		// executeQuery() �� executeUpdate() �Լ��� ����ϱ� ������ exeute() �Լ��� ����ϸ� �ȴ�.
		nCnt = pstmt.executeUpdate();
		if (!conn.getAutoCommit()) conn.commit();
		
		System.out.println("nCnt >>> : " + nCnt + "�� ���� �Ǿ���");
		
		if (nCnt > 0) {bool = true;}
		
		KbdConnProperty.conClose(conn, pstmt);
		}catch (Exception e) {
			System.out.println("�Է� ��񿬵��� ������ ������ϴ�. >>> : " + e);
		}finally {
			try {
				KbdConnProperty.conClose(conn, pstmt);
			}catch(Exception e2) {}
		}
		
		return bool;	}

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("ȸ������ CRUD::ISUD �׽�Ʈ >>> : ");		
		

		Scanner sc = new Scanner(System.in);
		
		while (true) {
			
			System.out.println("\n\nȸ������ ��ü��ȸ:SA, ������ȸ:S, ���:I, ����:U, ����:D, ����:Q");
			
			String isud = sc.next().toUpperCase();
			
			if ("Q".equals(isud)) break;
			
			if ("SA".equals(isud)) {
				System.out.println("ȸ������ ��ü��ȸ >>> : " + isud);
				
				KbdMember hm = new KbdMember();
				
				ArrayList<KbdMemberVO> aList = hm.kmemSelectAll();

				if (aList !=null && aList.size() > 0) {
					for (int i=0; i < aList.size(); i++) {
						
						KbdMemberVO kvo = aList.get(i);
						KbdMemberVO.printKbdMemberVO(kvo);
					}		
				}else {
					System.out.println("aList �� �����Ͱ� ���׿� >>> : " + aList);
				}
			}
			if ("S".equals(isud)) {
				System.out.println("ȸ������ ������ȸ >>> : " + isud);
				
				System.out.println("��ȸ���� ȸ����ȣ�� �Է��Ͻÿ� >>> : ");
				Scanner scs = new Scanner(System.in);
				String knum = scs.next();
				
				KbdMember hm = new KbdMember();
				
				KbdMemberVO kvo = null;
				kvo = new KbdMemberVO();
				kvo.setKnum(knum);
				
				ArrayList<KbdMemberVO> aList = hm.kmemSelect(kvo);

				if (aList !=null && aList.size() > 0) {
					for (int i=0; i < aList.size(); i++) {
						
						KbdMemberVO _kvo = aList.get(i);
						KbdMemberVO.printKbdMemberVO(_kvo);
					}		
				}else {
					System.out.println("aList �� �����Ͱ� ���׿� >>> : " + aList);
				}	
			}
			if ("I".equals(isud)) {
				System.out.println("ȸ������ ��� >>> : " + isud);
				
				String knum = "202108060007";
				String kname = "GGGG";
				String Kid = "GG00";
				String kpw = "GG1234";
				String Kbirth = "20210701";
				String kgender = "01";
				String ktel = "03212341234";
				String khp = "01012341234";
				String kemail = "GG00@naver.com";
				String kaddr = "���� ��õ�� ���굿 77";
				String khobby = "01";
				String kphoto = "abc06.jpg";
				String kskill = "Ư��7";
				String kjob = "01";
				
				KbdMember km = new KbdMember();
				
				KbdMemberVO kvo = null;
				kvo = new KbdMemberVO();
				kvo.setKnum(knum);
				kvo.setKname(kname);
				kvo.setKid(Kid);
				kvo.setKpw(kpw);
				kvo.setKbirth(Kbirth);
				kvo.setKgender(kgender);
				kvo.setKtel(ktel);
				kvo.setKhp(khp);
				kvo.setKemail(kemail);
				kvo.setKaddr(kaddr);
				kvo.setKhobby(khobby);
				kvo.setKphoto(kphoto);
				kvo.setKskill(kskill);
				kvo.setKjob(kjob);
				
				boolean bool = km.kmemInsert(kvo);
				
				if(bool) {
					System.out.println("ȸ�� ���� �Է� ���� >>> : " + bool);
					
					ArrayList<KbdMemberVO> aList = km.kmemSelectAll();
					
					if(aList !=null && aList.size() > 0) {
						for (int i=0; i < aList.size(); i++) {
							KbdMemberVO _kvo = aList.get(i);
							KbdMemberVO.printKbdMemberVO(_kvo);
						}
					}else {
						System.out.println("aList �� �����Ͱ� ���׿� >>> : " + aList);
					}
				}else {
					System.out.println("ȸ�� ���� �Է� ���� >>> : "+ bool);
				}
			}
			if ("U".equals(isud)) {
				System.out.println("ȸ������ ���� >>> : " + isud);
			}
			if ("D".equals(isud)) {
				System.out.println("ȸ������ ���� >>> : " + isud);
			}				
		}
	}
}








