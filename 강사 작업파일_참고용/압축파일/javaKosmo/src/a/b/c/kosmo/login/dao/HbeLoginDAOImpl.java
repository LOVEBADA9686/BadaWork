package a.b.c.kosmo.login.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import a.b.c.common.HbeConnProperty;
import a.b.c.kosmo.login.sql.HbeLoginQueryMap;
import a.b.c.kosmo.mem.vo.HbeMemberVO;


public class HbeLoginDAOImpl implements HbeLoginDAO {

	@Override
	public int hLoginCheck(HbeMemberVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeLoginDAOImpl hLoginCheck() �Լ� ���� >>> : ");		
		
		// ����� ��ü�� ���������� �����ϰ� �ʱ�ȭ �ϱ� 
		Connection        conn = null;
		PreparedStatement pstmt = null;
		ResultSet         rsRs = null;
		int nCnt = 0;
		
		try{
			conn = HbeConnProperty.getConnection();
			pstmt = conn.prepareStatement(HbeLoginQueryMap.gethLoginCheckQuery());
			System.out.println("�α��� üũ  :: \n" + HbeLoginQueryMap.gethLoginCheckQuery());
			
			pstmt.clearParameters();
			pstmt.setString(1, hvo.getHid());
			pstmt.setString(2, hvo.getHpw());
			rsRs = pstmt.executeQuery();
			
			if (rsRs !=null){	
				while (rsRs.next()){
					nCnt = rsRs.getInt(1);
				}
			}
			
			HbeConnProperty.conClose(conn, pstmt, rsRs);
		}catch (Exception sq){
			System.out.println(" �α���üũ DB ���� " + sq.getMessage());
			System.out.println(" ���� :: " + sq);
		}finally{
			HbeConnProperty.conClose(conn, pstmt, rsRs);	
		}
		
		return nCnt;
	}
}
