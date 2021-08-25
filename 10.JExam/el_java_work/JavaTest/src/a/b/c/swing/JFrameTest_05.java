package a.b.c.swing;

import java.awt.Color;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class JFrameTest_05 extends JFrame{
	
	// 생성자
	public JFrameTest_05(String title) {
		super(title);
		
		// getLayout() LayoutManager - Container
		// JFrame 디폴트 레이아웃 매니저는 보더레이아웃이다. : java.awt.BorderLayout
		System.out.println("getLayout() >>> : " + getLayout());			
				
		// 제이프레임의 디폴트 레이아웃 매니저 보더레이아웃을 
		// 그리드 레이아웃 매니저로 세팅하시오 
		setLayout(new GridLayout(3, 2)); // rows 행 * cols 열
		
		JLabel jb1 = new JLabel("라벨 1");
		JTextField jt1 = new JTextField();
		JLabel jb2 = new JLabel("라벨 2");
		JTextField jt2= new JTextField();
		JLabel jb3 = new JLabel("라벨3");
		JTextField jt3 = new JTextField();
		
		add(jb1);
		add(jt1);
		add(jb2);
		add(jt2);
		add(jb3);
		add(jt3);
		
		setSize(300, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setVisible(true);		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrameTest_05 jf3 = new JFrameTest_05("JFrame");
		
	}
}
