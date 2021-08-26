package a.b.c.kosmo.mem.dao;

import java.util.ArrayList;

import a.b.c.kosmo.mem.vo.HbeMemberVO;

public interface HbeMemberDAO {
	
	public ArrayList<HbeMemberVO> hmemSelectAll();
	public ArrayList<HbeMemberVO> hmemSelect(HbeMemberVO hvo);
	public boolean hmemInsert(HbeMemberVO hvo);
	public boolean hmemUpdate(HbeMemberVO hvo);
	public boolean hmemDelete(HbeMemberVO hvo);
	
	// 회원 이름 검색
	public ArrayList<HbeMemberVO> hmemSelectName(HbeMemberVO hvo);
	// 회원 아이디 검색
	public ArrayList<HbeMemberVO> hmemSelectId(HbeMemberVO hvo);
	// 회원 아이디 중복체크
	public boolean hmemIdCheck(HbeMemberVO hvo);
	
}
