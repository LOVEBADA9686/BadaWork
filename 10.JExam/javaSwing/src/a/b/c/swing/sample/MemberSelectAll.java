package a.b.c.swing.sample;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.AbstractCellEditor;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellEditor;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

public class MemberSelectAll extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	private DefaultTableModel dtm;
	private JTable jt;
	private JScrollPane jsPane;
	private JPanel jp[];
	private JButton jbt[];
	
	private Object[][] row;		 
	private static String col[] = {"회원번호", "회원이름", "아이디", "비밀번호", "Y/N", "등록일", "수정일", "수정/삭제"};	
	private static String btnCaption[] = {"회원가입하기", "목록"};
	
	// 생성자 
	public MemberSelectAll() {
		this.setTitle("회원 목록:::");
		this.setLayout(new BorderLayout(5, 5));
		
		jp = new JPanel[2];
		for (int i=0; i < jp.length; i++) {
			jp[i] = new JPanel();			
		}
		
		jbt = new JButton[2];		
		for (int i=0; i < jbt.length; i++) {
			jbt[i] = new JButton(btnCaption[i]);
			jbt[i].addActionListener(this);
			jp[1].add(jbt[i]);
		}		
			
		this.memberSelectAll();	
		
		dtm = new DefaultTableModel(row, col);		
		jt = new JTable(dtm);
		jsPane = new JScrollPane(jt);
		jp[0].add(jsPane);

//		################################# 시작 	
		// 컬럼 사이즈 조절
		jt.getColumn("Y/N").setPreferredWidth(20);
		jt.getColumn("수정/삭제").setPreferredWidth(60);		
		// 셀 가운데 정렬
		DefaultTableCellRenderer tScheduleCellRenderer = new DefaultTableCellRenderer();
		tScheduleCellRenderer.setHorizontalAlignment(SwingConstants.CENTER);
		TableColumnModel tcmSchedule = jt.getColumnModel();
		for (int i = 0; i < tcmSchedule.getColumnCount(); i++) {
			tcmSchedule.getColumn(i).setCellRenderer(tScheduleCellRenderer);
		}				
		// 테이블을 스크롤페인으로 크기 조절하기 
		jsPane.setPreferredSize(new Dimension(780, 200));
//		################################# 끝
			
		// 수정/삭제 버튼 붙이기
		jt.getColumnModel().getColumn(7).setCellRenderer(new TableCell());
		jt.getColumnModel().getColumn(7).setCellEditor(new TableCell());

		this.getContentPane().add(jp[0], BorderLayout.CENTER);
		this.getContentPane().add(jp[1], BorderLayout.SOUTH);
		
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocation(300, 300);
		this.setSize(800, 300);
		this.setResizable(false);
		this.setVisible(true);
	}

//	################################# 시작 
	// 수정/삭제 버튼 붙이기
	class TableCell extends AbstractCellEditor implements TableCellEditor, TableCellRenderer,  ActionListener{		
		private static final long serialVersionUID = 1L;
		
		JButton jb;
		
		// 생성자 
		public TableCell(){			
			jb = new JButton("수정/삭제");			
//			jc.addActionListener(e -> {
//				System.out.println(jt.getValueAt(jt.getSelectedRow(), 2));
//			});				
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
			
			if (jb == e.getSource()) {
				String knum = String.valueOf(jt.getValueAt(jt.getSelectedRow(), 0));
				MemberUpdate mu = new MemberUpdate();
				mu.memberSelect(knum);				
			}
		}
	} // end of TableCell 	
//	################################# 끝
	
	public void memberSelectAll() {
		System.out.println("MemberSelectAll memberSelectAll() 함수 진입 >>> : ");
		
		MemberDAO mdao = new MemberDAO();
		ArrayList<MemberVO> aList = mdao.memberSelectAll();
		
		int rowCnt = aList.size();
		row = new Object[rowCnt][col.length];
		
		for (int i=0; i < rowCnt; i++) {
			
			MemberVO _mvo = aList.get(i);
			row[i][0] = _mvo.getKnum();
			row[i][1] = _mvo.getKname();
			row[i][2] = _mvo.getKid();
			row[i][3] = _mvo.getKpw();
			row[i][4] = _mvo.getDeleteyn();
			row[i][5] = _mvo.getInsertdate();
			row[i][6] = _mvo.getUpdatedate();
		}
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		String jbCaption = e.getActionCommand();
		
		if (jbt[0] == e.getSource()) {
			System.out.println("MemberSelectAll 회원가입  >>> : " + jbCaption);
			new MemberInsert();
			this.setVisible(false);
			this.dispose();
		}
		if (jbt[1] == e.getSource()) {
			System.out.println("MemberSelectAll 다시 >>> : " + jbCaption);
			this.memberSelectAll();		
		}				
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new MemberSelectAll();
	}
}


