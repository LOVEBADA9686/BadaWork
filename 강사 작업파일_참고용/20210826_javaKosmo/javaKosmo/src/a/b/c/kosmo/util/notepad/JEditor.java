package a.b.c.kosmo.util.notepad;

import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.awt.*;  

public class JEditor extends JFrame
{

	private static final long serialVersionUID = 1L;

	private static final String IMG_PAGH = "C:\\00.KOSMO93\\10.JExam\\el_java_work\\javaKosmo\\src\\img_notepad\\";
	
	protected MenuEvent me;
	protected static JTextArea			ta;
	protected JScrollPane				sp;
	protected JMenuBar					mb;
	protected JMenu						mFile, mEdit, mForm, mNet, mHelp;
	protected static JMenuItem			mNew, mOpen, mSave, mQuit;
	protected static JMenuItem			mCut, mCopy, mPaste, mDelete, pCut, pCopy, pPaste, pDelete;
	protected static JMenuItem			mFont, mBackColor, mHost, mInfo, pFont, pBackColor;
	protected static JFileChooser		fc;
	protected static JColorChooser	    cc;
	
	// EDIT�� ���� ��������(Copy�� �ؽ�Ʈ�� �����Ѵ�.)
	protected static String				selection = "";		
	
	//Toolbar�� ���� ����
	protected JToolBar					toolbar;
	protected static JButton 			toolButNew, toolButOpen, toolButSave, toolButCut, toolButCopy, toolButPaste;
	protected ImageIcon					toolIMG1, toolIMG2, toolIMG3, toolIMG4, toolIMG5, toolIMG6;
	
	//PopupMenu�� ���� ����
	protected JPopupMenu					popup;
	
	//���콺 ����ٴϴ� �̹���
	final ImageIcon icon = new ImageIcon(IMG_PAGH + "navi.gif");
	JLabel mouseLabel;
	
