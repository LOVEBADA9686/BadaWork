package a.b.c.test;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;
import javax.swing.border.EmptyBorder;

public class CardLayoutTest_0 extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	
	private JPanel  contentPane;
	JPanel  jp;
	private JButton jb[];
	private Pane_1  pa1;
	private Pane_2  pa2;
	private Pane_3  pa3;
	private Pane_4  pa4;
	
	private CardLayout cls;
	
	public CardLayoutTest_0() {
		this.setTitle("카드레이아웃 테스트");
		
		cls = new CardLayout();
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setContentPane(contentPane);
		contentPane.setLayout(null);
		
		jp = new JPanel();
		jp.setLayout(cls);
		pa1 = new Pane_1();
		pa2 = new Pane_2();
		
		jp.add("Pane_1", pa1);
		jp.add("Pane_2", pa2);
		cls.show(jp,"Pane_1");
		
		jp.setBounds(12, 55, 448, 392);
		contentPane.add(jp);
		
		jb = new JButton[2];
		jb[0] = new JButton("버튼1");
		jb[0].setBounds(12, 10, 97, 35);
		contentPane.add(jb[0]);
		
		jb[1] = new JButton("버튼2");
		jb[1].setBounds(121, 10, 97, 35);
		contentPane.add(jb[1]);
		
		jb[0].addActionListener(this);
		jb[1].addActionListener(this);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 488, 495);
		this.setResizable(false);
		this.setVisible(true);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		
		if (jb[0] == obj){
			cls.show(jp,"Pane_2");
		}
		if (jb[1] == obj){
			cls.show(jp,"Pane_1");
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CardLayoutTest_0();
	}


}
