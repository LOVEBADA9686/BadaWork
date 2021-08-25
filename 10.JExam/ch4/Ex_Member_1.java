// package
package a.b.c.ch4.mem;

// import
import java.util.Scanner;
import a.b.c.ch4.mem.vo.Ex_MemberVO;

public class Ex_Member_1 
{
	// ��� 
	// �������
	// ������

	// �Լ� 
	// ȸ�� �����ϴ� �Լ� 
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

	// ȸ�� ��ȸ�ϴ� �Լ�
	public void memSelect(Ex_MemberVO exvo){
		System.out.println("Ex_Member_1.memSelect() ���� ���� >>> : ");
		System.out.println("ȸ����ȸ :: exvo >>> : " + exvo);
		System.out.println("exvo.getMnum() >>> : " + exvo.getMnum());
	}

	// ȸ������ �����ϴ� �Լ�
	public int memUpdate(Ex_MemberVO exvo){
		System.out.println("Ex_Member_1.memUpdate() ���� ���� >>> : ");
		System.out.println("ȸ���������� :: exvo >>> : " + exvo);	
		System.out.println("exvo.getMnum() >>> : " + exvo.getMnum());
		System.out.println("exvo.getMaddr() >>> : " + exvo.getMaddr());

		int nCnt = 0;
		if (true)
		{
			nCnt = 1;
		}
		return nCnt;
	}

	// ȸ������ �����ϴ� �Լ� 
	public int memDelete(Ex_MemberVO exvo){
		System.out.println("Ex_Member_1.memDelete() ���� ���� >>> : ");
		System.out.println("ȸ���������� :: exvo >>> : " + exvo);
		System.out.println("exvo.getMnum() >>> : " + exvo.getMnum());

		int nCnt = 0;
		if (true)
		{
			nCnt = 1;
		}
		return nCnt ;
	}


	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		// ������ ȭ�� 

		// �����ͺ��̽� ISUD : CRDU ���α׷� 
		// I : INSERT, S : SELECT, U : UPDATE, D : DELETE
		
		// ��������, �������� 
		String mnum = ""; 
		String mname = "";
		String mid = "";
		String mpw = "";
		String mhp = "";
		String memail = "";
		String maddr = "";

