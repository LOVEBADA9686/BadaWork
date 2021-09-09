package a.b.c.kosmo.board.service;

import java.util.ArrayList;

import a.b.c.kosmo.board.dao.HbeBoardDAO;
import a.b.c.kosmo.board.dao.HbeBoardDAOImpl;
import a.b.c.kosmo.board.vo.HbeBoardVO;

public class HbeBoardServiceImpl implements HbeBoardService {

	@Override
	public ArrayList<HbeBoardVO> hboardSelectAll() {
		// TODO Auto-generated method stub
		System.out.println("HbeBoardServiceImpl hboardSelectAll() �Լ� ���� >>> : ");
		
		HbeBoardDAO hdao = new HbeBoardDAOImpl();		
		return hdao.hboardSelectAll();
	}

	@Override
	public ArrayList<HbeBoardVO> hboardSelect(HbeBoardVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeBoardServiceImpl hboardSelect() �Լ� ���� >>> : ");
		
		HbeBoardDAO hdao = new HbeBoardDAOImpl();		
		return hdao.hboardSelect(hvo);
	}

	@Override
	public int hboardInsert(HbeBoardVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeBoardServiceImpl hboardInsert() �Լ� ���� >>> : ");
		
		HbeBoardDAO hdao = new HbeBoardDAOImpl();		
		return hdao.hboardInsert(hvo);
	}

	@Override
	public int hboardUpdate(HbeBoardVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeBoardServiceImpl hboardUpdate() �Լ� ���� >>> : ");
		
		HbeBoardDAO hdao = new HbeBoardDAOImpl();		
		return hdao.hboardUpdate(hvo);
	}

	@Override
	public int hboardDelete(HbeBoardVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeBoardServiceImpl hboardDelete() �Լ� ���� >>> : ");
		
		HbeBoardDAO hdao = new HbeBoardDAOImpl();		
		return hdao.hboardDelete(hvo);
	}

	@Override
	public ArrayList<HbeBoardVO> hboardSelectSubject(HbeBoardVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeBoardServiceImpl hboardSelectSubject() �Լ� ���� >>> : ");
		
		HbeBoardDAO hdao = new HbeBoardDAOImpl();		
		return hdao.hboardSelectSubject(hvo);
	}

	@Override
	public ArrayList<HbeBoardVO> hboardSelectWriter(HbeBoardVO hvo) {
		// TODO Auto-generated method stub
		System.out.println("HbeBoardServiceImpl hboardSelectWriter() �Լ� ���� >>> : ");
		
		HbeBoardDAO hdao = new HbeBoardDAOImpl();		
		return hdao.hboardSelectWriter(hvo);
	}
}
