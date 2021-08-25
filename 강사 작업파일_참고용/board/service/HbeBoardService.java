package a.b.c.board.service;

import java.util.ArrayList;

import a.b.c.board.vo.HbeBoardVO;

public interface HbeBoardService {
	
	public ArrayList<HbeBoardVO> hboardSelectAll();
	public ArrayList<HbeBoardVO> hboardSelect(HbeBoardVO hvo);
	public int hboardInsert(HbeBoardVO hvo);
	public int hboardUpdate(HbeBoardVO hvo);
	public int hboardDelete(HbeBoardVO hvo);

}
