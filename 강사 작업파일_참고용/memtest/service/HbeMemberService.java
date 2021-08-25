package a.b.c.memtest.service;

import java.util.ArrayList;

import a.b.c.memtest.vo.HbeMemberVO;

public interface HbeMemberService {

	public ArrayList<HbeMemberVO> hmemSelectAll();
	public ArrayList<HbeMemberVO> hmemSelect(HbeMemberVO hvo);
	public boolean hmemInsert(HbeMemberVO hvo);
	public boolean hmemUpdate(HbeMemberVO hvo);
}
