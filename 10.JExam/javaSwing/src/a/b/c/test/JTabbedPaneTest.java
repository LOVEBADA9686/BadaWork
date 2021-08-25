package a.b.c.test;

import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class JTabbedPaneTest extends JFrame{
	
	private static final long serialVersionUID = 1L;
	
	private JTabbedPane jtp;
	private Pane_1  pa1;
	private Pane_2  pa2;
	private Pane_3  pa3;
	private Pane_4  pa4;
	
	public JTabbedPaneTest() {
		this.setTitle("ÅÇÆäÀÎ Å×½ºÆ®");
		
		jtp = new JTabbedPane();
		pa1 = new Pane_1();
		pa2 = new Pane_2();
		pa3 = new Pane_3();
		pa4 = new Pane_4();
		
		// ÅÇÃß°¡
		jtp.addTab("ÅÇ_1", pa1);
		jtp.addTab("ÅÇ_2", pa2);
		jtp.addTab("ÅÇ_3", pa3);
		jtp.addTab("ÅÇ_4", pa4);
		
		this.getContentPane().add(jtp);
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(100, 100, 400, 500);
		this.setResizable(false);
		this.setVisible(true);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new JTabbedPaneTest();
	}

}
