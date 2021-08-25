package a.b.c.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class JFrameTest_10 extends JFrame {
	
	private JButton jbt;
	private JLabel jlb;
	
	// 생성자
	public JFrameTest_10() {
		
		this.setTitle("이벤트 해보기");
		
		JPanel jp = new JPanel();
				
		jbt = new JButton("버튼을 누르시오 >>> :");
		jlb = new JLabel("아직 버튼이 눌려지지 않았습니다.");
		
		// 무명 클래스, 익명 클래스, 어노니마우스 클래스  사용하기 
		jbt.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				if (e.getSource() == jbt) {
					jlb.setText("마침내 버튼이 눌렸습니다. >>> : ");	
				}		
			}			
		});
		
		jp.add(jbt);
		jp.add(jlb);
				
		this.add(jp);
		
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setVisible(true);		
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		new JFrameTest_10();		
	}
}


