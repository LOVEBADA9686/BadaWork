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
		this.setTitle("������ �׽�Ʈ");
		
		jtp = new JTabbedPane();
		memInsert = new MemberInsert();
		memSelectAll = new MemberSelectAll();
		memUpdate = new MemberUpdate();
		
		// ���߰�
		jtp.addTab("ȸ�� ���", memInsert);
		jtp.addTab("ȸ�� ��ȸ", memSelectAll);
		jtp.addTab("ȸ�� ����", memUpdate);		
		
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
