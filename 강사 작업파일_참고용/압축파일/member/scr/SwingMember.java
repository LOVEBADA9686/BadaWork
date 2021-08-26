package a.b.c.swing.member.scr;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

import a.b.c.common.SwingMemberChabun;
import a.b.c.swing.member.service.SwingMemberService;
import a.b.c.swing.member.service.SwingMemberServiceImpl;
import a.b.c.swing.member.vo.SwingMemberVO;

import java.awt.GridLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Color;

import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.awt.event.WindowAdapter;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SwingMember extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1223945384484229538L;
	
	// 멤버변수
	private JLabel      la1, la2, la3, la4, la5, la6, la7;
	private JTextField  tf1, tf2, tf3, tf4, tf5, tf6, tf7;
	private JButton     bt1, bt2, bt3, bt4, bt5, bt6;
	private JPanel      pa1, pa2;
	private JButton     btClose;

	// 생성자 
	public SwingMember() {
	
		// JFrame 타이틀 세팅하기
		this.setTitle("SwingMember");
		// JFrame 레이아웃 매니저 보더 레이아웃으로 설정하기 
		this.setLayout(new BorderLayout());
		
		// 라벨, 텍스트필드 붙일 JPanel 인스턴스 
		pa1 = new JPanel();
		// JPanel 바탕색 칠하기 시안으로 
		pa1.setBackground(Color.cyan);	
		// 버튼 붙일 JPanel 인스턴스
		pa2 = new JPanel();
		// JPanel 바탕색 칠하기 블루로		
		pa2.setBackground(Color.blue);

		// 라벨, 텍스트필드 붙일 JPanel 레이아웃 매니저 그리드 레이아웃
		pa1.setLayout(new GridLayout(7,2));
		// 라벨 인스턴스 
		la1 = new JLabel(" 고객번호 ", JLabel.CENTER);	
		la2 = new JLabel(" 고객명 ", JLabel.CENTER);	
		la3 = new JLabel(" 아이디 ", JLabel.CENTER);	
		la4 = new JLabel(" 패스워드 ", JLabel.CENTER);			
		la5 = new JLabel(" 삭제여부 ", JLabel.CENTER);	
		la6 = new JLabel(" 등록일 ", JLabel.CENTER);	
		la7 = new JLabel(" 수정일 ", JLabel.CENTER);	

		// 텍스트필드 인스턴스
		tf1 = new JTextField(10);
		tf2 = new JTextField(10);
		tf3 = new JTextField(10);
		tf4 = new JTextField(10);
		tf5 = new JTextField(10);
		tf6 = new JTextField(10);
		tf7 = new JTextField(10);
		
		// 라벨, 텍스트필드 붙일 JPanel에 라벨, 텍스트 필드 붙이기
		pa1.add(la1);
		pa1.add(tf1);
		pa1.add(la2);
		pa1.add(tf2);
		pa1.add(la3);
		pa1.add(tf3);
		pa1.add(la4);
		pa1.add(tf4);
		pa1.add(la5);
		pa1.add(tf5);
		pa1.add(la6);
		pa1.add(tf6);
		pa1.add(la7);
		pa1.add(tf7);		

		// 버튼 붙일 JPanel 레이아웃 매니저 플로우 레이아웃
		pa2.setLayout(new FlowLayout(FlowLayout.CENTER));
		// 버튼 인스턴스 
		bt1 = new JButton("조회");
		bt2 = new JButton("저장");
		bt3 = new JButton("수정");
		bt4 = new JButton("삭제");
		bt5 = new JButton("전체조회");
		bt6 = new JButton("초기화");
		btClose = new JButton("프로그램종료");
		
		// 버튼 붙일 JPanel에 버튼 필드 붙이기
		pa2.add(bt1);
		pa2.add(bt2);
		pa2.add(bt3);
		pa2.add(bt4);
		pa2.add(bt5);
		pa2.add(bt6);
		pa2.add(btClose);
				
		// JTextFiled disable : 삭제여부, 등록일, 수정일
		tf5.setEditable(false);
		tf6.setEditable(false);
		tf7.setEditable(false);
		
		// 조회, 등록, 수정, 삭제 버튼에 이벤트 전달
		bt1.addActionListener(this);
		bt2.addActionListener(this);
		bt3.addActionListener(this);
		bt4.addActionListener(this);
		bt5.addActionListener(this);
		bt6.addActionListener(this);
		btClose.addActionListener(this);
		
		// JPanel 두장 JFrame 붙이기 
		this.getContentPane().add(pa1, BorderLayout.CENTER);
		this.getContentPane().add(pa2, BorderLayout.SOUTH);

		this.setSize(580, 250);
		this.setLocation(400, 200);
		this.setResizable(false);
		this.setVisible(true);

		// JFrame 클로우즈 
		this.addWindowListener(new WindowAdapter() { 
			public void windowClosing(WindowEvent e) { 
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
//				System.exit(0);
			}
		});
	}
	
	// 조건 조회 
	public void smSelect(String swnum) {
		System.out.println("SwingMember :: smSelect() 시작 >>> : ");
		
		try {
			
			SwingMemberService sms = new SwingMemberServiceImpl();
			SwingMemberVO svo = null;
			svo = new SwingMemberVO();
			svo.setSwnum(swnum);
			
			// 화면 텍스트필드 클리어 
			jtextFileClear();
			
			ArrayList<SwingMemberVO> aList = sms.smSelect(svo);
			
			if (aList !=null && aList.size() > 0) {
				
				for (int i=0; i < aList.size(); i++) {
					
					SwingMemberVO _svo = aList.get(i);
					
					tf1.setText(_svo.getSwnum());
					tf2.setText(_svo.getSwname());
					tf3.setText(_svo.getSwid());
					tf4.setText(_svo.getSwpw());
					tf5.setText(_svo.getDeleteyn());
					tf6.setText(_svo.getInsertdate());
					tf7.setText(_svo.getUpdatedate());	
				}		
			}else {
				
			}
		}catch(Exception ex) {
			System.out.println("조건 중 에러가 >>> : " + ex.getMessage());
		}	
	}
	
	// 등록
	public void smInsert(String swnum, String swname, String swid, String swpw) {
		System.out.println("SwingMember :: smInsert() 시작 >>> : ");
		
		try {
			
			SwingMemberService sms = new SwingMemberServiceImpl();
			SwingMemberVO svo = null;
			svo = new SwingMemberVO();
			svo.setSwnum(swnum);
			svo.setSwname(swname);
			svo.setSwid(swid);
			svo.setSwpw(swpw);
			
			// 화면 텍스트필드 클리어 
			jtextFileClear();
			
			boolean bool = sms.smInsert(svo);
			
			if (bool) {
				System.out.println("회원 정보 입력 성공 >>> : " + bool);
				
				JOptionPane.showMessageDialog(this, "회원정보 입력 성공 >>> :  ");
				
				this.smSelect(swnum);
			}else {
				System.out.println("회원 정보 입력 실패 >>> : " + bool);
				JOptionPane.showMessageDialog(this, "회원정보 입력 실패 >>> :  ");
			}						
		}catch(Exception ex) {
			System.out.println("등록 중 에러가 >>> : " + ex.getMessage());
		}		
	}

	// 수정 
	public void smUpdate(String swnum, String swname) {
		System.out.println("SwingMember :: smUpdate() 시작 >>> : ");
		
		try {
			
			SwingMemberService sms = new SwingMemberServiceImpl();
			SwingMemberVO svo = null;
			svo = new SwingMemberVO();
			svo.setSwnum(swnum);
			svo.setSwname(swname);				
			
			// 화면 텍스트필드 클리어 
			jtextFileClear();
			
			boolean bool = sms.smUpdate(svo);
			
			if (bool) {
				System.out.println("회원 정보 수정 성공 >>> : " + bool);
				
				JOptionPane.showMessageDialog(this, "회원정보 수정 성공 >>> :  ");
				
				this.smSelect(swnum);
			}else {
				System.out.println("회원 정보 수정 실패 >>> : " + bool);
				JOptionPane.showMessageDialog(this, "회원정보 수정 성공 >>> :  ");
			}		
		}catch(Exception ex) {
			System.out.println("수정 중 에러가 >>> : " + ex.getMessage());
		}					
	}

	// 삭제 
	public void smDelete(String swnum) {
		System.out.println("SwingMember :: smDelete() 시작 >>> : ");
		
		try {
			
			SwingMemberService sms = new SwingMemberServiceImpl();
			SwingMemberVO svo = null;
			svo = new SwingMemberVO();
			svo.setSwnum(swnum);				
			
			// 화면 텍스트필드 클리어 
			jtextFileClear();
			
			boolean bool = sms.smDelete(svo);
			
			if (bool) {
				System.out.println("회원 정보 삭제 성공 >>> : " + bool);	
				JOptionPane.showMessageDialog(this, "회원정보 삭제 성공 >>> :  ");
			}else {
				System.out.println("회원 정보 삭제 실패 >>> : " + bool);
				JOptionPane.showMessageDialog(this, "회원정보 실패 성공 >>> :  ");
			}				
			
		}catch(Exception ex) {
			System.out.println("삭제 중 에러가 >>> : " + ex.getMessage());
		}			
	}
	// 전체 조회 
	public void smSelectAll() {
		System.out.println("SwingMember :: smSelectAll() 시작 >>> : ");
		
		try {
			new SwingMemberAll();
		}catch(Exception ex) {
			System.out.println("조건 중 에러가 >>> : " + ex.getMessage());
		}	
	}

