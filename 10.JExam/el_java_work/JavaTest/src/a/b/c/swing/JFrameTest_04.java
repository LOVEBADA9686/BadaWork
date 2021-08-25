package a.b.c.swing;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameTest_04 extends JFrame{
	
	// 생성자
	public JFrameTest_04(String title) {
		super(title);
		
		// getLayout() LayoutManager - Container
		// JFrame 디폴트 레이아웃 매니저는 보더레이아웃이다. : java.awt.BorderLayout
		System.out.println("getLayout() >>> : " + getLayout());
		
		JPanel jp = new JPanel();
		// JPanel 디폴르 레이아웃 매니저는 플로우 레이아웃이다. java.awt.FlowLayout
		System.out.println("jp.getLayout() >>> : " + jp.getLayout());		
		jp.setBackground(Color.red);
		
		JButton jb1 = new JButton("Button1");
		JButton jb2 = new JButton("Button2");
		JButton jb3 = new JButton("Button3");
		JButton jb4 = new JButton("Button4");
		JButton jb5 = new JButton("Button5");

		// 제이판넬에 제이버튼을 붙이는 것 
		jp.add(jb1);
		jp.add(jb2);
		jp.add(jb3);
		jp.add(jb4);
		jp.add(jb5);
		
		// 제이프레임에 제이판넬을 붙이는 것 
		// 제이프레임의 디폴트 레이아웃매니저인 보더레이아웃의 센터영역이 적용된다.
		add(jp);
		
		setSize(600, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setVisible(true);		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrameTest_04 jf3 = new JFrameTest_04("JFrame");
		
	}
}
