package a.b.c.kosmo.util.notepad;
// �����ӿ� IP�� URL�� �Է��Ͽ� HOST������ ������ �ҽ��� �������� Ŭ����

import java.awt.*;
import java.awt.event.*;
import java.net.*;
import javax.swing.*;
import java.io.*;

public class WantKnowHost extends JDialog implements ActionListener{

	Dimension dim;
	//Host, URL ������ ����
	JTextField			hoText, urlText;
	JLabel				hoLabel, urlLabel;
	JButton 			okButt, canButt;
	JPanel				pa1, pa2, pa3;
	InetAddress[]		inet=null;
	URL					urlName;
	InputStream		is;
	BufferedReader	br;
	String				ho="", url="";

	public WantKnowHost(){
		super(new JEditor(), "Host�� �˷����~~" , true);

		hoText = new JTextField(20);
		urlText = new JTextField(20);
		hoLabel = new JLabel("HOST Name ");
		urlLabel = new JLabel("URL Address ");
		okButt = new JButton("Ȯ��");
		canButt = new JButton("���");
		pa1 = 	new JPanel();
		pa2 = new JPanel();
		pa3 = new JPanel();
		pa1.setLayout(new BorderLayout());
		pa2.setLayout(new BorderLayout());

		display();
	}

	public void display(){
		pa1.add(hoLabel, "North");
		pa1.add(urlLabel, "South");
		pa2.add(hoText, "North");
		pa2.add(urlText, "South");
		pa3.add(okButt);
		pa3.add(canButt);

		getContentPane().add(pa1, "West");
		getContentPane().add(pa2, "Center");
		getContentPane().add(pa3, "South");
	
		okButt.addActionListener(this);
		canButt.addActionListener(this);

		Dimension dim = getToolkit().getScreenSize();
		setLocation(dim.width/2 - 155, dim.height/2 - 55);

		setSize(310, 125);
		setVisible(true);
		setResizable(false);

		setDefaultCloseOperation(this.DISPOSE_ON_CLOSE);
	}

	public void actionPerformed(ActionEvent e){
		ho = hoText.getText();
		url = urlText.getText();
		
		if(e.getSource() == okButt){
			//Host�̸����� �Է����� ���~~
			if(ho.length()>0 && url.length() == 0){
				try{
					//ȣ��Ʈ �̸��� ����� ��� IP�� �����ش�.
					inet = InetAddress.getAllByName(ho);				
					JEditor.ta.append("HostName : " + inet[0].getHostName() + "\n");
					for(int i=0 ; i<inet.length ; i++){
						JEditor.ta.append("IP : " + inet[i].getHostAddress() + "\n");
					}
					JEditor.ta.append("\n");
				}catch(UnknownHostException uhe){
					//������ �߻��� ���, USER���� Dialog�� ���� �˷��ش�.
					 JOptionPane.showMessageDialog(this, "URL�� �������� �ʽ��ϴ�.", "�����߻�", JOptionPane.ERROR_MESSAGE );
				}
			}else if(ho.length() == 0 && url.length()>0){
				try{
					urlName = new URL(url);				
					is = urlName.openStream();
					br = new BufferedReader(new InputStreamReader(is));
					String data;
					while((data = br.readLine()) != null){
						JEditor.ta.append(data + "\n");
					}
				}catch(MalformedURLException ea){
				}catch(IOException ea){
				}catch(Exception ea){
				}
			}else{
				//USER�� �ƹ��͵� �Է����� �ʾ�����, USER���� �ȳ�â�� �����ش�.
				JOptionPane.showMessageDialog(this, "IP�� URL �� �ϳ��� �Է��ϼ���.", "Information~", JOptionPane.INFORMATION_MESSAGE );
			}	
		}else if(e.getSource() == canButt){
				setVisible(false);
				dispose();
		}
	}
}
