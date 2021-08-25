package a.b.c.mem.service;

import java.util.ArrayList;

import a.b.c.mem.vo.HbeMemberVO;

public interface HbeMemberService {
	
	public ArrayList<HbeMemberVO> hmemSelectAll();
	public ArrayList<HbeMemberVO> hmemSelect(HbeMemberVO hvo);
	public boolean hmemInsert(HbeMemberVO hvo);
	public boolean hmemUpdate(HbeMemberVO hvo);
	public boolean hmemDelete(HbeMemberVO hvo);
}
