package a.b.c.kosmo.board.dao;

import java.util.ArrayList;

import a.b.c.kosmo.board.vo.HbeBoardVO;

public interface HbeBoardDAO {

	public ArrayList<HbeBoardVO> hboardSelectAll();
	public ArrayList<HbeBoardVO> hboardSelect(HbeBoardVO hvo);
	public int hboardInsert(HbeBoardVO hvo);
	public int hboardUpdate(HbeBoardVO hvo);
	public int hboardDelete(HbeBoardVO hvo);
}