	public JEditor(){		
		this.setTitle("������� v1.3.1");

		//TextArea�� ScrollPane�� �ٿ� �̸� �����ӿ� ���δ�.
		ta = new JTextArea();
		sp = new JScrollPane(ta);

		//�޴��� �����, ����Ű �����ϱ�
		mb = new JMenuBar();

		/*
			�޴��� �����ϰ�, ������ Mnemonic�� �����Ѵ�.
			Mnemonic�� �����ϸ� �޴��� �̸��� �ش� ���ĺ��� ������ �׾�����.
			�޴��� �����ϱ� ���ؼ��� ALTŰ�� �ش� ����Ű�� ������ �ȴ�.
		*/
		mFile = new JMenu("����(F)" );
		mEdit = new JMenu("����(E)");
		mForm = new JMenu("����(O)");
		mNet = new JMenu("����(T)");
		mHelp = new JMenu("����(H)");

		mFile.setMnemonic('f');
		mEdit.setMnemonic('e');
		mForm.setMnemonic('o');
		mNet.setMnemonic('t');
		mHelp.setMnemonic('h');

		/*
			�޴��������� �����ϰ�, ���� ���� �����ۿ� ����Ű�� �����Ѵ�.
			setAccelerator�� �޴������۸��� ������ "CTRL+(���ĺ�)" �� �Էµȴ�.
			���� ���� ���¿��� �ش� ���� ����Ű���� �Է��ϸ�, �޴��������� ���� ������ �� �ִ�.
			Mnemonic�� setAccelerator�� �������� EditPlus�� ���� �� �� �ִ�.
		*/
		mNew = new JMenuItem("����(N)", 'n');
		mNew.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_N, KeyEvent.CTRL_MASK));
		mNew.setIcon(new ImageIcon(IMG_PAGH + "mnew.gif"));
		mOpen = new JMenuItem("����(O)", 'o');
		mOpen.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_O, KeyEvent.CTRL_MASK));
		mOpen.setIcon(new ImageIcon(IMG_PAGH + "mopen.gif"));
		mSave = new JMenuItem("����(S)", 's');
		mSave.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, KeyEvent.CTRL_MASK));
		mSave.setIcon(new ImageIcon(IMG_PAGH + "msave.gif"));
		mQuit = new JMenuItem("�ݱ�(Q)", 'q');
		mQuit.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_Q, KeyEvent.CTRL_MASK));
		mQuit.setIcon(new ImageIcon(IMG_PAGH + "mquit.gif"));

		//�� �޴��������� �տ� �׸��� �ֱ� ���� setIcon()�� ���� �̹����� �־��ش�.
		mCut = new JMenuItem("�߶󳻱�(X)", 'x');
		mCut.setIcon(new ImageIcon(IMG_PAGH + "mcut.gif"));
		mCut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_MASK));
		mCopy = new JMenuItem("����(C)", 'c');
		mCopy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_MASK));
		mCopy.setIcon(new ImageIcon(IMG_PAGH + "mcopy.gif"));
		mPaste = new JMenuItem("�ٿ��ֱ�(V)", 'v');
		mPaste.setIcon(new ImageIcon(IMG_PAGH + "mPaste.gif"));
		mPaste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_MASK));
		mDelete = new JMenuItem("�����(D)", 'd');
		mDelete.setIcon(new ImageIcon(IMG_PAGH + "mDelete.gif"));
		mDelete.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_D, KeyEvent.CTRL_MASK));

		mFont = new JMenuItem("�۲�(F)",'f');
		mFont.setIcon(new ImageIcon(IMG_PAGH + "mfont.gif"));
		mBackColor = new JMenuItem("������(B)", 'b');
		mBackColor.setIcon(new ImageIcon("mbackcolor.gif"));
		mHost = new JMenuItem("ȣ��Ʈ ����(H)", 'h');
		mHost.setIcon(new ImageIcon(IMG_PAGH + "mhost.gif"));
		mInfo = new JMenuItem("������� ����(A)", 'a');
		mInfo.setIcon(new ImageIcon(IMG_PAGH + "minfo.gif"));

		/*
			FileChooser�� �θ� ��, FileFilter�� �̿��� ���������� �����ش�.
			���⼭�� �ڹ�ȭ�ϰ� �ؽ�Ʈ ȭ�ϸ��� ���͸��Ѵ�.
			���͸� ����� FileChoice.java ȭ�Ͽ� �����Ǿ� �ִ�.
			���⼭ �Ѱ��ִ� �������� �Ű������� FileChoice Ŭ�������� ����ϰ� �̿�.
		*/
		fc = new JFileChooser();
		fc.addChoosableFileFilter(new FileChoice("�ؽ�Ʈ ����  *.txt"));
		fc.addChoosableFileFilter(new FileChoice("�ڹ� ����  *.java"));
		fc.setCurrentDirectory(new File("."));

		cc = new JColorChooser();

		//ToolBar�� ���� ���� �ʱ�ȭ�ϱ�
		toolbar = new JToolBar();
		toolIMG1 = new ImageIcon(IMG_PAGH + "new.gif");
		toolIMG2 = new ImageIcon(IMG_PAGH + "open.gif");
		toolIMG3 = new ImageIcon(IMG_PAGH + "save.gif");
		toolIMG4 = new ImageIcon(IMG_PAGH + "cut.gif");
		toolIMG5 = new ImageIcon(IMG_PAGH + "copy.gif");
		toolIMG6 = new ImageIcon(IMG_PAGH + "paste.gif");

		//ToolBar�� ��ư�� ������ ������ �̹����� ���´�.
		toolButNew = new JButton(toolIMG1);
		toolButOpen = new JButton(toolIMG2);
		toolButSave = new JButton(toolIMG3);
		toolButCut = new JButton(toolIMG4);
		toolButCopy = new JButton(toolIMG5);
		toolButPaste = new JButton(toolIMG6);

		//PopupMenu �ʱ�ȭ
		//���⿡�� ����Ű�� �����Ѵ�.
		pCopy = new JMenuItem("�����ϱ�");		
		pCopy.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_C, KeyEvent.CTRL_MASK));
		pCut = new JMenuItem("�߶󳻱�");
		pCut.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_X, KeyEvent.CTRL_MASK));
		pPaste = new JMenuItem("�ٿ��ֱ�");
		pPaste.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_V, KeyEvent.CTRL_MASK));
		pDelete = new JMenuItem("�����");
		pFont = new JMenuItem("��Ʈ�ٲٱ�");
		pBackColor = new JMenuItem("�����ٲٱ�");
		popup = new JPopupMenu();

		//���콺�� ����ٴϴ� �̹����� ���� �۾�
		//Label�� �̹����� �ٿ� Label�� ���콺�� ���� �ٴѴ�(MouseMotionEvent �̿�)
		//setBounds()�� ũ�⸦ �����ִ� �޼����̴�.
		mouseLabel = new JLabel(icon);
		mouseLabel.setBounds(2000, 2000, icon.getIconWidth(), icon.getIconHeight());
		ta.add(mouseLabel);
		
		this.display();
	}

	public void display()
	{
		//�̺�Ʈ�� �þƼ� ó���� �ִ� Ŭ������ MenuEvent Ŭ�����̴�.
		//�̺�Ʈ ó���� �ϴ� Ŭ������ ��ü�� ����
		me = new MenuEvent();

		//�޴����� File�̺�Ʈ �����ϱ�
		mNew.addActionListener(me);
		mOpen.addActionListener(me);
		mSave.addActionListener(me);
		mQuit.addActionListener(me);

		//�޴����� Edit�̺�Ʈ �����ϱ�
		mCut.addActionListener(me);
		mCopy.addActionListener(me);
		mPaste.addActionListener(me);
		mDelete.addActionListener(me);

		//�޴����� Form�̺�Ʈ �����ϱ�
		mFont.addActionListener(me);
		mBackColor.addActionListener(me);

		//�޴����� Net, Help�̺�Ʈ �����ϱ�
		mHost.addActionListener(me);
		mInfo.addActionListener(me);

		//PopupMenu�� �̺�Ʈ �����ϱ�
		pCut.addActionListener(me);
		pCopy.addActionListener(me);
		pPaste.addActionListener(me);
		pDelete.addActionListener(me);
		pFont.addActionListener(me)	;
		pBackColor.addActionListener(me);

		//ToolBar�� �̺�Ʈ �����ϱ�
		toolButNew.addActionListener(me);
		toolButOpen.addActionListener(me);
		toolButSave.addActionListener(me);
		toolButCut.addActionListener(me);
		toolButCopy.addActionListener(me);
		toolButPaste.addActionListener(me);

		/*
			TextPopupMenu �̺�Ʈ ó���ϱ�
			if���� ���� ���콺 ������ Ŭ�� ���θ� ��������.
			e.getModifiers()�� USER�� Ŭ������ �޾ƿ���, �̴� ���� ������� BUTTON3_MASK�� ���Ѵ�.
			e.getX(), e.getY()�� ���� ���콺�� Ŭ�� ��ǥ�� �޾ƿ´�.
		*/
		ta.addMouseListener(new MouseAdapter()
		{
			public void mousePressed(MouseEvent e)
			{
				if((e.getModifiers() & MouseEvent.BUTTON3_MASK) != 0)
				popup.show(ta,e.getX(), e.getY());
			}
		});

		/*
			���콺�� ����ٴϴ� �̹����� ���� �̺�Ʈ ó���ϱ� 
			mouseMoved()�� ���� ���콺�� �����϶����� Label�� ���콺 ��ǥ���� ���� ��ġ�� �ٲ�� �Ѵ�.
		*/
		ta.addMouseMotionListener(new MouseMotionAdapter()
		{
			public void mouseMoved(MouseEvent e)
			{
				mouseLabel.setLocation(e.getX()-10, e.getY()-20);
			}
		});

		/*
			JFrame�� JScrollPane ���̱�
			JScrollPane���� JTextArea�� add()�Ǿ� �ִ�.
		*/
		getContentPane().add(sp);

		//�޴��ٿ� ��� ���̱�
		setJMenuBar(mb);

		mb.add(mFile);
		mFile.add(mNew);
		mFile.addSeparator();
		mFile.add(mOpen);
		mFile.add(mSave);
		mFile.addSeparator();
		mFile.add(mQuit);

		mb.add(mEdit);
		mEdit.add(mCut);
		mEdit.add(mCopy);
		mEdit.add(mPaste);
		mEdit.add(mDelete);

		mb.add(mForm);
		mForm.add(mFont);
		mForm.add(mBackColor);

		mb.add(mNet);
		mb.add(mHelp);
		mNet.add(mHost);
		mHelp.add(mInfo);

		//ToolBar�� ��� ���̱�
		toolbar.add(toolButNew);
		toolbar.add( toolButOpen);
		toolbar.add( toolButSave);
		toolbar.addSeparator();
		toolbar.add( toolButCut);
		toolbar.add( toolButCopy);
		toolbar.add( toolButPaste);
		toolbar.addSeparator();

		//������ ���v�� ǳ������ �ޱ�
		toolButNew.setToolTipText("New");
		toolButOpen.setToolTipText("Open");
		toolButSave.setToolTipText("Save");
		toolButCut.setToolTipText("Cut");
		toolButCopy.setToolTipText("Copy");
		toolButPaste.setToolTipText("Paste");

		//PopupMenu �����
		popup.add(pCopy);
		popup.add(pCut);
		popup.add(pPaste);
		popup.add(pDelete);
		popup.add(pBackColor);
		popup.add(pFont);
		popup.setInvoker(ta);

		//���ٸ� �����ӿ� ���δ�.
		getContentPane().add(toolbar, "North");

		//JFrame�� ���� �ҽ�
		setSize(1000,600);
		setVisible(true);
		
		/*
			JFrame�� ������� �߾ӿ� ��ġ�ϵ��� �ϱ� ����
			WindowŬ������ getToolkit()���� OS���� ����� ���� ȭ��ũ�⸦ ����.
			getScreenSize()���� Dimension�� width�� height�� �ʵ尪�� ��´�.
		*/
		Dimension dim = getToolkit().getScreenSize();
		setLocation(dim.width/2 - 600, dim.height/2 - 400);

		/*
			�������� X��ư�� ��ɿ� â�� ���� �ʵ��� �����Ѵ�.
			������ �������� �޼��忡�� quitFile()�� ȣ���Ѵ�.
			quitFile()�� �޴��������� QUIT�� �Բ� ���� �޼����̴�.
		*/
		this.setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
		this.addWindowListener(new WindowAdapter()
		{
			public void windowClosing(WindowEvent e)
			{
				me.quitFile();
			}
		});
	}
	
	public static void main(String[] args) {
		new JEditor();		
	}
}

 