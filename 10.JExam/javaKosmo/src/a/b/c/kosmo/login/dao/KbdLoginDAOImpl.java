package a.b.c.kosmo.login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import a.b.c.common.KbdConnProperty;
import a.b.c.kosmo.login.sql.KbdLoginQueryMap;
import a.b.c.kosmo.mem.vo.KbdMemberVO;

public class KbdLoginDAOImpl implements KbdLoginDAO {

	@Override
	public int kLoginCheck(KbdMemberVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KbdLoginDAOImpl kLoginCheck() �Լ� ���� >>> : ");
		
		
		// ����� ��ü�� ���������� �����ϰ� �ʱ�ȭ �ϱ�
		Connection				conn = null;
		PreparedStatement		pstmt = null;
		ResultSet				rsRs = null;
		int nCnt = 0;
		
		try {
			conn = KbdConnProperty.getConnection();
			pstmt = conn.prepareStatement(KbdLoginQueryMap.gethLoginCheckQuery());
			System.out.println("�α��� üũ :: \n" + KbdLoginQueryMap.gethLoginCheckQuery());
			
			pstmt.clearParameters();
			pstmt.setString(1, kvo.getKid());
			pstmt.setString(2, kvo.getKhp());
			rsRs = pstmt.executeQuery();
			
			if(rsRs !=null) {
				while (rsRs.next()) {
					nCnt = rsRs.getInt(1);
				}
			}
			
			KbdConnProperty.conClose(conn, pstmt, rsRs);
		}catch(Exception sq) {
			System.out.println("�α���üũ DB ����" + sq.getMessage());
			System.out.println("���� ::" + sq);
		}finally {
			KbdConnProperty.conClose(conn, pstmt, rsRs);
		}
		
		return nCnt;
	}

	
	
}
