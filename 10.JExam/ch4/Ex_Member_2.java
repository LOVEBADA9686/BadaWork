// package
package a.b.c.ch4.mem;

// import
import java.util.Scanner;
import a.b.c.ch4.mem.vo.Ex_MemberVO;

public class Ex_Member_2
{
	// ���
	// �������
	// ������
	
	//�Լ�
	//ȸ�� �����ϴ� �Լ�
	public int memInsert(Ex_MemberVO exvo){
		System.out.println("Ex_Member_1.memInsert() ���� ���� >>> : ");
		System.out.println("ȸ������ :: exvo >>> : " + exvo);
		System.out.println("exvo.getMnum() >>> : " + exvo.getMnum());
		System.out.println("exvo.getMname() >>> : " + exvo.getMname());
		System.out.println("exvo.getMid() >>> : " + exvo.getMid());
		System.out.println("exvo.getMpw() >>> : " + exvo.getMpw());
		System.out.println("exvo.getMhp() >>> : " + exvo.getMhp());
		System.out.println("exvo.getMmail() >>> : " + exvo.getMmail());
		System.out.println("exvo.getMaddr() >>> : " + exvo.getMaddr());

		// ������ ���񽺳� �ٿ����� �Լ��� ȣ���ؼ� ����� �޴´�.
		
		int nCnt = 0;

		if (true)
		{
			nCnt = 1;
		}
		return nCnt;
	}

	// ȸ�� ��ȸ �ϴ� �Լ�
	public void memSelect(Ex_MemberVO exvo){
	System.out.println("Ex_Member_1.memSelect() ���� ���� >>> : ");
	System.out.println("ȸ����ȸ :: exvo >>> : " + exvo);
	System.out.println("exvo.getMnum() >>> : " + exvo.getMnum());
	}

	// ȸ������ �����ϴ� �Լ�
	public void memDelete(Ex_MemberVO exvo){
	System.out.println("Ex_Member_1.memDelete() ���� ���� >>> : ");
	System.out.println("ȸ���������� :: exvo >>> : " + exvo);
	System.out.println("exvo.getMnum() >>> : " + exvo.getMnum());

	int nCnt = 0;
	if (true)
	{
		nCnt = 1;
	}
		return nCnt;
	}
	
	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
	String mnum = "";
	String mname = "";
	String mid = "";
	String mpw = "";
	String mhp = "";
	String mmail = "";
	String maddr = "";

