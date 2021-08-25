package a.b.c.swing.tabbed;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import a.b.c.common.ChabunUtils;
import a.b.c.swing.sample.MemberDAO;
import a.b.c.swing.sample.MemberVO;

public class MemberInsert extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	JPanel     jp[];
	JLabel     jl[];
	JTextField jt[];
	JButton    jb[];
	
	String[] jlLabel = {"회원번호", "회원이름", "아이디", "비밀번호"};
	String[] jbtCaption = {"등록", "다시"};
	
	public MemberInsert() {
		
		this.setLayout(null);
		this.setLayout(new BorderLayout(10, 10));
		
		jp = new JPanel[3];
		for (int i=0; i < jp.length; i++) {
			jp[i] = new JPanel();
		}
		
		jp[1].setLayout(null);
		jp[1].setLayout(new GridLayout(3, 2));
		
		jl = new JLabel[4];
		jt = new JTextField[4];
		for (int i=0; i < jl.length; i++) {
			jl[i] = new JLabel(jlLabel[i]);
			jl[i].setHorizontalAlignment(JLabel.CENTER);
			jt[i] = new JTextField(20);
			jp[1].add(jl[i]);
			jp[1].add(jt[i]);
		}
		
		JLabel jla = new JLabel("회원 등록");
		jla.setOpaque(true);
		jla.setHorizontalAlignment(JLabel.CENTER);
		jp[0].add(jla);
		
		
		jp[1].setLayout(null);
		jp[1].setLayout(new GridLayout(4, 2, 5, 5));
		
		jb = new JButton[2];
		for (int i=0; i < jb.length; i++) {
			jb[i] = new JButton(jbtCaption[i]);
			jb[i].addActionListener(this);
			jp[2].add(jb[i]);
		}
		
		jt[0].setEditable(false);
		
		
		this.add(jp[0], BorderLayout.NORTH);
		this.add(jp[1], BorderLayout.CENTER);
		this.add(jp[2], BorderLayout.SOUTH);
		
		this.setSize(300, 250);
		this.setVisible(true);
	}
	
	public void selectNum(String mnum) {
		jt[0].setText(mnum);
	}
	
	
	public void memberInsert(String kname, String kid, String kpw) {
		System.out.println("MemberInsert memberInsert() 함수 진입 >>> : ");
		
		MemberDAO mdao = new MemberDAO();
		MemberVO mvo = null;
		mvo = new MemberVO();
		mvo.setKnum(ChabunUtils.getMemberChabun("D"));
		mvo.setKname(kname);
		mvo.setKid(kid);
		mvo.setKpw(kpw);
		
		boolean bool = mdao.memberInsert(mvo);
		
		if (bool) {
			System.out.println("회원등록 성공 >>> : " + bool);
			new MemberSelectAll();
		}else {
			System.out.println("회원등록 실패 >>> : " + bool);
		}
	}
	
	public void textClear() {
		for (int i=0; i < jt.length; i++) {
			jt[i].setText("");
		}
	}

	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String jbCaption = e.getActionCommand();
		
		if ("등록".equals(jbCaption)) {
			
			String kname = jt[1].getText();
			String kid = jt[2].getText();
			String kpw = jt[3].getText();
			
			this.memberInsert(kname, kid, kpw);
		}
		if ("다시".equals(jbCaption)) {
			this.textClear();
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MemberInsert();
	}
}
