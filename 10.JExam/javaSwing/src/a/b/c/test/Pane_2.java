package a.b.c.test;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class Pane_2 extends JPanel implements ActionListener{

	private static final long serialVersionUID = 1L;

	JButton jb;
	public Pane_2() {
		
		this.setBackground(Color.BLUE);
		jb = new JButton("Pane_2 ��ư");
		jb.addActionListener(this);
		this.add(jb);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		String jbCaption = e.getActionCommand();
		
		if (jb == obj) {
			System.out.println("jbCaption Ŭ�� >>> : " + jbCaption);
		}
	}
}
