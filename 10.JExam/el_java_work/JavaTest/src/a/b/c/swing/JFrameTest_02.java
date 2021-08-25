package a.b.c.swing;

import javax.swing.JFrame;

public class JFrameTest_02 extends JFrame{
	
	// 생성자
	public JFrameTest_02(String title) {
		super(title);
		
		// 화면이 복잡하고 소스 길이가 길면 함수 또는 클래스로 분기해서 사용한다. 
		display();
	}
	
	public void display() {
		
		// 화면이 복잡하면 함수로 빼서 만들어도 된다. 
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setVisible(true);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new JFrameTest_02("JFrame 상속해서 사용하기 ");
	}
}
