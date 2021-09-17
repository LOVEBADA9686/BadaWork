package a.b.c.com.kbd.mem.service;

import java.util.ArrayList;

import a.b.c.com.kbd.mem.dao.MemberDAO;
import a.b.c.com.kbd.mem.dao.MemberDAOImpl;
import a.b.c.com.kbd.mem.vo.MemberVO;

public class MemberServiceImpl implements MemberService {

	@Override
	public ArrayList<MemberVO> memberSelectAll() {
		// TODO Auto-generated method stub
		System.out.println("MemberServiceImpl memberSelectAll() �Լ� ���� >>> : ");
		
		MemberDAO mdao = new MemberDAOImpl();
		return mdao.memberSelectAll();
	}

	@Override
	public ArrayList<MemberVO> memberSelect(MemberVO mvo) {
		// TODO Auto-generated method stub
		System.out.println("MemberServiceImpl memeberSelect() �Լ� ���� >>> : ");
		
		MemberDAO mdao = new MemberDAOImpl();
		return mdao.memberSelect(mvo);
	}

	@Override
	public boolean memberInsert(MemberVO mvo) {
		// TODO Auto-generated method stub
		System.out.println("MemberServiceImpl memberInser() �Լ� ���� >>> :");
		
		MemberDAO mdao = new MemberDAOImpl();
		return mdao.memberInsert(mvo);
	}

	@Override
	public boolean memberUpdate(MemberVO mvo) {
		// TODO Auto-generated method stub
		System.out.println("MemberServiceImpl memberUpdate() �Լ� ���� >>> : ");
		
		MemberDAO mdao = new MemberDAOImpl();
		return mdao.memberUpdate(mvo);		
	}

	@Override
	public boolean memberDelete(MemberVO mvo) {
		// TODO Auto-generated method stub
		System.out.println("MemberServiceImpl memberDelete() �Լ� ���� >>> : ");
		
		MemberDAO mdao = new MemberDAOImpl();
		return mdao.memberDelete(mvo);	
	}

}
