package a.b.c.kosmo.mem.scr;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;

import a.b.c.common.CodeUtil;
import a.b.c.common.DateUtil;
import a.b.c.common.KbdMemberChabun;
import a.b.c.kosmo.mem.service.KbdMemberService;
import a.b.c.kosmo.mem.service.KbdMemberServiceImpl;
import a.b.c.kosmo.mem.vo.KbdMemberVO;

public class KbdMember extends JFrame implements ActionListener {

	private static final long serialVersionUID = 9072198881429763467L;
	
	// 멤버변수
	private JLabel			jl[];
	private JTextField		jt[];
	private JTextField		jtFiled[];
	private JButton			jb[];
	private JPanel			jp[];
	private JComboBox<String>		jc[];
	private JComboBox<String>		jcBirth[];
	private JRadioButton				jr[];
	
	// 생성자
	@SuppressWarnings("unchecked")
	public KbdMember() {
		// JFrame 타이틀 세팅하기
		this.setTitle(":::회원가입:::");
		
		// JFrame 레이아웃 매니저 보더 레이아웃으로 설정하기
		this.getContentPane().setLayout(null);
		jp = new JPanel[2];
		jp[0] = new JPanel();
		jp[0].setBorder(new EtchedBorder());
		jp[0].setBounds(0, 0, 420, 880);
		jp[0].setBackground(Color.cyan);
		jp[0].setLayout(null);
		
		// 콤보박스, 라이오버튼, 텍스트필드, 라벨 초기화
		// 콤보박스
		jc = new JComboBox[5];
		// 콤보박스 : 생년월일에서 월, 일
		jcBirth = new JComboBox[5];
		// 라이오버튼 : 여자, 남자
		jr = new JRadioButton[2];
		
		// 텍스트필드
		jtFiled = new JTextField[6];
		jt = new JTextField[17];
		int ty = 80;
		for(int i=0; i < jt.length; i++) {
			
			if (4 == i || 5 == i || 6 == i || 7 == i || 8 == i || 10 == i || 13 == i) {
				System.out.println(">>>>>>>>>" + i);
				// 생년월일
				if(4 == i) {
					String[] years = DateUtil.comboYear();
					jc[0] = new JComboBox<String>(years);
					jp[0].add(jc[0]);
					jc[0].setBackground(Color.white);
					jc[0].setSelectedIndex(0);
					jc[0].setBounds(130, 240, 80, 30);
					
					String[] months = DateUtil.comboMonth();
					jcBirth[0] = new JComboBox<String>(months);
					jp[0].add(jcBirth[0]);
					jcBirth[0].setBackground(Color.white);
					jcBirth[0].setSelectedIndex(0);
					jcBirth[0].setBounds(220, 240, 65, 30);
					
					String[] days = DateUtil.comboDay();
					jcBirth[1] = new JComboBox<String>(days);
					jp[0].add(jcBirth[1]);
					jcBirth[1].setBackground(Color.white);
					jcBirth[1].setSelectedIndex(0);
					jcBirth[1].setBounds(290, 240, 65, 30);
				}
				// 성별
				if(5 == i) {
					ButtonGroup bg = new ButtonGroup();
					
					JPanel jpGender = new JPanel();
					jpGender.setLayout(new FlowLayout(FlowLayout.LEADING));
					jpGender.setBackground(Color.white);
					jpGender.setBounds(130, 280, 140, 31);
					for(int j=0; j < jr.length; j++) {
						jr[j] = new JRadioButton(CodeUtil.gender_value[j]);
						jr[j].addActionListener(this);
						jr[j].setBackground(Color.white);
						bg.add(jr[j]);
						jpGender.add(jr[j]);
						jp[0].add(jpGender);
					}
					jr[0].setSelected(true);
					jr[1].setSelected(false);
				}
				// 전화번호
				if(6 == i) {
					jc[1] = new JComboBox<String>(CodeUtil.tel_value);
					jp[0].add(jc[1]);
					jc[1].setBackground(Color.white);
					jc[1].setSelectedIndex(0);
					jc[1].setBounds(130, 320, 60, 30);
					
					jtFiled[0] = new JTextField(6);
					jtFiled[0].setBackground(Color.white);
					jtFiled[0].setBounds(200, 320, 60, 30);
					jtFiled[1] = new JTextField(6);
					jtFiled[1].setBackground(Color.white);
					jtFiled[1].setBounds(270, 320, 60, 30);
					
					jp[0].add(jtFiled[0]);
					jp[0].add(jtFiled[1]);					
				}
				// 휴대폰번호
				if (7 == i) {
					jc[2] = new JComboBox<String>(CodeUtil.hp_value);
					jp[0].add(jc[2]);
					jc[0].setBackground(Color.white);
					jc[2].setSelectedIndex(0);
					jc[2].setBounds(130, 360, 60, 30);
					
					jtFiled[2] = new JTextField(6);
					jtFiled[2].setBackground(Color.white);
					jtFiled[2].setBounds(200, 360, 60, 30);
					jtFiled[3] = new JTextField(6);
					jtFiled[3].setBackground(Color.white);
					jtFiled[3].setBounds(270, 360, 60, 30);
					
					jp[0].add(jtFiled[2]);
					jp[0].add(jtFiled[3]);
				}
				// 이메일
				if (8 == i) {
					
					jtFiled[4] = new JTextField(20);
					jtFiled[4].setBackground(Color.white);
					jtFiled[4].setBounds(130, 400, 100, 30);
					
					JLabel jla = new JLabel("@");
					jla.setOpaque(true);
					jla.setBackground(Color.cyan);
					jla.setBounds(235, 400, 20, 30);
					
					jtFiled[5] = new JTextField(6);
					jtFiled[5].setBackground(Color.white);
					jtFiled[5].setBounds(260, 400, 100, 30);
					
					jp[0].add(jtFiled[4]);
					jp[0].add(jla);
					jp[0].add(jtFiled[5]);
				}
				// 취미
				if(10 == i) {
					jc[3] = new JComboBox<String>(CodeUtil.hobby_lavel);
					jp[0].add(jc[3]);
					jc[3].setBackground(Color.white);
					jc[3].setSelectedIndex(0);
					jc[3].setBounds(130, 480, 80, 30);
				}
				// 직업
				if (13 == i) {
					jc[4] = new JComboBox<String>(CodeUtil.job_lavel);
					jp[0].add(jc[4]);
					jc[4].setBackground(Color.white);
					jc[4].setSelectedIndex(0);
					jc[4].setBounds(130, 600, 80, 30);
				}				
			}else {
				jt[i] = new JTextField(20);
				jt[i].setBounds(130, ty, 140, 30);
				jp[0].add(jt[i]);
			}
			ty +=40;
		}
		
		// 라벨
		jl = new JLabel[17];
		int ly = 80;
		for(int i=0; i < jl.length; i++) {
			jl[i] = new JLabel();
			jl[i].setOpaque(true);
			jl[i].setText(CodeUtil.member_value[i]);
			jl[i].setHorizontalAlignment(SwingConstants.CENTER);
			jl[i].setFont(new Font("맑은고딕", Font.BOLD, 15));
			jl[i].setBounds(20, ly, 100, 30);
			ly += 40;
			jp[0].add(jl[i]);
		}
		
		// 회원가입 라벨
		JLabel jlM = new JLabel();
		jlM.setText("회원가입");
		jlM.setHorizontalAlignment(SwingConstants.CENTER);
		jlM.setFont(new Font("맑은고딕", Font.BOLD, 20));
		jlM.setBounds(20,20,362,40);
		jp[0].add(jlM);
		
		// 버튼
		jb = new JButton[3];
		for (int i=0; i < jb.length; i++) {
			jb[i] = new JButton();
			jb[i].addActionListener(this);
			jp[0].add(jb[i]);
		}
		
		jb[0].setText("중복확인");
		jb[0].setBounds(280, 160, 110, 30);
		jb[0].setFont(new Font("맑은고딕", Font.BOLD, 15));
		
		jb[1].setText("가입하기");
		jb[1].setBounds(20, 780, 250, 30);
		jb[1].setFont(new Font("맑은고딕", Font.BOLD, 15));
		
		jb[2].setText("다시");
		jb[2].setBounds(280, 780, 100, 30);
		jb[2].setFont(new Font("맑은고딕", Font.BOLD, 15));
		
		// JTextFiled disable : 삭제여부, 등록일, 수정일
		jt[0].setEditable(false);
		jt[14].setEditable(false);
		jt[15].setEditable(false);
		jt[16].setEditable(false);
		
		// JPanel JFrame 붙이기
		this.getContentPane().add(jp[0]);
		
		this.setSize(420, 880);
		this.setLocation(200, 100);
		this.setResizable(false);
		this.setVisible(true);
		
		// JFrame 닫기
		this.addWindowListener(new WindowAdapter() {
			public void windClosing(WindowEvent e) {
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
			}
		});
	}
	
