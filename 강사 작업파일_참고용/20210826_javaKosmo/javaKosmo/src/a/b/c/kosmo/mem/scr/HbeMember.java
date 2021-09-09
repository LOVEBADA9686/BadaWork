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
import a.b.c.common.HbeMemberChabun;
import a.b.c.kosmo.mem.service.HbeMemberService;
import a.b.c.kosmo.mem.service.HbeMemberServiceImpl;
import a.b.c.kosmo.mem.vo.HbeMemberVO;

public class HbeMember extends JFrame implements ActionListener {

	private static final long serialVersionUID = 9072198881429763467L;
	
	// �������
	private JLabel      jl[];
	private JTextField  jt[];
	private JTextField  jtFiled[];
	private JButton     jb[];
	private JPanel      jp[];
	private JComboBox<String> jc[];
	private JComboBox<String> jcBirth[];
	private JRadioButton        jr[];
	
	// ������ 
	@SuppressWarnings("unchecked")
	public HbeMember() {
		// JFrame Ÿ��Ʋ �����ϱ�
		this.setTitle(":::ȸ������:::");
		
		// JFrame ���̾ƿ� �Ŵ��� ���� ���̾ƿ����� �����ϱ� 
		this.getContentPane().setLayout(null);				
		jp = new JPanel[2];		
		jp[0] = new JPanel();
		jp[0].setBorder(new EtchedBorder());
		jp[0].setBounds(0, 0, 420, 880);
		jp[0].setBackground(Color.cyan);
		jp[0].setLayout(null);
		
		// �޺��ڽ�, ���̿���ư, �ؽ�Ʈ�ʵ�, �� �ʱ�ȭ 
		// �޺��ڽ� 
		jc = new JComboBox[5];
		// �޺��ڽ� : ������Ͽ��� ��, �� 
		jcBirth = new JComboBox[5];
		// ���̿���ư : ����, ����
		jr = new JRadioButton[2];
				
		// �ؽ�Ʈ�ʵ�
		jtFiled = new JTextField[6];
		jt = new JTextField[17];
		int ty = 80;
		for (int i=0; i < jt.length; i++) {
							
			if ( 4 == i || 5 == i || 6 == i || 7 == i || 8 == i || 10 == i || 13 == i) {
				System.out.println(">>>>>>>> " + i);
				// �������
				if (4 == i) {
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
					jcBirth[1].setBounds(295, 240, 65, 30);
				}
				// ����
				if (5 == i) {	
					ButtonGroup bg = new ButtonGroup();
					
					JPanel jpGender = new JPanel();
					jpGender.setLayout(new FlowLayout(FlowLayout.LEADING));
					jpGender.setBackground(Color.white);
					jpGender.setBounds(130,280,140,31);
					for (int j=0; j < jr.length; j++) {
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
				// ��ȭ��ȣ
				if (6 == i) {					
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
				// �޴�����ȣ
				if (7 == i) {					
					jc[2] = new JComboBox<String> (CodeUtil.hp_value);
					jp[0].add(jc[2]);
					jc[2].setBackground(Color.white);
					jc[2].setSelectedIndex(0);
					jc[2].setBounds(130, 360, 60,30);
					
					jtFiled[2] = new JTextField(6);
					jtFiled[2].setBackground(Color.white);
					jtFiled[2].setBounds(200, 360, 60, 30);
					jtFiled[3] = new JTextField(6);
					jtFiled[3].setBackground(Color.white);
					jtFiled[3].setBounds(270, 360, 60, 30);
					
					jp[0].add(jtFiled[2]);
					jp[0].add(jtFiled[3]);
				}
				// �̸���
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
				// ���
				if (10 == i) {
					jc[3] = new JComboBox<String>(CodeUtil.hobby_lavel);
					jp[0].add(jc[3]);
					jc[3].setBackground(Color.white);
					jc[3].setSelectedIndex(0);
					jc[3].setBounds(130,480,80,30);
				}
				// ����
				if (13 == i) {
					jc[4] = new JComboBox<String>(CodeUtil.job_lavel);
					jp[0].add(jc[4]);
					jc[4].setBackground(Color.white);
					jc[4].setSelectedIndex(0);
					jc[4].setBounds(130,600,80,30);
				}
			}else {
				jt[i] = new JTextField(20);	
				jt[i].setBounds(130, ty, 140, 30);
				jp[0].add(jt[i]);
			}
			ty += 40;
		}
				
		// ��
		jl = new JLabel[17];		
		int ly = 80;		
		for (int i=0; i < jl.length; i++) {
			jl[i] = new JLabel();
			jl[i].setOpaque(true);
			jl[i].setText(CodeUtil.member_value[i]);
			jl[i].setHorizontalAlignment(SwingConstants.CENTER);
			jl[i].setFont(new Font("�������", Font.BOLD, 15));			
			jl[i].setBounds(20, ly, 100, 30);
			ly += 40;
			jp[0].add(jl[i]);
		}

		// ȸ������ �� 
		JLabel jlM = new JLabel(); 
		jlM.setText("ȸ������");		
		jlM.setHorizontalAlignment(SwingConstants.CENTER);
		jlM.setFont(new Font("�������", Font.BOLD, 20));
		jlM.setBounds(20,20,362,40);
		jp[0].add(jlM);
			
		// ��ư
		jb = new JButton[3];
		for (int i=0; i < jb.length ; i++ ){
			jb[i] = new JButton();
			jb[i].addActionListener(this);
			jp[0].add(jb[i]);
		}
		
		jb[0].setText("�ߺ�Ȯ��");
		jb[0].setBounds(280, 160, 110, 30);		
		jb[0].setFont(new Font("�������", Font.BOLD, 15));
		
		jb[1].setText("�����ϱ�");
		jb[1].setBounds(20, 780, 250, 30);		
		jb[1].setFont(new Font("�������", Font.BOLD, 15));
		
		jb[2].setText("�ٽ�");
		jb[2].setBounds(280, 780, 100, 30);		
		jb[2].setFont(new Font("�������", Font.BOLD, 15));
		
		
		// JTextFiled disable : ��������, �����, ������
		jt[0].setEditable(false);
		jt[14].setEditable(false);
		jt[15].setEditable(false);
		jt[16].setEditable(false);		
		
		// JPanel JFrame ���̱� 
		this.getContentPane().add(jp[0]);
		
		this.setSize(420, 880);
		this.setLocation(200, 100);
		this.setResizable(false);
		this.setVisible(true);

		// JFrame �ݱ� 
		this.addWindowListener(new WindowAdapter() { 
			public void windowClosing(WindowEvent e) { 
				e.getWindow().setVisible(false);
				e.getWindow().dispose();						
			}
		});
	}

	// ȸ�����̵� �ߺ�üũ�ϱ�
	public void hmemIdCheck(String hid) {
		System.out.println("HbeMember.hmemIdCheck() �Լ� ����  >>> : ");
		
		try {
			HbeMemberService hs = new HbeMemberServiceImpl();		
			HbeMemberVO hvo = null;
			hvo = new HbeMemberVO();
			hvo.setHid(hid);
			
			boolean bool = hs.hmemIdCheck(hvo);
			
			if (!bool) {
				System.out.println("��밡���� ���̵� �Դϴ�. >>> : " + bool);
				JOptionPane.showMessageDialog(this, "��밡���� ���̵� �Դϴ� >>> :  ");
				jt[2].setText(hvo.getHid());
				jt[2].setEditable(false);
			}else {
				System.out.println("���� ���̵� �ֽ��ϴ�. >>> : " + bool);
				JOptionPane.showMessageDialog(this, "���� ���̵� �ֽ��ϴ�  >>> :  ");
				jt[2].setText("");
			}
		}catch(Exception e) {
			System.out.println("������ >>> : " + e.getMessage());	
		}
		
	}
	// ȸ������ ����ϱ� 
	public void hmemInsert( String hname, String hid, String hpw,
							String hbirth, String hgender, String htel, 
							String hhp, String hemail, String haddr, 
							String hhobby, String hphoto, String hskill, 
							String hjob) {
		System.out.println("HbeMember.hmemInsert() �Լ� ����  >>> : ");		
		try {
		
			HbeMemberService hs = new HbeMemberServiceImpl();		
			HbeMemberVO hvo = null;
			hvo = new HbeMemberVO();
			
			String hnum = HbeMemberChabun.ymdNum();
			System.out.println("HbeMemberr.hmemInsert :: HbeMemberChabun.ymdNum() >>> : " + hnum);
			hvo.setHnum(hnum);
			hvo.setHname(hname);
			hvo.setHid(hid);
			hvo.setHpw(hpw);
			hvo.setHbirth(hbirth);
			hvo.setHgender(hgender);
			hvo.setHtel(htel);
			hvo.setHhp(hhp);
			hvo.setHemail(hemail);
			hvo.setHaddr(haddr);
			hvo.setHhobby(hhobby);				
			hvo.setHphoto(hphoto);
			hvo.setHskill(hskill);
			hvo.setHjob(hjob);
			HbeMemberVO.printlnHbeMemberVO(hvo);
						
			boolean bool = hs.hmemInsert(hvo);
			
			if (bool) {
				System.out.println("ȸ�� ���� �Է� ���� >>> : " + bool);	
				JOptionPane.showMessageDialog(this, "ȸ������ ��� ���� >>> :  ");
				
				this.setVisible(false);
				this.dispose();
				
				HbeMemberAll hmemAll = HbeMemberAll.getInstance();
				hmemAll.hmemSelectAll();
			}else {
				System.out.println("ȸ�� ���� �Է� ���� >>> : " + bool);							
			}
		}catch(Exception e) {
				System.out.println("������ >>> : " + e.getMessage());			
		}		
	}
		
	public void valueClear() {
		System.out.println("HbeMember.valueClear() �Լ� ����  >>> : ");
		for (int i=0; i < jt.length; i++) {			
			if ( 4 == i || 5 == i || 6 == i || 7 == i || 8 == i || 10 == i || 13 == i) {				
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
	
	// �׼� �̺�Ʈ 
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		System.out.println("HbeMember.actionPerformed() �Լ� ����  >>> : ");
		Object obj = e.getSource();
		Object jbCaption = e.getActionCommand();
		
		if (jb[0] == obj) {
			System.out.println("�ߺ�Ȯ�� ��ư Ŭ�� >>> : " + jbCaption);
			
			// ȸ�� ���̵�
			String hid = jt[2].getText();
			
			this.hmemIdCheck(hid);
		}
		if (jb[1] == obj) {	
			System.out.println("�����ϱ� ��ư Ŭ�� >>> : " + jbCaption);	
			
			// ȸ���̸� 
			String hname = jt[1].getText();
			
			// ȸ�� ���̵�
			String hid = jt[2].getText();
			
			// ȸ�� ��й�ȣ
			String hpw = jt[3].getText();
			
			// �������
			String hbirth = "";
			hbirth = String.valueOf(jc[0].getSelectedItem());
			hbirth = hbirth.concat(String.valueOf(jcBirth[0].getSelectedItem()));
			hbirth = hbirth.concat(String.valueOf(jcBirth[1].getSelectedItem()));
			
			// ����
			String hgender = "";
			if (jr[0].isSelected()) {
				System.out.println("hgender >>> : " + jr[0].getText());
				hgender = "01";
			}else {
				System.out.println("hgender >>> : " + jr[1].getText());
				hgender = "02";
			}
					
			// ��ȭ��ȣ
			String htel = "";
			htel = String.valueOf(jc[1].getSelectedItem());
			htel = htel.concat(jtFiled[0].getText());
			htel = htel.concat(jtFiled[1].getText());
			
			// �ڵ��� ��ȣ
			String hhp = "";
			hhp = String.valueOf(jc[2].getSelectedItem());
			hhp = hhp.concat(jtFiled[2].getText());
			hhp = hhp.concat(jtFiled[3].getText());
			
			// �̸��� 
			String hemail = "";
			hemail = jtFiled[4].getText();
			hemail = hemail.concat("@");
			hemail = hemail.concat(jtFiled[5].getText());
			
			// �ּ�
			String haddr = jt[9].getText();
			
			// ��� 
			String hhobby = "";
			hhobby = CodeUtil.setHobby(String.valueOf(jc[3].getSelectedItem()));
			
			// ����			
			String hphoto = jt[11].getText();
			
			// Ư��
			String hskill = jt[12].getText();
			
			// ����
			String hjob = "";			
			hjob = CodeUtil.setJob(String.valueOf(jc[4].getSelectedItem()));
			
			System.out.println("hname >>> : " + hname);
			System.out.println("hid >>> : " + hid);
			System.out.println("hpw >>> : " + hpw);			
			System.out.println("hbirth >>> : " + hbirth);
			System.out.println("hgender >>> : " + hgender);
			System.out.println("htel >>> : " + htel);			
			System.out.println("hhp >>> : " + hhp);
			System.out.println("hemail >>> : " + hemail);
			System.out.println("haddr >>> : " + haddr);			
			System.out.println("hhobby >>> : " + hhobby);
			System.out.println("hphoto >>> : " + hphoto);
			System.out.println("hskill >>> : " + hskill);			
			System.out.println("hjob >>> : " + hjob);	
			
			this.hmemInsert(hname, hid, hpw, 
					  		hbirth, hgender, htel, 
					  		hhp, hemail, haddr, 
					  		hhobby, hphoto, hskill, 
					  		hjob);
		}
		
		if (jb[2] == obj) {	
			System.out.println("�ٽù�ư ��ư Ŭ�� >>> : ");	
			this.valueClear();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("HbeMember.main() �Լ� ����  >>> : ");
		new HbeMember();
	}
}
