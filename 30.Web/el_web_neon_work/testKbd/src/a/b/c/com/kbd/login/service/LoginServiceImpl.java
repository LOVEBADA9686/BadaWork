package a.b.c.com.kbd.login.service;

import a.b.c.com.kbd.login.dao.LoginDAO;
import a.b.c.com.kbd.login.dao.LoginDAOImpl;
import a.b.c.com.kbd.mem.vo.MemberVO;

public class LoginServiceImpl implements LoginService {

	@Override
	public int loginCheckCnt(MemberVO mvo) {
		// TODO Auto-generated method stub
		System.out.println("LoginServiceImpl loginCheckCnt() �Լ� ���� >>> : ");
		
		LoginDAO ldao = new LoginDAOImpl();
		return ldao.loginCheckCnt(mvo);
		
	}
}
