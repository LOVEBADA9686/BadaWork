package a.b.c.kosmo.util.chat;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;

public class SwingChatClient extends JFrame{
	private static final long serialVersionUID = 1L;
	
	private static final String ICON_PATH = "C:\\00.KOSMO93\\10.JExam\\el_java_work\\javaKosmo\\src\\img_chat\\";
	
	private JTextArea 		jta;
    private JTextField 		jtSend;
    private JScrollPane 	jsPane;
    private JPanel			jp[];
    private JLabel  		jl;
    private ImageIcon 		chatIcon;
    private Socket 			socket;
    private BufferedWriter 	bw;
    
    public SwingChatClient() {
    	this.setTitle("ä���ϱ�");
    	this.getContentPane().setLayout(null);    	
    	
    	jp = new JPanel[3];
    	for (int i=0; i < jp.length; i++) {
    		jp[i] = new JPanel();
    		jp[i].setBorder(new EtchedBorder(EtchedBorder.LOWERED));
    		jp[i].setLayout(new BorderLayout());    		
    		this.getContentPane().add(jp[i]);
    	}
    	jp[0].setBounds(5, 7, 375, 55);
    	jp[1].setBounds(5, 65, 375, 343);
    	jp[2].setBounds(5, 412, 375, 40);
    	
    	chatIcon = new ImageIcon(ICON_PATH + "ase.gif");
    	jl = new JLabel("ä�� �ϱ� ", chatIcon, SwingConstants.CENTER);
    	jl.setBackground(Color.WHITE);	
		jl.setBorder(new EtchedBorder());	
		jl.setFont(new Font("�������", Font.BOLD, 20));
		jp[0].setBackground(Color.YELLOW);		
		jp[0].add(jl);
		
    	jta = new JTextArea();
    	jta.setBackground(Color.YELLOW);
        jtSend = new JTextField();
        jtSend.setBackground(Color.YELLOW);
        jta.setEditable(false);        
        jsPane = new JScrollPane(jta);
        jsPane.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);
        jsPane.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);    
        jtSend.addKeyListener(new MsgSendListener());
        
        jp[1].add(jsPane,BorderLayout.CENTER);
        jp[2].add(jtSend,BorderLayout.CENTER);
        
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);        
        this.setResizable(false);
        this.setLocation(100, 100);
        this.setSize(400, 500);
        this.setVisible(true);       
    }
    
    //���� ������ ���� ����
    public void setSocket(Socket socket) {
    	
        this.socket = socket;
        
        try {
            OutputStream out = socket.getOutputStream();
            bw = new BufferedWriter(new OutputStreamWriter(out));
        } catch (Exception e) {
           System.out.println("������ >>> : " + e.getMessage());
        }
    } 
 
    //���� Ŭ������ �̺�Ʈ ������ �����
    class MsgSendListener implements KeyListener {
 
        @Override
        public void keyTyped(KeyEvent e) {}
        @Override
        public void keyPressed(KeyEvent e) {}
 
        @Override
        public void keyReleased(KeyEvent e) {
        	
            if (e.getKeyCode()==KeyEvent.VK_ENTER) {
            
            	String msg = jtSend.getText();
                System.out.println(msg);
                jta.append("[ ��  ]  >>>  " + msg + "\n");
                jtSend.setText("");
                
                try {
                	//�ѹ����� �����ٴ� ���� �˸��� ���ؼ� bufferedWriter�� "\n"�� ���δ�
                    bw.write(msg + "\n");
                    bw.flush();
                } catch (IOException e1) {
                	System.out.println("������ >>> : " + e1.getMessage());
                }
            }            
        }
    }
    
    //���� Ŭ������ ���� ������ �ۼ�
    class TcpClientReceiveThread implements Runnable {
    	
        private Socket socket;
        
        // ������ 
        public TcpClientReceiveThread(Socket socket) {
            this.socket = socket;
        }
        
        @Override
        public void run() {
        	
            // �����κ��� ���� �޼����� �о �ؽ�Ʈ ���� �߰��ϱ�
            try {
                BufferedReader br = new BufferedReader(new InputStreamReader(socket.getInputStream()));
                while (true) {
                    String msg = br.readLine();//�޼��� ���� �о����
                    jta.append("[ ���� ]  >>>  " + msg + "\n");                    
                }
            } catch (Exception e) {
                jta.append("������ ����Ǿ����ϴ�.");
            } finally {                
            	if (socket!=null && !socket.isClosed()) {
            		try {socket.close(); socket=null; }catch(Exception e2){}
                }
            }
        }
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		try {        
            Socket socket = new Socket("192.168.219.109", 5000);
        
            //���� ��ü ����
            SwingChatClient cf = new SwingChatClient();
            cf.setSocket(socket);//���ο��� ������ ����
       
            TcpClientReceiveThread th1 = cf.new TcpClientReceiveThread(socket);       
            new Thread(th1).start();
            
        } catch (Exception e) {
        	System.out.println("������ >>> : " + e.getMessage());
        }
	}
}

