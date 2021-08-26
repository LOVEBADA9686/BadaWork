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
	
	// ������ 
	@SuppressWarnings("unchecked")
	public HbeMemberAll() {
		this.setTitle("ȸ���˻��ϱ�");
		this.getContentPane().setLayout(new BorderLayout(10, 10));

		jpR = new JPanel[3];
		jlR = new JLabel("��ȸ����");
		jlR.setHorizontalAlignment(SwingConstants.CENTER);

		jcR = new JComboBox<String>(CodeUtil.combo_cpation);
		jcR.setSelectedIndex(0);
		jcR.addActionListener(this);

		jtR = new JTextField();
		jtR.setVisible(false);
		jbR = new JButton("��ȸ");
		jbR.addActionListener(this);

		for (int i=0; i < jpR.length; i++ ){
			jpR[i] = new JPanel();
			jpR[i].setLayout(new BorderLayout());
		}
		
//################################################
		// JTable ���̴� ��Ģ 
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
		
		// JFrame Ŭ�ο��� 
		this.addWindowListener(new WindowAdapter() { 
			public void windowClosing(WindowEvent e) { 
				e.getWindow().setVisible(false);
				e.getWindow().dispose();
			}
		});
	}
	
	public void jtableRender() {
//		################################# ���� 	
		// �÷� ������ ����
		jt.getColumn("ȸ���̸�").setPreferredWidth(30);
		jt.getColumn("���̵�").setPreferredWidth(30);
		jt.getColumn("�н�����").setPreferredWidth(30);
		jt.getColumn("����").setPreferredWidth(30);
		jt.getColumn("���").setPreferredWidth(30);
		jt.getColumn("����").setPreferredWidth(30);
		jt.getColumn("Ư��").setPreferredWidth(30);
		jt.getColumn("����").setPreferredWidth(30);
		jt.getColumn("Y/N").setPreferredWidth(10);
		jt.getColumn("����/����").setPreferredWidth(60);		
		// �� ��� ����
		DefaultTableCellRenderer tScheduleCellRenderer = new DefaultTableCellRenderer();
		tScheduleCellRenderer.setHorizontalAlignment(SwingConstants.CENTER);
		TableColumnModel tcmSchedule = jt.getColumnModel();
		for (int i = 0; i < tcmSchedule.getColumnCount(); i++) {
			tcmSchedule.getColumn(i).setCellRenderer(tScheduleCellRenderer);
		}				
		// ���̺��� ��ũ���������� ũ�� �����ϱ� 
		jsPain.setPreferredSize(new Dimension(1600, 400));
//		################################# ��		
		
		// ����/���� ��ư ���̱�
		jt.getColumnModel().getColumn(17).setCellRenderer(new TableCell());
		jt.getColumnModel().getColumn(17).setCellEditor(new TableCell());
	}

	
//################################# ���� 
	// ����/���� ��ư ���̱�
	class TableCell extends AbstractCellEditor implements TableCellEditor, TableCellRenderer,  ActionListener{		
		private static final long serialVersionUID = 1L;
		
		JButton jb;
		
		// ������ 
		public TableCell(){			
		
			jb = new JButton("����/����");			
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
			System.out.println("TableCell actionPerformed() �Լ� ���� >>> : ");
			
			if (jb == e.getSource()) {
				String hnum = String.valueOf(jt.getValueAt(jt.getSelectedRow(), 0));
				System.out.println("hnum >>> : " + hnum);
				HbeMemberUpdate hmu = new HbeMemberUpdate();
				hmu.hmemSelect(hnum);
			}
		}
	} // end of TableCell 	