		if (1 == args.length)
		{
			String isud = args[0];

			// ȸ������
			if ("I".equals(isud.toUpperCase()))
			{
				System.out.println("ȸ������ ������ �Է� �ϼ��� >>> : " + isud);
				Scanner sc = new Scanner(System.in);

				System.out.println("ȸ����ȣ�� key-in �Ͻÿ� >>> : ");
				mnum = sc.next();
				System.out.println("�Է��� ȸ����ȣ >>> : " + mnum);
				
				System.out.println("ȸ���̸��� key-in �Ͻÿ� >>> : ");
				mname = sc.next();
				System.out.println("�Է��� ȸ���̸� >>> : " + mname);
				
				System.out.println("���̵� key-in �Ͻÿ� >>> : ");
				mid = sc.next();
				System.out.println("�Է��� ���̵� >>> : " + mid);
				
				System.out.println("��й�ȣ�� key-in �Ͻÿ� >>> : ");
				mpw = sc.next();
				System.out.println("�Է��� ��й�ȣ >>> : " + mpw);

				System.out.println("�ڵ�����ȣ�� key-in �Ͻÿ� >>> : ");
				mhp = sc.next();
				System.out.println("�Է��� �ڵ�����ȣ >>> : " + mhp);

				System.out.println("�̸��ϸ� key-in �Ͻÿ� >>> : ");
				memail = sc.next();
				System.out.println("�Է��� �̸��� >>> : " + memail);
				
				System.out.println("ȸ���ּҸ� key-in �Ͻÿ� >>> : ");
				maddr = sc.next();
				System.out.println("�Է��� ȸ���ּ� >>> : " + maddr);
				sc.nextLine();

				// ȸ������
				Ex_Member_1 exm_1 = new Ex_Member_1();
				System.out.println("exm_1 >>> : " + exm_1);
							
				// VO : Value Object �����ϱ� 				
				Ex_MemberVO exvo = new Ex_MemberVO();
				exvo.setMnum(mnum);
				exvo.setMname(mname);
				exvo.setMid(mid);
				exvo.setMpw(mpw);
				exvo.setMhp(mhp);
				exvo.setMemail(memail);
				exvo.setMaddr(maddr);

				// Value Objec exvo ���������� memInsert �ƱԸ�Ʈ�� �ѱ��
				int nCntInsert = exm_1.memInsert(exvo);

				System.out.println("nCntInsert >>> : " + nCntInsert);
				if (nCntInsert == 1)
				{
					System.out.println("ȸ������ ���� !!!");
				}else{
					System.out.println("ȸ������ ���� !!!");
				}
			}

			// ȸ�� ��ȸ
			if ("S".equals(isud.toUpperCase()))
			{
				System.out.println("isud >>> : " + isud);

				System.out.println("ȸ����ȸ ������ �Է� �ϼ��� >>> : " + isud);
				Scanner sc = new Scanner(System.in);

				System.out.println("ȸ����ȣ�� key-in �Ͻÿ� >>> : ");
				mnum = sc.next();
				System.out.println("�Է��� ȸ����ȣ >>> : " + mnum);

				// ȸ�� ��ȸ
				Ex_Member_1 exm_1 = new Ex_Member_1();
				System.out.println("exm_1 >>> : " + exm_1);

				// VO : Value Object �����ϱ� 				
				Ex_MemberVO exvo = new Ex_MemberVO();
				exvo.setMnum(mnum);
				
				// Value Objec exvo ���������� memSelect �ƱԸ�Ʈ�� �ѱ��
				exm_1.memSelect(exvo);
			}

			// ȸ������ ���� 
			if ("U".equals(isud.toUpperCase()))
			{
				System.out.println("isud >>> : " + isud);

				System.out.println("ȸ������ �ּ� ������ �Է� �ϼ��� >>> : " + isud);
				Scanner sc = new Scanner(System.in);

				System.out.println("ȸ����ȣ�� key-in �Ͻÿ� >>> : ");
				mnum = sc.next();
				System.out.println("�Է��� ȸ����ȣ >>> : " + mnum);
				
				System.out.println("ȸ���ּҸ� key-in �Ͻÿ� >>> : ");
				maddr = sc.next();
				System.out.println("�Է��� ȸ���ּ� >>> : " + maddr);
				
				// ȸ������ ���� 
				Ex_Member_1 exm_1 = new Ex_Member_1();
				System.out.println("exm_1 >>> : " + exm_1);
				
				// VO : Value Object �����ϱ� 				
				Ex_MemberVO exvo = new Ex_MemberVO();
				exvo.setMnum(mnum);				
				exvo.setMaddr(maddr);

				// Value Objec exvo ���������� memUpdate �ƱԸ�Ʈ�� �ѱ��
				int nCntUpdate = exm_1.memUpdate(exvo);

				System.out.println("nCntUpdate >>> : " + nCntUpdate);
				if (nCntUpdate == 1)
				{
					System.out.println("ȸ������ ���� ���� !!!");
				}else{
					System.out.println("ȸ������ ���� ���� !!!");			
				}
			}

			// ȸ������ ����
			if ("D".equals(isud.toUpperCase()))
			{
				System.out.println("isud >>> : " + isud);

				System.out.println("ȸ�������� ȸ����Ȧ�� �Է� �ϼ��� >>> : " + isud);
				Scanner sc = new Scanner(System.in);

				System.out.println("ȸ����ȣ�� key-in �Ͻÿ� >>> : ");
				mnum = sc.next();
				System.out.println("�Է��� ȸ����ȣ >>> : " + mnum);

				// ȸ������ ����
				Ex_Member_1 exm_1 = new Ex_Member_1();
				System.out.println("exm_1 >>> : " + exm_1);
				
				// VO : Value Object �����ϱ� 				
				Ex_MemberVO exvo = new Ex_MemberVO();
				exvo.setMnum(mnum);

				// Value Objec exvo ���������� memDelete �ƱԸ�Ʈ�� �ѱ��
				int nCntDelete = exm_1.memDelete(exvo);

				System.out.println("nCntDelete >>> : " + nCntDelete);
				if (nCntDelete == 1)
				{
					System.out.println("ȸ������ ���� ���� !!!");
				}else{
					System.out.println("ȸ������ ���� ���� !!!");
				}
			}
		}else{
			System.out.println("ISUD �����ڸ� �Է��Ͻÿ� !!!!");		
		}	// end of if 	
	}	// end of main �Լ� 	
} // end of Ex_Member_1 Ŭ���� 

