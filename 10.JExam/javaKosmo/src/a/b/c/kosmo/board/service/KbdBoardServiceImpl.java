package a.b.c.kosmo.board.service;

import java.util.ArrayList;

import a.b.c.kosmo.board.dao.KbdBoardDAO;
import a.b.c.kosmo.board.dao.KbdBoardDAOImpl;
import a.b.c.kosmo.board.vo.KbdBoardVO;

public class KbdBoardServiceImpl implements KbdBoardService {

	@Override
	public ArrayList<KbdBoardVO> kboardSelectAll() {
		// TODO Auto-generated method stub
		System.out.println("KbdBoardServiceImpl kboardSelectAll() 함수 진입 >>> : ");
		
		KbdBoardDAO kdao = new KbdBoardDAOImpl();
		return kdao.kboardSelectAll();
	}

	@Override
	public ArrayList<KbdBoardVO> kboardSelect(KbdBoardVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KbdBoardServiceImpl kboardSelect() 함수 진입 >>> : ");

		KbdBoardDAO kdao = new KbdBoardDAOImpl();
		return kdao.kboardSelect(kvo);
	}

	@Override
	public int kboardInsert(KbdBoardVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KbdBoardSerivceImpl kboardInsert() 함수 진입 >>> : ");
		
		KbdBoardDAO kdao = new KbdBoardDAOImpl();
		return kdao.kboardInsert(kvo);
	}

	@Override
	public int kboardUpdate(KbdBoardVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KbdBoardServiceImpl kboardUpdate() 함수 진입 >>> : ");
		
		KbdBoardDAO kdao = new KbdBoardDAOImpl();
		return kdao.kboardUpdate(kvo);
	}

	@Override
	public int kboardDelete(KbdBoardVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KbdBoardServiceImpl kboardDelect() 함수 진입 >>> : ");
		
		KbdBoardDAO kdao = new KbdBoardDAOImpl();
		return kdao.kboardDelete(kvo);
	}
	
}
