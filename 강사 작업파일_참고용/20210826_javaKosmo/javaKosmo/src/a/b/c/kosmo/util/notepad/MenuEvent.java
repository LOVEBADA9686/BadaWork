package a.b.c.kosmo.util.notepad;
//Menu, ToolBar, Popup�� �̺�Ʈ ó�� Ŭ����

import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.awt.*;
import javax.swing.border.*;

public class MenuEvent extends JFrame implements ActionListener{
	public void actionPerformed(ActionEvent e){

		// File�� MenuItem�� ToolBar�� �̺�Ʈ�� ����
		// || �� �̿��Ͽ�, ������ ����� �̺�Ʈ�� �Բ� ó���Ѵ�.
		// �޼����� ������ �����ϰ� �ϱ� ���� �Ʒ����׿� ����� �޼��带 �����Ѵ�.
		if(e.getSource() == JEditor.mNew || e.getSource() == JEditor.toolButNew){
			newFile();
		}else if(e.getSource() == JEditor.mOpen || e.getSource() == JEditor.toolButOpen){
			openFile();
		}else if(e.getSource() == JEditor.mSave || e.getSource() == JEditor.toolButSave){
			saveFile();
		}else if(e.getSource() == JEditor.mQuit){
			quitFile();
		}
	
		// Edit�� MenuItem �� ToolBar�� �̺�Ʈ ����
		//	start�� end�� JTextArea�� �� ���� �κ��� ù������ �������� ���� �����Ѵ�.
		int start = JEditor.ta.getSelectionStart();
		int end = JEditor.ta.getSelectionEnd();

		if(e.getSource() == JEditor.mCut || e.getSource() == JEditor.toolButCut || e.getSource() == JEditor.pCut){
			selectedDelete(start, end);				
		}else if(e.getSource() == JEditor.mCopy || e.getSource() == JEditor.toolButCopy || e.getSource() == JEditor.pCopy){
			selectedCopy();
		}else if(e.getSource() == JEditor.mPaste || e.getSource() == JEditor.toolButPaste || e.getSource() == JEditor.pPaste){
			selectedPaste(start, end);	
		}else if(e.getSource() == JEditor.mDelete || e.getSource() == JEditor.pDelete){
			selectedDelete(start, end);
			JEditor.selection ="";	//Delete����̱� ������ ���� ��, selection���� �ʱ�ȭ��Ų��.
		}

		// Form�� Net, Help�� MenuItem ����
		if(e.getSource() == JEditor.mFont || e.getSource() == JEditor.pFont){
				//��Ʈ�� �ٲٱ� ���� ����� FontTestŬ������ �����Ǿ� �ִ�.
				new ChangeFont();

		}else if(e.getSource() == JEditor.mBackColor || e.getSource() == JEditor.pBackColor){
				//ColorChooser���� ������ Color�� ���� �������� ���
				Color c = JEditor.cc.showDialog(new JEditor(), "Background Color", Color.white ); 			   
				if(c!=null)
					JEditor.ta.setBackground(c);										 
				
		}else if(e.getSource() == JEditor.mHost){
				//ȣ��Ʈ�� ������ �������� ����� WantKnowHost�� �����Ǿ� �ִ�.
				new WantKnowHost();

		}else if(e.getSource() == JEditor.mInfo){
				helpInfo();			
		}
	}
	
	//������(JTextArea�� ������ ������, ���� ���θ� ��������.)
	//showConfirmDialog�� ��ư Ŭ���� ���� int���� ���������� �� ������ if���� �����Ѵ�.
	public void newFile(){
		if(JEditor.ta.getText().length() > 0){
			int i = JOptionPane.showConfirmDialog(this, "������ �����Ͻðڽ��ϱ�?", "���� Ȯ��", 
				JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE);
			if(i==JOptionPane.OK_OPTION){
				saveFile();	
			}else if(i==JOptionPane.NO_OPTION){
				JEditor.ta.setText("");	
			}
		}else{
			JEditor.ta.setText("");
		}
	}

	//���Ͽ���(showOpenDialog() �̿�)
	public void openFile(){
		if(JEditor.fc.showOpenDialog(new JEditor()) == JFileChooser.APPROVE_OPTION){
			File file = JEditor.fc.getSelectedFile();
			String s = "";
			String total = "";

		try{
			FileReader fr = new FileReader(file);
			BufferedReader br = new BufferedReader(fr);

			while((s=br.readLine()) != null){
				total += (s+"\n");
			}
			JEditor.ta.setText(total);
			br.close();
			fr.close();
		}catch(FileNotFoundException e){
		}catch(IOException e){}
 	}
	}

