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

public class CardLayoutTest_2 extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	
	private Container c;	
	private JButton jb[];		
	JPanel card1;
	JPanel card2;
	JPanel card3;
	
	private CardLayout card;
	
	public CardLayoutTest_2() {
		this.setTitle("ī�巹�̾ƿ� �׽�Ʈ");
		this.setLayout(new FlowLayout());
		
		c = getContentPane();	
		card = new CardLayout();
		c.setLayout(card);
		
		card1 = new JPanel();
        card1.setBackground(Color.lightGray);
        card1.add(new JLabel("Card 1"));
        card2 = new JPanel();
        card2.add(new JLabel("Card 2"));
        card2.setBackground(Color.orange);
        card3 = new JPanel();
        card3.add(new JLabel("Card 3"));
        card3.setBackground(Color.cyan);
		
		jb = new JButton[3];
		jb[0] = new JButton("���");
		jb[1] = new JButton("��");
		jb[2] = new JButton("�ٳ���");
	
		jb[0].addActionListener(this);
		jb[1].addActionListener(this);
		jb[2].addActionListener(this);
		
		card1.add(jb[0]);
		card2.add(jb[1]);
		card3.add(jb[2]);
		
		this.add(card1, "1");
		this.add(card2, "2");
		this.add(card3, "3");
		
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
		
		if ("���".equals(jbCaption)){
		
		}
		if ("��".equals(jbCaption)){
		
		}
		if ("�ٳ���".equals(jbCaption)){
			
		}
		card.next(c);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new CardLayoutTest_2();
	}


}
