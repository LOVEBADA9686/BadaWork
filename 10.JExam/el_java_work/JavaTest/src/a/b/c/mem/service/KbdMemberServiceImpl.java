package a.b.c.mem.service;

import java.util.ArrayList;

import a.b.c.mem.dao.KbdMemberDAO;
import a.b.c.mem.dao.KbdMemberDAOImpl;
import a.b.c.mem.vo.KbdMemberVO;

public class KbdMemberServiceImpl implements KbdMemberService {

	@Override
	public ArrayList<KbdMemberVO> kmemSelectAll() {
		// TODO Auto-generated method stub
		System.out.println("KbdMemberServiceImpl.kmemSelectAll() �Լ� ����");
		
		KbdMemberDAO kdao = new KbdMemberDAOImpl();
		ArrayList<KbdMemberVO> aList = kdao.kmemSelectAll();
		return aList;
	}

	@Override
	public ArrayList<KbdMemberVO> kmemSelect(KbdMemberVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KbdMemberServiceImpl.kmemSelect() �Լ� ����");
		
		KbdMemberDAO kdao = new KbdMemberDAOImpl();
		ArrayList<KbdMemberVO> aList = kdao.kmemSelect(kvo);
		return aList;
	}

	@Override
	public boolean kmemInsert(KbdMemberVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KbdMemberServiceImpl.kmemInsert() �Լ� ���� ");
		
		KbdMemberDAO kdao = new KbdMemberDAOImpl();
		boolean bool = kdao.kmemInsert(kvo);
		return bool;
	}

	@Override
	public boolean kmemUpdate(KbdMemberVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KbdMemberServiceImpl.kmemUpdate() �Լ� ���� ");
		
		KbdMemberDAO kdao = new KbdMemberDAOImpl();
		boolean bool = kdao.kmemUpdate(kvo);
		return bool;
	}
	
	@Override
	public boolean kmemDelete(KbdMemberVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KbdMemberServiceImpl.kmemDelete() �Լ� ���� ");
		
		KbdMemberDAO kdao = new KbdMemberDAOImpl();
		boolean bool = kdao.kmemDelete(kvo);
		return bool;
	}

}
