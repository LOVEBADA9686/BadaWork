package a.b.c.kosmo.board.scr;

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
import a.b.c.kosmo.board.service.HbeBoardService;
import a.b.c.kosmo.board.service.HbeBoardServiceImpl;
import a.b.c.kosmo.board.vo.HbeBoardVO;
import a.b.c.kosmo.mem.service.HbeMemberService;
import a.b.c.kosmo.mem.service.HbeMemberServiceImpl;
import a.b.c.kosmo.mem.vo.HbeMemberVO;

public class HbeBoardrAll extends JFrame implements ActionListener{
	
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
	
	// 싱글톤 패턴 : Singleton Pattern
	private static HbeBoardrAll hboardAll;	
	public static HbeBoardrAll getInstance() {
		if (hboardAll == null) {
			hboardAll = new HbeBoardrAll();
		}
		return hboardAll;
	}
	
	// 생성자 
	@SuppressWarnings("unchecked")
	public HbeBoardrAll() {
		
		this.setTitle("게시글 검색하기");
		this.getContentPane().setLayout(new BorderLayout(10, 10));

		jpR = new JPanel[3];
		jlR = new JLabel("조회조건");
		jlR.setHorizontalAlignment(SwingConstants.CENTER);

		jcR = new JComboBox<String>(CodeUtil.board_combo_cpation);
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
		columnName = CodeUtil.board_selectall_label;			
		
		dtm = new DefaultTableModel(fieldValue, columnName);
		jt = new JTable(dtm);
		jt.setEnabled(true);
		jsPain = new JScrollPane(jt);		
		
		this.hboardSelectAll();		
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
			jtBtn[i] = new JButton(CodeUtil.board_jbtn_cpation[i]);
			jtBtn[i].addActionListener(this);
			jpR[2].add(jtBtn[i]);
		}

		this.getContentPane().add(jpR[0], BorderLayout.NORTH);
		this.getContentPane().add(jpR[1], BorderLayout.CENTER);
		this.getContentPane().add(jpR[2], BorderLayout.SOUTH);

		this.setLocation(100, 100);
		this.setSize(800,400);
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
		//jt.getColumn("글제목").setPreferredWidth(30);
		//jt.getColumn("작성자").setPreferredWidth(30);
		//jt.getColumn("비밀번호").setPreferredWidth(30);
		jt.getColumn("글내용").setPreferredWidth(100);
		jt.getColumn("Y/N").setPreferredWidth(10);
		//jt.getColumn("등록일").setPreferredWidth(30);
		//jt.getColumn("수정일").setPreferredWidth(30);		
		//jt.getColumn("수정/삭제").setPreferredWidth(60);		
		// 셀 가운데 정렬
		DefaultTableCellRenderer tScheduleCellRenderer = new DefaultTableCellRenderer();
		tScheduleCellRenderer.setHorizontalAlignment(SwingConstants.CENTER);
		TableColumnModel tcmSchedule = jt.getColumnModel();
		for (int i = 0; i < tcmSchedule.getColumnCount(); i++) {
			tcmSchedule.getColumn(i).setCellRenderer(tScheduleCellRenderer);
		}				
		// 테이블을 스크롤페인으로 크기 조절하기 
		jsPain.setPreferredSize(new Dimension(760, 350));
//		################################# 끝		
		
		// 수정/삭제 버튼 붙이기
		jt.getColumnModel().getColumn(8).setCellRenderer(new TableCell());
		jt.getColumnModel().getColumn(8).setCellEditor(new TableCell());
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
				String bnum = String.valueOf(jt.getValueAt(jt.getSelectedRow(), 0));
				System.out.println("bnum >>> : " + bnum);
				HbeBoardUpdate hbu = new HbeBoardUpdate();
				hbu.hboardSelect(bnum);
			}
		}
	} // end of TableCell 	
