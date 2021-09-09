package a.b.c.kosmo.util.notepad;
//USER�� ���ÿ� ���� ���ϴ� �κ��� FontStyle�� �ٲٴ� Ŭ����

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.event.*;
import javax.swing.border.*;

public class ChangeFont extends JDialog implements ListSelectionListener, ActionListener{
	JPanel						pa1, pa2, pa3, pa4, pa5;
	JList							listF, listS;
	JTextField					textF, textS;
	JScrollPane				scrollF, scrollS;
	JButton						but1, but2, but3;
	JCheckBox					boldCB, italicCB;
	Object						obj1, obj2;

	GraphicsEnvironment	ge;
	String[]						fontNames;
	String[]						fontSizes;

	public ChangeFont(){
		//JDialog�� �������� �������� true�� ����� ������ �ִ� ������,
		//��Ʈ�ٲٱ� â�� �߸�, �θ�â�� JEditor�� Ŭ���� �Ұ��ϴ�.
		super(new JEditor(), "��Ʈ�ٲٱ�", true);

		pa1 = new JPanel();
		pa2 = new JPanel();
		pa3 = new JPanel();
		pa4 = new JPanel();
		pa5 = new JPanel();
		textF = new JTextField(" ", 20);
		textS = new JTextField(" " ,20);

		but1 = new JButton("Ȯ��");
		but2 = new JButton("���");
		but3 = new JButton("����");
		boldCB = new JCheckBox();
		italicCB = new JCheckBox();

		boldCB.setText("<html><body><p><B>BOLD</B></P></body></html>");
		italicCB.setText("<html><body><p><i>ITALIC</i></P></body></html>");

		//���� ������ ��� ������ ��Ʈ �̸��� ����Ʈ�� ���� ���� GraphicsEnvironment�� �����Ѵ�.
		//���ϵǴ� ���� OS�� ��ſ� ���� String �迭���̴�.
		ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
		fontNames = ge.getAvailableFontFamilyNames();
		fontSizes = new String[]{"8", "9", "10", "11", "12", "14", "16", "18", "20", "22", "24", "26", "28", "36", "48", "72"};

		listF = new JList(fontNames);
		listS = new JList(fontSizes);
		//JList���� ó���� ���̴� ����� ������ �ش�.
		listF.setVisibleRowCount(4);
		listS.setVisibleRowCount(4);

		//JList�� JScrollPane�� �ٿ�, JScrollPane�� �ٿ��� ��ũ���� ���´�.
		scrollF = new JScrollPane(listF);
		scrollS = new JScrollPane(listS);

		//�� ���� �ǳڿ� border�� �����Ѵ�.
		pa1.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.RAISED), "Name"));
		pa2.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.RAISED), "Size"));
		pa3.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.RAISED), "Style"));

		display();
	}
	   
	public void display(){
		pa1.setLayout(new BorderLayout());
		pa2.setLayout(new BorderLayout());
		pa1.add(textF, "North");
		pa1.add(scrollF, "Center");
		pa2.add(textS, "North");
		pa2.add(scrollS, "Center");
		pa3.add(boldCB);
		pa3.add(italicCB);
		pa4.add(but1);
		pa4.add(but2);
		pa4.add(but3);
		pa5.setLayout(new BorderLayout());
		pa5.add(pa3, "North");
		pa5.add(pa4, "South");
		getContentPane().add(pa1, "West");
		getContentPane().add(pa2, "East");
		getContentPane().add(pa5, "South");

		listF.addListSelectionListener(this);
		listS.addListSelectionListener(this);
		but1.addActionListener(this);
		but2.addActionListener(this);
		but3.addActionListener(this);

		Dimension dim = getToolkit().getScreenSize();
		setLocation(dim.width/2 - 240, dim.height/2 - 130);

		setSize(480, 260);
		setVisible(true);
		setResizable(false);						   

		//�������� X��ư�� ������ â�� ����ǵ��� �Ѵ�.
		this.setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
	}

	//��Ʈ�� ����� �����ϸ� TextField�� ���ó����� ������
	//
	public void valueChanged(ListSelectionEvent e){
		if(e.getSource() == listF){
			obj1 = listF.getSelectedValue();	
			if(obj1 != null)
				textF.setText(obj1.toString());
		}else if(e.getSource() == listS){
			obj2 = listS.getSelectedValue();
			if(obj2 != null)
				textS.setText(obj2.toString());
		}		
	}

	//��Ʈ ���� ��ư�� ������ ListSelectionListener�� ���� ���ð��� JTextField�� �������� �Ѵ�.
	public void actionPerformed(ActionEvent e){
		//���� TextArea ������ ��Ʈ�̸��� ũ�⸦ �����´�.
		Font f = JEditor.ta.getFont();
		String defaultName = f.getFontName();
		int defaultSize = f.getSize();

		//Font �������� ���ð��� ������, ���� Default���� �־��ش�.
		//����ڰ� ��Ʈ�̸�, ����� ���� �� ���� ���, Default���� �Ѱ� �־��
		//NullPointException�� �߻����� �ʴ´�.
		if(obj1 == null)
			obj1 =defaultName;
		if(obj2 == null)
			obj2=new Integer(defaultSize);

		if(e.getSource() == but1){
			fontChange();
			dispose();
			setVisible(false);
		}else if(e.getSource() == but2){
			dispose();
			setVisible(false);			
		}else if(e.getSource() == but3){
			fontChange();
		}
	}

	//��Ʈ ��Ÿ���� üũ ���ο� ���� �ؽ�Ʈ�� �����Ѵ�.
	//����� Bold�� Italic�ۿ� ���� ������ �̷��� �ϳ�, �׸��� �� ���� ��� �ٸ� �ڵ尡 �ʿ��ϴ�.
	public void fontChange(){
		if(boldCB.isSelected() && italicCB.isSelected()){
			JEditor.ta.setFont(new Font(obj1.toString(), Font.BOLD | Font.ITALIC, Integer.parseInt(obj2.toString())));
		}else if(boldCB.isSelected() && !(italicCB.isSelected())){
			JEditor.ta.setFont(new Font(obj1.toString(), Font.BOLD, Integer.parseInt(obj2.toString())));				
		}else if(italicCB.isSelected() && !(boldCB.isSelected())){
			JEditor.ta.setFont(new Font(obj1.toString(), Font.ITALIC, Integer.parseInt(obj2.toString())));	
		}else{
			JEditor.ta.setFont(new Font(obj1.toString(), Font.PLAIN, Integer.parseInt(obj2.toString())));					
		}
	}
}
