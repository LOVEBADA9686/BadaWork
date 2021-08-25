package a.b.c.swing;

import javax.swing.JFrame;

public class JFrameTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame jf = new JFrame("첫번째 JFrame");
		System.out.println("jf 참조변수 >>> : " + jf);
		
		// JFrame 의 크기 
		// jf.setSize(폭, 높이)
//		jf.setSize(width, height); void - Window
		jf.setSize(600, 500);
		
		// JFrame 죽이기 
		// JFraem 우측상단에 맨 끝쪽에 있는 x 버튼을 클릭하면 JFrame을 죽이세요 
//		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  void - Window
		
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		
		// JFrame 윈도우 화면에 보여주세요 : true, 안보여주세요 : false 
		// 단 메모리에 있는상태로 
//		jf.setVisible(true);void - Window
		jf.setVisible(true);
	}

}
