package a.b.c.kosmo.mem.dao;

import java.util.ArrayList;

import a.b.c.kosmo.mem.vo.KbdMemberVO;

public interface KbdMemberDAO {

	
	public ArrayList<KbdMemberVO> kmemSelectAll();
	public ArrayList<KbdMemberVO> kmemSelect(KbdMemberVO kvo);
	public boolean kmemInsert(KbdMemberVO kvo);
	public boolean kmemUpdate(KbdMemberVO kvo);
	public boolean kmemDelete(KbdMemberVO kvo);
	
	// 회원 이름 검색
	public ArrayList<KbdMemberVO> kmemSelectName(KbdMemberVO kvo);
	// 회원 아이디 검색
	public ArrayList<KbdMemberVO> kmemSelectId(KbdMemberVO kvo);
	// 회원 아이디 중복체크
	public boolean kmemIdCheck(KbdMemberVO kvo);
}
