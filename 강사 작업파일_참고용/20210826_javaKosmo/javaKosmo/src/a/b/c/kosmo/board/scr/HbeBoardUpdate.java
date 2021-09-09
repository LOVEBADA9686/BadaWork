package a.b.c.kosmo.board.scr;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;

import a.b.c.common.CodeUtil;
import a.b.c.kosmo.board.service.HbeBoardService;
import a.b.c.kosmo.board.service.HbeBoardServiceImpl;
import a.b.c.kosmo.board.vo.HbeBoardVO;

public class HbeBoardUpdate  extends JFrame implements ActionListener {

	private static final long serialVersionUID = 1L;
	
	// 멤버변수
	private JLabel      	jl[];
	private JTextField  	jt[];
	private JTextArea   	jta;
	private JPasswordField 	jpf;
	private JButton     	jb[];	
	private JPanel      	jp[];
	
	public HbeBoardUpdate() {
		// JFrame 타이틀 세팅하기
		this.setTitle(":::게시판:::");
		
		// JFrame 레이아웃 매니저 보더 레이아웃으로 설정하기 
		this.getContentPane().setLayout(null);				
		jp = new JPanel[2];		
		jp[0] = new JPanel();
		jp[0].setBorder(new EtchedBorder());
		jp[0].setBounds(0, 0, 465, 480);
		jp[0].setBackground(Color.cyan);
		jp[0].setLayout(null);
		
		// 게시판 라벨 
		JLabel jlM = new JLabel(); 
		jlM.setText("게시판");		
		jlM.setHorizontalAlignment(SwingConstants.CENTER);
		jlM.setFont(new Font("맑은고딕", Font.BOLD, 20));
		jlM.setBounds(20,20,362,40);
		jp[0].add(jlM);		
		
		// 라벨
		jl = new JLabel[5];		
		int ly = 80;		
		for (int i=0; i < jl.length; i++) {
			jl[i] = new JLabel();
			jl[i].setOpaque(true);
			jl[i].setText(CodeUtil.board_label[i]);
			jl[i].setHorizontalAlignment(SwingConstants.CENTER);
			jl[i].setFont(new Font("맑은고딕", Font.BOLD, 15));			
			jl[i].setBounds(20, ly, 100, 30);
			ly += 40;
			jp[0].add(jl[i]);
		}
			
		// 텍스트필드	
		jt = new JTextField[3];		
		int ty = 80;
		for (int i=0; i < jt.length; i++) {
			jt[i] = new JTextField(200);	
			jt[i].setBounds(130, ty, 300, 30);
			jp[0].add(jt[i]);
			ty += 40;
		}
		
		// 비밀번호
		jpf = new JPasswordField();
		jpf.setBounds(130, 200, 100, 30);
		jpf.setEchoChar('*');
		jp[0].add(jpf);
		
		// 텍스트에어리어 붙이기 위해서 
		jp[1] = new JPanel();
		jp[1].setLayout(new BorderLayout(5, 5));
		jp[1].setBounds(130, 240, 300, 140);
		jp[1].setBackground(Color.red);
		jp[0].add(jp[1]);
		
		// 텍스트에어리어 
		jta = new JTextArea(10, 10);
		jp[1].add(new JScrollPane(jta));
	
		// 버튼
		jb = new JButton[2];
		for (int i=0; i < jb.length ; i++ ){
			jb[i] = new JButton();
			jb[i].addActionListener(this);
			jp[0].add(jb[i]);
		}
		
		jb[0].setText("수정");
		jb[0].setBounds(20, 420, 250, 30);		
		jb[0].setFont(new Font("맑은고딕", Font.BOLD, 15));
		
		jb[1].setText("삭제");
		jb[1].setBounds(280, 420, 150, 30);		
		jb[1].setFont(new Font("맑은고딕", Font.BOLD, 15));
		
		
		// JTextFiled disable : 삭제여부, 등록일, 수정일
		jt[0].setEditable(false);
		jt[2].setEditable(false);
				
		// JPanel JFrame 붙이기 
		this.getContentPane().add(jp[0]);		
		
		this.setSize(465, 520);
		this.setLocation(200, 100);
		this.setResizable(false);
		this.setVisible(true);

		// JFrame 닫기 
		this.addWindowListener(new WindowAdapter() { 
			public void windowClosing(WindowEvent e) { 
				e.getWindow().setVisible(false);
				e.getWindow().dispose();						
			}
		});
	}

