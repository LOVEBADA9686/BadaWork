package a.b.c.swing.member.dao;

import java.util.ArrayList;

import a.b.c.swing.member.vo.SwingMemberVO;

public interface SwingMemberDAO {
	
	public ArrayList<SwingMemberVO> smSelectAll();
	public ArrayList<SwingMemberVO> smSelect(SwingMemberVO svo);
	public boolean smInsert(SwingMemberVO svo);
	public boolean smUpdate(SwingMemberVO svo);
	public boolean smDelete(SwingMemberVO svo);	

	// 조건조회 :: 이름
	public ArrayList<SwingMemberVO> smSelectName(SwingMemberVO svo);
	// 조건조회 :: 아이디
	public ArrayList<SwingMemberVO> smSelectId(SwingMemberVO svo);
	
	// 로그인 체크 smLoginCheck
	public int smLoginCheck(SwingMemberVO svo);	
}
