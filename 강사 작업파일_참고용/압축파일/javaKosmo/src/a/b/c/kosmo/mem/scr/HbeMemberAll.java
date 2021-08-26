package a.b.c.kosmo.mem.scr;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;

import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

import a.b.c.common.CodeUtil;
import a.b.c.kosmo.mem.service.HbeMemberService;
import a.b.c.kosmo.mem.service.HbeMemberServiceImpl;
import a.b.c.kosmo.mem.vo.HbeMemberVO;

public class HbeMemberAll extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = -7773980409866362226L;
	
	DefaultTableModel dtm;
	JTable             jt;
	Object[][] fieldValue;
	String[]   columnName;
	
	JPanel[]    jpR;
	JLabel      jlR;
	JComboBox<String>  jcR;
	JTextField  jtR;
	JButton     jbR;
	JScrollPane jsPain;
	JButton     jtBtn[];
	JCheckBox   jcb[];
	
	String comboStr;
	String searchStr;
	
	// 생성자 
	@SuppressWarnings("unchecked")
	public HbeMemberAll() {
		this.setTitle("회원검색하기");
		this.getContentPane().setLayout(new BorderLayout(10, 10));

		jpR = new JPanel[3];
		jlR = new JLabel("조회조건");
		jlR.setHorizontalAlignment(SwingConstants.CENTER);

		jcR = new JComboBox<String>(CodeUtil.combo_cpation);
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
		
//################################################
		// JTable 붙이는 규칙 
		columnName = CodeUtil.member_selectall_value;				
		
		dtm = new DefaultTableModel(fieldValue, columnName);
		jt = new JTable(dtm);
		jt.setEnabled(true);
		jsPain = new JScrollPane(jt);
		
		this.hmemSelectAll();
//################################################
		
		jpR[0].add(jlR);
		jpR[0].add(jcR);		
		jpR[0].add(jtR);
		jpR[0].add(jbR);
		jpR[0].setLayout(new GridLayout(1, 4, 5, 5));
		jpR[1].add(jsPain);
		
		jpR[2] = new JPanel();
		jpR[2].setLayout(new FlowLayout(FlowLayout.CENTER));
		
		jtBtn = new JButton[2];		
		for (int i=0; i < jtBtn.length; i++) {
			jtBtn[i] = new JButton(CodeUtil.jbtn_cpation[i]);
			jtBtn[i].addActionListener(this);
			jpR[2].add(jtBtn[i]);
		}

		this.getContentPane().add(jpR[0], BorderLayout.NORTH);
		this.getContentPane().add(jpR[1], BorderLayout.CENTER);
		this.getContentPane().add(jpR[2], BorderLayout.SOUTH);

		this.setLocation(100, 100);
		this.setSize(1600,540);
		this.setResizable(false);
		this.setVisible(true);
		
		// JFrame 클로우즈 
		this.addWindowListener(new WindowAdapter() { 
			public void windowClosing(WindowEvent e) { 
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
			}
		});
	}
	
	public void jtableRender() {
//		################################# 시작 	
		// 컬럼 사이즈 조절
		jt.getColumn("회원이름").setPreferredWidth(30);
		jt.getColumn("아이디").setPreferredWidth(30);
		jt.getColumn("패스워드").setPreferredWidth(30);
		jt.getColumn("성별").setPreferredWidth(30);
		jt.getColumn("취미").setPreferredWidth(30);
		jt.getColumn("사진").setPreferredWidth(30);
		jt.getColumn("특기").setPreferredWidth(30);
		jt.getColumn("직업").setPreferredWidth(30);
		jt.getColumn("Y/N").setPreferredWidth(10);
		jt.getColumn("수정/삭제").setPreferredWidth(60);		
		// 셀 가운데 정렬
		DefaultTableCellRenderer tScheduleCellRenderer = new DefaultTableCellRenderer();
		tScheduleCellRenderer.setHorizontalAlignment(SwingConstants.CENTER);
		TableColumnModel tcmSchedule = jt.getColumnModel();
		for (int i = 0; i < tcmSchedule.getColumnCount(); i++) {
			tcmSchedule.getColumn(i).setCellRenderer(tScheduleCellRenderer);
		}				
		// 테이블을 스크롤페인으로 크기 조절하기 
		jsPain.setPreferredSize(new Dimension(1600, 400));
//		################################# 끝		
		
		// 수정/삭제 버튼 붙이기
		jt.getColumnModel().getColumn(17).setCellRenderer(new TableCell());
		jt.getColumnModel().getColumn(17).setCellEditor(new TableCell());
	}

	
