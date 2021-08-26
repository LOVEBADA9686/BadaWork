package a.b.c.swing.member.service;

import java.util.ArrayList;

import a.b.c.swing.member.dao.SwingMemberDAO;
import a.b.c.swing.member.dao.SwingMemberDAOImpl;
import a.b.c.swing.member.vo.SwingMemberVO;

public class SwingMemberServiceImpl implements SwingMemberService {

	@Override
	public ArrayList<SwingMemberVO> smSelectAll() {
		// TODO Auto-generated method stub
		System.out.println("SwingMemberServiceImpl.smSelectAll() 함수 진입 ");
		
		SwingMemberDAO sdao = new SwingMemberDAOImpl();
		ArrayList<SwingMemberVO> aList = sdao.smSelectAll();
		return aList;
	}

	@Override
	public ArrayList<SwingMemberVO> smSelect(SwingMemberVO svo) {
		// TODO Auto-generated method stub
		System.out.println("SwingMemberServiceImpl.smSelect() 함수 진입 ");
		
		SwingMemberDAO sdao = new SwingMemberDAOImpl();
		ArrayList<SwingMemberVO> aList = sdao.smSelect(svo);
		return aList;
	}

	@Override
	public boolean smInsert(SwingMemberVO svo) {
		// TODO Auto-generated method stub
		System.out.println("SwingMemberServiceImpl.smInsert() 함수 진입 ");
		
		SwingMemberDAO sdao = new SwingMemberDAOImpl();
		boolean bool = sdao.smInsert(svo);
		return bool;
	}

	@Override
	public boolean smUpdate(SwingMemberVO svo) {
		// TODO Auto-generated method stub
		System.out.println("SwingMemberServiceImpl.smUpdate() 함수 진입 ");
		
		SwingMemberDAO sdao = new SwingMemberDAOImpl();
		boolean bool = sdao.smUpdate(svo);
		return bool;
	}

	@Override
	public boolean smDelete(SwingMemberVO svo) {
		// TODO Auto-generated method stub
		System.out.println("SwingMemberServiceImpl.smDelete() 함수 진입 ");
		
		SwingMemberDAO sdao = new SwingMemberDAOImpl();
		boolean bool = sdao.smDelete(svo);
		return bool;
	}
	
	// 조건조호 :: 이름
	@Override
	public ArrayList<SwingMemberVO> smSelectName(SwingMemberVO svo) {
		// TODO Auto-generated method stub
		System.out.println("SwingMemberServiceImpl.smSelectName() 함수 진입 ");
		
		SwingMemberDAO sdao = new SwingMemberDAOImpl();
		ArrayList<SwingMemberVO> aList = sdao.smSelectName(svo);
		return aList;
	}	

	// 조건조회 :: 아이디 
	@Override
	public ArrayList<SwingMemberVO> smSelectId(SwingMemberVO svo) {
		// TODO Auto-generated method stub
		System.out.println("SwingMemberServiceImpl.smSelectId() 함수 진입 ");
		
		SwingMemberDAO sdao = new SwingMemberDAOImpl();
		ArrayList<SwingMemberVO> aList = sdao.smSelectId(svo);
		return aList;		
	}

	// 로그인 체크 
	@Override
	public int smLoginCheck(SwingMemberVO svo) {
		// TODO Auto-generated method stub
		System.out.println("SwingMemberServiceImpl.smSelectId() 함수 진입 ");
		
		SwingMemberDAO sdao = new SwingMemberDAOImpl();
		int nCnt = sdao.smLoginCheck(svo);
		return nCnt;		

	}
}