	// 게시글 조회하기 
	public void hboardSelect(String bnum) {
		System.out.println("HbeBoardUpdate hboardSelect() 함수 진입 >>> : " + bnum);
		
		HbeBoardService hs = new HbeBoardServiceImpl();
		HbeBoardVO hvo = null;
		hvo = new HbeBoardVO();
		hvo.setBnum(bnum);
		
		ArrayList<HbeBoardVO> aList = hs.hboardSelect(hvo);
		System.out.println("" + aList);
		if (aList !=null && aList.size() > 0) {			
	
			HbeBoardVO _hvo = aList.get(0);	
			jt[0].setText(_hvo.getBnum());
			jt[1].setText(_hvo.getBsubject());						
			jt[2].setText(_hvo.getBwriter());			
			jpf.setText(_hvo.getBpw());				
			jta.setText(_hvo.getBcontents());					
		}
	}
	
	// 게시글 수정하기 
	public void hboardUpdate(String bnum, String bsubject, String bcontents) {
		System.out.println("HbeBoardUpdate hboardUpdate() 함수 진입 >>> : " + bnum);
		
		HbeBoardService hs = new HbeBoardServiceImpl();
		HbeBoardVO hvo = null;
		hvo = new HbeBoardVO();
		hvo.setBnum(bnum);
		hvo.setBsubject(bsubject);
		hvo.setBcontents(bcontents);
			
		int nCnt = hs.hboardUpdate(hvo);
		
		if (nCnt > 0) {
			System.out.println("게시글 수정 성공  >>> : " + nCnt);
			JOptionPane.showMessageDialog(this, "게시글 수정 성공 >>> :  ");
			
			this.setVisible(false);
			this.dispose();
			
			HbeBoardrAll hboardAll = HbeBoardrAll.getInstance();
			hboardAll.hboardSelectAll();
		}else {
			System.out.println("게시글 수정 실패  >>> : " + nCnt);
		}
	}

	// 게시글 삭제하기 
	public void hboardDelete(String bnum) {
		System.out.println("HbeBoardUpdate hboardDelete() 함수 진입 >>> : " + bnum);
		
		HbeBoardService hs = new HbeBoardServiceImpl();
		HbeBoardVO hvo = null;
		hvo = new HbeBoardVO();
		hvo.setBnum(bnum);;	
		
		int nCnt = hs.hboardDelete(hvo);
		
		if (nCnt > 0) {
			System.out.println("게시글 삭제 성공  >>> : " + nCnt);
			JOptionPane.showMessageDialog(this, "게시글 삭제 성공 >>> :  ");
			
			this.setVisible(false);
			this.dispose();
			
			HbeBoardrAll hboardAll = HbeBoardrAll.getInstance();
			hboardAll.hboardSelectAll();		
		}else {
			System.out.println("게시글 삭제 실패  >>> : " + nCnt);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub		
		System.out.println("HbeBoard.actionPerformed() 함수 시작  >>> : ");
		
		Object obj = e.getSource();
		Object jbCaption = e.getActionCommand();
		
		if (jb[0] == obj) {
			System.out.println("수정하기 버튼 클릭 >>> : " + jbCaption);
			
			String bnum = "";
			String bsubject = "";							
			String bcontents = "";
		
			bnum = jt[0].getText();
			bsubject = jt[1].getText();								
			bcontents = jta.getText();
		
			System.out.println("bnum >>> : " + bnum);
			System.out.println("bsubject >>> : " + bsubject);						
			System.out.println("bcontents >>> : " + bcontents);
						
			this.hboardUpdate(bnum, bsubject, bcontents);
		}
		
		if (jb[1] == obj) {	
			System.out.println("삭제하기 버튼 클릭 >>> : ");	
			String bnum = "";
			bnum = jt[0].getText();
			System.out.println("bnum >>> : " + bnum);
			this.hboardDelete(bnum);
		}				
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HbeBoardUpdate();
	}
}
