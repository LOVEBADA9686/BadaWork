package a.b.c.kosmo.board.service;

import java.util.ArrayList;

import a.b.c.kosmo.board.vo.KbdBoardVO;

public interface KbdBoardService {
	
	public ArrayList<KbdBoardVO> kboardSelectAll();
	public ArrayList<KbdBoardVO> kboardSelect(KbdBoardVO kvo);
	public int kboardInsert(KbdBoardVO kvo);
	public int kboardUpdate(KbdBoardVO kvo);
	public int kboardDelete(KbdBoardVO kvo);

}