	//��������(showSaveDialog() �̿�)
	public void saveFile(){
		if(JEditor.fc.showSaveDialog(new JEditor()) == JFileChooser.APPROVE_OPTION){		
			File file = JEditor.fc.getSelectedFile();
			String total = "";
			total = JEditor.ta.getText();

			try{
				FileWriter fw = new FileWriter(file);
				BufferedWriter bw = new BufferedWriter(fw);
				bw.write(total);
				bw.close();
				fw.close();
			}catch(FileNotFoundException e){
			}catch(IOException e){}
		}	
	}

	//���ϴݱ�
	public void quitFile(){
		Object[] options = {"Quit with Saving", "Quit without Saving", "Cancel"};

		//������ �ݱ� ���� ������ ������, ���忩�θ� �����.
		//����� ������ Dialog�� �ۼ��Ѵ�. Object�迭�� �̿��Ͽ� Dialog�� ��ư���� �����Ѵ�.
		if(JEditor.ta.getText().length() > 1){
			int i = JOptionPane.showOptionDialog(this, "���� �����Ͻðڽ��ϱ�?", "���� Ȯ��", 
					JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.INFORMATION_MESSAGE, null,   options,   options[2]);

			if(i==JOptionPane.OK_OPTION){
				saveFile();	
				dispose();
				System.exit(0);				
			}else if(i==JOptionPane.NO_OPTION){
				dispose();
				System.exit(0);										
			}		
		}else{
			 int i = JOptionPane.showConfirmDialog(this, "���� �����Ͻðڽ��ϱ�?", "���� Ȯ��", 
					JOptionPane.YES_NO_OPTION, JOptionPane.INFORMATION_MESSAGE );
			if(i==JOptionPane.OK_OPTION){
				dispose();
				System.exit(0);	
			}
		}
	}

	//Cut, Delete
	public void selectedDelete(int start, int end){
		JEditor.selection = JEditor.ta.getSelectedText();
		if(JEditor.selection == null)
			return;
		JEditor.ta.replaceRange("",start, end);
	}

	//Copy
	public void selectedCopy(){
		JEditor.selection = JEditor.ta.getSelectedText();
	}

	//Paste
	public void selectedPaste(int start, int end){
		if(JEditor.selection == null)
			return;
		JEditor.ta.replaceRange(JEditor.selection, start, end);
	}

	public void helpInfo(){
		//Label�� html�ڵ带 �̿��Ͽ� ���δ�. 
		//Label�� Button���� html�� �̿��Ͽ� ����� �� �ִ�.
		JDialog helpFrame = new JDialog(new JEditor(), "Information", true);
		String initial = "<html>\n" + "<body ><p align=center><font face=Monotype Corsiva><font size=+10>SejongDaewang</font>" +
							"<font face=���ﰡ���ٶ�M>&nbsp;&nbsp;\nv1.3.1</font></font></p>\n" +
							"<p align=center>" +	"<font face=���ﰡ���ٶ�M>&nbsp;</font></p>" + 
							"<p>&nbsp;</p>" +	"<p align=center>" +	
							"<font face=�������>Copyright (c) &nbsp;2002 ~ 2004 &nbsp;Nam &amp; Moo</font></p>" +
							"<p align=center><font face=�������>" +	"All Right Reserved</font></p></body></html>";
		JLabel infoLabel = new JLabel(initial, JLabel.CENTER);
		JLabel mailAddr = new JLabel("<html><font face=Comic Sans MS><font size=+1 color=blue>Freeware for Everyone</font></font></html>", JLabel.CENTER);
		mailAddr.setBorder(new TitledBorder(new TitledBorder("unkwon0858@hotmail.com"), "sindosiin@hotmail.com",
										TitledBorder.RIGHT, TitledBorder.BOTTOM));
		helpFrame.getContentPane().add(mailAddr, "South");
		helpFrame.getContentPane().add(infoLabel, "Center");

		Dimension dim = getToolkit().getScreenSize();
		helpFrame.setLocation(dim.width/2 - 150, dim.height/2 - 150);

		helpFrame.setSize(300,300);
		helpFrame.setVisible(true);
		helpFrame.setResizable(false);
	}
}
