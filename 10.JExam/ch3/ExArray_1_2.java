// package
package a.b.c.ch3;

// import


public class ExArray_1_2
{
	// ��� 
	// �������
	// ������

	// �Լ� 

	// main() �Լ� : ���α׷� ������
	public static void main(String[] args) {
		// TODO Auto-generated method stub.
		
		String aa = "abcdefghijklmnopqrstuvwxyz";
		String aA = aa.toUpperCase();
		String n = "0123456789";
		String m = "+-*/%";
		String s = "~!@#$^&()[]{}";

		System.out.println("aa >>> : " + aa);
		System.out.println("aA >>> : " + aA);
		System.out.println("n >>> : " + n);
		System.out.println("m >>> : " + m);
		System.out.println("s >>> : " + s);

		// ��Ʈ�� ���̸� ���ؼ�(���� �迭), charAt(int index) �� �̿��ؼ�
		// �ֿܼ� �����ڿ� 16������ ����Ͻÿ� (16������ 0x ǥ���ϱ�)

		// char ������Ÿ�� c ���������� ���� �� ����Ʈ ������ �ʱ�ȭ �� �� 
		// �� for ������ �����Ѵ�. 
		char c = '\u0000';

		System.out.println("\n������ �ҹ��� 26 :: >>>>>>>>>>>>>>"); 
		for (int i=0; i < aa.length(); i++ )
		{			
			c = aa.charAt(i);
			System.out.println("aa.chartAt("+i+") >>> : " + c + " , 0x" + Integer.toHexString(c));
		}	
		System.out.println("\n������ �빮�� 26 :: >>>>>>>>>>>>>>"); 
		for (int i=0; i < aA.length(); i++ )
		{			
			c = aA.charAt(i);
			System.out.println("aA.chartAt("+i+") >>> : " + c + " , 0x" + Integer.toHexString(c));
		}	
		System.out.println("\n���� :: >>>>>>>>>>>>>>"); 
		for (int i=0; i < n.length(); i++ )
		{			
			c = n.charAt(i);
			System.out.println("n.chartAt("+i+") >>> : " + c + " , 0x" + Integer.toHexString(c));
		}	
		System.out.println("\n������ :: >>>>>>>>>>>>>>"); 
		for (int i=0; i < m.length(); i++ )
		{			
			c = m.charAt(i);
			System.out.println("m.chartAt("+i+") >>> : " + c + " , 0x" + Integer.toHexString(c));
		}	
		System.out.println("\nƯ����ȣ :: >>>>>>>>>>>>>>"); 
		for (int i=0; i < s.length(); i++ )
		{			
			c = s.charAt(i);
			System.out.println("s.chartAt("+i+") >>> : " + c + " , 0x" + Integer.toHexString(c));
		}	
	}
}
