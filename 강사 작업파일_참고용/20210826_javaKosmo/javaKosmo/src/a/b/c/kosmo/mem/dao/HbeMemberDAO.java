package a.b.c.kosmo.mem.dao;

import java.util.ArrayList;

import a.b.c.kosmo.mem.vo.HbeMemberVO;

public interface HbeMemberDAO {
	
	public ArrayList<HbeMemberVO> hmemSelectAll();
	public ArrayList<HbeMemberVO> hmemSelect(HbeMemberVO hvo);
	public boolean hmemInsert(HbeMemberVO hvo);
	public boolean hmemUpdate(HbeMemberVO hvo);
	public boolean hmemDelete(HbeMemberVO hvo);
	
	// ȸ�� �̸� �˻�
	public ArrayList<HbeMemberVO> hmemSelectName(HbeMemberVO hvo);
	// ȸ�� ���̵� �˻�
	public ArrayList<HbeMemberVO> hmemSelectId(HbeMemberVO hvo);
	// ȸ�� ���̵� �ߺ�üũ
	public boolean hmemIdCheck(HbeMemberVO hvo);
	
}
