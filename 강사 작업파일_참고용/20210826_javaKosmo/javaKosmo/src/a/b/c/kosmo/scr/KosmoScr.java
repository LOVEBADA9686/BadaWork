package a.b.c.kosmo.scr;

import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;

import a.b.c.kosmo.login.scr.HbeLogin_Panel;
import a.b.c.kosmo.util.calcu.CalculatorGUI;
import a.b.c.kosmo.util.chat.SwingChatClient;
import a.b.c.kosmo.util.chat.SwingChatServer;
import a.b.c.kosmo.util.notepad.JEditor;
import a.b.c.kosmo.util.time.Ex_DigitalClock;

public class KosmoScr extends JFrame implements ActionListener{
	private static final long serialVersionUID = 6514790051744812839L;
	
	private CardLayout 	card;
	private JPanel 		contain;
	private JPanel      jpM;
	private JLabel      jl[];
	private JPanel    	jp[];
	private JButton   	jb[];
	private JButton     jbChat[];
	
	HbeLogin_Panel		hLogin;
	
	private Color[] jpbk_color = {Color.YELLOW,
			                      Color.CYAN, Color.CYAN, Color.CYAN, 
			                      Color.CYAN, Color.CYAN, Color.CYAN,
			                      Color.CYAN, Color.CYAN, Color.CYAN};
	private String[] jp_label = {"�̴��� Ȩ��", 
								 "ȸ�� ����", "ȸ�� ����", "ȸ�� ��ȸ",
					             "�۾��� ���", "�� ����", "�� ��ȸ", 
					             "����", "ä��", "������"};
	private String[] jb_caption = {"Ȩ", 
			                      "ȸ������", "ȸ������", "ȸ����ȸ",
			                      "�۵��", "�ۼ���", "����ȸ", 
			                      "����", "ä��", "������"};
	
	private String[] jbChat_caption = {"���������ϱ�", "���������ϱ�", "ä������"};
	
	private static String IMG_PATH = "C:\\00.KOSMO93\\10.JExam\\el_java_work\\javaKosmo\\src\\img_kosmo";
	