//################################# 시작 
	// 수정/삭제 버튼 붙이기
	class TableCell extends AbstractCellEditor implements TableCellEditor, TableCellRenderer,  ActionListener{		
		private static final long serialVersionUID = 1L;
		
		JButton jb;
		
		// 생성자 
		public TableCell(){			
		
			jb = new JButton("수정/삭제");			
	//		jc.addActionListener(e -> {
	//			System.out.println(jt.getValueAt(jt.getSelectedRow(), 2));
	//		});				
			jb.addActionListener(this);			
		}
		
		@Override
		public Object getCellEditorValue() {
			// TODO Auto-generated method stub
			return null;
		}
	
		@Override
		public Component getTableCellRendererComponent(JTable table, Object value, 
				                                       boolean isSelected, boolean hasFocus,
				                                       int row, int column) {
			// TODO Auto-generated method stub
			return jb;
		}
	
		@Override
		public Component getTableCellEditorComponent(JTable table, Object value, 
				                                     boolean isSelected, int row, int column) {
			// TODO Auto-generated method stub
			return jb;
		}	
		
		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			System.out.println("TableCell actionPerformed() 함수 진입 >>> : ");
			
			if (jb == e.getSource()) {
				String hnum = String.valueOf(jt.getValueAt(jt.getSelectedRow(), 0));
				System.out.println("hnum >>> : " + hnum);
				HbeMemberUpdate hmu = new HbeMemberUpdate();
				hmu.hmemSelect(hnum);
			}
		}
	} // end of TableCell 	
