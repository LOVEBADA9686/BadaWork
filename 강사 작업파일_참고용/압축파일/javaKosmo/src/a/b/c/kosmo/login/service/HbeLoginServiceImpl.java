package a.b.c.kosmo.login.service;

import a.b.c.kosmo.login.dao.HbeLoginDAO;
import a.b.c.kosmo.login.dao.HbeLoginDAOImpl;
import a.b.c.kosmo.mem.vo.HbeMemberVO;

public class HbeLoginServiceImpl implements HbeLoginService {

	@Override
	public int hLoginCheck(HbeMemberVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeLoginServiceImpl.hLoginCheck() 함수 진입 ");
		
		HbeLoginDAO hdao = new HbeLoginDAOImpl();
		return hdao.hLoginCheck(hvo);		
	}
}
