package a.b.c.kosmo.mem.service;

import java.util.ArrayList;

import a.b.c.kosmo.mem.dao.KbdMemberDAO;
import a.b.c.kosmo.mem.dao.KbdMemberDAOImpl;
import a.b.c.kosmo.mem.vo.KbdMemberVO;

public class KbdMemberServiceImpl implements KbdMemberService {

	@Override
	public ArrayList<KbdMemberVO> kmemSelectAll() {
		// TODO Auto-generated method stub
		System.out.println("KbdMemberServiceImpl.kmemSelectAll() 함수 진입");
		
		KbdMemberDAO kdao = new KbdMemberDAOImpl();
		ArrayList<KbdMemberVO>aList = kdao.kmemSelectAll();
		return aList;
	}

	@Override
	public ArrayList<KbdMemberVO> kmemSelect(KbdMemberVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KbdMemberServiceImpl.kmemSelect() 함수 진입");
		KbdMemberDAO kdao = new KbdMemberDAOImpl();
		ArrayList<KbdMemberVO> aList = kdao.kmemSelect(kvo);
		return aList;
	}

	@Override
	public boolean kmemInsert(KbdMemberVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KbdMemberServiceImpl.kmemInsert() 함수 진입");
		KbdMemberDAO kdao = new KbdMemberDAOImpl();
		boolean bool = kdao.kmemInsert(kvo);
		return bool;
	}

	@Override
	public boolean kmemUpdate(KbdMemberVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KbdMemberServiceImpl.kmemUpdate() 함수 진입");
		
		KbdMemberDAO kdao = new KbdMemberDAOImpl();
		boolean bool = kdao.kmemUpdate(kvo);
		return bool;
	}

	@Override
	public boolean kmemDelete(KbdMemberVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KbdmemberServiceImpl.kmemDelete() 함수 진입");
		
		KbdMemberDAO kdao = new KbdMemberDAOImpl();
		boolean bool = kdao.kmemDelete(kvo);
		return bool;
	}

	// 조건조회 :: 회원 이름
	@Override
	public ArrayList<KbdMemberVO> kmemSelectName(KbdMemberVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KbdMemberServiceImpl.kmemSelectName() 함수 진입");
		
		KbdMemberDAO kdao = new KbdMemberDAOImpl();
		return kdao.kmemSelectName(kvo);
	}

	// 조건조회 :: 회원 아이디
	@Override
	public ArrayList<KbdMemberVO> kmemSelectId(KbdMemberVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KbdMemberServiceImpl.kmemSelectId() 함수 진입");
		
		KbdMemberDAO kdao = new KbdMemberDAOImpl();
		return kdao.kmemSelectId(kvo);
	}

	@Override
	public boolean kmemIdCheck(KbdMemberVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KbdMemberServiceImpl.kmemIdCheck() 함수 진입");
		
		KbdMemberDAO kdao = new KbdMemberDAOImpl();
		return kdao.kmemIdCheck(kvo);
	}

}