//################################# 끝	

	// JTable 프린트 
	public void jtablePrint(ArrayList<HbeMemberVO> aList, int rowCnt, int columnCnt) {
		System.out.println("HbeMemberAll jtablePrint() 함수 진입 >>> : ");
		
		fieldValue = new Object[rowCnt][columnCnt];
		for (int i=0; i < rowCnt; i++ ){			
			HbeMemberVO _hvo = aList.get(i);
			fieldValue[i][0] = _hvo.getHnum();
			fieldValue[i][1] = _hvo.getHname();
			fieldValue[i][2] = _hvo.getHid();
			fieldValue[i][3] = _hvo.getHpw();
			fieldValue[i][4] = _hvo.getHbirth();
			fieldValue[i][5] = _hvo.getHgender();
			fieldValue[i][6] = _hvo.getHtel();
			fieldValue[i][7] = _hvo.getHhp();								
			fieldValue[i][8] = _hvo.getHemail();
			fieldValue[i][9] = _hvo.getHaddr();
			fieldValue[i][10] = CodeUtil.hobby(_hvo.getHhobby());
			fieldValue[i][11] = _hvo.getHphoto();
			fieldValue[i][12] = _hvo.getHskill();
			fieldValue[i][13] = CodeUtil.hobby(_hvo.getHjob());
			fieldValue[i][14] = _hvo.getDeleteyn();
			fieldValue[i][15] = _hvo.getInsertdate();
			fieldValue[i][16] = _hvo.getUpdatedate();	
		}
	}
		
	// 회원 전체 검색
	public void hmemSelectAll() {
		System.out.println("HbeMemberAll hmemSelectAll() 함수 진입 >>> : ");
		
		HbeMemberService hms = new HbeMemberServiceImpl();
		ArrayList<HbeMemberVO> aList =  hms.hmemSelectAll();
	
		int columnCnt = columnName.length;
		int rowCnt = aList.size();
		System.out.println("전체조회 :: rowCnt >>> : " + rowCnt);	
		
		this.jtablePrint(aList,rowCnt, columnCnt);		
		
		dtm = new DefaultTableModel(fieldValue, columnName);
		jt.setModel(dtm);		
		this.jtableRender();
		
		return;
	}
	
	// 회원 이름 검색
	public void hmemSelectName(String searchStr) {
		System.out.println("HbeMemberAll hmemSelectName() 함수 진입 >>> : ");
		
		HbeMemberService hms = new HbeMemberServiceImpl();
		HbeMemberVO hvo = null;
		hvo = new HbeMemberVO();
		hvo.setHname(searchStr);
		ArrayList<HbeMemberVO> aList =  hms.hmemSelectName(hvo);
	
		int columnCnt = columnName.length;
		int rowCnt = aList.size();
		System.out.println("회원이름 조회 :: rowCnt >>> : " + rowCnt);	
		
		this.jtablePrint(aList, rowCnt, columnCnt);		
		
		dtm = new DefaultTableModel(fieldValue, columnName);
		jt.setModel(dtm);		
		this.jtableRender();
		
		return;
	}
	
	// 회원 아이디 검색
	public void hmemSelectId(String searchStr) {
		System.out.println("HbeMemberAll hmemSelectId() 함수 진입 >>> : ");
		
		HbeMemberService hms = new HbeMemberServiceImpl();
		HbeMemberVO hvo = null;
		hvo = new HbeMemberVO();
		hvo.setHid(searchStr);
		ArrayList<HbeMemberVO> aList =  hms.hmemSelectId(hvo);
	
		int columnCnt = columnName.length;
		int rowCnt = aList.size();
		System.out.println("회원아이디 조회 :: rowCnt >>> : " + rowCnt);	
		
		this.jtablePrint(aList, rowCnt, columnCnt);		
		
		dtm = new DefaultTableModel(fieldValue, columnName);
		jt.setModel(dtm);		
		this.jtableRender();
		
		return;	
	}	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		// ComboBox 이벤트 처리
		if (jcR == e.getSource()) {
			comboStr = (String)jcR.getSelectedItem();
			if ("전체".equals(comboStr)){
				jtR.setVisible(false);				
			}
			if ("아이디".equals(comboStr)){
				jtR.setVisible(true);
				jtR.setText("");
			}
			if ("이름".equals(comboStr)){
				jtR.setVisible(true);
				jtR.setText("");
			}
		}
		
		// 조회 버튼 이벤트 
		if (jbR == e.getSource()) {
			String searchStr = jtR.getText();
			
			if ("전체".equals(comboStr)){
				System.out.println("searchStr >>> : " + searchStr);
				
				this.hmemSelectAll();
			}			
			
			if ("이름".equals(comboStr)){				
				
				if (searchStr !=null && searchStr.length() > 0) {				
					System.out.println("이름 :: searchStr >>> : " + searchStr);
					
					this.hmemSelectName(searchStr);	
				}else {
					JOptionPane.showMessageDialog(this, "검색 조건 이름을 입력하세요 >>> :  ");
				}
			}
			if ("아이디".equals(comboStr)){
				
				if (searchStr !=null && searchStr.length() > 0) {
					System.out.println("아이디 :: searchStr >>> : " + searchStr);
					
					this.hmemSelectId(searchStr);
				}else {
					JOptionPane.showMessageDialog(this, "검색 조건 아이디를 입력하세요 >>> :  ");
				}				
			}
		}
		
		// 버튼 
		if (jtBtn[0] == e.getSource()) {
			System.out.println("회원 가입하기 >>> : ");
			this.setVisible(false);
			this.dispose();
			new HbeMember();
		}	
		if (jtBtn[1] == e.getSource()) {
			System.out.println("회원 목록보기 >>> : ");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HbeMemberAll();
	}
}
