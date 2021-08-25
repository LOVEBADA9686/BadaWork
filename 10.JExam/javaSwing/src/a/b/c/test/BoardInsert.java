package a.b.c.test;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class BoardInsert extends JFrame implements ActionListener{

	private static final long serialVersionUID = 1L;
	
	JPanel     jp[];
	JLabel     jl[];
	JTextField jt[];
	JTextArea  jta;
	JButton    jb[];
	
	String[] jlLabel = {"글번호", "글제목", "비밀번호", "내용"};
	String[] jbtCaption = {"등록", "다시"};
	
	public BoardInsert() {
		this.setTitle("등록::다시");
		this.setLayout(new BorderLayout(5, 5));
		
		jp = new JPanel[3];
		for (int i=0; i < jp.length; i++) {
			jp[i] = new JPanel();
		}
		
		jp[1].setLayout(null);
		jp[1].setLayout(new GridLayout(3, 2));
		
		jl = new JLabel[4];
		jt = new JTextField[4];
		for (int i=0; i < jl.length; i++) {
		
			jl[i] = new JLabel(jlLabel[i]);
			jl[i].setHorizontalAlignment(JLabel.CENTER);
			jt[i] = new JTextField(20);			
			jp[1].add(jl[i]);
			jp[1].add(jt[i]);
		}
		
		JLabel jla = new JLabel("게시판");
		jla.setOpaque(true);
		jla.setHorizontalAlignment(JLabel.CENTER);
		jp[0].add(jla);
		
		
		jp[1].setLayout(null);
		jp[1].setLayout(new GridLayout(4, 2, 5, 5));
		
		jb = new JButton[2];
		for (int i=0; i < jb.length; i++) {
			jb[i] = new JButton(jbtCaption[i]);
			jb[i].addActionListener(this);
			jp[2].add(jb[i]);
		}
		
		jt[0].setEditable(false);
		this.getContentPane().add(jp[0], BorderLayout.NORTH);
		this.getContentPane().add(jp[1], BorderLayout.CENTER);
		this.getContentPane().add(jp[2], BorderLayout.SOUTH);

//		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		this.setLocationRelativeTo(null);
		this.setSize(300, 250);
		this.setResizable(false);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new BoardInsert();
	}
}