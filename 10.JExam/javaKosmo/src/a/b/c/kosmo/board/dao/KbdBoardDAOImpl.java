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
		System.out.println("KbdBoardDAOImpl kboardSelectAll() �Լ� ���� >>> : ");
		
		// ����� ��ü�� ���������� �����ϰ� �ʱ�ȭ �ϱ�
		Connection				conn = null;
		PreparedStatement		pstmt = null;
		ResultSet				rsRs = null;
		
		ArrayList<KbdBoardVO> aList = null;
		
		try {
			conn = KbdConnProperty.getConnection();
			pstmt = conn.prepareStatement(KbdBoardSqlMap.getKboardSelectAllQueryMap());
			System.out.println("��ü��ȸ :: \n" + KbdBoardSqlMap.getKboardSelectAllQueryMap());
			
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
			System.out.println("��ü��ȸ DB ����" + sq.getMessage());
			System.out.println("���� :: " + sq);
		}finally {
			KbdConnProperty.conClose(conn, pstmt, rsRs);
		}
		
		return aList;
	}

	@Override
	public ArrayList<KbdBoardVO> kboardSelect(KbdBoardVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KbdBoardDAOImpl kboardSelect() �Լ� ���� >>> : ");
		
		// ����� ��ü�� ���������� �����ϰ� �ʱ�ȭ �ϱ�
		Connection			conn = null;
		PreparedStatement	pstmt = null;
		ResultSet			rsRs = null;
			
		ArrayList<KbdBoardVO> aList = null;
		
		try {
			conn = KbdConnProperty.getConnection();
			pstmt = conn.prepareStatement(KbdBoardSqlMap.getKboardSelectQueryMap());
			System.out.println("������ȸ :: \n" + KbdBoardSqlMap.getKboardSelectQueryMap());
			
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
			System.out.println("��ü��ȸ DB ����" + sq.getMessage());
			System.out.println("���� :: " + sq);
		}finally {
			KbdConnProperty.conClose(conn, pstmt, rsRs);
		}
		
		return aList;
	}

	@Override
	public int kboardInsert(KbdBoardVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KbdBoardDAOImpl kboardInsert() �Լ� ���� >>> : ");
		
		// ����� ��ü�� ���������� �����ϰ� �ʱ�ȭ �ϱ�
		Connection				conn = null;
		PreparedStatement		pstmt = null;
		int nCnt = 0;
		
		try {
			conn = KbdConnProperty.getConnection();
			pstmt = conn.prepareStatement(KbdBoardSqlMap.getKboardInserQueryMap());
			System.out.println("�μ�Ʈ :: \n" + KbdBoardSqlMap.getKboardInserQueryMap());
			
			pstmt.clearParameters();
			pstmt.setString(1, kvo.getBnum());
			pstmt.setString(2, kvo.getBsubject());
			pstmt.setString(3, kvo.getBwriter());
			pstmt.setString(4, kvo.getBcontents());
			pstmt.setString(5, kvo.getBpw());

			nCnt = pstmt.executeUpdate();
			if(! conn.getAutoCommit()) conn.commit();
			System.out.println("nCnt >>> : " + nCnt + "�� ��� �Ǿ���");
			
			KbdConnProperty.conClose(conn, pstmt);
		}catch(Exception sq) {
			System.out.println("�μ�Ʈ DB ����" + sq.getMessage());
			System.out.println("���� ::" + sq);
		}finally {
			KbdConnProperty.conClose(conn, pstmt);
		}
		
		return nCnt;
	}

	@Override
	public int kboardUpdate(KbdBoardVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KbdBoardDAOImpl kboardUpdate() �Լ� ���� >>> : ");
		KbdBoardVO.printlnKbdBoardVO(kvo);
		
		// ����� ��ü�� ���������� �����ϰ�  �ʱ�ȭ �ϱ�
		Connection 			conn = null;
		PreparedStatement	pstmt = null;
		int nCnt = 0;
		
		try {
			conn = KbdConnProperty.getConnection();
			pstmt = conn.prepareStatement(KbdBoardSqlMap.getKboardUpdateQueryMap());
			System.out.println("������Ʈ :: \n" + KbdBoardSqlMap.getKboardUpdateQueryMap());
			
			pstmt.clearParameters();
			pstmt.clearParameters();
			pstmt.setString(1, kvo.getBsubject());
			pstmt.setString(2, kvo.getBcontents());
			pstmt.setString(3, kvo.getBnum());
			
			nCnt = pstmt.executeUpdate();
			if(! conn.getAutoCommit()) conn.commit();
			System.out.println("nCnt >>> : " + nCnt + "�� ��� �Ǿ���");
			
			KbdConnProperty.conClose(conn, pstmt);
		}catch(Exception sq) {
			System.out.println("������Ʈ DB ���� " + sq.getMessage());
			System.out.println("���� :: " + sq);
		}finally {
			KbdConnProperty.conClose(conn, pstmt);
		}	
		
		return nCnt;
	}

	@Override
	public int kboardDelete(KbdBoardVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KbdBoardDAOImpl kboardDelete() �Լ� ���� >>> : ");
		
		// ����� ��ü�� ���������� �����ϰ� �ʱ�ȭ �ϱ�
		Connection		conn = null;
		PreparedStatement	pstmt = null;
		int nCnt = 0;
		
		try {
			conn = KbdConnProperty.getConnection();
			pstmt = conn.prepareStatement(KbdBoardSqlMap.getKboardDeleteQueryMap());
			System.out.println("����Ʈ :: \n" + KbdBoardSqlMap.getKboardDeleteQueryMap());
			
			pstmt.clearParameters();
			pstmt.setString(1, kvo.getBnum());
			
			nCnt = pstmt.executeUpdate();
			if (! conn.getAutoCommit()) conn.commit();
			System.out.println("nCnt >>> : " + nCnt + "�� ���� �Ǿ���");
			
			KbdConnProperty.conClose(conn, pstmt);
		}catch (Exception sq) {
			System.out.println("����Ʈ DB ����" + sq.getMessage());
			System.out.println("���� :: " + sq);
		}finally {
			KbdConnProperty.conClose(conn, pstmt);
		}
		
		return nCnt;
	}
	
}
