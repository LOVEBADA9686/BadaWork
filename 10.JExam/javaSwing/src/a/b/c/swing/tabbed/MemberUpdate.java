package a.b.c.swing.tabbed;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import a.b.c.common.ChabunUtils;
import a.b.c.swing.sample.MemberDAO;
import a.b.c.swing.sample.MemberVO;

public class MemberUpdate extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	JPanel     jp[];
	JLabel     jl[];
	JTextField jt[];
	JButton    jb[];
	
	String[] jlLabel = {"ȸ����ȣ", "ȸ���̸�", "���̵�", "��й�ȣ", "��������", "�����", "������"};
	String[] jbtCaption = {"����", "����"};
	
	public MemberUpdate() {
		
		this.setLayout(new BorderLayout(10, 10));
		
		jp = new JPanel[3];
		for (int i=0; i < jp.length; i++) {
			jp[i] = new JPanel();
		}
		
		jp[1].setLayout(null);
		jp[1].setLayout(new GridLayout(3, 2));
		
		jl = new JLabel[7];
		jt = new JTextField[7];
		for (int i=0; i < jl.length; i++) {
			jl[i] = new JLabel(jlLabel[i]);
			jl[i].setHorizontalAlignment(JLabel.CENTER);
			jt[i] = new JTextField(20);
			jp[1].add(jl[i]);
			jp[1].add(jt[i]);
		}
		
		JLabel jla = new JLabel("ȸ�� ����/����");
		jla.setOpaque(true);
		jla.setHorizontalAlignment(JLabel.CENTER);
		jp[0].add(jla);
		
		
		jp[1].setLayout(null);
		jp[1].setLayout(new GridLayout(7, 2, 5, 5));
		
		jb = new JButton[2];
		for (int i=0; i < jb.length; i++) {
			jb[i] = new JButton(jbtCaption[i]);
			jb[i].addActionListener(this);
			jp[2].add(jb[i]);
		}
				
		jt[0].setEditable(true);
		jt[2].setEditable(false);
		jt[3].setEditable(false);		
		jt[4].setEditable(false);
		jt[5].setEditable(false);
		jt[6].setEditable(false);
		
		this.add(jp[0], BorderLayout.NORTH);
		this.add(jp[1], BorderLayout.CENTER);
		this.add(jp[2], BorderLayout.SOUTH);
			
		this.setLocation(100, 100);
		this.setSize(300, 400);	
		this.setVisible(true);
	}
	
	public void memberSelect(String knum) {
		System.out.println("MemberUpdate memberSelect() �Լ� ���� >>> : " + knum);
		
		MemberDAO mdao = new MemberDAO();
		MemberVO mvo = null;
		mvo = new MemberVO();
		mvo.setKnum(knum);
		
		ArrayList<MemberVO> aList = mdao.memberSelect(mvo);
		System.out.println("" + aList);
		if (aList !=null && aList.size() > 0) {			
			MemberVO _mvo = aList.get(0);			
			jt[0].setText(_mvo.getKnum());
			jt[1].setText(_mvo.getKname());
			jt[2].setText(_mvo.getKid());
			jt[3].setText(_mvo.getKpw());
			jt[4].setText(_mvo.getDeleteyn());
			jt[5].setText(_mvo.getInsertdate());
			jt[6].setText(_mvo.getUpdatedate());			 
		}
	}
	
	public void memberUpdate(String knum, String kid) {
		System.out.println("MemberUpdate memberUpdate() �Լ� ���� >>> : ");
		
		MemberDAO mdao = new MemberDAO();
		MemberVO mvo = null;
		mvo = new MemberVO();
		mvo.setKnum(knum);		
		mvo.setKid(kid);
		
		boolean bool  = mdao.memberUpdate(mvo);
		
		if (bool) {
			System.out.println("ȸ������ ���� ���� >>> : " + bool);
		}else {
			System.out.println("ȸ������ ���� ���� >>> : " + bool);
		}
	}	
	
	public void memberDelete(String knum) {
		System.out.println("MemberUpdate memberDelete() �Լ� ���� >>> : ");
		
		MemberDAO mdao = new MemberDAO();	
		MemberVO mvo = null;
		mvo = new MemberVO();
		mvo.setKnum(knum);		
		
		boolean bool  = mdao.memberDelete(mvo);
		
		if (bool) {
			System.out.println("ȸ������ ���� ���� >>> : " + bool);
		}else {
			System.out.println("ȸ������ ���� ���� >>> : " + bool);
		}
	}		
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		String jbCaption = e.getActionCommand();
		
		if ("����".equals(jbCaption)) {
			
			String knum = jt[0].getText();
			String kid = jt[1].getText();
			this.memberUpdate(knum, kid);
		}
		
		if ("����".equals(jbCaption)) {
			
			String knum = jt[0].getText();			
			this.memberDelete(knum);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MemberUpdate();
	}
}
