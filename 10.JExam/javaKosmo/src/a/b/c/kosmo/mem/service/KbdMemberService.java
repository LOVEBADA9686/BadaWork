package a.b.c.kosmo.mem.service;

import java.util.ArrayList;

import a.b.c.kosmo.mem.vo.KbdMemberVO;

public interface KbdMemberService {
	
	public ArrayList<KbdMemberVO> kmemSelectAll();
	public ArrayList<KbdMemberVO> kmemSelect(KbdMemberVO kvo);
	public boolean kmemInsert(KbdMemberVO kvo);
	public boolean kmemUpdate(KbdMemberVO kvo);
	public boolean kmemDelete(KbdMemberVO kvo);
	
	// ȸ�� �̸� �˻�
	public ArrayList<KbdMemberVO> kmemSelectName(KbdMemberVO kvo);
	// ȸ�� ���̵� �˻�
	public ArrayList<KbdMemberVO> kmemSelectId(KbdMemberVO kvo);
	// ȸ�� ���̵� �ߺ�üũ
	public boolean kmemIdCheck(KbdMemberVO kvo);
	
	

}