	if (1 == args.length)
	{
		String isud = args[0];

		// ȸ������
		if ("I".equals(isud.toUpperCase()))
		{
		System.out.println("ȸ������������ �Է��Ͻÿ�! >>> : " + isud);
		Scanner sc = new Scanner(System.in);

		System.out.println("ȸ����ȣ�� key-in �Ͻÿ� >>> : ");
		mnum = sc.next();
		System.out.println("�Է��� ȸ����ȣ >>> : " + mnum);

		System.out.println("ȸ���̸��� key-in �Ͻÿ� >>> : ");
		mnum = sc.next();
		System.out.println("�Է��� ȸ���̸� >>> : " + mname);

		System.out.println("ȸ�����̵� key-in �Ͻÿ� >>> : ");
		mnum = sc.next();
		System.out.println("�Է��� ȸ�����̵� >>> : " + mid);

		System.out.println("��й�ȣ key-in �Ͻÿ� >>> : ");
		mnum = sc.next();
		System.out.println("�Է��� ��й�ȣ >>> : " + mpw);

		System.out.println("�ڵ�����ȣ key-in �Ͻÿ� >>> : ");
		mnum = sc.next();
		System.out.println("�Է��� �ڵ�����ȣ >>> : " + mhp);

		System.out.println("�̸����� key-in �Ͻÿ� >>> : ");
		mnum = sc.next();
		System.out.println("�Է��� �̸��� >>> : " + mmail);

		System.out.println("ȸ���ּ� key-in �Ͻÿ� >>> : ");
		mnum = sc.next();
		System.out.println("�Է��� ȸ���ּ� >>> : " + maddr);
		sc.nextLine();

		Ex_Member_1 exm_1 = new Ex_Member_1();
		System.out.println("exm_1 >>> : " + exm_1);


		Ex_MemberVO exvo = new Ex_MemberVO();
		exvo.setMnum(mnum);
		exvo.setMname(mname);
		exvo.setMid(mid);
		exvo.setMpw(mpw);
		exvo.setMhp(mhp);
		exvo.setMmail(mmail);
		exvo.setMaddr(maddr);

		int nCntInsert = exm_1memInsert(exvo);


	System.out.println("nCnInsert >>> : " + nCnInsert);
	if (nCnInsert == 1)
	{
		System.out.println("ȸ������ ����!!!");
	}else{
		System.out.println("ȸ������ ����!!!");
	}
		}

if ("S".equals(isud.toUpperCase()))
{
	System.out.println("isud >>> : " + isud);
	System.out.println("ȸ����ȸ ������ �Է��Ͻÿ� >>> : " + isud);
	Scanner sc = new Scanner(System.in);

	System.out.println("ȸ����ȣ�� key_in �Ͻÿ�!!! >>> : ");
	mnum = sc.next();
	System.out.println("�Է��� ȸ����ȣ >>> : " + mnum);

	Ex_Member_1 exm_1 = new Ex_Member_1();
	System.out.println("exm_1 >>> : " + exm_1);

	Ex_MemberVO exvo = new Ex_MemberVO();
	exvo.setMnum(mnum);

	exm_1.memSelete(exvo);
}

if ("U".equals(isud.toUpperCase()))
{
	System.out.println("isud >>> : " + isud);
	System.out.println("ȸ������ ������ �Է��Ͻÿ� >>> : " + isud);
	Scanner sc = new Scanner(System.in);

	System.out.println("ȸ����ȣ�� key_in �Ͻÿ�!!! >>> : ");
	mnum = sc.next();
	System.out.println("�Է��� ȸ����ȣ >>> : " + mnum);

	System.out.println("ȸ���ּҸ� key_in �Ͻÿ�!!! >>> : ");
	mnum = sc.next();
	System.out.println("�Է��� ȸ���ּ� >>> : " + mnum);

	Ex_Member_1 exm_1 = new Ex_Member_1();
	System.out.println("exm_1 >>> : " + exm_1);

	Ex_MemberVO exvo = new Ex_MemberVO();
	exvo.setMnum(mnum);
	exvo.setMaddr(addr);

	int nCntUpdate = exm_1.memUpdate(exvo);

	System.out.println("nCnUpdate >>> : " + nCnUpdate);

	if (nCnUpdate == 1)
	{
		System.out.println("ȸ������ ����!!!");
	}else{
		System.out.println("ȸ������ ����!!!");
	}	
}
	if ("D".equals(isud.toUpperCase()))
	{
		System.out.println("isud >>> : " + isud);
		System.out.println("������ ȸ����ȣ�� �Է��Ͻÿ� >>> : " + isud);
		Scanner sc = new Scanner(System.in);

		System.out.println("ȸ����ȣ�� key_in �Ͻÿ�!!! >>> : ");
		mnum = sc.next();
		System.out.println("�Է��� ȸ����ȣ >>> : " + mnum);

		Ex_Member_1 exm_1 = new Ex_Member_1();
		System.out.println("exm_1 >>> : " + exm_1);

		Ex_MemberVO exvo = new Ex_MemberVO();
		exvo.setMnum(mnum);

		int nCnDelete = exm_1.memDelete(exvo);

		System.out.println("nCnDelete >>> : " + nCnDelete);

		if (nCnDelete == 1)
		{
			System.out.println("ȸ���������� ����!!!");

		}else{
			System.out.println("ȸ���������� ����!!!");
		}
	}
	}else{
			System.out.println("ISUD �����ڸ� �Է��Ͻÿ�!!!");
	}
	}
}
