package a.b.c.swing;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameTest_06 extends JFrame{
	
	// 생성자
	public JFrameTest_06(String title) {
		super(title);
				
		// JFrame 디폴트 레이아웃 매니저는 보더레이아웃이다. : java.awt.BorderLayout
		System.out.println("getLayout() >>> : " + getLayout());			
				
		JPanel jp = new JPanel();
		// JPanel 디폴르 레이아웃 매니저는 플로우 레이아웃이다. java.awt.FlowLayout
		System.out.println("jp.getLayout() >>> : " + jp.getLayout());		
		jp.setLayout(null);
		System.out.println("jp.setLayout(null) :: jp.getLayout() >>> : " + jp.getLayout());
		
		JButton jb1 = new JButton("Button1");
		JButton jb2 = new JButton("Button2");
		JButton jb3 = new JButton("Button3");
		JButton jb4 = new JButton("Button4");
				
		jp.add(jb1);		
		jp.add(jb2);		
		jp.add(jb3);
		jp.add(jb4);
		
		// jb1.setBounds(x, y, width, height);
		jb1.setBounds(20, 5, 95, 30); //  위치(20, 5)에 폭 95, 높이 30
		jb2.setBounds(55, 45, 105, 70);
		jb3.setBounds(180, 15, 105, 90);
		
//		jb4.setLocation(x, y); // 위치
//		jb4.setSize(width, height); // 폭 , 높이
		// setBouds(x, y, width, height) = setLocation(x, y) + setSize(width, height)
		jb4.setLocation(300, 200); // 위치
		jb4.setSize(200, 70); // 폭 , 높이
		
		add(jp);
		
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setVisible(true);		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new JFrameTest_06("JFrame");
		
	}
}
