package a.b.c.test;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class CardLayoutTest_3 extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	
	private Container c;
	
	private JButton jb[];	
	private Pane_1  pa1;
	private Pane_2  pa2;
	private Pane_3  pa3;
	private Pane_4  pa4;
	
	private CardLayout card;
	
	public CardLayoutTest_3() {
		this.setTitle("카드레이아웃 테스트");
		this.setLayout(new FlowLayout());
		
		c = getContentPane();	
		card = new CardLayout();
		c.setLayout(card);
		
		pa1 = new Pane_1();		
		pa1.setBackground(Color.lightGray);
		pa1.add(new JLabel("Card 1"));
		pa2 = new Pane_2();		
		pa2.add(new JLabel("Card 2"));
		pa2.setBackground(Color.orange);
		pa3 = new Pane_3();	
		pa3.add(new JLabel("Card 3"));
		pa3.setBackground(Color.cyan);
		
		jb = new JButton[3];
		jb[0] = new JButton("사과");
		jb[1] = new JButton("배");
		jb[2] = new JButton("바나나");
	
		jb[0].addActionListener(this);
		jb[1].addActionListener(this);
		jb[2].addActionListener(this);
		
		pa1.add(jb[0]);
		pa2.add(jb[1]);
		pa3.add(jb[2]);
		
		this.add(pa1, "1");
		this.add(pa2, "2");
		this.add(pa3, "3");
			
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 488, 495);
		this.setResizable(false);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		String jbCaption = e.getActionCommand();
		
		if ("사과".equals(jbCaption)){
			card.show(c, "3");
		}
		if ("배".equals(jbCaption)){
			card.show(c, "1");
		}
		if ("바나나".equals(jbCaption)){
			card.show(c, "2");
		}
//		card.show(c, "1");
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CardLayoutTest_3();
	}


}
