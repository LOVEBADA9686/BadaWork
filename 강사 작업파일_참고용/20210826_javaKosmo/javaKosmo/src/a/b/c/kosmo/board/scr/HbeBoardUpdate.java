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
	
	// �������
	private JLabel      	jl[];
	private JTextField  	jt[];
	private JTextArea   	jta;
	private JPasswordField 	jpf;
	private JButton     	jb[];	
	private JPanel      	jp[];
	
	public HbeBoardUpdate() {
		// JFrame Ÿ��Ʋ �����ϱ�
		this.setTitle(":::�Խ���:::");
		
		// JFrame ���̾ƿ� �Ŵ��� ���� ���̾ƿ����� �����ϱ� 
		this.getContentPane().setLayout(null);				
		jp = new JPanel[2];		
		jp[0] = new JPanel();
		jp[0].setBorder(new EtchedBorder());
		jp[0].setBounds(0, 0, 465, 480);
		jp[0].setBackground(Color.cyan);
		jp[0].setLayout(null);
		
		// �Խ��� �� 
		JLabel jlM = new JLabel(); 
		jlM.setText("�Խ���");		
		jlM.setHorizontalAlignment(SwingConstants.CENTER);
		jlM.setFont(new Font("�������", Font.BOLD, 20));
		jlM.setBounds(20,20,362,40);
		jp[0].add(jlM);		
		
		// ��
		jl = new JLabel[5];		
		int ly = 80;		
		for (int i=0; i < jl.length; i++) {
			jl[i] = new JLabel();
			jl[i].setOpaque(true);
			jl[i].setText(CodeUtil.board_label[i]);
			jl[i].setHorizontalAlignment(SwingConstants.CENTER);
			jl[i].setFont(new Font("�������", Font.BOLD, 15));			
			jl[i].setBounds(20, ly, 100, 30);
			ly += 40;
			jp[0].add(jl[i]);
		}
			
		// �ؽ�Ʈ�ʵ�	
		jt = new JTextField[3];		
		int ty = 80;
		for (int i=0; i < jt.length; i++) {
			jt[i] = new JTextField(200);	
			jt[i].setBounds(130, ty, 300, 30);
			jp[0].add(jt[i]);
			ty += 40;
		}
		
		// ��й�ȣ
		jpf = new JPasswordField();
		jpf.setBounds(130, 200, 100, 30);
		jpf.setEchoChar('*');
		jp[0].add(jpf);
		
		// �ؽ�Ʈ����� ���̱� ���ؼ� 
		jp[1] = new JPanel();
		jp[1].setLayout(new BorderLayout(5, 5));
		jp[1].setBounds(130, 240, 300, 140);
		jp[1].setBackground(Color.red);
		jp[0].add(jp[1]);
		
		// �ؽ�Ʈ����� 
		jta = new JTextArea(10, 10);
		jp[1].add(new JScrollPane(jta));
	
		// ��ư
		jb = new JButton[2];
		for (int i=0; i < jb.length ; i++ ){
			jb[i] = new JButton();
			jb[i].addActionListener(this);
			jp[0].add(jb[i]);
		}
		
		jb[0].setText("����");
		jb[0].setBounds(20, 420, 250, 30);		
		jb[0].setFont(new Font("�������", Font.BOLD, 15));
		
		jb[1].setText("����");
		jb[1].setBounds(280, 420, 150, 30);		
		jb[1].setFont(new Font("�������", Font.BOLD, 15));
		
		
		// JTextFiled disable : ��������, �����, ������
		jt[0].setEditable(false);
		jt[2].setEditable(false);
				
		// JPanel JFrame ���̱� 
		this.getContentPane().add(jp[0]);		
		
		this.setSize(465, 520);
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

	// �Խñ� ��ȸ�ϱ� 
	public void hboardSelect(String bnum) {
		System.out.println("HbeBoardUpdate hboardSelect() �Լ� ���� >>> : " + bnum);
		
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
	
	// �Խñ� �����ϱ� 
	public void hboardUpdate(String bnum, String bsubject, String bcontents) {
		System.out.println("HbeBoardUpdate hboardUpdate() �Լ� ���� >>> : " + bnum);
		
		HbeBoardService hs = new HbeBoardServiceImpl();
		HbeBoardVO hvo = null;
		hvo = new HbeBoardVO();
		hvo.setBnum(bnum);
		hvo.setBsubject(bsubject);
		hvo.setBcontents(bcontents);
			
		int nCnt = hs.hboardUpdate(hvo);
		
		if (nCnt > 0) {
			System.out.println("�Խñ� ���� ����  >>> : " + nCnt);
			JOptionPane.showMessageDialog(this, "�Խñ� ���� ���� >>> :  ");
			
			this.setVisible(false);
			this.dispose();
			
			HbeBoardrAll hboardAll = HbeBoardrAll.getInstance();
			hboardAll.hboardSelectAll();
		}else {
			System.out.println("�Խñ� ���� ����  >>> : " + nCnt);
		}
	}

	// �Խñ� �����ϱ� 
	public void hboardDelete(String bnum) {
		System.out.println("HbeBoardUpdate hboardDelete() �Լ� ���� >>> : " + bnum);
		
		HbeBoardService hs = new HbeBoardServiceImpl();
		HbeBoardVO hvo = null;
		hvo = new HbeBoardVO();
		hvo.setBnum(bnum);;	
		
		int nCnt = hs.hboardDelete(hvo);
		
		if (nCnt > 0) {
			System.out.println("�Խñ� ���� ����  >>> : " + nCnt);
			JOptionPane.showMessageDialog(this, "�Խñ� ���� ���� >>> :  ");
			
			this.setVisible(false);
			this.dispose();
			
			HbeBoardrAll hboardAll = HbeBoardrAll.getInstance();
			hboardAll.hboardSelectAll();		
		}else {
			System.out.println("�Խñ� ���� ����  >>> : " + nCnt);
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub		
		System.out.println("HbeBoard.actionPerformed() �Լ� ����  >>> : ");
		
		Object obj = e.getSource();
		Object jbCaption = e.getActionCommand();
		
		if (jb[0] == obj) {
			System.out.println("�����ϱ� ��ư Ŭ�� >>> : " + jbCaption);
			
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
			System.out.println("�����ϱ� ��ư Ŭ�� >>> : ");	
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
