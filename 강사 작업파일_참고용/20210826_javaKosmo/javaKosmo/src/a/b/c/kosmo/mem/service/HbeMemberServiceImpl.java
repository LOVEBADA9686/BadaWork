package a.b.c.kosmo.mem.service;

import java.util.ArrayList;

import a.b.c.kosmo.mem.dao.HbeMemberDAO;
import a.b.c.kosmo.mem.dao.HbeMemberDAOImpl;
import a.b.c.kosmo.mem.vo.HbeMemberVO;

public class HbeMemberServiceImpl implements HbeMemberService {

	@Override
	public ArrayList<HbeMemberVO> hmemSelectAll() {
		// TODO Auto-generated method stub
		System.out.println("HbeMemberServiceImpl.hmemSelectAll() �Լ� ���� ");
		
		HbeMemberDAO hdao = new HbeMemberDAOImpl();
		ArrayList<HbeMemberVO> aList = hdao.hmemSelectAll();
		return aList;
	}

	@Override
	public ArrayList<HbeMemberVO> hmemSelect(HbeMemberVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeMemberServiceImpl.hmemSelect() �Լ� ���� ");
		
		HbeMemberDAO hdao = new HbeMemberDAOImpl();
		ArrayList<HbeMemberVO> aList = hdao.hmemSelect(hvo);
		return aList;
	}

	@Override
	public boolean hmemInsert(HbeMemberVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeMemberServiceImpl.hmemInsert() �Լ� ���� ");
		
		HbeMemberDAO hdao = new HbeMemberDAOImpl();
		boolean bool = hdao.hmemInsert(hvo);
		return bool;
	}

	@Override
	public boolean hmemUpdate(HbeMemberVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeMemberServiceImpl.hmemUpdate() �Լ� ���� ");
		
		HbeMemberDAO hdao = new HbeMemberDAOImpl();
		boolean bool = hdao.hmemUpdate(hvo);
		return bool;
	}

	@Override
	public boolean hmemDelete(HbeMemberVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeMemberServiceImpl.hmemDelete() �Լ� ���� ");
		
		HbeMemberDAO hdao = new HbeMemberDAOImpl();
		boolean bool = hdao.hmemDelete(hvo);
		return bool;
	}

	// ������ȸ :: ȸ�� �̸� 
	@Override
	public ArrayList<HbeMemberVO> hmemSelectName(HbeMemberVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeMemberServiceImpl.hmemSelectName() �Լ� ���� ");
		
		HbeMemberDAO hdao = new HbeMemberDAOImpl(); 
		return hdao.hmemSelectName(hvo);
	}

	// ������ȸ :: ȸ�� ���̵�	
	@Override
	public ArrayList<HbeMemberVO> hmemSelectId(HbeMemberVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeMemberServiceImpl.hmemSelectId() �Լ� ���� ");
		
		HbeMemberDAO hdao = new HbeMemberDAOImpl(); 
		return hdao.hmemSelectId(hvo);

	}

	@Override
	public boolean hmemIdCheck(HbeMemberVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeMemberServiceImpl.hmemIdCheck() �Լ� ���� ");
		
		HbeMemberDAO hdao = new HbeMemberDAOImpl();		
		return hdao.hmemIdCheck(hvo);
	}

}
