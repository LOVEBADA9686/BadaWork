package a.b.c.mem.service;

import java.util.ArrayList;

import a.b.c.mem.vo.KbdMemberVO;

public interface KbdMemberService {

	public ArrayList<KbdMemberVO> kmemSelectAll();
	public ArrayList<KbdMemberVO> kmemSelect(KbdMemberVO kvo);
	public boolean kmemInsert(KbdMemberVO kvo);
	public boolean kmemUpdate(KbdMemberVO kvo);
	public boolean kmemDelete(KbdMemberVO kvo);
}