	// 회원아이디 중복체크하기
	public void kmemIdCheck(String kid) {
		System.out.println("KbdMember.kmemIdCheck() 함수 시작 >>> : ");
		
		try {
			KbdMemberService ks = new KbdMemberServiceImpl();
			KbdMemberVO kvo = null;
			kvo = new KbdMemberVO();
			kvo.setKid(kid);
			
			boolean bool = ks.kmemIdCheck(kvo);
			
			if(!bool) {
				System.out.println("사용가능한 아이디 입니다. >>> : " + bool);
				JOptionPane.showMessageDialog(this, "사용가능한 아이디 입니다. >>> : ");
				jt[2].setText(kvo.getKid());
				jt[2].setEditable(false);				
			}else {
				System.out.println("같은 아이디가 있습니다. >>> : " + bool);
				JOptionPane.showMessageDialog(this, "같은 아이디가 있습니다. >>> : ");
				jt[2].setText("");
			}
		}catch(Exception e) {
			System.out.println("에러가 >>> : " + e.getMessage());
		}
	}
	
	//회원 등록하기
	public void kmemInsert(String kname, String kid, String kpw,
							String kbirth, String kgender, String ktel,
							String khp, String kemail, String kaddr,
							String khobby, String kphoto, String kskill,
							String kjob) {
		System.out.println("KbdMember.kmemInsert() 함수 시작 >>> : ");
		try{
		
			KbdMemberService ks = new KbdMemberServiceImpl();
			KbdMemberVO kvo = null;
			kvo = new KbdMemberVO();
			
			String knum = KbdMemberChabun.ymdNum();
			System.out.println("KbaMember.kmemInsert :: KbaMemberChabun.ymNum() >>> : " + knum);
			kvo.setKnum(knum);
			kvo.setKname(kname);
			kvo.setKid(kid);
			kvo.setKpw(kpw);
			kvo.setKbirth(kbirth);
			kvo.setKgender(kgender);
			kvo.setKtel(ktel);
			kvo.setKhp(khp);
			kvo.setKemail(kemail);
			kvo.setKaddr(kaddr);
			kvo.setKhobby(khobby);
			kvo.setKphoto(kphoto);
			kvo.setKskill(kskill);
			kvo.setKjob(kjob);
			KbdMemberVO.printlnKbdMemberVO(kvo);
			
			boolean bool = ks.kmemInsert(kvo);
			
			if(bool) {
				System.out.println("회원 정보 입력 성공 >>> : " + bool);
				JOptionPane.showMessageDialog(this, "회원정보 등록 성공 >>> : ");
				new KbdMemberAll_old();
			}else {
				System.out.println("회원 정보 입력 실패 >>> : " + bool);
			}
		}catch(Exception e) {
			System.out.println("에러가 >>> : " + e.getMessage());
		}
	}
	
