package a.b.c.swing;

import javax.swing.JFrame;

public class JFrameTest_02 extends JFrame{
	
	// ������
	public JFrameTest_02(String title) {
		super(title);
		
		// ȭ���� �����ϰ� �ҽ� ���̰� ��� �Լ� �Ǵ� Ŭ������ �б��ؼ� ����Ѵ�. 
		display();
	}
	
	public void display() {
		
		// ȭ���� �����ϸ� �Լ��� ���� ���� �ȴ�. 
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setVisible(true);
	}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new JFrameTest_02("JFrame ����ؼ� ����ϱ� ");
	}
}
