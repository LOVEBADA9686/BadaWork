package a.b.c.kosmo.util.time;

import java.awt.FlowLayout;
import java.awt.Font;
import java.util.Calendar;
 
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

// ���߿� �����ϱ� 
// ---- ������ ���� Ŭ���� 
// java.lang.Runnable �������̽� Ŭ����
// java.lang.Thread Ŭ����

// ---- GUI ���� Ŭ���� 
// javax.swing.JFrame �������� Ŭ����
// java.awt.FlowLayout; �÷ο췹�̾ƿ� Ŭ���� 
// java.awt.Font; ��Ʈ Ŭ���� 
// javax.swing.JLabel; ���̶� Ŭ���� 


public class Ex_DigitalClock extends JPanel implements Runnable{

	private static final long serialVersionUID = 1L;

	private Thread thread;
    private JLabel label;
 
    public Ex_DigitalClock(){
        this.setLayout(new FlowLayout());
 
        label = new JLabel();
        label.setFont(new Font("Serif",Font.PLAIN, 20));
 
        if(thread == null){
             
            //this�� �ǹ̴� Runnable�� ������ ��ü�� ����(DigitalClock)
            thread = new Thread(this);
            thread.start();
        }
        
        this.add(label);
        this.setBounds(5,5,500,50);
        this.setVisible(true);
    }
    
    public void run(){
        while(true){
           
        	Calendar cal = Calendar.getInstance();
            String now = 	cal.get(Calendar.YEAR)+"��"+
		                    (cal.get(Calendar.MONTH)+1)+"��"+
		                    cal.get(Calendar.DATE)+"��"+
		                    cal.get(Calendar.HOUR)+"��"+
		                    cal.get(Calendar.MINUTE)+"��"+
		                    cal.get(Calendar.SECOND)+"��";
            
            label.setText(now);
           
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){               
            }
        }
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame.setDefaultLookAndFeelDecorated(true);
        new Ex_DigitalClock();
	}
}