	// ������ 
	public KosmoScr (){
		this.setTitle("KOSMO MAIN");
		
		contain = new JPanel();
		contain.setBorder(new EmptyBorder(5, 5, 5, 5));
		this.setContentPane(contain);
		contain.setLayout(null);
		card = new CardLayout(10, 10);

		jpM = new JPanel();		
		jpM.setLayout(card);	
		
		// Ÿ�̸�
		JPanel jpT = new JPanel();
		jpT.setBackground(Color.YELLOW);
		jpT.setBounds(30, 20, 670, 50);		
		contain.add(jpT);
		
		Ex_DigitalClock edc = new Ex_DigitalClock();
		edc.setBackground(Color.YELLOW);
		jpT.add(edc);
		
		// �ǳ�
		jp = new JPanel[10];
		jl = new JLabel[10];
		for (int i=0; i < jp.length; i++) {
			jp[i] = new JPanel();
			
			// �� 
			jp[i].setLayout(null);
			jl[i] = new JLabel(jp_label[i]);
			jl[i].setBackground(Color.WHITE);	
			jl[i].setBorder(new EtchedBorder());	
			jl[i].setHorizontalAlignment(SwingConstants.CENTER);
			jl[i].setFont(new Font("�������", Font.BOLD, 30));
			jl[i].setBounds(230, 20, 200, 50);
			
			jp[i].add(jl[i]);
			jp[i].setBackground(jpbk_color[i]);	
			jpM.add(jp[i]);
		}
				
		ImageIcon im = new ImageIcon(IMG_PATH + "/" + "1_(3).png" );
		JLabel jlImg = new JLabel(im);
		jlImg.setBackground(Color.WHITE);	
		jlImg.setBorder(new EtchedBorder());	
		jlImg.setHorizontalAlignment(SwingConstants.CENTER);
		jlImg.setFont(new Font("�������", Font.BOLD, 30));
		jlImg.setBounds(180, 90, 290, 260);
		jp[0].add(jlImg);
		

		// ä�� ����
		JPanel chatJp = new JPanel();
		chatJp.setBackground(Color.YELLOW);
		chatJp.setBounds(130, 90, 400, 260);
		jp[8].add(chatJp);
		jbChat = new JButton[3];
		for (int i=0; i < jbChat.length; i++) {
			jbChat[i] = new JButton(jbChat_caption[i]);
			jbChat[i].addActionListener(this);
			chatJp.add(jbChat[i]);
		}
		
		// �����̳ʿ� �ǳ� ���̱�
		jpM.add(jb_caption[0], jp[0]);
		jpM.add(jb_caption[1], jp[1]);
		jpM.add(jb_caption[2], jp[2]);
		jpM.add(jb_caption[3], jp[3]);
		jpM.add(jb_caption[4], jp[4]);
		jpM.add(jb_caption[5], jp[5]);
		jpM.add(jb_caption[6], jp[6]);
		jpM.add(jb_caption[7], jp[7]);
		jpM.add(jb_caption[8], jp[8]);
		jpM.add(jb_caption[9], jp[9]);
		card.show(jpM, "Ȩ");

		jpM.setBounds(20, 80, 690, 540);
		contain.add(jpM);
		
		// �α��� �ǳ�				
		JPanel jp00 = new JPanel();
		jp00.setBounds(720, 20, 320, 290);
		jp00.setBackground(Color.YELLOW);
		contain.add(jp00);
		jp00.setLayout(null);
		
		hLogin = new HbeLogin_Panel();
		hLogin.setLayout(null);
		hLogin.setBounds(5, 5, 310, 280);
		jp00.add(hLogin);
		
		// ��ư
		jb = new JButton[10];
		for (int i=0; i < jb.length; i++) {
			jb[i] = new JButton(jb_caption[i]);
			jb[i].addActionListener(this);	
			contain.add(jb[i]);
		}
		jb[0].setBounds(720, 340, 100, 30); // Ȩ	
		jb[1].setBounds(720, 380, 100, 30); // ȸ������
		jb[2].setBounds(830, 380, 100, 30); // ȸ������
		jb[3].setBounds(940, 380, 100, 30);	// ȸ����ȸ
		jb[4].setBounds(720, 420, 100, 30); // �Խ��� �۾��� ���
		jb[5].setBounds(830, 420, 100, 30); // �Խ��� �۾��� ����
		jb[6].setBounds(940, 420, 100, 30);	// �Խ��� ��ȸ
		jb[7].setBounds(720, 460, 100, 30); // ����
		jb[8].setBounds(830, 460, 100, 30); // ä��
		jb[9].setBounds(940, 460, 100, 30);	// ��Ʈ�е�
		
		for (int i=0; i < 8; i++) {
			jb[i+2].setEnabled(false);
		}
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(200, 150, 1090, 680);
		this.setResizable(false);
		this.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		Object obj = e.getSource();
		String jbCaption = e.getActionCommand();
		
	
		if (jb[0] == obj){
			System.out.println("jbCaption >>> : " + jbCaption);
			card.show(jpM, "Ȩ");
		}
		if (jb[1] == obj){
			System.out.println("jbCaption >>> : " + jbCaption);
			card.show(jpM, "ȸ������");
			
			if (true) {
				for (int i=0; i < 8; i++) {
					jb[i+2].setEnabled(true);
				}
			}
		}
		if (jb[2] == obj){
			System.out.println("jbCaption >>> : " + jbCaption);
			card.show(jpM, "ȸ������");
		}	
		if (jb[3] == obj){
			System.out.println("jbCaption >>> : " + jbCaption);
			card.show(jpM, "ȸ����ȸ");		
		}	
		if (jb[4] == obj){
			System.out.println("jbCaption >>> : " + jbCaption);
			card.show(jpM, "�۵��");		
		}		
		if (jb[5] == obj){
			System.out.println("jbCaption >>> : " + jbCaption);
			card.show(jpM, "�ۼ���");
		}
		if (jb[6] == obj){
			System.out.println("jbCaption >>> : " + jbCaption);
			card.show(jpM, "����ȸ");
		}	
		if (jb[7] == obj){
			System.out.println("jbCaption >>> : " + jbCaption);
			card.show(jpM, "����");
			new CalculatorGUI();
		}
		if (jb[8] == obj){
			System.out.println("jbCaption >>> : " + jbCaption);
			card.show(jpM, "ä��");
		}
		if (jb[9] == obj){
			System.out.println("jbCaption >>> : " + jbCaption);
			card.show(jpM, "������");
//			new JEditor();

		}			
		
		// ä�� ��ư
		if (jbChat[0] == obj){
			System.out.println("jbCaption >>> : " + jbCaption);				
		}
		if (jbChat[1] == obj){
			System.out.println("jbCaption >>> : " + jbCaption);		
		}
		if (jbChat[2] == obj){
			System.out.println("jbCaption >>> : " + jbCaption);					
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new KosmoScr();
	}
}
