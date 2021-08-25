package a.b.c.mem.service;

import java.util.ArrayList;

import a.b.c.mem.dao.HbeMemberDAO;
import a.b.c.mem.dao.HbeMemberDAOImpl;
import a.b.c.mem.vo.HbeMemberVO;

public class HbeMemberServiceImpl implements HbeMemberService {

	@Override
	public ArrayList<HbeMemberVO> hmemSelectAll() {
		// TODO Auto-generated method stub
		System.out.println("HbeMemberServiceImpl.hmemSelectAll() 함수 진입 ");
		
		HbeMemberDAO hdao = new HbeMemberDAOImpl();
		ArrayList<HbeMemberVO> aList = hdao.hmemSelectAll();
		return aList;
	}

	@Override
	public ArrayList<HbeMemberVO> hmemSelect(HbeMemberVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeMemberServiceImpl.hmemSelect() 함수 진입 ");
		
		HbeMemberDAO hdao = new HbeMemberDAOImpl();
		ArrayList<HbeMemberVO> aList = hdao.hmemSelect(hvo);
		return aList;
	}

	@Override
	public boolean hmemInsert(HbeMemberVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeMemberServiceImpl.hmemInsert() 함수 진입 ");
		
		HbeMemberDAO hdao = new HbeMemberDAOImpl();
		boolean bool = hdao.hmemInsert(hvo);
		return bool;
	}

	@Override
	public boolean hmemUpdate(HbeMemberVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeMemberServiceImpl.hmemUpdate() 함수 진입 ");
		
		HbeMemberDAO hdao = new HbeMemberDAOImpl();
		boolean bool = hdao.hmemInsert(hvo);
		return bool;
	}

	@Override
	public boolean hmemDelete(HbeMemberVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeMemberServiceImpl.hmemDelete() 함수 진입 ");
		
		HbeMemberDAO hdao = new HbeMemberDAOImpl();
		boolean bool = hdao.hmemInsert(hvo);
		return bool;
	}

}