//################################# ��	

	// JTable ����Ʈ 
	public void jtablePrint(ArrayList<HbeMemberVO> aList, int rowCnt, int columnCnt) {
		System.out.println("HbeMemberAll jtablePrint() �Լ� ���� >>> : ");
		
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
		
	// ȸ�� ��ü �˻�
	public void hmemSelectAll() {
		System.out.println("HbeMemberAll hmemSelectAll() �Լ� ���� >>> : ");
		
		HbeMemberService hms = new HbeMemberServiceImpl();
		ArrayList<HbeMemberVO> aList =  hms.hmemSelectAll();
	
		int columnCnt = columnName.length;
		int rowCnt = aList.size();
		System.out.println("��ü��ȸ :: rowCnt >>> : " + rowCnt);	
		
		this.jtablePrint(aList,rowCnt, columnCnt);		
		
		dtm = new DefaultTableModel(fieldValue, columnName);
		jt.setModel(dtm);		
		this.jtableRender();
		
		return;
	}
	
	// ȸ�� �̸� �˻�
	public void hmemSelectName(String searchStr) {
		System.out.println("HbeMemberAll hmemSelectName() �Լ� ���� >>> : ");
		
		HbeMemberService hms = new HbeMemberServiceImpl();
		HbeMemberVO hvo = null;
		hvo = new HbeMemberVO();
		hvo.setHname(searchStr);
		ArrayList<HbeMemberVO> aList =  hms.hmemSelectName(hvo);
	
		int columnCnt = columnName.length;
		int rowCnt = aList.size();
		System.out.println("ȸ���̸� ��ȸ :: rowCnt >>> : " + rowCnt);	
		
		this.jtablePrint(aList, rowCnt, columnCnt);		
		
		dtm = new DefaultTableModel(fieldValue, columnName);
		jt.setModel(dtm);		
		this.jtableRender();
		
		return;
	}
	
	// ȸ�� ���̵� �˻�
	public void hmemSelectId(String searchStr) {
		System.out.println("HbeMemberAll hmemSelectId() �Լ� ���� >>> : ");
		
		HbeMemberService hms = new HbeMemberServiceImpl();
		HbeMemberVO hvo = null;
		hvo = new HbeMemberVO();
		hvo.setHid(searchStr);
		ArrayList<HbeMemberVO> aList =  hms.hmemSelectId(hvo);
	
		int columnCnt = columnName.length;
		int rowCnt = aList.size();
		System.out.println("ȸ�����̵� ��ȸ :: rowCnt >>> : " + rowCnt);	
		
		this.jtablePrint(aList, rowCnt, columnCnt);		
		
		dtm = new DefaultTableModel(fieldValue, columnName);
		jt.setModel(dtm);		
		this.jtableRender();
		
		return;	
	}	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
		// ComboBox �̺�Ʈ ó��
		if (jcR == e.getSource()) {
			comboStr = (String)jcR.getSelectedItem();
			if ("��ü".equals(comboStr)){
				jtR.setVisible(false);				
			}
			if ("���̵�".equals(comboStr)){
				jtR.setVisible(true);
				jtR.setText("");
			}
			if ("�̸�".equals(comboStr)){
				jtR.setVisible(true);
				jtR.setText("");
			}
		}
		
		// ��ȸ ��ư �̺�Ʈ 
		if (jbR == e.getSource()) {
			String searchStr = jtR.getText();
			
			if ("��ü".equals(comboStr)){
				System.out.println("searchStr >>> : " + searchStr);
				
				this.hmemSelectAll();
			}			
			
			if ("�̸�".equals(comboStr)){				
				
				if (searchStr !=null && searchStr.length() > 0) {				
					System.out.println("�̸� :: searchStr >>> : " + searchStr);
					
					this.hmemSelectName(searchStr);	
				}else {
					JOptionPane.showMessageDialog(this, "�˻� ���� �̸��� �Է��ϼ��� >>> :  ");
				}
			}
			if ("���̵�".equals(comboStr)){
				
				if (searchStr !=null && searchStr.length() > 0) {
					System.out.println("���̵� :: searchStr >>> : " + searchStr);
					
					this.hmemSelectId(searchStr);
				}else {
					JOptionPane.showMessageDialog(this, "�˻� ���� ���̵� �Է��ϼ��� >>> :  ");
				}				
			}
		}
		
		// ��ư 
		if (jtBtn[0] == e.getSource()) {
			System.out.println("ȸ�� �����ϱ� >>> : ");
			this.setVisible(false);
			this.dispose();
			new HbeMember();
		}	
		if (jtBtn[1] == e.getSource()) {
			System.out.println("ȸ�� ��Ϻ��� >>> : ");
		}
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new HbeMemberAll();
	}
}
