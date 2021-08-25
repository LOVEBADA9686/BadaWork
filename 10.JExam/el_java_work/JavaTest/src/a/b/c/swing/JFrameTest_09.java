package a.b.c.swing;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFrameTest_09 extends JFrame implements ActionListener{
	
	private JButton jbt;
	
	// 생성자
	public JFrameTest_09() {
		
		this.setTitle("이벤트 해보기");		
		this.setLayout(new FlowLayout());
		
		jbt = new JButton("버튼을 누르시오 >>> :");
		
		// 현재 객체를 리스너로 등록
		jbt.addActionListener(this);
		
		this.add(jbt);
		
		this.setSize(300, 200);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		this.setVisible(true);		
	}
	
	// 현재 객체 사용하기
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource() == jbt) {
			jbt.setText("마침내 버튼이 눌렸습니다. >>> : ");	
		}	
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub		
		new JFrameTest_09();		
	}
}


