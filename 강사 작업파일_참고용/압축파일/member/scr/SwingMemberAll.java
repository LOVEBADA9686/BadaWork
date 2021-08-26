package a.b.c.swing.member.scr;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;

import a.b.c.swing.member.service.SwingMemberService;
import a.b.c.swing.member.service.SwingMemberServiceImpl;
import a.b.c.swing.member.vo.SwingMemberVO;

public class SwingMemberAll extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = -7773980409866362226L;
	
	DefaultTableModel dtm = null;
	JTable             jt = null;
	Object[][] fieldValue = null;
	String[]   columnName = {"회원번호", "이름", "아이디", "비밀번호", "삭제여부", "등록일", "수정일"};
	
	JPanel[]    jpR = null;
	JLabel      jlR = null;
	JComboBox   jcR = null;
	JTextField  jtR = null;
	JButton     jbR = null;
	JScrollPane jsp = null;
	
	String[] comboCaption = {"----------", "전체", "이름", "아이디"};
	String comboStr = "";
	
	// 생성자 
	public SwingMemberAll() {
		this.setTitle("회원검색하기");
		this.getContentPane().setLayout(new BorderLayout(10, 10));

		jpR = new JPanel[2];
		jlR = new JLabel("조회조건");
		jlR.setHorizontalAlignment(SwingConstants.CENTER);

		jcR = new JComboBox(comboCaption);
		jcR.setSelectedIndex(0);
		jcR.addActionListener(this);

		jtR = new JTextField();
		jtR.setVisible(false);
		jbR = new JButton("조회");
		jbR.addActionListener(this);

		for (int i=0; i < jpR.length; i++ ){
			jpR[i] = new JPanel();
			jpR[i].setLayout(new BorderLayout());
		}

		// JTable 붙이는 규칙 
		dtm = new DefaultTableModel(fieldValue, columnName);
		jt = new JTable(dtm);
		jt.setEnabled(true);
		jsp = new JScrollPane(jt);

		jpR[0].add(jlR);
		jpR[0].add(jcR);		
		jpR[0].add(jtR);
		jpR[0].add(jbR);
		jpR[0].setLayout(new GridLayout(1, 4, 5, 5));
		jpR[1].add(jsp);

//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);		
		this.getContentPane().add(jpR[0], BorderLayout.NORTH);
		this.getContentPane().add(jpR[1], BorderLayout.CENTER);

		this.setLocation(100, 100);
		this.setSize(780,540);
		this.setResizable(false);
		this.setVisible(true);
		
		// JFrame 클로우즈 
		this.addWindowListener(new WindowAdapter() { 
			public void windowClosing(WindowEvent e) { 
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
//						System.exit(0);
			}
		});
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		// ComboBox 이벤트 처리
		if (e.getSource() == jcR)
		{
			comboStr = (String)jcR.getSelectedItem();
			if ("전체".equals(comboStr)){
				jtR.setVisible(false);				
			}
			if ("아이디".equals(comboStr)){
				jtR.setVisible(true);
			}
			if ("이름".equals(comboStr)){
				jtR.setVisible(true);
			}
		}
		
		// 조회 버튼 이벤트 
		if (e.getSource() == jbR){
			String searchStr = "";

			if ("전체".equals(comboStr)){
				searchStr = jtR.getText();
				System.out.println("searchStr >>> : " + searchStr);

				int columnCnt = columnName.length;
		
				try{
					SwingMemberService sms = new SwingMemberServiceImpl();

					ArrayList<SwingMemberVO> aList =  sms.smSelectAll();
				
					int rowCnt = aList.size();
					System.out.println("rowCnt >>> : " + rowCnt);

					fieldValue = new Object[rowCnt][columnCnt];

					for (int i=0; i < rowCnt; i++ ){
						
						SwingMemberVO _svo = aList.get(i);
						fieldValue[i][0] = _svo.getSwnum();
						fieldValue[i][1] = _svo.getSwname();
						fieldValue[i][2] = _svo.getSwid();
						fieldValue[i][3] = _svo.getSwpw();
						fieldValue[i][4] = _svo.getDeleteyn();
						fieldValue[i][5] = _svo.getInsertdate();
						fieldValue[i][6] = _svo.getUpdatedate();
						/*
						(0,0) (0,1) (0,2) (0,3) (0,4) (0,5) (0,6)
						(1,0) (1,1) (1,2) (1,3) (1,4) (1,5) (1,6)
						(2,0) (2,1) (2,2) (2,3) (2,4) (2,5) (2,6)
						(3,0) (3,1) (3,2) (3,3) (3,4) (3,5) (3,6)
						(4,0) (4,1) (4,2) (4,3) (4,4) (4,5) (4,6)
						(5,0) (5,1) (5,2) (5,3) (5,4) (5,5) (5,6)
						(6,0) (6,1) (6,2) (6,3) (6,4) (6,5) (6,6)
						(7,0) (7,1) (7,2) (7,3) (7,4) (7,5) (7,6)
						
						
						SM202108190010	qqqqq	qqqqq	1234	Y	21/08/19	21/08/19
						SM202108190007	7777	7777	7777	Y	21/08/19	21/08/19
						SM202108190006	6666	6666	6666	Y	21/08/19	21/08/19
						SM202108180005	5555	5555	5555	Y	21/08/18	21/08/18
						SM202108180004	4444	4444	4444	Y	21/08/18	21/08/18
						SM202108180003	3333	3333	3333	Y	21/08/18	21/08/18
						SM202108180002	2222	2222	2222	Y	21/08/18	21/08/18
						SM202108180001	1111	1111	1111	Y	21/08/18	21/08/18
						*/
						System.out.println(">>> : " + fieldValue[i]);
					}
				}
				catch (Exception ex){
					System.out.println("에러가 >>> : " + ex.getMessage());
				}		

				dtm = new DefaultTableModel(fieldValue, columnName);
				jt.setModel(dtm);
				
				return;
			}
			if ("이름".equals(comboStr)){
				searchStr = jtR.getText();
				System.out.println("searchStr >>> : " + searchStr);

				int columnCnt = columnName.length;
		
				try{
					SwingMemberService sms = new SwingMemberServiceImpl();
					SwingMemberVO svo = null;
					svo = new SwingMemberVO();
					svo.setSwname(searchStr);
					
					ArrayList<SwingMemberVO> aList =  sms.smSelectName(svo);
				
					int rowCnt = aList.size();
					System.out.println("rowCnt >>> : " + rowCnt);

					fieldValue = new Object[rowCnt][columnCnt];

					for (int i=0; i < rowCnt; i++ ){
						
						SwingMemberVO _svo = aList.get(i);
						fieldValue[i][0] = _svo.getSwnum();
						fieldValue[i][1] = _svo.getSwname();
						fieldValue[i][2] = _svo.getSwid();
						fieldValue[i][3] = _svo.getSwpw();
						fieldValue[i][4] = _svo.getDeleteyn();
						fieldValue[i][5] = _svo.getInsertdate();
						fieldValue[i][6] = _svo.getUpdatedate();
						
						System.out.println(">>> : " + fieldValue[i]);
					}
				}
				catch (Exception ex){
					System.out.println("에러가 >>> : " + ex.getMessage());
				}		

				dtm = new DefaultTableModel(fieldValue, columnName);
				jt.setModel(dtm);
				
				return;
			}
			if ("아이디".equals(comboStr)){
				searchStr = jtR.getText();
				System.out.println(" searchStr >>> : " + searchStr);

				int columnCnt = columnName.length;
		
				try{
					SwingMemberService sms = new SwingMemberServiceImpl();
					SwingMemberVO svo = null;
					svo = new SwingMemberVO();
					svo.setSwid(searchStr);

					ArrayList<SwingMemberVO> aList =  sms.smSelectId(svo);
				
					int rowCnt = aList.size();
					System.out.println("rowCnt >>> : " + rowCnt);

					fieldValue = new Object[rowCnt][columnCnt];

					for (int i=0; i < rowCnt; i++ ){
						
						SwingMemberVO _svo = aList.get(i);
						fieldValue[i][0] = _svo.getSwnum();
						fieldValue[i][1] = _svo.getSwname();
						fieldValue[i][2] = _svo.getSwid();
						fieldValue[i][3] = _svo.getSwpw();
						fieldValue[i][4] = _svo.getDeleteyn();
						fieldValue[i][5] = _svo.getInsertdate();
						fieldValue[i][6] = _svo.getUpdatedate();
						
						System.out.println(">>> : " + fieldValue[i]);
					}
				}
				catch (Exception ex){
					System.out.println("에러가 >>> : " + ex.getMessage());
				}		

				dtm = new DefaultTableModel(fieldValue, columnName);
				jt.setModel(dtm);
				
				return;
			}
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new SwingMemberAll();
	}
}