//	2. 이벤트 리스너 클래스를 등록한다.	
//	현재 객체 : 상속하는 경우	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String btnCmd = String.valueOf(e.getActionCommand());
		
		if ("조회".equals(btnCmd)) {
			System.out.println("btnCmd >>> : " + btnCmd + " 시작 >>> : ");
			
			String swnum = "";
			
			try {	
				
				swnum = tf1.getText();				
				System.out.println("swnum >>> : " + swnum);
				
				// 조건 조회 함수 호출 
				this.smSelect(swnum);	
				
			}catch(Exception ex) {
				System.out.println("에러가 >>> : " + ex.getMessage());
			}
		}
		if ("저장".equals(btnCmd)) {
			System.out.println("btnCmd >>> : " + btnCmd + " 시작 >>> : ");	
							
			String swnum = "";
			String swname = "";
			String swid = "";
			String swpw = "";
			
			try {

				swnum = SwingMemberChabun.ymdNum();
				swname = tf2.getText();
				swid = tf3.getText();
				swpw = tf4.getText();
				System.out.println("swnum >>> : " + swnum);
				System.out.println("swname >>> : " + swname);
				System.out.println("swid >>> : " + swid);
				System.out.println("swpw >>> : " + swpw);
						
				// 등록 함수 호출 
				this.smInsert(swnum, swname, swid, swpw);
				
			}catch(Exception ex) {
				System.out.println("에러가 >>> : " + ex.getMessage());
			}			
		}
		if ("수정".equals(btnCmd)) {
			System.out.println("btnCmd >>> : " + btnCmd + " 시작 >>> : ");
			
			// 이름만 수정하기 				
			String swnum = "";
			String swname = "";		
			
			try {
				
				swnum = tf1.getText();
				swname = tf2.getText();
				
				System.out.println("swnum >>> : " + swnum);
				System.out.println("swname >>> : " + swname);
					
				// 수정 함수 호출 
				this.smUpdate(swnum, swname);	
				
			}catch(Exception ex) {
				System.out.println("에러가 >>> : " + ex.getMessage());
			}
			
		}
		if ("삭제".equals(btnCmd)) {
			System.out.println("btnCmd >>> : " + btnCmd + " 시작 >>> : ");
			
			String swnum = "";
			
			try {
				
				swnum = tf1.getText();				
				System.out.println("swnum >>> : " + swnum);
					
				// 삭제 함수 호출
				this.smDelete(swnum);	
				
			}catch(Exception ex) {
				System.out.println("에러가 >>> : " + ex.getMessage());
			}
		}	
		if ("전체조회".equals(btnCmd)) {
			System.out.println("btnCmd >>> : " + btnCmd + " 시작 >>> : ");
			
			try {
				// 전체조회 함수 호출
				this.smSelectAll();	
				
			}catch(Exception ex) {
				System.out.println("에러가 >>> : " + ex.getMessage());
			}
		}	
		if ("초기화".equals(btnCmd)) {
			System.out.println("btnCmd >>> : " + btnCmd + " 시작 >>> : ");
			
			try {
				// 초기화 함수 호출
				this.jtextFileClear();	
				
			}catch(Exception ex) {
				System.out.println("에러가 >>> : " + ex.getMessage());
			}
		}
		if ("프로그램종료".equals(btnCmd)) {
			System.out.println("btnCmd >>> : " + btnCmd + " 시작 >>> : ");
			
			try {
				System.exit(0);				
			}catch(Exception ex) {
				System.out.println("에러가 >>> : " + ex.getMessage());
			}
		}
	}
	
	public void jtextFileClear() {
		System.out.println("SwingMember_1 :: jtextFileClear() 시작 >>> : ");
		
		tf1.setText("");
		tf2.setText("");
		tf3.setText("");
		tf4.setText("");
		tf5.setText("");
		tf6.setText("");
		tf7.setText("");		
	}
	
	public static void main(String args[]){
		// TODO Auto-generated method stub
		System.out.println("SwingMember_1 :: main() 시작 >>> : ");
		
		new SwingMember();		
	}
}