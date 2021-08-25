package a.b.c.swing;

import javax.swing.JFrame;

public class JFrameTest_01 extends JFrame{
	
	// 생성자
	public JFrameTest_01(String title) {
		super(title);
		
		// GUI 어플리케이션에서 
		// 화면을 그리는 행위는 맨 먼저 일어나야 한다. 
		// 생성자에서 화면을 그리는 행위를 한다. 
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setVisible(true);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new JFrameTest_01("JFrame 상속해서 사용하기 ");
	}
}