	public void valueClear() {
		System.out.println("KbdMember.valueClear() 함수 시작 >>> : ");
		for(int i=0; i < jt.length; i++) {
			if (4 == i || 5 == i || 6 == i || 7 == i || 8 == i || 10 == i || 13 == i ) {
				jc[0].setSelectedIndex(0);
				jcBirth[0].setSelectedIndex(0);
				jcBirth[1].setSelectedIndex(0);
				jr[0].setSelected(true);
				jr[1].setSelected(false);
				jc[1].setSelectedIndex(0);
				jtFiled[0].setText("");
				jtFiled[1].setText("");
				jc[2].setSelectedIndex(0);
				jtFiled[2].setText("");
				jtFiled[3].setText("");
				jtFiled[4].setText("");
				jtFiled[5].setText("");
				jc[3].setSelectedIndex(0);
				jc[4].setSelectedIndex(0);
			}else {
				jt[i].setText("");
			}
			jt[2].setEditable(true);
		}
	}
	
	// 액션 이벤트
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("KbdMember.actionPerformed() 함수 시작 >>> : ");
		Object obj = e.getSource();
		Object jbCaption = e.getActionCommand();
		
		if(jb[0] == obj) {
			System.out.println("중복확인 버튼 클릭 >>> : " + jbCaption);
			
			// 회원 아이디
			String kid = jt[2].getText();
			
			this.kmemIdCheck(kid);
		}
		if(jb[1] == obj) {
			System.out.println("가입하기 버튼 클릭 >>> : " + jbCaption);
			
			// 회원이름
			String kname = jt[1].getText();
			
			// 회원 아이디
			String kid = jt[2].getText();
			
			// 회원 비밀번호
			String kpw = jt[3].getText();
			
			// 생년월일
			String kbirth = "";
			kbirth = String.valueOf(jc[0].getSelectedItem());
			kbirth = kbirth.concat(String.valueOf(jcBirth[0].getSelectedItem()));
			kbirth = kbirth.concat(String.valueOf(jcBirth[1].getSelectedItem()));
			
			// 성별
			String kgender = "";
			if(jr[0].isSelected()) {
				System.out.println("kgender >>> : " + jr[0].getText());
				kgender = "01";
			}else {
				System.out.println("kgender >>> : " + jr[1].getText());
				kgender = "02";
			}
			
			// 전화번호
			String ktel = "";
			ktel = String.valueOf(jc[1].getSelectedItem());
			ktel = ktel.concat(jtFiled[0].getText());
			ktel = ktel.concat(jtFiled[1].getText());
			
			// 핸드폰 번호
			String khp = "";
			khp = String.valueOf(jc[2].getSelectedItem());
			khp = khp.concat(jtFiled[2].getText());
			khp = khp.concat(jtFiled[3].getText());
			
			// 이메일
			String kemail = "";
			kemail = jtFiled[4].getText();
			kemail = kemail.concat("@");
			kemail = kemail.concat(jtFiled[5].getText());
			
			// 주소
			String kaddr = jt[9].getText();
			
			// 취미
			String khobby = "";
			khobby = CodeUtil.setHobby(String.valueOf(jc[3].getSelectedItem()));
			
			// 사진
			String kphoto = jt[11].getText();
			
			// 특기
			String kskill = jt[12].getText();
			
			// 직업
			String kjob = "";
			kjob = CodeUtil.setJob(String.valueOf(jc[4].getSelectedItem()));
			
			System.out.println("kname >>> : " + kname);
			System.out.println("kid >>> : " + kid);
			System.out.println("kpw >>> : " + kpw);
			System.out.println("kbirth >>> : " + kbirth);
			System.out.println("kgender >>> : " + kgender);
			System.out.println("ktel >>> : " + ktel);
			System.out.println("khp >>> : " + khp);
			System.out.println("kemail >>> : " + kemail);
			System.out.println("kaddr >>> : " + kaddr);
			System.out.println("khobby >>> : " + khobby);
			System.out.println("kphoto >>> : " + kphoto);
			System.out.println("kskill >>> : " + kskill);
			System.out.println("kjob >>> : " + kjob);
			
			this.kmemInsert(kname, kid, kpw,
							kbirth, kgender, ktel,
							khp, kemail, kaddr,
							khobby, kphoto, kskill,
							kjob);			
		}
		
		if(jb[2] == obj) {
			System.out.println("다시버튼 버튼 클릭 >>> : ");
			this.valueClear();
		}	
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("KbdMember.main() 함수 시작 >>> : ");
		new KbdMember();
	}
}
