package a.b.c.board.service;

import java.util.ArrayList;

import a.b.c.board.vo.KbdBoardVO;

public interface KbdBoardService {
	
	public ArrayList<KbdBoardVO> kboardSelectAll();
	public ArrayList<KbdBoardVO> kboardSelect(KbdBoardVO kvo);
	public int kboardInsert(KbdBoardVO kvo);
	public int kboardUpdate(KbdBoardVO kvo);
	public int kboardDelete(KbdBoardVO kvo);

}
