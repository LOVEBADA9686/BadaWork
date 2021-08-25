package a.b.c.test;

import java.awt.CardLayout;
import java.awt.GridLayout;
import java.awt.Container;
import java.awt.Color;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;


public class CardLayoutTest_1 extends JFrame implements ActionListener
{
	JPanel jp  = null;
	Cards card = null;

	public CardLayoutTest_1()
	{
		super("CardLayoutTest");
		setSize(400, 200);
		setDefaultCloseOperation(this.EXIT_ON_CLOSE);

		jp = new JPanel(new GridLayout(0, 5, 10, 10));
		addButton("<<", jp);
		addButton("<", jp);
		addButton(">", jp);
		addButton(">>", jp);
		addButton("종료", jp);

		card = new Cards();

		getContentPane().add(jp, "North");
		getContentPane().add(card, "Center");		
		
		setVisible(true);
	}

	void addButton(String str, Container target)
	{
		JButton jb = new JButton(str);
		jb.addActionListener(this);
		target.add(jb);
	}

	private class Cards extends JPanel
	{
		CardLayout cl = null;

		public Cards()
		{
			cl = new CardLayout();
			setLayout(cl);
			
			for (int i=0; i <= 10; i++)
			{
				JButton jb1 = new JButton();
				jb1.setText("현재 카드의 번호는 " + i + " 입니다.");
							
				
//				if (i == 0)jb1.setBackground(Color.yellow);
//				if (i == 1)jb1.setBackground(Color.blue);
//				if (i == 2)jb1.setBackground(Color.cyan);
//				if (i == 3)jb1.setBackground(Color.DARK_GRAY);
//				if (i == 4)jb1.setBackground(Color.GREEN);
//				if (i == 5)jb1.setBackground(Color.LIGHT_GRAY);
//				if (i == 6)jb1.setBackground(Color.MAGENTA);
//				if (i == 7)jb1.setBackground(Color.ORANGE);
//				if (i == 8)jb1.setBackground(Color.pink);				
//				if (i == 9)jb1.setBackground(Color.red);
//				if (i == 10)jb1.setBackground(Color.black);	
				
				Color[] color = {Color.yellow, Color.blue, Color.cyan,
								 Color.DARK_GRAY, Color.GREEN, Color.LIGHT_GRAY,
								 Color.MAGENTA, Color.ORANGE, Color.pink,
								 Color.red, Color.black};

				jb1.setBackground(color[i]);

				add(jb1, "Center");
			}
		}
	}

	public void actionPerformed(ActionEvent e)
	{
		if ("종료".equals(e.getActionCommand()))
		{
			setVisible(false);
			dispose();
			System.exit(0);
		}
		else if ("<<".equals(e.getActionCommand()))
		{
			card.cl.first(card);
		}
		else if ("<".equals(e.getActionCommand()))
		{
			card.cl.previous(card);
		}
		else if (">".equals(e.getActionCommand()))
		{
			card.cl.next(card);
		}
		else if (">>".equals(e.getActionCommand()))
		{
			card.cl.last(card);
		}
	}
	
	
	public static void main(String args[])
	{
		new CardLayoutTest_1();
	}
}
