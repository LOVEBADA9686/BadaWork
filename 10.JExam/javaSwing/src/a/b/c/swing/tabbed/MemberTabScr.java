package a.b.c.swing.tabbed;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class MemberTabScr extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	private JTabbedPane jtp;
	private MemberInsert 	memInsert;
	private MemberSelectAll memSelectAll;
	private MemberUpdate    memUpdate;
	
	public MemberTabScr() {
		this.setTitle("탭페인 테스트");
		
		jtp = new JTabbedPane();
		memInsert = new MemberInsert();
		memSelectAll = new MemberSelectAll();
		memUpdate = new MemberUpdate();
		
		// 탭추가
		jtp.addTab("회원 등록", memInsert);
		jtp.addTab("회원 조회", memSelectAll);
		jtp.addTab("회원 수정", memUpdate);		
		
		this.getContentPane().add(jtp);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 800, 400);
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MemberTabScr();
	}

}
