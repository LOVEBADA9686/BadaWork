// package
package a.b.c.ch3;

// import


public class ExArray_1_1
{
	// ��� 
	// �������
	// ������

	// �Լ� 

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		
		char[] cA = new char[26];
		char ch = 'A';

		for (int i=0; i < cA.length; i++)
		{
			// ��ҿ� �� ���� 
			cA[i] = ch;
			ch++;
		}
		System.out.println("������ �빮�� 26 :: >>>>>>>>>>>>>>"); 
		for (int i=0; i < cA.length; i++ )
		{
			// ����� ���� ��ȸ, �ƽ�Ű 10������ ����ȯ �ؼ� ��ȸ 
			System.out.println(cA[i] 
			// 8����, 16������ ��ȸ �غ��� print ����ؼ� �� �ٷ� �����ֱ�, �� ���ĺ� �빮�ڸ�		
							  + " , 10���� :: " + (int)cA[i]
							  + " , 8���� :: 0" + Integer.toOctalString(cA[i])
							  + " , 16���� :: 0x" + Integer.toHexString(cA[i])
							  + " , 16���� :: 0X" + Integer.toHexString(cA[i])
							  + " , 2���� :: " + Integer.toBinaryString(cA[i]));
		}	

		char[] ca= new char[26];
		char cha = 'a';

		for (int i=0; i < ca.length; i++)
		{
			// ��ҿ� �� ���� 
			ca[i] = cha;
			cha++;
		}
		System.out.println("������ �ҹ��� 26 :: >>>>>>>>>>>>>>"); 
		for (int i=0; i < ca.length; i++ )
		{
			// ����� ���� ��ȸ, �ƽ�Ű 10������ ����ȯ �ؼ� ��ȸ 
			System.out.println(ca[i] 
			// 8����, 16������ ��ȸ �غ��� print ����ؼ� �� �ٷ� �����ֱ�, �� ���ĺ� �빮�ڸ�		
							  + " , 10���� :: " + (int)ca[i]
							  + " , 8���� :: 0" + Integer.toOctalString(ca[i])
							  + " , 16���� :: 0x" + Integer.toHexString(ca[i])
							  + " , 16���� :: 0X" + Integer.toHexString(ca[i])
							  + " , 2���� :: " + Integer.toBinaryString(ca[i]));
		}	
	}
}