//################################# 끝	
	
	public void hboardSelectAll() {
		System.out.println("HbeBoardrAll hboardSelectAll() 함수 진입 >>> : ");
		
		HbeBoardService hs = new HbeBoardServiceImpl();	
		ArrayList<HbeBoardVO> aList = hs.hboardSelectAll();	
		int columnCnt = columnName.length;
		int rowCnt = aList.size();	
		System.out.println("게시판 전체 조회 :: rowCnt >>> : " + rowCnt);		

		this.jtablePrint(aList,rowCnt, columnCnt);				
		dtm = new DefaultTableModel(fieldValue, columnName);
		jt.setModel(dtm);		
		this.jtableRender();
		
		return;
	}
	
	// 글제목 검색
	public void hboardSelectSubject(String searchStr) {
		System.out.println("HbeBoardrAll hboardSelectSubject() 함수 진입 >>> : ");
		
		HbeBoardService hs = new HbeBoardServiceImpl();	
		HbeBoardVO hvo = null;
		hvo = new HbeBoardVO();
		hvo.setBsubject(searchStr);
		ArrayList<HbeBoardVO> aList =  hs.hboardSelectSubject(hvo);
	
		int columnCnt = columnName.length;
		int rowCnt = aList.size();
		System.out.println("게시판 글제목 검색 :: rowCnt >>> : " + rowCnt);		
		
		this.jtablePrint(aList, rowCnt, columnCnt);
		dtm = new DefaultTableModel(fieldValue, columnName);
		jt.setModel(dtm);		
		this.jtableRender();
		
		return;
	}
	
	// 작성자 검색
	public void hboardSelectWriter(String searchStr) {
		System.out.println("HbeBoardrAll hboardSelectWriter() 함수 진입 >>> : ");
		
		HbeBoardService hs = new HbeBoardServiceImpl();	
		HbeBoardVO hvo = null;
		hvo = new HbeBoardVO();
		hvo.setBwriter(searchStr);
		ArrayList<HbeBoardVO> aList =  hs.hboardSelectWriter(hvo);
	
		int columnCnt = columnName.length;
		int rowCnt = aList.size();
		System.out.println("게시판 작성자 검색 :: rowCnt >>> : " + rowCnt);
		
		this.jtablePrint(aList, rowCnt, columnCnt);
		dtm = new DefaultTableModel(fieldValue, columnName);
		jt.setModel(dtm);		
		this.jtableRender();
		
		return;
	}
	
	// JTable 프린트 
	public void jtablePrint(ArrayList<HbeBoardVO> aList, int rowCnt, int columnCnt) {
		System.out.println("HbeBoardrAll jtablePrint() 함수 진입 >>> : ");
		
		fieldValue = new Object[rowCnt][columnCnt];

		for (int i=0; i < rowCnt; i++ ){
			
			HbeBoardVO _hvo = aList.get(i);
			fieldValue[i][0] = _hvo.getBnum();
			fieldValue[i][1] = _hvo.getBsubject();
			fieldValue[i][2] = _hvo.getBwriter();
			fieldValue[i][3] = _hvo.getBpw();
			fieldValue[i][4] = _hvo.getBcontents();
			fieldValue[i][5] = _hvo.getDeleteyn();
			fieldValue[i][6] = _hvo.getInsertdate();
			fieldValue[i][7] = _hvo.getUpdatedate();	
		}
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
			if ("글제목".equals(comboStr)){
				jtR.setVisible(true);
				jtR.setText("");
			}
			if ("작성자".equals(comboStr)){
				jtR.setVisible(true);
				jtR.setText("");
			}
		}
		
		// 조회 버튼 이벤트 
		if (jbR == e.getSource()) {
			String searchStr = jtR.getText();

			if ("전체".equals(comboStr)){
				System.out.println("searchStr >>> : " + searchStr);
				
				this.hboardSelectAll();	
			}
			if ("글제목".equals(comboStr)){				
				
				if (searchStr !=null && searchStr.length() > 0) {				
					System.out.println("글제목 :: searchStr >>> : " + searchStr);
					
					this.hboardSelectSubject(searchStr);	
				}else {
					JOptionPane.showMessageDialog(this, "검색 조건 글제목을 입력하세요 >>> :  ");
				}
			}
			if ("작성자".equals(comboStr)){
				
				if (searchStr !=null && searchStr.length() > 0) {				
					System.out.println("작성자 :: searchStr >>> : " + searchStr);
					
					this.hboardSelectWriter(searchStr);	
				}else {
					JOptionPane.showMessageDialog(this, "검색 조건 작성자를 입력하세요 >>> :  ");
				}
			}
		}
		
		// 버튼 
		if (jtBtn[0] == e.getSource()) {
			System.out.println("글 작성하기  >>> : ");
			new HbeBoard();
		}	
		if (jtBtn[1] == e.getSource()) {
			System.out.println("글 목록보기 >>> : ");
			
			jcR.setSelectedIndex(0);
			this.hboardSelectAll();
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HbeBoardrAll.getInstance();
	}
}
