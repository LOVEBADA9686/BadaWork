package a.b.c.kosmo.login.service;

import a.b.c.kosmo.login.dao.KbdLoginDAO;
import a.b.c.kosmo.login.dao.KbdLoginDAOImpl;
import a.b.c.kosmo.mem.vo.KbdMemberVO;

public class KbdLoginServiceImpl implements KbdLoginService {

	@Override
	public int kLoginCheck(KbdMemberVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KbdLoginServiceImpl.kLoginCheck() 함수 진입");
		
		KbdLoginDAO kdao = new KbdLoginDAOImpl();
		return kdao.kLoginCheck(kvo);
	}
}
