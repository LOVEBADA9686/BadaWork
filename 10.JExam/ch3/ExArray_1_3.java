// package
package a.b.c.ch3;

// import


public class ExArray_1_3
{
	// ��� 
	// �������
	// ������

	// �Լ� 

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		
		// String Ŭ������ ���ڿ��� �ٷ�� ��Ʈ�� Ŭ���� : ���� �迭 : 
		String s = "abc";

		System.out.println("s >>> : " + s);
		System.out.println("s >>> : " + + System.identityHashCode(s));

		// ���ڿ��� ���̸� ���ϴ� �Լ� : public int length() : ���ڿ��� ���̸� �����ϴ� �Լ� 
		int sLen = s.length();
		System.out.println("s.length() >>> : " + s.length());
		for (int i=0; i < sLen; i++)
		{
			// public char charAt(int index)
			System.out.println("s.charAt("+i+") >>> : " + s.charAt(i));
		}

		// length vs length() ����
		// length �� ���� �ʵ� : �迭�� ���̸� ���ϴ� �ʵ� 
		int iV[] = new int[3];
		int iVLen = iV.length;
		System.out.println("iVLen >>> : " + iVLen);
		// length() �� ���� �Լ� : String Ŭ������ �ִ� �Լ� : ���ڿ��� ���̸� ���ϴ� �Լ� 
		String ss = "abcd";
		int ssLen = ss.length();
		System.out.println("ssLen >>> : " + ssLen);
	}
}
