package a.b.c.memtest.dao;

import java.util.ArrayList;

import a.b.c.memtest.vo.HbeMemberVO;

public interface HbeMemberDAO {
	public ArrayList<HbeMemberVO> hmemSelectAll();
	public ArrayList<HbeMemberVO> hmemSelect(HbeMemberVO hvo);
	public boolean hmemInsert(HbeMemberVO hvo);
	public boolean hmemUpdate(HbeMemberVO hvo);
	public boolean hmemDelete(HbeMemberVO hvo);
}
