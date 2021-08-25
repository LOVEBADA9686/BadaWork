package a.b.c.board.service;

import java.util.ArrayList;

import a.b.c.board.dao.KbdBoardDAO;
import a.b.c.board.dao.KbdBoardDAOImpl;
import a.b.c.board.vo.KbdBoardVO;

public class KbdBoardServiceImpl implements KbdBoardService {

	@Override
	public ArrayList<KbdBoardVO> kboardSelectAll() {
		// TODO Auto-generated method stub
		System.out.println("KbdBoardServiceImpl kboardSelectAll() �Լ� ���� >>> : ");
		
		KbdBoardDAO kdao = new KbdBoardDAOImpl();
		return kdao.kboardSelectAll();		
	}

	@Override
	public ArrayList<KbdBoardVO> kboardSelect(KbdBoardVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KbdBoardServiceImpl kboardSelect() �Լ� ���� >>> : ");
		
		KbdBoardDAO kdao = new KbdBoardDAOImpl();
		return kdao.kboardSelect(kvo);
	}

	@Override
	public int kboardInsert(KbdBoardVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KbdBoardServiceImpl kboardInsert() �Լ� ���� >>> : ");
		
		KbdBoardDAO kdao = new KbdBoardDAOImpl();
		return kdao.kboardInsert(kvo);
	}

	@Override
	public int kboardUpdate(KbdBoardVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KbdBoardServiceImpl kboardUpdate() �Լ� ���� >>> : ");
		
		KbdBoardDAO kdao = new KbdBoardDAOImpl();
		return kdao.kboardUpdate(kvo);
	}

	@Override
	public int kboardDelete(KbdBoardVO kvo) {
		// TODO Auto-generated method stub
		System.out.println("KbdBoardServiceImpl kboardDelete() �Լ� ���� >>> : ");
		
		KbdBoardDAO Kdao = new KbdBoardDAOImpl();
		return Kdao.kboardDelete(kvo);
	}

}


